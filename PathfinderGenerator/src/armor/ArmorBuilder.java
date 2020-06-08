package armor;

import java.util.Random;

import constant.ArmorConstant;
import constant.WeaponConstant;
import utility.Data;
import utility.Debug;
import utility.Tuple;



/**
 * WeaponBuilder sert � la cr�ation d'armure et bouclier.
 * @author Mentra20
 *
 */
public class ArmorBuilder {
	
	Random r; //Le random pour les tirages.
    
    /* CONSTRUCTOR */
    public ArmorBuilder(){
        this.r = new Random();
    }

    /**
     * creer une armure ou bouclier de raret� choisie
     * @param rarity : la raret� de l'armure ou bouclier
     * @return l'armure ou bouclier cr��
     */
    public ArmorShield createArmor(int rarity) {
    	Debug.debug("Create armor or shield with rarity "+rarity+"...");
    	
    	//Membre x du tuple : genre d'armure.
    	//Membre y du tuple : propri�t� sp�ciale.
        Data<Tuple<Integer,Integer>> data = new Data<Tuple<Integer,Integer>>();
        
      //Chargement des donn�es
        switch(rarity) {
        case 1 : data.addAll(ArmorConstant.rarity1()); //On charge le tableau de drop de raret� 1.
        	break;
        case 2 : data.addAll(ArmorConstant.rarity2()); //On charge le tableau de drop de raret� 2.
    		break;
        case 3 : data.addAll(ArmorConstant.rarity3()); //On charge le tableau de drop de raret� 3.
			break;
        case 4 : data.addAll(ArmorConstant.rarity4()); //On charge le tableau de drop de raret� 4.
			break;
        case 5 : data.addAll(ArmorConstant.rarity5()); //On charge le tableau de drop de raret� 5.
			break;
        case 6 : data.addAll(ArmorConstant.rarity6()); //On charge le tableau de drop de raret� 6.
			break;
        default : Debug.error("erreur case createArmor"); 
        	break;
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_choice = "+randomValue);
        Tuple<Integer,Integer> tuple = data.selectObject(randomValue);
        
        int alteration;
        
        if (tuple.getX() == -1) return specificArmor(rarity);//L'armure est une armure sp�cifique.
        else alteration = tuple.getX();//L'armure est une armure magique.
        //L'alteration vaut 0 si rien et -2 si de maitre.
       
        ArmorShield armor = magicArmor(alteration);
        
        //On doit ajouter une propri�t� sp�ciale
        if(tuple.getY() > 0) {
        	//Le chiffre de l'unit� indique l'alt�ration de la premiere propri�t�.
        	armor = armorSpecialPropertie(armor,tuple.getY()%10,1);
        	
        	if(tuple.getY() > 10) {//L'arme � une deuxi�me propri�t� sp�ciale.
        		//Le chiffre de la dizaine indique l'alt�ration de la deuxi�me propri�t�.
        		armor = armorSpecialPropertie(armor,tuple.getY()/10,2);
        	}
        }
        //Ajout du prix des propri�t�s sp�ciales � l'armure/bouclier.
        armor = armorSpecialPrice(armor);
        
        //Pour le debug de plusieures armures.
        Debug.debug("");
        return armor;
    }
    
    
    /**
     * cr�er une armure ou bouclier magique
     * @param alteration : l'alteration de l'armure/bouclier
     * @return l'armure/bouclier modifiee
     */
    public ArmorShield magicArmor(int alteration) {
    	Debug.debug("Create magic armor or shield with alteration "+alteration+"...");
    	
    	Data<ArmorShield> data = new Data<ArmorShield>();
    	
    	//Chargement des donn�es
        data.addAll(ArmorConstant.armorShieldList());
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_armor = "+randomValue);
        //On recup�re l'armure
        ArmorShield currentArmor = data.selectObject(randomValue);
        currentArmor.setAlteration(alteration);
        
        //Debug prix de base et le poid
        Debug.debug("Based price : "+currentArmor.getPrice());
        Debug.debug("Based weight : "+currentArmor.getWeight());
        
        //On applique les mat�riaux
        currentArmor = armorMaterial(currentArmor);
        
        //Rend �ventuellement l'armure en armure de maitre.
        currentArmor = isArmorMaster(currentArmor);
        
        return currentArmor;
    }
    
    /**
     * Affecte un materiel a l'armure ou bouclier
     * @param armor : l'armure ou bouclier a modifie
     * @return l'armure/bouclier modifie
     */
    public ArmorShield armorMaterial(ArmorShield armor) {
    	Debug.debug("Create armor or shield material...");
    	
    	Data<Material> data = new Data<Material>();
        
        //Chargement des donn�es.
        if(armor.getTypeMaterial() == TypeMaterial.WOOD || armor.getTypeMaterial() == TypeMaterial.LEATHER){
            data.addAll(ArmorConstant.leatherWoodMaterial());//On charge le mat�riel bois ou cuir.
        }
        else if(armor.getTypeMaterial() == TypeMaterial.STEEL){
            data.addAll(ArmorConstant.steelMaterial());//On charge le mat�riel m�tal.
        }
        else{//Cas d'armure ind�terminer.
        	armor.setMaterial(Material.CHOOSE);
            return armor;
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        
        Debug.debug("n_mat = "+randomValue);
        Material select = data.selectObject(randomValue);
        
        while(!restrictionMaterial(select,armor)) {//Tant qu'il y a une restriction
        	
        	//On force a obtenir un mat�riaux car premier jet r�ussis.
        	randomValue = r.nextInt(100)+1;
        	//La valeur interdite depend du tableau selectionn� (bois/cuir ou metal).
        	if(armor.getTypeMaterial() == TypeMaterial.STEEL) {
        		while(randomValue >= 5 && randomValue <= 53) {//Correspond � pas de mat�riel
        			randomValue = r.nextInt(100)+1;
        		}
        	}else {
        		while(randomValue >= 6 && randomValue <= 67) {//Correspond � pas de mat�riel
        			randomValue = r.nextInt(100)+1;
        		}
        	}
        	
        	Debug.debug("n_mat = "+randomValue);
        	select = data.selectObject(randomValue);
        }
        armor.setMaterial(select);
        
        //Les modifications du prix et du poid du au mat�riel.
        armor = materialModification(armor);
        
    	return armor;
    }
    
    /**
     * Cr�er une armure/bouclier sp�cifique.
     * @param rarity : la raret� de l'armure/bouclier.
     * @return l'armure/bouclier cr��e.
     */
    public ArmorShield specificArmor(int rarity){
    	Debug.debug("Create specific armor or shield with rarity "+rarity+"...");
    	
        Data<ArmorShield> select = new Data<ArmorShield>();
        
        //Chargement des donn�es
        boolean AS = r.nextBoolean();//Determine si c'est un bouclier ou une armure
        switch(rarity){
            case 1: 
            	if(AS) select.addAll(ArmorConstant.specificArmor1());//Armure sp�cifique de raret� 1.
            	else select.addAll(ArmorConstant.specificShield1());//Bouclier sp�cifique de raret� 1.
            	break;
            case 2: 
            	if(AS) select.addAll(ArmorConstant.specificArmor2());//Armure sp�cifique de raret� 2.
            	else select.addAll(ArmorConstant.specificShield2());//Bouclier sp�cifique de raret� 2.
            	break;
            case 3: 
            	if(AS) select.addAll(ArmorConstant.specificArmor3());//Armure sp�cifique de raret� 3.
            	else select.addAll(ArmorConstant.specificShield3());//Bouclier sp�cifique de raret� 3.
            	break;
            case 4: 
            	if(AS) select.addAll(ArmorConstant.specificArmor4());//Armure sp�cifique de raret� 4.
            	else select.addAll(ArmorConstant.specificShield4());//Bouclier sp�cifique de raret� 4.
            	break;
            case 5: 
            	if(AS) select.addAll(ArmorConstant.specificArmor5());//Armure sp�cifique de raret� 5.
            	else select.addAll(ArmorConstant.specificShield5());//Bouclier sp�cifique de raret� 5.
            	break;
            case 6: 
            	if(AS) select.addAll(ArmorConstant.specificArmor6());//Armure sp�cifique de raret� 6.
            	else select.addAll(ArmorConstant.specificShield6());//Bouclier sp�cifique de raret� 6.
            	break;
            default : Debug.error("erreur case specificArmor");
            	break;
        }
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_spe = "+randomValue);
        
        Debug.debug("");
        return select.selectObject(randomValue);
    }    
    
    
    /**
     * renvoie true ou false selon les restrictions de l'armure/bouclier 
     * @param select : la materiel a tester
     * @param armor : l'armure/bouclier qui restreint
     * @return true ou false
     */
    public boolean restrictionMaterial(Material select,ArmorShield armor) {
    	// pas besoin de gerer qu'une armure soit en m�tal pour avoir le mat�riel m�tallique
    	// g�r� par le tableau de mat�riaux et le type du mat�riel
    	
    	if(select == Material.OS) {
    		if(armor.getName() != "Armure de cuir clout�e" && armor.getName() != "Rondache en bois"
    				&& armor.getName() != "Cuirasse" && armor.getName() != "Armure d'�caille"  
    				&& armor.getName() != "Ecu en bois" && armor.getName() != "Pavois") {
    			return false;
    		}
    	}
    	
    	if(select == Material.OR) {
    		if(armor.getType() == Type.HEAVY) {
    			return false;
    		}
    	}
    	
    	if(select == Material.BRONZE) {
    		if(armor.getType() == Type.HEAVY) return false;
    	}
    	
    	if(select == Material.EBENITE) {//Il ne fait pas exclure le TypeMaterial.NOTHING
    		if(armor.getTypeMaterial() == TypeMaterial.LEATHER) return false;
    	}
    	
    	if(select == Material.CRIN_DE_GRIFFON) {
    		if(armor.getName() != "V�tement rembourr�") return false;
    	}
    	
    	if(select == Material.PEAU_D_ANGUILLE) {
    		if(armor.getTypeMaterial() == TypeMaterial.WOOD) return false;
    	}
    	
    	if(select == Material.PEAU_D_ANGE) {
    		if(armor.getTypeMaterial() == TypeMaterial.WOOD) return false;
    	}
    	
    	if(select == Material.TISSUS_DE_SOMBREFEUILLE) {
    		if(armor.getTypeMaterial() == TypeMaterial.WOOD) return false;
    	}
    	
    	return true;
    }
    
    /**
     * Transforme ou non une armure/bouclier en armure de maitre
     * @param armor : l'armure/bouclier a modifie
     * @return l'armure/bouclier modifie ou non
     */
    public ArmorShield isArmorMaster(ArmorShield armor) {
    	boolean change = false;
    	  
    	//Une armure magique est forcement une armure de maitre.
        //Si l'armure ne possede pas d'alteration on ne fait rien.
        if(armor.getAlteration() > 0 || armor.getAlteration() == -2) change = true;
    	
        //Au niveau du materiel de l'arme.
    	switch (armor.getMaterial()) {
    	case ACIER_ARDENT: change = true;
			break;
		case ACIER_GLACE : change = true;
			break;
		case ADAMENTIUM : change = true;
			break;	
		case EBENITE : change = true;
			break;
		case MITHRAL : change = true;
			break;	 
		case PEAU_DE_DRAGON : change = true;
			break;	
		case PEAU_D_ANGE : change = true;
			break;	
		case PEAU_D_ANGUILLE : change = true;
			break;	
		case TISSUS_DE_SOMBREFEUILLE : change = true;
			break;	
		//Aucun des mat�riaux transforme l'arme en arme de maitre.
		default: break;
		}
    	
    	if(change) {
    		Debug.debug("Change armor or shield to master armor or shield...");
    		Debug.debug("Master price : "+150);
    		armor.setPrice(armor.getPrice() + 150);
    	}
    	
    	armor.setMasterWork(change);
    	return armor;
    	
    }
    
    /**
     * Ajoute une propri�t� sp�ciale � l'armure/bouclier
     * @param armor : l'armure ou bouclier
     * @param magicAlteration : l'alteration magique
     * @param specialPropertieNumber : la premi�re ou deuxi�me propri�t�s 
     * @return l'armure/bouclier modifi�.
     */
    public ArmorShield armorSpecialPropertie(ArmorShield armor, int magicAlteration, int specialPropertieNumber) {
    	//L'arme n'est normalement pas une armure/bouclier de maitre 
    	if(armor.getAlteration() == -2) {
    		Debug.error("Master weapon only can't have special propertie....");
    	}

    	Debug.debug("Create special propertie "+specialPropertieNumber+" with rank "+magicAlteration+"...");
    	
    	//Cas ind�terminable
    	if(armor.getName() == "Autre armure l�g�re" 
    			|| armor.getName() == "Autre armure interm�daire" 
    			|| armor.getName() == "Autre armure lourde" 
    			|| armor.getName() == "Autre bouclier") {
    		
    		//On doit le d�terminer manuellement.
    		if(specialPropertieNumber == 1) armor.setSpecialPropertie1(new ArmorSpecialPropertie("� determiner",magicAlteration));
    		else armor.setSpecialPropertie2(new ArmorSpecialPropertie("� determiner",magicAlteration));
    		
    		return armor;
    	}
    	
    	Data<ArmorSpecialPropertie> data = new Data<ArmorSpecialPropertie>();
    	
    	//Chargement de data.
    	//Une armure
    	if(armor.getType() == Type.LIGTH || armor.getType() == Type.INTERMEDIATE || armor.getType() == Type.HEAVY) {
    		switch(magicAlteration) {
    		case 1: data.addAll(ArmorConstant.armorSpecialProperties1());
    			break;
    		case 2: data.addAll(ArmorConstant.armorSpecialProperties2());
    			break;
    		case 3: data.addAll(ArmorConstant.armorSpecialProperties3());
				break;
    		case 4: data.addAll(ArmorConstant.armorSpecialProperties4());
				break;
    		case 5: data.addAll(ArmorConstant.armorSpecialProperties5());
				break;
    		default: Debug.error("Error case special armor");
    			break;
    		}
    	}
    	if(armor.getType() == Type.SHIELD) {
    		switch(magicAlteration) {
    		case 1: data.addAll(ArmorConstant.shieldSpecialProperties1());
    			break;
    		case 2: data.addAll(ArmorConstant.shieldSpecialProperties2());
				break;
    		case 3: data.addAll(ArmorConstant.shieldSpecialProperties3());
				break;
    		case 4: data.addAll(ArmorConstant.shieldSpecialProperties4());
				break;
    		case 5: data.addAll(ArmorConstant.shieldSpecialProperties5());
				break;
    		default: Debug.error("Error case special shield");
    			break;
    		}
    	}
    	
    	//Tirage
    	int randomValue = r.nextInt(100)+1;
    	ArmorSpecialPropertie specialPropertie = data.selectObject(randomValue);
    	Debug.debug("n_spe_prop = "+randomValue);
    	
    	//Propri�t� compatible avec l'armure/bouclier
    	while(!restrictionProperties(armor,specialPropertie)) {
    		randomValue = r.nextInt(100)+1;
    		specialPropertie = data.selectObject(randomValue);
    		Debug.debug("n_spe_prop = "+randomValue);
    	}
    	
    	//On donne la propri�t� au bon emplacement.
    	if(specialPropertieNumber == 1) armor.setSpecialPropertie1(specialPropertie);
    	else armor.setSpecialPropertie2(specialPropertie);
    	
    	return armor;
    }
    
    /**
     * retourne true ou false selon les restriction de la propri�t� sp�ciale et l'armure/bouclier
     * @param armor : l'armure ou bouclier
     * @param specialPropertie : la propri�t� sp�ciale.
     * @return true ou false
     */
    public boolean restrictionProperties(ArmorShield armor, ArmorSpecialPropertie specialPropertie) {
    	//Ne jamais oublier d'inclure NOTHING (d'o� les conditions parfois illogiques)
    	
    	if(specialPropertie.getName() == "�quilibr�e") {
    		if(armor.getType() == Type.HEAVY) return false;
    	}
    	
    	if(specialPropertie.getName() == "Renforcement") {
    		if(armor.getType() == Type.LIGTH) return false;
    	}
    	
    	if(specialPropertie.getName() == "Pugilat") {
    		if(armor.getType() == Type.HEAVY || armor.getType() == Type.INTERMEDIATE) return false;
    	}
    	
    	if(specialPropertie.getName() == "Opposition") {//tirage au sort comme tueuse pour l'arme
    		Data<String> data2 = new Data<String>();
    		
    		int randomValue2 = r.nextInt(100)+1;
    		Debug.debug("n_opposition = "+randomValue2);
    		
    		data2.addAll(WeaponConstant.tueuseType());
    		String oppType = data2.selectObject(randomValue2);
    		
    		specialPropertie.setName(specialPropertie.getName()+" ("+oppType+")");
    	}
    	
    	if(specialPropertie.getName() == "Miroir") {
    		if(armor.getTypeMaterial() == TypeMaterial.WOOD || armor.getTypeMaterial() == TypeMaterial.LEATHER) return false;
    	}
    	
    	if(specialPropertie.getName() == "Attaque" || specialPropertie.getName() == "Fusion") {
    		if(armor.getName() != "Ecu en acier" && armor.getName() != "Ecu en bois" 
    				&& armor.getName() != "Rondache en acier" && armor.getName() != "Rondache en bois") return false;
    	}
    	
    	if(specialPropertie.getName() == "B�lier") {
    		if(armor.getName() =="Pavois" || armor.getName() =="Targe") return false;
    	}
    	
    	if(specialPropertie.getName() == "Anim�e") {
    		if(armor.getName() == "Pavois") return false;
    	}

    	//Cas avec deux propri�t�s incompatible
    	if(armor.getSpecialPropertie1().getName() != "_") {//Si on a d�j� une capacit�.
    		//On ne peut avoir deux fois la m�me capacit� sur l'arme.
    		if(specialPropertie.getName() == armor.getSpecialPropertie1().getName()) return false;
    		
    		if(specialPropertie.getName() == "Adh�sive" && 
    				(armor.getSpecialPropertie1().getName() == "Graisseuse" || 
    				armor.getSpecialPropertie1().getName() == "Graisseuse sup�rieure")) {
    			return false;
    		}
    		if((specialPropertie.getName() == "Graisseuse" || 
    				specialPropertie.getName() == "Graisseuse sup�rieure") && armor.getSpecialPropertie1().getName() == "Adh�sive") {
    			return false;
    		}
    		
    		if(specialPropertie.getName() == "Martyr" && 
    				(armor.getSpecialPropertie1().getName() == "D�fense (l�g�re)" || 
    				armor.getSpecialPropertie1().getName() == "D�fense (interm�diaire)" || 
    				armor.getSpecialPropertie1().getName() == "D�fense (lourde)")) {
    			return false;
    		}
    		if((specialPropertie.getName() == "D�fense (l�g�re)" || 
    				specialPropertie.getName() == "D�fense (interm�diaire)" || specialPropertie.getName() == "D�fense (lourde)") 
    				&& armor.getSpecialPropertie1().getName() == "Martyr") {
    			return false;
    		}
    		
    		if(armor.getSpecialPropertie1().getName() == "Souffle draconique" && specialPropertie.getName() == "Souffle draconique") {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    /**
     * change le prix et poid de l'arme si le mat�riaux le change
     * @param armor : l'armure ou bouclier a modifi�
     * @return : l'armure ou bouclier modifi�
     */
    public ArmorShield materialModification(ArmorShield armor) {
    	Debug.debug("Maybe do change in weapon due to material....");
    	boolean change = false;//True si un changement a eu lieu.
    	double newPrice;//Le nouveau prix.
    	double newWeight;//Le nouveau poid.
    	
    	switch (armor.getMaterial()) {
    	
		case OS:
			change = true;
			newPrice = armor.getPrice() * 0.5;
			
			armor.setPrice(newPrice);
			break;
			
		case OR :
			change = true;
			//On d�termine au hasard si l'arme est en or pur.
			boolean pureGold = r.nextBoolean();//Si true, l'arme est en or pur..
			boolean decorate = r.nextBoolean();//Si true, l'arme a des plaques d'or en plus
			
			if(pureGold) {//Si l'arme est en or pur.
				armor.setMaterial(Material.OR_PUR);
				newPrice = armor.getPrice() * 10;
				newWeight = armor.getWeight() * 1.5;
			}
			else {//L'arme est en or (partiellement).
				newPrice = armor.getPrice() * 3;
				newWeight = armor.getWeight();//Sinon erreur car newWeight pas init
			}
			
			if(decorate) {
				//Un armure ou bouclier plaqu�
				newPrice = armor.getPrice() *3;
				if(pureGold) {
					armor.setMaterial(Material.OR_PUR_DECO);
				}
				else {
					armor.setMaterial(Material.OR_DECO);
				}
			}
			
			armor.setPrice(newPrice);
			armor.setWeight(newWeight);
			break;
		
		case ACIER_VIVANT :
			change = true;
			
			if(armor.getType() == Type.HEAVY) newPrice = armor.getPrice() + 1500;
			else if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 1000;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 500;
			else if(armor.getType() == Type.SHIELD) newPrice = armor.getPrice() + 100;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
		
		case ACIER_ARDENT ://Prix de maitre d�duit
			change = true;
			
			if(armor.getType() == Type.HEAVY) newPrice = armor.getPrice() + 2850;
			else if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 2350;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 850;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
			
		case ACIER_GLACE ://Prix de maitre d�duit
			change = true;
			
			if(armor.getType() == Type.HEAVY) newPrice = armor.getPrice() + 2850;
			else if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 2350;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 850;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
		
		case MITHRAL : //cout de maitre en moins
			change = true;
			
			newWeight = armor.getWeight() * 0.5;
			
			if(armor.getType() == Type.HEAVY) newPrice = armor.getPrice() + 8850;
			else if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 3850;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 850;
			else if(armor.getType() == Type.SHIELD) newPrice = armor.getPrice() + 850;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			armor.setWeight(newWeight);
			break;
			
		case BRONZE_ELYSEEN ://Prix de maitre d�duit
			change = true;
			
			if(armor.getType() == Type.HEAVY) newPrice = armor.getPrice() + 3000;
			else if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 2000;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 1000;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
			
		case ADAMENTIUM :
			change = true;
			
			if(armor.getType() == Type.HEAVY) newPrice = armor.getPrice() + 14850;
			else if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 9850;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 4850;
			else if(armor.getType() == Type.SHIELD) newPrice = armor.getPrice() + 2850;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
		
		case PEAU_DE_DRAGON : 
			change = true;
			armor.setPrice((armor.getPrice() + 150)*2 - 150);//Double du prix de l'objet de maitre (on deduit le prix de maitre apres)
			break;
			
		case EBENITE :
			change = true;
			//Le nombre entier de tranches de 0.5kg dans le poid de l'arme.
			int factor = (int) (armor.getWeight() / 0.5);
			
			newPrice = armor.getPrice() + factor * 10;
			newWeight = armor.getWeight() * 0.5;
			
			armor.setPrice(newPrice);
			armor.setWeight(newWeight);
			break;	
			
		case CRIN_DE_GRIFFON :
			change = true;
			armor.setPrice(armor.getPrice() + 200);
			break;	
			
		case PEAU_D_ANGUILLE ://Prix de maitre d�duit
			change = true;
			
			if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 1650;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 1050;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
			
		case PEAU_D_ANGE ://Prix de maitre d�duit
			change = true;
			
			if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 1850;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 850;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			break;
			
		case TISSUS_DE_SOMBREFEUILLE ://Prix de maitre d�duit
			change = true;
			
			newWeight = armor.getWeight() *0.5;
			
			if(armor.getType() == Type.INTERMEDIATE) newPrice = armor.getPrice() + 1350;
			else if(armor.getType() == Type.LIGTH) newPrice = armor.getPrice() + 600;
			else newPrice = armor.getPrice();
			
			armor.setPrice(newPrice);
			armor.setWeight(newWeight);
			break;
			
		default:
			Debug.debug("No change due to material...");
			break;
		}
    	
    	//Un changement a eu lieu.
    	if(change) {
    		Debug.debug("Change done due to material...");
    		Debug.debug("new price : "+armor.getPrice());
    		Debug.debug("new weight : "+armor.getWeight());
    	}
    	return armor;
    }
    
    /**
     * ajoute le prix des deux propri�t� sp�ciales � l'armure ou bouclier.
     * @param weapon : l'armure ou bouclier o� il faut ajouter le prix.
     * @return l'armure ou bouclier modifi�.
     */
    public ArmorShield armorSpecialPrice(ArmorShield armor) {
    	//L'arme n'est normalement pas seulement une arme de maitre 
    	if(armor.getAlteration() == -2) {
    		Debug.error("Master weapon only can't have special propertie....");
    	}
    	
    	Debug.debug("Compute special properties price...");
    	
    	int totalAlteration = 0;
    	double specialPrice = 0;//Prix � ajouter � la fin
    	
    	//Les propri�t�s sp�ciales 1 et 2 de l'arme.
    	ArmorSpecialPropertie wsp1 = armor.getSpecialPropertie1();
    	ArmorSpecialPropertie wsp2 = armor.getSpecialPropertie2();
    	
    	//Si la propri�t� sp�ciale 1 n'est pas vide.
    	if(wsp1.getName() != "_") {
    		//Il s'agit du prix et non de l'alteration magique.
    		if(wsp1.getMagicAlterationOrPrice() > 10) {
    			//On ajoute directement au prix total.
    			specialPrice += wsp1.getMagicAlterationOrPrice();
    		}
    		else {//C'est une alt�ration magique.
    			totalAlteration += wsp1.getMagicAlterationOrPrice();
    		}
    	}
    	
    	//Si la propri�t� sp�ciale 2 n'est pas vide.
    	if(wsp2.getName() != "_") {
    		//Il s'agit du prix et non de l'alteration magique.
    		if(wsp2.getMagicAlterationOrPrice() > 10) {
    			//On ajoute directement au prix total.
    			specialPrice += wsp2.getMagicAlterationOrPrice();
    		}
    		else {//C'est une alt�ration magique.
    			totalAlteration += wsp2.getMagicAlterationOrPrice();
    		}
    	}
    	
    	//Si l'alteration n'est pas -2. (n'est pas censer arriv�)
    	if(armor.getAlteration() >= 0) {
    		totalAlteration += armor.getAlteration();
    	}
    	Debug.debug("total Alteration : "+totalAlteration);
    	
    	
    	double alterationPrice;
    	//Switch sur l'alteration totale pour trouver le prix.
    	switch (totalAlteration) {
		case 1:
			alterationPrice = 1000;
			break;
		case 2:
			alterationPrice = 4000;
			break;
		case 3:
			alterationPrice = 9000;
			break;
		case 4:
			alterationPrice = 16000;
			break;
		case 5:
			alterationPrice = 25000;
			break;
		case 6:
			alterationPrice = 36000;
			break;
		case 7:
			alterationPrice = 49000;
			break;
		case 8:
			alterationPrice = 64000;
			break;
		case 9:
			alterationPrice = 81000;
			break;
		case 10:
			alterationPrice = 100000;
			break;
		default://Il n'y a pas d'alteration.
			Debug.debug("No alteration for the weapon...");
			alterationPrice = 0;
			break;
		}
    	
    	specialPrice += alterationPrice;
    	Debug.debug("Special price : "+specialPrice);
    	
    	//On ajoute le prix � l'arme.
    	armor.setPrice(armor.getPrice() + specialPrice);
    	
    	return armor;
    }
}

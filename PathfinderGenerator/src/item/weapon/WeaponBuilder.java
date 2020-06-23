package item.weapon;
import java.util.Random;

import constant.WeaponConstant;
import utility.Data;
import utility.Debug;
import utility.Tuple;

/**
 * WeaponBuilder sert � la cr�ation d'arme.
 * @author Mentra20
 *
 */
public class WeaponBuilder{
    
    Random r; //Le random pour les tirages.
    
    /* CONSTRUCTOR */
    public WeaponBuilder(){
        this.r = new Random();
    }

    /**
     * Cr�e une arme selon la raret� donn�e.
     * @param rarity : la raret�.
     * @return l'arme cr��e.
     */
    public Weapon createWeapon(int rarity){
    	Debug.debug("Create weapon with rarity "+rarity+"...");
    	
    	//Membre x du tuple : genre d'arme.
    	//Membre y du tuple : propri�t� sp�ciale.
        Data<Tuple<Integer,Integer>> data = new Data<Tuple<Integer,Integer>>();
        
      //Chargement des donn�es
        switch(rarity) {
        case 1 : data.addAll(WeaponConstant.rarity1()); //On charge le tableau de drop de raret� 1.
        	break;
        case 2 : data.addAll(WeaponConstant.rarity2());//On charge le tableau de drop de raret� 2.
        	break;
        case 3 : data.addAll(WeaponConstant.rarity3());//On charge le tableau de drop de raret� 3.
        	break;
        case 4 : data.addAll(WeaponConstant.rarity4());//On charge le tableau de drop de raret� 4.
        	break;
        case 5 : data.addAll(WeaponConstant.rarity5());//On charge le tableau de drop de raret� 5.
        	break;
        case 6 : data.addAll(WeaponConstant.rarity6());//On charge le tableau de drop de raret� 6.
        	break;
        default : Debug.error("erreur case createWeapon"); 
        	break;
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_choice = "+randomValue);
        Tuple<Integer,Integer> tuple = data.selectObject(randomValue);
        
        int alteration;
        
        if (tuple.getX() == -1) return specificWeapon(rarity);//L'arme est une arme sp�cifique.
        else alteration = tuple.getX();//L'arme est une arme magique.
        //L'alteration vaut 0 si rien et -2 si de maitre.
       
        Weapon weapon = magicWeapon(alteration);
        
        //On doit ajouter une propri�t� sp�ciale
        if(tuple.getY() > 0) {
        	//Le chiffre de l'unit� indique l'alt�ration de la premiere propri�t�.
        	weapon = weaponSpecialPropertie(weapon,tuple.getY()%10,1);
        	
        	if(tuple.getY() > 10) {//L'arme � une deuxi�me propri�t� sp�ciale.
        		//Le chiffre de la dizaine indique l'alt�ration de la deuxi�me propri�t�.
        		weapon = weaponSpecialPropertie(weapon,tuple.getY()/10,2);
        	}
        }
        
        //Ajout du prix des propri�t�s sp�ciales � l'arme.
        weapon = weaponSpecialPrice(weapon);
        
        //Pour le debug de plusieures armes.
        Debug.debug("");
        return weapon;
    }
    
    /**
     * Cr�er une arme de maitre
     * @return l'arme de maitre.
     */
    public Weapon createMasterWeapon() {
    	Weapon weapon = magicWeapon(-2);
    	//Pour le debug de plusieurs items.
        Debug.debug("");
        return weapon;
    }
    
    /**
     * Cr�er une arme sp�cifique.
     * @param rarity : la raret� de l'arme.
     * @return l'arme cr��e.
     */
    public Weapon specificWeapon(int rarity){
    	Debug.debug("Create specific weapon with rarity "+rarity+"...");
    	
        Data<Weapon> select = new Data<Weapon>();
        
      //Chargement des donn�es
        switch(rarity){
            case 1: select.addAll(WeaponConstant.specificWeapon1());//Arme sp�cifique de raret� 1.
            	break;
            case 2: select.addAll(WeaponConstant.specificWeapon2());//Arme sp�cifique de raret� 2.
            	break;
            case 3: select.addAll(WeaponConstant.specificWeapon3());//Arme sp�cifique de raret� 3.
            	break;
            case 4: select.addAll(WeaponConstant.specificWeapon4());//Arme sp�cifique de raret� 4.
            	break;
            case 5: select.addAll(WeaponConstant.specificWeapon5());//Arme sp�cifique de raret� 5.
        		break;
            case 6: select.addAll(WeaponConstant.specificWeapon6());//Arme sp�cifique de raret� 6.
        		break;
            default : Debug.error("erreur case specificWeapon");
            	break;
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_spe = "+randomValue);
        
        Debug.debug("");
        return select.selectObject(randomValue);
    }    
    
    
    /**
     * Cr�er une arme magique. (aussi arme normale +0 et arme de maitre -2...)
     * @param alteration : l'alt�ration de l'arme.
     * @return l'arme cr��e.
     */
    public Weapon magicWeapon(int alteration){
    	Debug.debug("Create magic weapon with alteration "+alteration+"...");
    	
        Data<Weapon> data = new Data<Weapon>();
        //Chargement des donn�es
        data.addAll(WeaponConstant.weaponList());
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        
        //On recup�re l'arme
        Weapon currentWeapon = data.selectObject(randomValue);
        currentWeapon.setAlteration(alteration);
        
        //L'arme est une munition.
        if(currentWeapon.getType() == Type.MUN) {
        	//On lui change le nombre de munition.
        	currentWeapon = weaponMunitionQuantity((Munition) currentWeapon);
        }
        
        if(currentWeapon.getType() == Type.DIST){
        	//On doit tirer le drop de munition.
            currentWeapon = weaponMunition((RangeWeapon) currentWeapon);
        }
        
        //Debug prix de base et le poid
        Debug.debug("Based price : "+currentWeapon.getPrice());
        Debug.debug("Based weight : "+currentWeapon.getWeight());
        
        //On applique les mat�riaux
        currentWeapon = weaponMaterial(currentWeapon);
        
        //Rend �ventuellement l'arme en arme de maitre.
        currentWeapon = isWeaponMaster(currentWeapon);
        
        return currentWeapon;
    }
    
    /**
     * Cr�er une munition et le rattache � l'arme.
     * @param weapon : l'arme � modifi�e.
     * @return l'arme modifi�e/Cr��e.
     */
    public Weapon weaponMunition(RangeWeapon weapon){
        
        Data<Weapon> data = new Data<Weapon>();
        //Chargement des donn�es
        data.addAll(WeaponConstant.weaponMunition());
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_mun = "+randomValue);
            
        Weapon select = data.selectObject(randomValue);
        
        //L'arme disparait (munition seule)
        if(select.getType() == Type.MUN){
        	 Debug.debug("Change weapon type to munition...");
            //L'arme est devenue une munition.
            select.setName(weapon.getMunition().getName());
            select.setWeight(weapon.getMunition().getWeight());
            //On calcule tout ce qui d�pend de la quantit� de munitions.
            ((Munition) select).computeAmmoQuantity();
            ((Munition) select).computeAmmoPrice();
            ((Munition) select).computeAmmoWeight();
            select.setAlteration(weapon.getAlteration());
            select.setTypeDamage(weapon.getTypeDamage());
           
            return select;
        }
        
        //L'arme est accompagn�e de munitions.
        else{
        	Debug.debug("Create munitions for the weapon...");
        	
        	//La munition drop.
            Munition selectMunition = ((RangeWeapon) select).getMunition();
            selectMunition.setName(weapon.getMunition().getName());
            selectMunition.setWeight(weapon.getMunition().getWeight());
            //On calcule ce qui depend de la quantit�
            selectMunition.computeAmmoQuantity();
            selectMunition.computeAmmoPrice();
            selectMunition.computeAmmoWeight();
            
            //On ratache les munitions � l'arme.
            weapon.setMunition(selectMunition);
           
            return weapon;
        }
    }
    
    /**
     * Cr�er le mat�riel de l'arme.
     * @param weapon : l'arme � modifi�e.
     * @return l'arme modifi�e.
     */
    public Weapon weaponMaterial(Weapon weapon){
    	Debug.debug("Create weapon material...");
    	
        Data<Material> data = new Data<Material>();
        
        //Chargement des donn�es.
        if(weapon.getTypeMaterial() == TypeMaterial.WOOD){
            data.addAll(WeaponConstant.woodMaterial());//On charge le mat�riel bois.
        }
        else if(weapon.getTypeMaterial() == TypeMaterial.STEEL){
            data.addAll(WeaponConstant.steelMaterial());//On charge le mat�riel m�tal.
        }
        else{//Cas d'arme ind�terminer.
        	weapon.setMaterial(Material.CHOOSE);
            return weapon;
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        
        Debug.debug("n_mat = "+randomValue);
        Material select = data.selectObject(randomValue);
        
        while(!restrictionMaterial(select,weapon)) {
        	
        	//On force a obtenir un mat�riaux car premier jet r�ussis.
        	randomValue = r.nextInt(100)+1;
        	//La valeur interdite depend du tableau selectionn� (bois ou metal).
        	if(weapon.getTypeMaterial() == TypeMaterial.STEEL) {
        		while(randomValue >= 7 && randomValue <= 56) {//Correspond � pas de mat�riel
        			randomValue = r.nextInt(100)+1;
        		}
        	}else {
        		while(randomValue >= 6 && randomValue <= 55) {//Correspond � pas de mat�riel
        			randomValue = r.nextInt(100)+1;
        		}
        	}
        	
        	Debug.debug("n_mat = "+randomValue);
        	select = data.selectObject(randomValue);
        }
        
        weapon.setMaterial(select);
        
        //Les modifications du prix et du poid du au mat�riel.
        weapon = materialModification(weapon);
        
        return weapon;
    }
    
    /**
     * Donne une propri�t� sp�ciale � l'arme.
     * @param weapon : l'arme � modifi�e.
     * @param magicAlteration : le niveau d'alt�ration de l'arme.
     * @param specialPropertieNumber : le num�ro de la propri�t� sp�ciale � modifi�e.
     * @return L'arme modifi�e.
     */
    public Weapon weaponSpecialPropertie(Weapon weapon,int magicAlteration, int specialPropertieNumber) {
    	//L'arme n'est normalement pas une arme de maitre 
    	if(weapon.getAlteration() == -2) {
    		Debug.error("Master weapon only can't have special propertie....");
    	}
    	
    	//Une arme magique peut aussi avoir une propri�t� particuli�re.
    	if(specialPropertieNumber == 1) {//Si c'est la premiere fois qu'on cr�er la propri�t� sp�ciale.
    		weapon = weaponParticularPropertie(weapon);
    	}
    	
    	Debug.debug("Create special propertie "+specialPropertieNumber+" with rank "+magicAlteration+"...");
    	
    	//Cas ind�terminable
    	if(weapon.getName() == "Autre arme de corps � corps l�g�re" 
    			|| weapon.getName() == "Autre arme de corps � corps � une main" 
    			|| weapon.getName() == "Autre arme de corps � corps � deux mains" 
    			|| weapon.getName() == "Autre arme � distance"
    			|| weapon.getName() == "Autre munition") {
    		
    		//On doit le d�terminer manuellement.
    		if(specialPropertieNumber == 1) weapon.setSpecialPropertie1(new WeaponSpecialPropertie("� determiner",magicAlteration));
    		else weapon.setSpecialPropertie2(new WeaponSpecialPropertie("� determiner",magicAlteration));
    		
    		return weapon;
    	}
    	
    	Data<WeaponSpecialPropertie> data = new Data<WeaponSpecialPropertie>();
    	
    	//Chargement de data.
    	//Une arme au CAC.
    	if(weapon.getType() == Type.CAC_1M || weapon.getType() == Type.CAC_LIGHT || weapon.getType() == Type.CAC_2M) {
    		switch(magicAlteration) {
    		case 1: data.addAll(WeaponConstant.meleeSpecialPropertie1());
    			break;
    		case 2: data.addAll(WeaponConstant.meleeSpecialPropertie2());
    			break;
    		case 3: data.addAll(WeaponConstant.meleeSpecialPropertie3());
				break;
    		case 4: data.addAll(WeaponConstant.meleeSpecialPropertie4_5());
				break;
    		case 5: data.addAll(WeaponConstant.meleeSpecialPropertie4_5());
				break;
    		default: Debug.error("Error case special melee");
    			break;
    		}
    	}
    	if(weapon.getType() == Type.DIST) {
    		switch(magicAlteration) {
    		case 1: data.addAll(WeaponConstant.rangeSpecialPropertie1());
    			break;
    		case 2: data.addAll(WeaponConstant.rangeSpecialPropertie2());
    			break;
    		case 3: data.addAll(WeaponConstant.rangeSpecialPropertie3_4());
				break;
    		case 4: data.addAll(WeaponConstant.rangeSpecialPropertie3_4());
				break;
			//Possibilit� de ne rien faire.
    		case 5: data.addAll(WeaponConstant.rangeSpecialPropertie3_4());
				break;
    		default: Debug.error("Error case special range");
    			break;
    		}
    	}
    	if(weapon.getType() == Type.MUN) {
    		switch(magicAlteration) {
    		case 1: data.addAll(WeaponConstant.munitionSpecialPropertie1());
    			break;
    		case 2: data.addAll(WeaponConstant.munitionSpecialPropertie2());
    			break;
    		case 3: data.addAll(WeaponConstant.munitionSpecialPropertie3());
    			break;
    		//Possibilit� de ne rien faire.
    		case 4: data.addAll(WeaponConstant.munitionSpecialPropertie3());
    			break;
    		case 5: data.addAll(WeaponConstant.munitionSpecialPropertie3());
    			break;
    		default: Debug.error("Error case special munition");
    			break;
    		}
    	}
    	
    	//Tirage
    	int randomValue = r.nextInt(100)+1;
    	WeaponSpecialPropertie specialPropertie = data.selectObject(randomValue);
    	Debug.debug("n_spe_prop = "+randomValue);
    	
    	//Propri�t� compatible avec l'arme
    	while(!restrictionProperties(weapon,specialPropertie)) {
    		randomValue = r.nextInt(100)+1;
    		specialPropertie = data.selectObject(randomValue);
    		Debug.debug("n_spe_prop = "+randomValue);
    	}
    	
    	//On donne la propri�t� au bon emplacement.
    	if(specialPropertieNumber == 1) weapon.setSpecialPropertie1(specialPropertie);
    	else weapon.setSpecialPropertie2(specialPropertie);
    	
    	return weapon;
    }
    
    /**
     * Renvoie true si l'arme r�pond au restriction, false sinon.
     * @param weapon : l'arme � test�e.
     * @param specialPropertie : la propri�t� sp�ciale.
     * @return l'arme modifi�e.
     */
    public boolean restrictionProperties(Weapon weapon,WeaponSpecialPropertie specialPropertie) {
    	
    	if(specialPropertie.getName() == "Mortelle") {
    		if(weapon.getName() != "Bolas" && weapon.getName() != "Fouet" && weapon.getName() != "Matraque") {
    			return false;
    		}
    	}
    	
    	if(specialPropertie.getName() == "Ac�r�e") {//L'arme doit �tre perforante ou/et tranchante.
    		if(weapon.getTypeDamage() == TypeDamage.C) return false;
    	}
    	
    	//Les armes de jets.
    	if(specialPropertie.getName() == "Boomerang") {
    		if(weapon.getName() != "Dague" && weapon.getName() != "Gourdin" && weapon.getName() != "Lance" 
    				&& weapon.getName() != "Marteau l�ger" && weapon.getName() != "Trident" && weapon.getName() != "Bolas"
    				&& weapon.getName() != "Epieu" && weapon.getName() != "Shuriken") {
    			return false;
    		}
    	}
    	
    	//Les autres armes de jet qui peuvent apparaitre sont des armes au CAC.
    	if(specialPropertie.getName() == "Inamovible") {
    		Type type = weapon.getType();
    		if(type != Type.CAC_1M && type != Type.CAC_2M && type != Type.CAC_LIGHT 
    				&& weapon.getName() != "Bolas" && weapon.getName() != "Shuriken") 
    			return false;
    	}
    	
    	if(specialPropertie.getName() == "Destruction") {
    		if(weapon.getTypeDamage() != TypeDamage.C && weapon.getTypeDamage() != TypeDamage.C_P) return false;
    	}
    	
    	if(specialPropertie.getName() == "Percutante") {
    		if(weapon.getType() == Type.CAC_LIGHT) return false;
    	}
    	
    	if(specialPropertie.getName() == "Munitions in�puisables") {
    		String name = weapon.getName();
    		if(name != "Arc long composite" && name != "Arc court composite" && name != "Arbal�te lourde"
    				&& name != "Arbal�te l�g�re" && name != "Arc long" && name != "Arc court") return false;
    	}
    	
    	//Les autres cas ne peuvent pas apparaitre.
    	if(specialPropertie.getName() == "Deuxi�me chance") {
    		String name = weapon.getName();
    		if(name != "Arc long composite" && name != "Arc court composite" && name != "Arc long" && name != "Arc court") return false;
    	}
    	
    	//Les autres cas ne peuvent pas apparaitre.
    	if(specialPropertie.getName() == "Duel") {
    		if(weapon.getType() != Type.CAC_LIGHT && weapon.getName() != "Rapi�re" && weapon.getName() != "Fouet") return false;
    	}
    	
    	if(specialPropertie.getName() == "Tueuse") {
    		Data<String> data2 = new Data<String>();
    		
    		int randomValue2 = r.nextInt(100)+1;
    		Debug.debug("n_tueuse = "+randomValue2);
    		
    		data2.addAll(WeaponConstant.tueuseType());
    		String tueuseType = data2.selectObject(randomValue2);
    		
    		specialPropertie.setName(specialPropertie.getName()+" ("+tueuseType+")");
    	}
    	
    	//S'applique qu'aux armes � feu (que l'on ne peut avoir qu'avec "autre arme a distance" d�j� g�rer pr�c�demment).
    	if(specialPropertie.getName() == "Chanceux") return false;
    	if(specialPropertie.getName() == "Chanceux sup�rieur") return false;
    	if(specialPropertie.getName() == "Fiable") return false;
    	if(specialPropertie.getName() == "Charge �tanche") return false;
    	if(specialPropertie.getName() == "Fiable sup�rieure") return false;
    	
    	
    	//Cas avec deux propri�t�s incompatible
    	if(weapon.getSpecialPropertie1().getName() != "_") {//Si on a d�j� une capacit�.
    		//On doit check dans les deux sens.
    		if(specialPropertie.getName() == "Repositionnante" && weapon.getSpecialPropertie1().getName() == "Inamovible") return false;
    		if(specialPropertie.getName() == "Inamovible" && weapon.getSpecialPropertie1().getName() == "Repositionnante") return false;
    		
    		//On ne peut avoir deux fois la m�me capacit� sur l'arme.
    		if(specialPropertie.getName() == weapon.getSpecialPropertie1().getName()) return false;
    	}
    	
    	//Aucune restriction a �t� d�tect�.
    	return true;
    }
    
    /**
     * Donne une propri�t� particuli�re � l'arme.
     * @param weapon : l'arme � modifi�e
     * @return l'arme modifi�e.
     */
    public Weapon weaponParticularPropertie(Weapon weapon) {
    	Debug.debug("Create particular propertie...");
    	
    	//Tirage.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_part_prop = "+randomValue);
    	
    	if(randomValue <= 30) {
    		weapon.setParticularPropertie("Lumi�re");//L'arme �met de la lumi�re.
    	}
    	else if(randomValue <= 45) {
    		weapon.setParticularPropertie("Indice");//Indice sur la propri�t� sp�ciale
    	}
    	
		return weapon;
    }
    
    /**
     * restrictionMateriel renvoie vrai ou faux selon que l'arme repond aux crit�res du mat�riel.
     * @param material : le mat�riel
     * @param weapon : l'arme qui doit repondre aux crit�res.
     * @return true ou false.
     */
    public boolean restrictionMaterial(Material material,Weapon weapon) {
    	
    	if(material == Material.PIERRE) {//L'arme est en pierre
    		//L'arme est une fleche ou une lance -> choix accept�.
    		if(weapon.getName() == "Fl�che" || weapon.getName() == "Lance") return true;
    		//L'arme n'est pas contendante -> refus�.
    		if(weapon.getTypeDamage() != TypeDamage.C_P && weapon.getTypeDamage() != TypeDamage.C) return false;
    		//L'arme est une arme a deux mains -> refus�.
    		if(weapon.getType() == Type.CAC_2M) return false;
    	}
    	
    	if(material == Material.OR) {//L'arme est en or.
    		//L'arme est contendante seulement.
    		if(weapon.getTypeDamage() == TypeDamage.C) return false;
    		//L'arme est une arme a deux mains 
    		if(weapon.getType() == Type.CAC_2M) return false;
    	}
    	
    	if(material == Material.OS) {//Arme en os.
    		String name = weapon.getName();
    		if(name == "Fl�che" || name == "Lance" || name == "Pique" || name == "Hallebarde" 
    				|| name == "Coutille" || name == "Trident") return true;
    		
    		//L'arme doit etre contendante uniquement si elle est a deux mains.
    		if(weapon.getType() == Type.CAC_2M 
    				&& (weapon.getTypeDamage() != TypeDamage.C && weapon.getTypeDamage() != TypeDamage.C_P)) return false;
    	}
    	
    	if(material == Material.OBSIDIENNE) {//Arme en obsidienne.
    		//L'arme est une fleche ou une lance -> choix accept�.
    		if(weapon.getName() == "Fl�che" || weapon.getName() == "Lance") return true;
    		//L'arme est contendante seulement.
    		if(weapon.getTypeDamage() == TypeDamage.C) return false;
    		//L'arme est une arme a deux mains 
    		if(weapon.getType() == Type.CAC_2M) return false;
    	}
    	
    	if(material == Material.BRONZE) {
    		String name = weapon.getName();
    		if(name == "Fl�che" || name == "Lance" || name == "Hache d�armes" 
    				|| name == "Hache d�armes naine" || name == "Grande hache"
    				|| name == "Hachette") return true;
    		//L'arme est une arme a deux mains 
    		if(weapon.getType() == Type.CAC_2M) return false;
    	}
    	
    	if(material == Material.VIRIDIUM) {
    		//Viridium seulement sur armes legere ou munitions.
    		if(weapon.getType() != Type.CAC_LIGHT && weapon.getType() != Type.MUN) return false;
    	}
    	
    	if(material == Material.CRISTAL_DE_SANG) {
    		//L'arme doit etre tranchante ou perforante.
    		if(weapon.getTypeDamage() == TypeDamage.C) return false;
    	}
    	
    	//Toute les restrictions sont pass�es.
    	return true;
    }
    
    /**
     * isWeaponMaster modifie l'arme si elle doit etre une arme de maitre.
     * Modifie �galement son prix en ajoutant le prix de maitre.
     * @param weapon : l'arme a �valu�e.
     * @return l'arme eventuellement modifi�e.
     */
    public Weapon isWeaponMaster(Weapon weapon) {
    	boolean change = false;
  
    	//Une arme magique est forcement une arme de maitre.
        //Si l'arme ne possede pas d'alteration on ne fait rien.
        if(weapon.getAlteration() > 0 || weapon.getAlteration() == -2) change = true;
    	
        //Au niveau du materiel de l'arme.
    	switch (weapon.getMaterial()) {
		case ACIER_ARDENT: change = true;
			break;
		case ACIER_GLACE : change = true;
			break;
		case ADAMENTIUM : change = true;
			break;	
		case BOIS_VERT : change = true;
			break;
		case EBENITE : change = true;
			break;
		case MITHRAL : change = true;
			break;	
		//Aucun des mat�riaux transforme l'arme en arme de maitre.
		default: break;
		}
    	
    	if(change) {
    		Debug.debug("Change weapon to master weapon...");
    		double masterPrice = 0;
    		
    		if(weapon.getType() == Type.MUN) {//L'arme est une munition donc 6 po x nb munition.
    			masterPrice =  6 * ((Munition) weapon).getQuantity();
    		}	
    		else {
    			masterPrice = 300;
    		}
    		Debug.debug("Master price : "+masterPrice);
    		weapon.setPrice(weapon.getPrice() + masterPrice);
    	}
    	
    	weapon.setMasterWork(change);
    	return weapon;
    }
    
    /**
     * weaponMunitionQuantity cr�er le nombre de munition pour l'arme.
     * @param weapon : l'arme � modifi�e
     * @return l'arme modifi�e.
     */
    public Weapon weaponMunitionQuantity(Munition weapon) {
    	Debug.debug("Change number of munition...");
    	
    	
    	 Data<String> data = new Data<String>();
         //Chargement des donn�es
         data.addAll(WeaponConstant.weaponMunitionQuantity());
         
         //Tirage
         int randomValue = r.nextInt(100)+1;
         Debug.debug("n_mun = "+randomValue);
             
         String select = data.selectObject(randomValue);
         weapon.setStringQuantity(select);
         //On transforme en vrai quantit�e.
         weapon.computeAmmoQuantity();
         //On calcule le prix
         weapon.computeAmmoPrice();
         //On calcule le poid
         weapon.computeAmmoWeight();
         
         return weapon;
    }
    
    /**
     * materialModification modifie le prix et poid de l'arme en fonction du materiel.
     * @param weapon : l'arme a modifi�e.
     * @return l'arme modifi�e en fonction du mat�riel.
     */
    public Weapon materialModification(Weapon weapon) {
    	Debug.debug("Maybe do change in weapon due to material....");
    	boolean change = false;//True si un changement a eu lieu.
    	double newPrice;//Le nouveau prix.
    	double newWeight;//Le nouveau poid.
    	
    	switch (weapon.getMaterial()) {
    	
		case PIERRE:
			change = true;
    		newPrice = weapon.getPrice() * 0.25;
    		newWeight = weapon.getWeight() * 0.75;
    		
    		weapon.setPrice(newPrice);
    		weapon.setWeight(newWeight);
			break;
		
		case OR:
			change = true;
			//On d�termine au hasard si l'arme est en or pur.
			boolean pureGold = r.nextBoolean();//Si true, l'arme est en or pur..
			
			if(pureGold) {//Si l'arme est en or pur.
				weapon.setMaterial(Material.OR_PUR);
				newPrice = weapon.getPrice() * 10;
				newWeight = weapon.getWeight() * 1.5;
			}
			else {//L'arme est en or (plaqu�).
				newPrice = weapon.getPrice() * 3;
				newWeight = weapon.getWeight();//Sinon erreur car newWeight pas init
			}
			
			weapon.setPrice(newPrice);
    		weapon.setWeight(newWeight);
			break;
		
		case OS :
			change = true;
			newPrice = weapon.getPrice() * 0.5;
			
			weapon.setPrice(newPrice);
			break;
		
		case OBSIDIENNE :
			change = true;
			newPrice = weapon.getPrice() * 0.5;
			newWeight = weapon.getWeight() * 0.75;
			
			weapon.setPrice(newPrice);
			weapon.setWeight(newWeight);
			break;
			
		case VIRIDIUM:
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 20 * ((Munition)weapon).getQuantity();
			}
			//L'arme est forcement une arme legere on ne reverifie pas.
			else {
				newPrice = weapon.getPrice() + 200;
			}
			weapon.setPrice(newPrice);
			break;
			
		case RACINE_DE_WYR :
			change = true;
			//Contenance de la racine de wyr tir� au hasard.
			int stock = r.nextInt(3)+1;
			
			switch (stock) {
			case 1:
				weapon.setMaterial(Material.RACINE_DE_WYR1);
				newPrice = weapon.getPrice() + 1000;
				break;
			case 2:
				weapon.setMaterial(Material.RACINE_DE_WYR2);
				newPrice = weapon.getPrice() + 2000;
				break;
			case 3:
				weapon.setMaterial(Material.RACINE_DE_WYR3);
				newPrice = weapon.getPrice() + 4000;
				break;
			default:
				Debug.error("Error in switch racine de wyr");
				//N�c�ssit� d'initialiser newprice.
				newPrice = -100;//Impossible d'atteindre ce cas.
				break;
			}
			
			weapon.setPrice(newPrice);
			break;
		
		case ACIER_VIVANT : 
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 10 * ((Munition)weapon).getQuantity();
			}
			else {
				newPrice = weapon.getPrice() + 500;
			}
			
			weapon.setPrice(newPrice);
			break;
			
		case FER_FROID : 
			change = true;
			newPrice = weapon.getPrice() * 2;
			
			//Si l'arme a une alt�ration magique
			if(weapon.getAlteration() > 0) {
				newPrice += 2000; //On ajout en plus du prix * 2
			}
			
			weapon.setPrice(newPrice);
			break;
		
		case ARGENT_ALCHIMIQUE : 
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 2 * ((Munition)weapon).getQuantity();
			}
			else if(weapon.getType() == Type.CAC_LIGHT) {
				newPrice = weapon.getPrice() + 20;
			}
			else if(weapon.getType() == Type.CAC_1M) {
				newPrice = weapon.getPrice() + 90;
			}else if(weapon.getType() == Type.CAC_2M) {
				newPrice = weapon.getPrice() + 180;
			}
			else {//L'arme est une arme a distance (ou bug) : on n'ajoute rien au prix.
				newPrice = weapon.getPrice();
			}
			
			weapon.setPrice(newPrice);
			break;
		
		case CRISTAL_DE_SANG :
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 30 * ((Munition)weapon).getQuantity();
			}
			else {
				newPrice = weapon.getPrice() + 1500;
			}
			
			weapon.setPrice(newPrice);
			break;
		
		case MITHRAL : 
			change = true;
			//1000 po par kg
			newPrice = weapon.getPrice() + weapon.getWeight() * 1000;//dur de g�rer le cout de maitre
			newWeight = weapon.getWeight() * 0.5;
			
			weapon.setPrice(newPrice);
			weapon.setWeight(newWeight);
			break;
		
		case ACIER_ARDENT :
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 9 * ((Munition)weapon).getQuantity();//15-6
			}
			else {
				newPrice = weapon.getPrice() + 300;//600-300
			}
			
			weapon.setPrice(newPrice);
			break;
			
		case ACIER_GLACE :
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 9 * ((Munition)weapon).getQuantity();//15-6
			}
			else {
				newPrice = weapon.getPrice() + 300;//600-300
			}
			
			weapon.setPrice(newPrice);
			break;
		
		case BRONZE_ELYSEEN : 
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				newPrice = weapon.getPrice() + 20 * ((Munition)weapon).getQuantity();
			}
			else {
				newPrice = weapon.getPrice() + 1000;
			}
			
			weapon.setPrice(newPrice);
			break;
			
		case ADAMENTIUM : 
			change = true;
			
			if(weapon.getType() == Type.MUN) {
				//54 et pas 60 car il est dit que dans le tableau des prix la part 
				//du prix de maitre est d�j� compris dans le prix total. (60-6)
				newPrice = weapon.getPrice() + 54 * ((Munition)weapon).getQuantity();
			}
			else {//3000 - 300 (prix de maitre)
				newPrice = weapon.getPrice() + 2700;
			}
			
			weapon.setPrice(newPrice);
			break;
		
		case BOIS_FLEXIBLE :
			change = true;
			newPrice = weapon.getPrice() + 500;
			weapon.setPrice(newPrice);
			break;
		
		case EBENITE :
			change = true;
			//Le nombre entier de tranches de 0.5kg dans le poid de l'arme.
			int factor = (int) (weapon.getWeight() / 0.5);
			
			newPrice = weapon.getPrice() + factor * 10;
			newWeight = weapon.getWeight() * 0.5;
			
			weapon.setPrice(newPrice);
			weapon.setWeight(newWeight);
			break;
			
		case BOIS_VERT :
			change = true;
			//Le nombre entier de tranches de 0.5kg dans le poid de l'arme.
			factor = (int) (weapon.getWeight() / 0.5);
			
			newPrice = weapon.getPrice() + factor * 50;
			weapon.setPrice(newPrice);
			break;
			
		default:
			Debug.debug("No change due to material...");
			break;
		}
    	
    	//Un changement a eu lieu.
    	if(change) {
    		Debug.debug("Change done due to material...");
    		Debug.debug("new price : "+weapon.getPrice());
    		Debug.debug("new weight : "+weapon.getWeight());
    	}
    	
    	return weapon;
    }
    
    /**
     * weaponSpecialPrice ajout le prix des deux propri�t� sp�ciales � l'arme.
     * @param weapon : l'arme o� il faut ajouter le prix.
     * @return l'arme modifi�e.
     */
    public Weapon weaponSpecialPrice(Weapon weapon) {
    	//L'arme n'est normalement pas seulement une arme de maitre 
    	if(weapon.getAlteration() == -2) {
    		Debug.error("Master weapon only can't have special propertie....");
    	}
    	
    	Debug.debug("Compute special properties price...");
    	
    	int totalAlteration = 0;
    	double specialPrice = 0;//Prix � ajouter � la fin
    	
    	//Les propri�t�s sp�ciales 1 et 2 de l'arme.
    	WeaponSpecialPropertie wsp1 = weapon.getSpecialPropertie1();
    	WeaponSpecialPropertie wsp2 = weapon.getSpecialPropertie2();
    	
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
    	
    	//Si l'alteration n'est pas -1 ni -2.
    	if(weapon.getAlteration() >= 0) {
    		totalAlteration += weapon.getAlteration();
    	}
    	Debug.debug("total Alteration : "+totalAlteration);
    	
    	
    	double alterationPrice;
    	//Switch sur l'alteration totale pour trouver le prix.
    	switch (totalAlteration) {
		case 1:
			alterationPrice = 2000;
			break;
		case 2:
			alterationPrice = 8000;
			break;
		case 3:
			alterationPrice = 18000;
			break;
		case 4:
			alterationPrice = 32000;
			break;
		case 5:
			alterationPrice = 50000;
			break;
		case 6:
			alterationPrice = 72000;
			break;
		case 7:
			alterationPrice = 98000;
			break;
		case 8:
			alterationPrice = 128000;
			break;
		case 9:
			alterationPrice = 162000;
			break;
		case 10:
			alterationPrice = 200000;
			break;
		default://Il n'y a pas d'alteration.
			Debug.debug("No alteration for the weapon...");
			alterationPrice = 0;
			break;
		}
    	
    	if(weapon.getType() == Type.MUN) {
    		//Dans le cas de munition ce prix concerne 50 unit�s.
    		//On transforme le prix en prix unitaire puis on le multiplie par le nombre de munitions.
    		alterationPrice = (alterationPrice/50) * ((Munition) weapon).getQuantity();
    	}
    	specialPrice += alterationPrice;
    	Debug.debug("Special price : "+specialPrice);
    	
    	//On ajoute le prix � l'arme.
    	weapon.setPrice(weapon.getPrice() + specialPrice);
    	
    	return weapon;
    }
    
}

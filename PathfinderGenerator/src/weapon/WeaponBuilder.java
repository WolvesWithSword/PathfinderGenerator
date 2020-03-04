package weapon;
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
     * @param rarity
     * @return l'arme cr��e.
     */
    public Weapon createWeapon(int rarity){
    	Debug.debug("Create weapon with rarity "+rarity+"...");
    	
    	//Membre x du tuple : genre d'arme.
    	//Membre y du tuple : propri�t� sp�ciale.
        Data<Tuple<Integer,Integer>> data = new Data<Tuple<Integer,Integer>>();
        
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
        
        if (tuple.getX()== 0) return specificWeapon(rarity);//L'arme est une arme sp�cifique.
        String alteration;
        if (tuple.getX() == -1) alteration = "maitre";//L'arme est une arme de maitre.
        else alteration = "+"+tuple.getX();//L'arme est une arme magique.
        
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
        //Pour le debug de plusieures armes.
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
     * Cr�er une arme magique.
     * @param alteration : l'alt�ration de l'arme.
     * @return l'arme cr��e.
     */
    public Weapon magicWeapon(String alteration){
    	Debug.debug("Create magic weapon with alteration "+alteration+"...");
    	
        Data<Weapon> data = new Data<Weapon>();
        data.addAll(WeaponConstant.weaponList());
        
        //Tirage
        int randomValue = r.nextInt(100-19)+1;
        
        if(randomValue > 65){
        	//Entre 66 et 84 : aucune valeur dans le tableau (erreur?).
            Debug.debug("n_wp = "+(randomValue+19));
        }
        else{
            Debug.debug("n_wp = "+randomValue);
        }
        
        
        Weapon currentWeapon = data.selectObject(randomValue);
        currentWeapon.setAlteration(alteration);
        
        if(currentWeapon.getType() == Type.DIST){
        	//On doit tirer le drop de munition.
            currentWeapon = weaponMun((RangeWeapon) currentWeapon);
        }
        
        currentWeapon = weaponMaterial(currentWeapon);
        
        return currentWeapon;
    }
    
    /**
     * Cr�er une munition et le rattache � l'arme.
     * @param weapon : l'arme � modifi�e.
     * @return l'arme modifi�e/Cr��e.
     */
    public Weapon weaponMun(RangeWeapon weapon){
        
        Data<Weapon> data = new Data<Weapon>();
        data.addAll(WeaponConstant.weaponMunition());
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_mun = "+randomValue);
            
        Weapon select = data.selectObject(randomValue);
            
        if(select.getType() == Type.MUN){
        	 Debug.debug("Change weapon type to munition...");
            //L'arme est devenue une munition.
            select.setName(weapon.getMunition().getName());
        }
        else{
        	 Debug.debug("Create munitions for the weapon...");
        	//On ratache les munitions � l'arme.
            select.setName(weapon.getName());
            select.setTypeDamage(weapon.getTypeDamage());
            select.setMaterial(weapon.getMaterial());
            select.setTypeMaterial(weapon.getTypeMaterial());
            ((RangeWeapon) select).getMunition().setName(weapon.getMunition().getName());
        }
        select.setAlteration(weapon.getAlteration());
        
        return select;
            
    }
    
    /**
     * Cr�er le mat�riel de l'arme.
     * @param weapon : l'arme � modifi�e.
     * @return l'arme modifi�e.
     */
    public Weapon weaponMaterial(Weapon weapon){
    	Debug.debug("Create weapon material...");
    	
        Data<Material> data = new Data<Material>();
        
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
        
        weapon.setMaterial(select);
        
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
    	
    	//Une arme magique peut aussi avoir une propri�t� particuli�re.
    	if(specialPropertieNumber == 1) {//Si c'est la premiere fois qu'on cr�er la propri�t� sp�ciale.
    		weapon = weaponParticularPropertie(weapon);
    	}
    	
    	Debug.debug("Create special propertie "+specialPropertieNumber+" with rank "+magicAlteration+"...");
    	
    	//Cas ind�terminable
    	if(weapon.getName() == "autre arme de corps � corps l�g�re" 
    			|| weapon.getName() == "autre arme de corps � corps � une main" 
    			|| weapon.getName() == "autre arme de corps � corps � deux mains" 
    			|| weapon.getName() == "autre arme � distance"
    			|| weapon.getName() == "autre munition") {
    		
    		if(specialPropertieNumber == 1) weapon.setSpecialPropertie1(new WeaponSpecialPropertie("� determiner"));
    		else weapon.setSpecialPropertie2(new WeaponSpecialPropertie("� determiner"));
    		
    		return weapon;
    	}
    	
    	Data<WeaponSpecialPropertie> data = new Data<WeaponSpecialPropertie>();
    	
    	//Chargement de data.
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
    	
    	int randomValue = r.nextInt(100)+1;
    	WeaponSpecialPropertie specialPropertie = data.selectObject(randomValue);
    	Debug.debug("n_spe_prop = "+randomValue);
    	
    	//Propri�t� compatible avec l'arme
    	while(!restriction(weapon,specialPropertie)) {
    		randomValue = r.nextInt(100)+1;
    		specialPropertie = data.selectObject(randomValue);
    		Debug.debug("n_spe_prop = "+randomValue);
    	}
    	
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
    public boolean restriction(Weapon weapon,WeaponSpecialPropertie specialPropertie) {
    	
    	if(specialPropertie.getName() == "Mortelle") {
    		if(weapon.getName() != "bolas" && weapon.getName() != "fouet" && weapon.getName() != "matraque") {
    			return false;
    		}
    	}
    	
    	if(specialPropertie.getName() == "Ac�r�e") {//L'arme doit �tre perforante ou/et tranchante.
    		if(weapon.getTypeDamage() == TypeDamage.C || weapon.getTypeDamage() == TypeDamage.NOTHING) return false;
    	}
    	
    	//Les autres cas ne peuvent apparaitre.
    	if(specialPropertie.getName() == "Boomerang") {
    		if(weapon.getName() != "dague" && weapon.getName() != "gourdin" && weapon.getName() != "lance" 
    				&& weapon.getName() != "marteau l�ger" && weapon.getName() != "trident" && weapon.getName() != "bolas") {
    			return false;
    		}
    	}
    	
    	//Les autres armes de jet qui peuvent apparaitre sont des armes au CAC.
    	if(specialPropertie.getName() == "Inamovible") {
    		Type type = weapon.getType();
    		if(type != Type.CAC_1M && type != Type.CAC_2M && type != Type.CAC_LIGHT && weapon.getName() != "bolas") 
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
    		if(name != "arc long composite" && name != "arc court composite" && name != "arbal�te lourde"
    				&& name != "arbal�te l�g�re" && name != "arc long") return false;
    	}
    	
    	//Les autres cas ne peuvent pas apparaitre.
    	if(specialPropertie.getName() == "Deuxi�me chance") {
    		String name = weapon.getName();
    		if(name != "arc long composite" && name != "arc court composite" && name != "arc long") return false;
    	}
    	
    	//Les autres cas ne peuvent pas apparaitre.
    	if(specialPropertie.getName() == "Duel") {
    		if(weapon.getType() != Type.CAC_LIGHT && weapon.getName() != "rapi�re" && weapon.getName() != "fouet") return false;
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
    		if(specialPropertie.getName() == "Repositionnante" && weapon.getSpecialPropertie1().getName() == "Inamovible") return false;
    		if(specialPropertie.getName() == "Inamovible" && weapon.getSpecialPropertie1().getName() == "Repositionnante") return false;
    	}
    	
    	
    	return true;
    }
    
    /**
     * Donne une propri�t� particuli�re � l'arme.
     * @param weapon : l'arme � modifi�e
     * @return l'arme modifi�e.
     */
    public Weapon weaponParticularPropertie(Weapon weapon) {
    	Debug.debug("Create particular propertie...");
    	
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
}




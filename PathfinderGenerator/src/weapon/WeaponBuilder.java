package weapon;
import java.util.Random;

import utility.Constant;
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
        case 1 : data.addAll(Constant.rarity1()); //On charge le tableau de drop de raret� 1.
        	break;
        case 2 : data.addAll(Constant.rarity2());//On charge le tableau de drop de raret� 2.
        	break;
        default : Debug.error("erreur case createWeapon"); 
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
        	weapon = weaponSpecialPropertie(weapon,tuple.getY());
        }
        
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
            case 1: select.addAll(Constant.specificWeapon1());//Arme sp�cifique de raret� 1.
            	break;
            case 2: select.addAll(Constant.specificWeapon2());//Arme sp�cifique de raret� 2.
            	break;
            default : Debug.error("erreur case specificWeapon");
        }
        
        //Tirage
        int randomValue = r.nextInt(100)+1;
        Debug.debug("n_spe = "+randomValue);
        
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
        data.addAll(Constant.weaponList());
        
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
        data.addAll(Constant.weaponMunition());
        
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
            data.addAll(Constant.woodMaterial());//On charge le mat�riel bois.
        }
        else if(weapon.getTypeMaterial() == TypeMaterial.STEEL){
            data.addAll(Constant.steelMaterial());//On charge le mat�riel m�tal.
        }
        else{//Cas normalement impossible
        	Debug.error("No type material");
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
     * @return L'arme modifi�e.
     */
    public Weapon weaponSpecialPropertie(Weapon weapon,int magicAlteration) {
    	//Une arme magique peut aussi avoir une propri�t� particuli�re.
    	weapon = weaponParticularPropertie(weapon);
    	
    	Debug.debug("Create special propertie "+magicAlteration+"...");
    	
    	//Cas ind�terminable
    	if(weapon.getName() == "autre arme de corps � corps l�g�re" 
    			|| weapon.getName() == "autre arme de corps � corps � une main" 
    			|| weapon.getName() == "autre arme de corps � corps � deux mains" 
    			|| weapon.getName() == "autre arme � distance"
    			|| weapon.getName() == "autre munition") {
    		weapon.setSpecialPropertie(new WeaponSpecialPropertie("� determiner"));
    		return weapon;
    	}
    	
    	Data<WeaponSpecialPropertie> data = new Data<WeaponSpecialPropertie>();
    	
    	//Chargement de data.
    	if(weapon.getType() == Type.CAC_1M || weapon.getType() == Type.CAC_LIGHT || weapon.getType() == Type.CAC_2M) {
    		switch(magicAlteration) {
    		case 1: data.addAll(Constant.meleeSpecialPropertie1());
    			break;
    		default: Debug.error("Error case special melee");
    		}
    	}
    	if(weapon.getType() == Type.DIST) {
    		switch(magicAlteration) {
    		case 1: data.addAll(Constant.rangeSpecialPropertie1());
    			break;
    		default: Debug.error("Error case special range");
    		}
    	}
    	if(weapon.getType() == Type.MUN) {
    		switch(magicAlteration) {
    		case 1: data.addAll(Constant.munitionSpecialPropertie1());
    			break;
    		default: Debug.error("Error case special munition");
    		}
    	}
    	
    	int randomValue = r.nextInt(100)+1;
    	WeaponSpecialPropertie specialPropertie = data.selectObject(randomValue);
    	
    	//Propri�t� compatible avec l'arme
    	while(!restriction(weapon,specialPropertie)) {
    		randomValue = r.nextInt(100)+1;
    		specialPropertie = data.selectObject(randomValue);
    	}
    	
    	Debug.debug("n_spe_prop = "+randomValue);
    	weapon.setSpecialPropertie(specialPropertie);
    	
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
    		if(weapon.getName() != "bolas" || weapon.getName() != "fouet" || weapon.getName() != "matraque") {
    			return false;
    		}
    	}
    	
    	if(specialPropertie.getName() == "Ac�r�e") {
    		if(weapon.getTypeDamage() != TypeDamage.P || weapon.getTypeDamage() != TypeDamage.T) return false;
    	}
    	
    	//Les autres cas ne peuvent apparaitre.
    	if(specialPropertie.getName() == "Boomerang") {
    		if(weapon.getName() != "dague" || weapon.getName() != "gourdin" || weapon.getName() != "lance" 
    				|| weapon.getName() != "marteau l�ger" || weapon.getName() != "trident" || weapon.getName() != "bolas") {
    			return false;
    		}
    	}
    	
    	if(specialPropertie.getName() == "Tueuse") {
    		Data<String> data2 = new Data<String>();
    		
    		int randomValue2 = r.nextInt(100)+1;
    		Debug.debug("n_tueuse = "+randomValue2);
    		
    		data2.addAll(Constant.tueuseType());
    		String tueuseType = data2.selectObject(randomValue2);
    		
    		specialPropertie.setName(specialPropertie.getName()+" ("+tueuseType+")");
    	}
    	
    	//S'applique qu'aux armes � feu (que l'on ne peut avoir qu'avec "autre arme a distance" d�j� g�rer pr�c�demment).
    	if(specialPropertie.getName() == "Chanceux") return false;
    	if(specialPropertie.getName() == "Fiable") return false;
    	
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




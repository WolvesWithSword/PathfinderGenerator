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
    	//Membre x du tuple : genre d'arme.
    	//Membre y du tuple : propri�t� sp�ciale.
        Data<Tuple<Integer,Integer>> data = new Data<Tuple<Integer,Integer>>();
        
        switch(rarity) {
        case 1 : data.addAll(Constant.rarity1()); //On charge le tableau de drop de raret� 1.
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
        
        return magicWeapon(alteration);
        
    }
    
    /**
     * Cr�er une arme sp�cifique.
     * @param rarity : la raret� de l'arme.
     * @return l'arme cr��e.
     */
    public Weapon specificWeapon(int rarity){
        Data<Weapon> select = new Data<Weapon>();
        
        switch(rarity){
            case 1: select.addAll(Constant.specificWeapon1());//Arme sp�cifique de raret� 1.
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
            //L'arme est devenue une munition.
            select.setName(weapon.getMunition().getName());
        }
        else{
        	//On ratache les munitions � l'arme.
            select.setName(weapon.getName());
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
        Data<Material> data = new Data<Material>();
        
        if(weapon.getTypeMaterial() == TypeMaterial.WOOD){
            data.addAll(Constant.woodMaterial());//On charge le mat�riel bois.
        }
        else if(weapon.getTypeMaterial() == TypeMaterial.STEEL){
            data.addAll(Constant.steelMaterial());//On charge le mat�riel m�tal.
        }
        else{
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
}




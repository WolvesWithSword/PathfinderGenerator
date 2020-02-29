package main;
import utility.Debug;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		//Param�trage de l'affichage
		Debug.setMode(true, true);
		
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		
		//Creation d'arme
		//Arme de raret� 1.
		Weapon weapon = weaponBuilder.createWeapon(1);
		Debug.debug("");
		//Arme d'alt�ration +1.
		Weapon weapon2 = weaponBuilder.magicWeapon("+1");
		Debug.debug("");
		//Arme de maitre.
		Weapon weapon3 = weaponBuilder.magicWeapon("de maitre");
		Debug.debug("");
		//Arme sp�cifique de raret� 1.
		Weapon weapon4 = weaponBuilder.specificWeapon(1);
		Debug.debug("");
		//Arme de raret� 2.
		Weapon weapon5 = weaponBuilder.createWeapon(2);
		Debug.debug("");
		//Arme d'alt�ration +1 et propri�t� sp�ciale 1.
		Weapon weapon6 = weaponBuilder.magicWeapon("+1");
		weapon6 = weaponBuilder.weaponSpecialPropertie(weapon6, 1);
		Debug.debug("");
		//Arme sp�cifique de raret� 2.
		Weapon weapon7 = weaponBuilder.specificWeapon(2);
		Debug.debug("");
		//Arme d'alt�ration +2.
		Weapon weapon8 = weaponBuilder.magicWeapon("+2");
		Debug.debug("");
		
		
		Debug.display("--- Arme de raret� 1 ---");
		Debug.printWeapon(weapon);
		
		Debug.display("--- Arme d'alt�ration +1 ---");
		Debug.printWeapon(weapon2);
		
		Debug.display("--- Arme de maitre ---");
		Debug.printWeapon(weapon3);
		
		Debug.display("--- Arme sp�cifique de raret� 1 ---");
		Debug.printWeapon(weapon4);
		
		Debug.display("--- Arme de raret� 2 ---");
		Debug.printWeapon(weapon5);
		
		Debug.display("--- Arme d'alteration +1 et propri�t� sp�ciale 1 ---");
		Debug.printWeapon(weapon6);
		
		Debug.display("--- Arme sp�cifique de raret� 2 ---");
		Debug.printWeapon(weapon7);
		
		Debug.display("--- Arme d'alt�ration +2 ---");
		Debug.printWeapon(weapon8);
		
		Debug.debug("SUCCEED");
	}
	
	
}

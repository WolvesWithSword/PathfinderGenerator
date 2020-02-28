package main;
import utility.Debug;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		
		//Creation d'arme
		//Arme de raret� 1.
		Weapon weapon = weaponBuilder.createWeapon(1);
		Debug.display("");
		//Arme d'alt�ration +1.
		Weapon weapon2 = weaponBuilder.magicWeapon("+1");
		Debug.display("");
		//Arme de maitre.
		Weapon weapon3 = weaponBuilder.magicWeapon("de maitre");
		Debug.display("");
		//Arme sp�cifique de raret� 1.
		Weapon weapon4 = weaponBuilder.specificWeapon(1);
		Debug.display("");
		
		Debug.display("--- Arme de raret� 1 ---");
		Debug.printWeapon(weapon);
		
		Debug.display("--- Arme d'alt�ration +1 ---");
		Debug.printWeapon(weapon2);
		
		Debug.display("--- Arme de maitre ---");
		Debug.printWeapon(weapon3);
		
		Debug.display("--- Arme sp�cifique de raret� 1 ---");
		Debug.printWeapon(weapon4);
		
		Debug.debug("SUCCEED");
	}
	
	
}

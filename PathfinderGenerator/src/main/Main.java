package main;
import armor.ArmorBuilder;
import armor.ArmorShield;
import gemAndJewel.Gem;
import gemAndJewel.GemAndJewelBuilder;
import gemAndJewel.Jewel;
import potion.Potion;
import potion.PotionBuilder;
import utility.Debug;
import utility.Tuple;
import weapon.Weapon;
import weapon.WeaponBuilder;

public class Main {
	
	public static void main (String[] args){
		//Paramètrage de l'affichage
		Debug.setMode(true, true);
		
		WeaponBuilder weaponBuilder = new WeaponBuilder();
		GemAndJewelBuilder gemAndJewelBuilder = new GemAndJewelBuilder();
		PotionBuilder potionBuilder = new PotionBuilder();
		ArmorBuilder armorBuilder = new ArmorBuilder();

		Weapon weapon = weaponBuilder.createWeapon(6);
		Tuple<Gem,Jewel> tuple = gemAndJewelBuilder.createGemOrJewel(6);
		Potion potion = potionBuilder.createPotion(6);
		ArmorShield armor = armorBuilder.createArmor(6);
		
		Debug.printWeapon(weapon);
		Debug.printGemOrJewel(tuple);
		Debug.printPotion(potion);
		Debug.printArmorShield(armor);
		
		Debug.display("");
		Debug.debug("SUCCEED");
		
	}
	
}

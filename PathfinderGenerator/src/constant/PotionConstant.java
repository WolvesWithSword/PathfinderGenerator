package constant;

import utility.Data;
import utility.Tuple;

/**
 * PotionConstant contient toutes les constantes pour cr��er une potion.
 * Bas� sur le tableau : Generateur_de_tresor.ods (en lien sur Github).
 * Raret� 1 : faible inf�rieur
 * Raret� 2 : faible sup�rieur
 * Raret� 3 : interm�diaire inf�rieur
 * Raret� 4 : interm�diaire sup�rieur
 * Raret� 5 : puissant inf�rieur
 * Raret� 6 : puissant sup�rieur
 * @author Mentra20
 *
 */
public class PotionConstant {

	//Tirage pour les potions de raret� 1.
	public static Data<Integer> rarity1(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(0, 40));
		res.add(new Tuple<Integer, Integer>(1, 60));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 2.
	public static Data<Integer> rarity2(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(0, 10));
		res.add(new Tuple<Integer, Integer>(1, 50));
		res.add(new Tuple<Integer, Integer>(2, 40));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 3.
	public static Data<Integer> rarity3(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 25));
		res.add(new Tuple<Integer, Integer>(2, 60));
		res.add(new Tuple<Integer, Integer>(3, 15));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 4.
	public static Data<Integer> rarity4(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(1, 10));
		res.add(new Tuple<Integer, Integer>(2, 40));
		res.add(new Tuple<Integer, Integer>(3, 50));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 5.
	public static Data<Integer> rarity5(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 35));
		res.add(new Tuple<Integer, Integer>(3, 65));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 6.
	public static Data<Integer> rarity6(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 10));
		res.add(new Tuple<Integer, Integer>(3, 90));
		
		return res;
	}
	
	// Potions communes de nds 0.
	public static Data<String> commonPotion0(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("signature magique", 14));
		res.add(new Tuple<String, Integer>("assistance divine", 14));
		res.add(new Tuple<String, Integer>("lumi�re", 16));
		res.add(new Tuple<String, Integer>("purification de nourriture et d�eau", 14));
		res.add(new Tuple<String, Integer>("r�sistance", 14));
		res.add(new Tuple<String, Integer>("stabilisation", 14));
		res.add(new Tuple<String, Integer>("stimulant", 14));
		
		return res;
	}
	
	// Potions communes de nds 1.
	public static Data<String> commonPotion1(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("b�n�diction d�arme", 4));
		res.add(new Tuple<String, Integer>("soins l�ger", 10));
		res.add(new Tuple<String, Integer>("endurance aux �nergies destructives", 5));
		res.add(new Tuple<String, Integer>("agrandissement", 8));
		res.add(new Tuple<String, Integer>("saut", 6));
		res.add(new Tuple<String, Integer>("armure de mage", 8));
		res.add(new Tuple<String, Integer>("morsure magique", 6));
		res.add(new Tuple<String, Integer>("arme magique", 8));
		res.add(new Tuple<String, Integer>("passage sans trace", 5));
		res.add(new Tuple<String, Integer>("protection contre le Chaos", 4));
		res.add(new Tuple<String, Integer>("protection contre le Mal", 4));
		res.add(new Tuple<String, Integer>("protection contre le Bien", 4));
		res.add(new Tuple<String, Integer>("protection contre la Loi", 4));
		res.add(new Tuple<String, Integer>("rapetissement", 5));
		res.add(new Tuple<String, Integer>("regain d�assurance", 6));
		res.add(new Tuple<String, Integer>("sanctuaire", 5));
		res.add(new Tuple<String, Integer>("bouclier de la foi", 8));
		
		return res;
	}
	
	// Potions communes de nds 2.
	public static Data<String> commonPotion2(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("aide", 4));
		res.add(new Tuple<String, Integer>("arme align�e", 3));
		res.add(new Tuple<String, Integer>("peau d��corce", 4));
		res.add(new Tuple<String, Integer>("endurance de l�ours", 5));
		res.add(new Tuple<String, Integer>("flou", 4));
		res.add(new Tuple<String, Integer>("force de taureau", 5));
		res.add(new Tuple<String, Integer>("gr�ce f�line", 5));
		res.add(new Tuple<String, Integer>("soins mod�r�s", 7));
		res.add(new Tuple<String, Integer>("vision dans le noir", 4));
		res.add(new Tuple<String, Integer>("retardement du poison", 3));
		res.add(new Tuple<String, Integer>("splendeur de l�aigle", 5));
		res.add(new Tuple<String, Integer>("ruse du renard", 5));
		res.add(new Tuple<String, Integer>("invisibilit�", 7));
		res.add(new Tuple<String, Integer>("l�vitation", 5));
		res.add(new Tuple<String, Integer>("sagesse du hibou", 5));
		res.add(new Tuple<String, Integer>("protection contre les projectiles", 2));
		res.add(new Tuple<String, Integer>("d�livrance de la paralysie", 3));
		res.add(new Tuple<String, Integer>("r�sistance aux �nergies destructives, acide", 4));
		res.add(new Tuple<String, Integer>("r�sistance aux �nergies destructives, froid", 4));
		res.add(new Tuple<String, Integer>("r�sistance aux �nergies destructives, �lectricit�", 4));
		res.add(new Tuple<String, Integer>("r�sistance aux �nergies destructives, feu", 4));
		res.add(new Tuple<String, Integer>("r�sistance aux �nergies destructives, son", 2));
		res.add(new Tuple<String, Integer>("pattes d�araign�e", 4));
		res.add(new Tuple<String, Integer>("alignement ind�tectable", 2));
		
		return res;
	}
	
	// Potions communes de nds 3.
	public static Data<String> commonPotion3(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("soins importants", 6));
		res.add(new Tuple<String, Integer>("dissipation de la magie", 4));
		res.add(new Tuple<String, Integer>("d�placement", 4));
		res.add(new Tuple<String, Integer>("vol", 6));
		res.add(new Tuple<String, Integer>("�tat gazeux", 5));
		res.add(new Tuple<String, Integer>("espoir", 4));
		res.add(new Tuple<String, Integer>("rapidit�", 6));
		res.add(new Tuple<String, Integer>("h�ro�sme", 5));
		res.add(new Tuple<String, Integer>("aff�tage", 4));
		res.add(new Tuple<String, Integer>("morsure magique supr�me", 4));
		res.add(new Tuple<String, Integer>("panoplie magique", 4));
		res.add(new Tuple<String, Integer>("neutralisation du poison", 5));
		res.add(new Tuple<String, Integer>("protection contre les �nergies destructives, acide", 3));
		res.add(new Tuple<String, Integer>("protection contre les �nergies destructives, froid", 3));
		res.add(new Tuple<String, Integer>("protection contre les �nergies destructives, �lectricit�", 3));
		res.add(new Tuple<String, Integer>("protection contre les �nergies destructives, feu", 3));
		res.add(new Tuple<String, Integer>("protection contre les �nergies destructives, son", 2));
		res.add(new Tuple<String, Integer>("rage", 3));
		res.add(new Tuple<String, Integer>("gu�rison de la c�cit�/surdit�", 3));
		res.add(new Tuple<String, Integer>("d�livrance des mal�dictions", 4));
		res.add(new Tuple<String, Integer>("gu�rison des maladies", 5));
		res.add(new Tuple<String, Integer>("don de langues", 5));
		res.add(new Tuple<String, Integer>("respiration aquatique", 5));
		res.add(new Tuple<String, Integer>("marche sur l�onde", 4));
		
		return res;
	}
	
	// Potions hors du commun de nds 1.
	public static Data<String> uncommonPotion1(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("corde anim�e", 4));
		res.add(new Tuple<String, Integer>("charge de fourmi", 7));
		res.add(new Tuple<String, Integer>("manteau d�ombre", 5));
		res.add(new Tuple<String, Integer>("effacement", 4));
		res.add(new Tuple<String, Integer>("d�marche a�rienne", 6));
		res.add(new Tuple<String, Integer>("baie nourrici�re", 4));
		res.add(new Tuple<String, Integer>("graisse", 4));
		res.add(new Tuple<String, Integer>("invisibilit� pour les animaux", 7));
		res.add(new Tuple<String, Integer>("invisibilit� pour les morts-vivants", 8));
		res.add(new Tuple<String, Integer>("verrouillage", 4));
		res.add(new Tuple<String, Integer>("revigorer", 5));
		res.add(new Tuple<String, Integer>("sens surd�velopp�s", 6));
		res.add(new Tuple<String, Integer>("pierre magique", 4));
		res.add(new Tuple<String, Integer>("dissipation de la fi�vre", 7));
		res.add(new Tuple<String, Integer>("sanctification de cadavre", 5));
		res.add(new Tuple<String, Integer>("gourdin magique", 4));
		res.add(new Tuple<String, Integer>("caresse de la mer", 8));
		res.add(new Tuple<String, Integer>("disparition", 8));
		
		return res;
	}
	
	// Potions hors du commun de nds 2.
	public static Data<String> uncommonPotion2(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("barri�re protectrice", 6));
		res.add(new Tuple<String, Integer>("sens aiguis�s", 8));
		res.add(new Tuple<String, Integer>("verrou magique", 5));
		res.add(new Tuple<String, Integer>("bouclier pare-balles", 5));
		res.add(new Tuple<String, Integer>("poigne s�re", 6));
		res.add(new Tuple<String, Integer>("flamme �ternelle", 5));
		res.add(new Tuple<String, Integer>("r�sistance � la corruption", 5));
		res.add(new Tuple<String, Integer>("d�guiser autrui", 8));
		res.add(new Tuple<String, Integer>("pr�servation des morts", 8));
		res.add(new Tuple<String, Integer>("r�paration int�grale", 5));
		res.add(new Tuple<String, Integer>("dissimulation d�objet", 6));
		res.add(new Tuple<String, Integer>("rapetissement d�animal", 5));
		res.add(new Tuple<String, Integer>("corde enchant�e", 4));
		res.add(new Tuple<String, Integer>("vague", 6));
		res.add(new Tuple<String, Integer>("rapport", 8));
		res.add(new Tuple<String, Integer>("distorsion du bois", 5));
		res.add(new Tuple<String, Integer>("fa�onnage du bois", 5));
		
		return res;
	}
	
	// Potions hors du commun de nds 3.
	public static Data<String> uncommonPotion3(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("creusement", 12));
		res.add(new Tuple<String, Integer>("innombrables yeux", 10));
		res.add(new Tuple<String, Integer>("lumi�re du jour", 12));
		res.add(new Tuple<String, Integer>("r�servoir draconique", 15));
		res.add(new Tuple<String, Integer>("fl�ches enflamm�es", 9));
		res.add(new Tuple<String, Integer>("rapetissement d�objet", 9));
		res.add(new Tuple<String, Integer>("fa�onnage de la pierre", 10));
		res.add(new Tuple<String, Integer>("pi�ge � feu", 10));
		res.add(new Tuple<String, Integer>("antid�tection", 13));
		
		return res;
	}
	
}

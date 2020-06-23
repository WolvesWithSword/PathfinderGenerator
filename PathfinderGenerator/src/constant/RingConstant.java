package constant;

import item.ring.Ring;
import utility.Data;
import utility.Tuple;

/**
 * Les tableaux de tirages pour les anneaux magique
 * Raret� 1 : faible inf�rieur
 * Raret� 2 : faible sup�rieur
 * Raret� 3 : interm�diaire inf�rieur
 * Raret� 4 : interm�diaire sup�rieur
 * Raret� 5 : puissant inf�rieur
 * Raret� 6 : puissant sup�rieur
 * @author Mentra20
 *
 */
public class RingConstant {

	//Anneaux de raret� 1.
	public static Data<Ring> rarity1(){
		Data<Ring> res = new Data<Ring>();
		
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de donjon, du prisonnier", 250), 7));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des sceaux magiques", 1000), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de connaissance des sorts I", 1500), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de protection +1", 2000), 15));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de la main d�outre-tombe", 2000), 7));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de feuille morte", 2200), 10));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�escalade", 2500), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de saut", 2500), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de subsistance", 2500), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de nage", 2500), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de f�rocit�", 3000), 7));
			
		return res;
	} 
	
	//Anneaux de raret� 2.
	public static Data<Ring> rarity2(){
		Data<Ring> res = new Data<Ring>();
		
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de contresort", 4000), 15));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des objets d�ments", 5000), 10));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des crocs du rat", 5000), 10));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de gui sacr�", 6000), 17));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de connaissance des sorts II", 6000), 17));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de vol�e de coups", 6000), 17));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�audace pure", 6840), 14));
			
		return res;
	}

	//Anneaux de raret� 3.
	public static Data<Ring> rarity3(){
		Data<Ring> res = new Data<Ring>();
		
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des crocs de force", 8000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de barri�re mentale", 8000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de protection +2", 8000), 5));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d��puisement de force", 8000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de bouclier de force", 8500), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau du b�liere", 8600), 5));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de l��rudit", 8700), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�escalade sup�rieur", 10000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de soins", 10000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�ennemi de pr�dilection", 10000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de saut, augment�", 10000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de ma�trise ki", 10000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�v�lation, mineur", 10000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de nage, augment�", 10000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�amiti� avec les animaux", 10800), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de transposition", 10800), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de pr�cision tactique", 11000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau du sybarite", 11000), 2));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de leurre", 12000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de cr�ation magique", 12000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de dynamisation ectoplasmique", 12000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�sistancesaux �nergies destructives, mineur", 12000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau du troglodyte", 12000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de main de fer", 12000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau du cam�l�on", 12700), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de connaissance des sorts III", 13500), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de l��cumeur des mers", 14000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�tribution", 15000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de marche sur l�onde", 15000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de donjon, du ge�lier", 16000), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�v�lation supr�me", 16000), 5));

		return res;
	} 
	
	
	//Anneaux de raret� 4.
	public static Data<Ring> rarity4(){
		Data<Ring> res = new Data<Ring>();
		
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�sistance int�rieure mineur", 18000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de protection +3", 18000), 12));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de stockage de sort", 18000), 10));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de voile d��nergie", 19500), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de ma�trise magique", 20000), 5));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�invisibilit�", 20000), 11));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des arcanes I", 20000), 8));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�v�lation supr�me", 24000), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de connaissance des sorts IV", 24000), 8));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau d�esquive totale", 25000), 12));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de rayons X", 25000), 8));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de clignotement", 27000), 12));
			
		return res;
	} 
	
	//Anneaux de raret� 5.
	public static Data<Ring> rarity5(){
		Data<Ring> res = new Data<Ring>();
		
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�sistance aux �nergies destructives majeur", 28000), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de l�eccl�siarque", 28500), 7));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de protection", 32000), 17));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de retour", 33600), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de libert� de mouvement", 40000), 16));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des arcanes II", 40000), 15));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�sistance int�rieure majeur", 42000), 5));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�sistance aux �nergies destructives supr�me", 44000), 17));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau du destin repouss�", 45000), 8));
	
			
		return res;
	} 
	
	//Anneaux de raret� 6.
	public static Data<Ring> rarity6(){
		Data<Ring> res = new Data<Ring>();
		
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de protection mutuelle majeur", 50000), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de protection +5", 50000), 12));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau du feu d��toiles", 50000), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de stockage de sort", 50000), 10));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de prolongement", 56000), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�sistance int�rieure supr�me", 66000), 5));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des arcanes III", 70000), 9));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneaux des spiritualistes", 70000), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de t�l�kin�sie", 75000), 8));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de r�g�n�ration", 90000), 5));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de renvoi des sorts", 100000), 6));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau des arcanes IV", 100000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de triple souhait", 120000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de convocation de djinn", 125000), 3));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de contr�le des �l�ments", 200000), 4));
		res.add(new Tuple<Ring, Integer>(new Ring("Anneau de stockage de sort majeur", 200000), 3));

		return res;
	} 
}

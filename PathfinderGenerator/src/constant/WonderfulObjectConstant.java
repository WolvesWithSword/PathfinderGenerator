package constant;

import utility.Data;
import utility.Tuple;
import wonderfulObject.Type;
import wonderfulObject.WonderfulObject;

/**
 * Les tableaux de tirages pour les objets merveilleux
 * Raret� 0 : faible insignifiant
 * Raret� 1 : faible inf�rieur
 * Raret� 2 : faible sup�rieur
 * Raret� 3 : interm�diaire inf�rieur
 * Raret� 4 : interm�diaire sup�rieur
 * Raret� 5 : puissant inf�rieur
 * Raret� 6 : puissant sup�rieur
 * @author Mentra20
 *
 */
public class WonderfulObjectConstant {
		
	//Tableau de drop du genre d'objets merveilleux
	public static Data<Type> location(){
		Data<Type> res = new Data<Type>();
	
		res.add(new Tuple<Type, Integer>(Type.WAIST, 6));
		res.add(new Tuple<Type, Integer>(Type.BODY, 6));
		res.add(new Tuple<Type, Integer>(Type.TORSO, 5));
		res.add(new Tuple<Type, Integer>(Type.EYES, 5));
		res.add(new Tuple<Type, Integer>(Type.FEET, 6));
		res.add(new Tuple<Type, Integer>(Type.HANDS, 6));
		res.add(new Tuple<Type, Integer>(Type.HEAD, 7));
		res.add(new Tuple<Type, Integer>(Type.FOREHEAD, 6));
		res.add(new Tuple<Type, Integer>(Type.NECK, 7));
		res.add(new Tuple<Type, Integer>(Type.SHOULDERS, 7));
		res.add(new Tuple<Type, Integer>(Type.WRIST, 6));
		res.add(new Tuple<Type, Integer>(Type.WITHOUT_LOCATION, 33));
		
		return res;
	}
	
	//Objet merveilleux � la taille de raret� 1.
	public static Data<WonderfulObject> waist1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bande de cabriole", 800, Type.WAIST), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cartouchi�re b�n�fique", 1000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon m�ridien", 1000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture � lame", 1000, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture d�all�gement du fardeau", 2000, Type.WAIST), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Large ceinture aquatique", 2600, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture d��quitation", 3200, Type.WAIST), 16));
	
		return res;
	}
	
	//Objet merveilleux � la taille de raret� 2.
	public static Data<WonderfulObject> waist2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de force de g�ant +2", 4000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de dext�rit� du chat +2", 4000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de constitution de l�ours +2", 4000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture mordante", 4000, Type.WAIST), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de r�cup�ration d�armes", 5000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture du rat contamin�", 5200, Type.WAIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de subsistance", 6000, Type.WAIST), 16));
	
		return res;
	}
	
	//Objet merveilleux � la taille de raret� 3.
	public static Data<WonderfulObject> waist3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture reptilienne", 9000, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture simiesque", 9400, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de puissance de g�ant +2", 10000, Type.WAIST), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de la belette", 10000, Type.WAIST), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de charge tonitruante", 10000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture du Minotaure", 11000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture du rat contamin� sup�rieure", 11200, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de sant�", 12000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de surveillance", 12500, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de jet", 14000, Type.WAIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture des nains", 14900, Type.WAIST), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde de t�nacit�", 15000, Type.WAIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de force de g�ant +4", 16000, Type.WAIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de la perfection physique +2", 16000, Type.WAIST), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de dext�rit� du chat +4", 16000, Type.WAIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de constitution de l�ours +4", 16000, Type.WAIST), 10));	
		return res;
	}
	
	//Objet merveilleux � la taille de raret� 4.
	public static Data<WonderfulObject> waist4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture simiesque sup�rieure", 18000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Anneaux de l�anaconda", 18500, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture reptilienne sup�rieure", 20000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture des h�ros d�chus", 21000, Type.WAIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de la gorgone", 23000, Type.WAIST), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de terre �l�mentaire", 24000, Type.WAIST), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�charpe de d�viation", 25000, Type.WAIST), 16));
	
		return res;
	}
	
	//Objet merveilleux � la taille de raret� 5.
	public static Data<WonderfulObject> waist5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de l�homme-poisson", 32000, Type.WAIST), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de force de g�ant +6", 36000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de dext�rit� du chat +6", 36000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de constitution de l�ours +6", 36000, Type.WAIST), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de puissance de g�ant +4", 40000, Type.WAIST), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de jet sup�rieure", 42000, Type.WAIST), 12));
	
		return res;
	}
	
	//Objet merveilleux � la taille de raret� 6.
	public static Data<WonderfulObject> waist6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture de peau de pierre	", 60000, Type.WAIST), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de la perfection physique +4", 64000, Type.WAIST), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de puissance de g�ant +6", 90000, Type.WAIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinture d�intangibilit�", 110000, Type.WAIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ceinturon de la perfection physique +6", 144000, Type.WAIST), 10));
	
		return res;
	}
	
	//Objet merveilleux port� au corps de raret� 1.
	public static Data<WonderfulObject> body1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de corde infinie", 1000, Type.BODY), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de la manticore", 1000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe d�ossements", 2400, Type.BODY), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +1", 3000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corset du vishkanya", 3000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chasuble de druide", 3750, Type.BODY), 20));
	
		return res;
	}
	
	//Objet merveilleux port� au corps de raret� 2.
	public static Data<WonderfulObject> body2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Soutane de pr�tre", 4600, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de m�morisation", 5000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de composantes", 5000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe d�ensorceleur", 5000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harnais d�ancrage pour eidolon", 6000, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de camelot", 7000, Type.BODY), 25));
	
		return res;
	}
	
	//Objet merveilleux port� au corps de raret� 3.
	public static Data<WonderfulObject> body3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de mim�tisme", 8400, Type.BODY), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe ardente", 11000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe �lectrifi�e", 11000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe gel�e", 11000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +2", 12000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de moine", 13000, Type.BODY), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robes de l�h�ritage magique", 16000, Type.BODY), 25));
		
		return res;
	}
	
	//Objet merveilleux port� au corps de raret� 4.
	public static Data<WonderfulObject> body4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe du xorn", 20000, Type.BODY), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corset de sorcellerie", 22000, Type.BODY), 27));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +3", 27000, Type.BODY), 24));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe prismatique", 27000, Type.BODY), 24));
		
		return res;
	}
	
	//Objet merveilleux port� au corps de raret� 5.
	public static Data<WonderfulObject> body5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cache-poussi�re du tireur", 36000, Type.BODY), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +4", 48000, Type.BODY), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de contrebandier", 48000, Type.BODY), 20));
		
		return res;
	}
	
	//Objet merveilleux port� au corps de raret� 6.
	public static Data<WonderfulObject> body6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
		
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe �toil�e", 58000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de convocation", 64000, Type.BODY), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Kimono mystique", 67000, Type.BODY), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +5", 75000, Type.BODY), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe resplendissante du com�dien", 75000, Type.BODY), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe d�archimage", 75000, Type.BODY), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +6", 108000, Type.BODY), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Robe de vision totale", 120000, Type.BODY), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandelettes de frappes d�vastatrices +7", 147000, Type.BODY), 3));
		
		return res;
	}
	
	//Objet merveilleux port� au torse de raret� 1.
	public static Data<WonderfulObject> torso1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandages de gu�rison rapide", 200, Type.TORSO), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maillot de sprinter", 1000, Type.TORSO), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cartouchi�re in�puisable", 1500, Type.TORSO), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veste � outils", 1800, Type.TORSO), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet de m�decin", 3000, Type.TORSO), 25));
		
		return res;
	}
	
	//Objet merveilleux port� au torse de raret� 2.
	public static Data<WonderfulObject> torso2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�charpe du champion", 4000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veste absorbante", 5000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tunique d�incantation minutieuse", 5000, Type.TORSO), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet d��vasion", 5200, Type.TORSO), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Vareuse de sorci�re ricaneuse", 6000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet de tir impitoyable", 6000, Type.TORSO), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plastron proph�tique", 6000, Type.TORSO), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tunique de puissance d�vastatrice", 6000, Type.TORSO), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet du traqueur", 6000, Type.TORSO), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Uniforme resplendissant", 7000, Type.TORSO), 10));
		
		return res;
	}
	
	//Objet merveilleux port� au torse de raret� 3.
	public static Data<WonderfulObject> torso3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chemise enflamm�e", 8000, Type.TORSO), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tunique en peau de serpent", 8000, Type.TORSO), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baudrier du tueur", 10000, Type.TORSO), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chemise de libert�", 10000, Type.TORSO), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veston de l�empoisonneur", 12000, Type.TORSO), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veste du cafard", 16000, Type.TORSO), 20));
		
		return res;
	}
	
	//Objet merveilleux port� au torse de raret� 4.
	public static Data<WonderfulObject> torso4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
				
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gilet de stabilit� mutag�ne", 20000, Type.TORSO), 50));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Linceul spectral", 26000, Type.TORSO), 50));

		return res;
	}
	
	//Objet merveilleux port� au torse de raret� 5.
	public static Data<WonderfulObject> torso5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
				
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("P�lerine d�immortalit�", 50000, Type.TORSO), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Veston de l�empoisonneur sup�rieur", 58000, Type.TORSO), 40));

		return res;
	}
	
	//Objet merveilleux port� au torse de raret� 6.
	public static Data<WonderfulObject> torso6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
				
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baudrier mis�ricordieux", 60000, Type.TORSO), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chasuble de la foi", 76000, Type.TORSO), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chasuble de r�sistance � la magie", 90000, Type.TORSO), 30));
		
		return res;
	}
	
	//Objet merveilleux port� aux yeux de raret� 1.
	public static Data<WonderfulObject> eyes1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de perception de la mort", 2000, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de lynx", 2500, Type.EYES), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes grossissantes", 2500, Type.EYES), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cache-oeil de pirate", 2600, Type.EYES), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("B�sicles de compr�hension", 3000, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Loupe de d�tection", 3500, Type.EYES), 13));
		
		return res;
	}
	
	//Objet merveilleux port� aux yeux de raret� 2.
	public static Data<WonderfulObject> eyes2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de chouette", 4000, Type.EYES), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux per�ants", 6000, Type.EYES), 24));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes du chasseur de tr�sors", 6400, Type.EYES), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Monocle d�enqu�teur", 6800, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de vision jumel�e", 7500, Type.EYES), 16));
		
		return res;
	}
	
	//Objet merveilleux port� aux yeux de raret� 3.
	public static Data<WonderfulObject> eyes3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes elfiques", 8500, Type.EYES), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de lumi�re aveuglante", 8800, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de l�aveugle", 12000, Type.EYES), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de nyctalope", 12000, Type.EYES), 19));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("B�sicles de d�tection des chim�res", 12000, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de vision � 360�", 15000, Type.EYES), 18));

		
		return res;
	}
	
	//Objet merveilleux port� aux yeux de raret� 4.
	public static Data<WonderfulObject> eyes4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes d�Ombreterre", 20000, Type.EYES), 21));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de sniper", 20000, Type.EYES), 19));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes arc-en-ciel", 21000, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes d�annihilation", 25000, Type.EYES), 19));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux d�anath�me", 25000, Type.EYES), 23));
		
		return res;
	}
	
	//Objet merveilleux port� aux yeux de raret� 5.
	public static Data<WonderfulObject> eyes5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("B�sicles du mauvais �il", 30000, Type.EYES), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de sniper sup�rieures", 50000, Type.EYES), 40));
		
		return res;
	}
	
	//Objet merveilleux port� aux yeux de raret� 6.
	public static Data<WonderfulObject> eyes6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de charme", 56000, Type.EYES), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Monocle d�investigateur", 66000, Type.EYES), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cache-oeil du tyran des mers", 70000, Type.EYES), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du ma�tre d�armes", 80000, Type.EYES), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de domination mentale", 95000, Type.EYES), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Yeux de dragon", 110000, Type.EYES), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunettes de vision lucide", 184800, Type.EYES), 10));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 1.
	public static Data<WonderfulObject> feet1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du chat", 1000, Type.FEET), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de casse-cou", 1400, Type.FEET), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d�endurance", 1500, Type.FEET), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pantoufles de d�marche a�rienne", 2000, Type.FEET), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du terrain amical", 2400, Type.FEET), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes des terres gel�es", 2500, Type.FEET), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes elfiques", 2500, Type.FEET), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons d�acrobate", 3000, Type.FEET), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de rapidit�", 3000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du bourbier", 3500, Type.FEET), 8));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 2.
	public static Data<WonderfulObject> feet2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de cambrioleur", 4000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de ruade d�vastatrice +1", 4000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sandales r�actives", 4000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons de marche brumeuse", 4400, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons d�araign�e", 4800, Type.FEET), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sandales de l�g�ret� a�rienne", 5000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de sept lieues", 5500, Type.FEET), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval du z�phyr", 6000, Type.FEET), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Souliers hant�s", 6480, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d��chapp�e", 7200, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de l�vitation", 7500, Type.FEET), 18));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 3.
	public static Data<WonderfulObject> feet3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d��vasion", 8000, Type.FEET), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d�enracinement", 8000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes cauchemardesque", 8500, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval cauchemardesque", 9000, Type.FEET), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes � chausse-trappes", 10000, Type.FEET), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de perception des vibrations", 10000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes du mastodonte", 10500, Type.FEET), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussures d��clairs bondissants", 10500, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de rapidit�", 12000, Type.FEET), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes verdoyantes", 12000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de ruade d�vastatrice +2", 16000, Type.FEET), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes ail�es", 16000, Type.FEET), 16));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 4.
	public static Data<WonderfulObject> feet4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussures de marche sur le feu", 21000, Type.FEET), 38));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sandales des dryades", 24000, Type.FEET), 34));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de brume", 27000, Type.FEET), 28));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 5.
	public static Data<WonderfulObject> feet5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes d�escampette", 30000, Type.FEET), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de ruade d�vastatrice +3", 36000, Type.FEET), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval glorieux", 39600, Type.FEET), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de cambrioleur sup�rieures", 46000, Type.FEET), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bottes de t�l�portation", 49000, Type.FEET), 25));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 6.
	public static Data<WonderfulObject> feet6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaussons du triton", 56000, Type.FEET), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de ruade d�vastatrice +4", 64000, Type.FEET), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fers � cheval de ruade d�vastatrice +5", 100000, Type.FEET), 30));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 1.
	public static Data<WonderfulObject> hands1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de soutien", 180, Type.HANDS), 13));//180 po wtf
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Griffes de l�ours polaire", 1300, Type.HANDS), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mitaines de reconnaissance", 2000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants luisants", 2000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d�apprenti prestidigitateur", 2200, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants du d�fi", 2200, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d�escamotage", 2500, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants du gu�risseur", 2500, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d�ing�nieur", 3000, Type.HANDS), 10));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 2.
	public static Data<WonderfulObject> hands2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de manoeuvre offensive", 4000, Type.HANDS), 12));//180 po ??
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de vision spectrale", 4000, Type.HANDS), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants antiprojectiles", 4000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de d�samor�age des pi�ges", 4000, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de frappe magique", 5000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants empoisonn�s", 5000, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants magn�tiques", 6000, Type.HANDS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de nage et d�escalade", 6250, Type.HANDS), 25));

		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 3.
	public static Data<WonderfulObject> hands3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d�liquescents", 8000, Type.HANDS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de neutralisation des m�tamorphes", 4000, Type.HANDS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelet du cobra de fer", 8000, Type.HANDS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gant de fauconnier", 8000, Type.HANDS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de magus", 8000, Type.HANDS), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de d�samor�age des glyphes", 9000, Type.HANDS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gant de rangement", 10000, Type.HANDS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de fa�onnage", 10000, Type.HANDS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mitaines d��lasticit�", 10000, Type.HANDS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelet de rouille", 11500, Type.HANDS), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de duelliste", 15000, Type.HANDS), 24));
		
		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 4.
	public static Data<WonderfulObject> hands4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants vampiriques", 18000, Type.HANDS), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de poigne colossale", 20000, Type.HANDS), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants de raccourcis", 27000, Type.HANDS), 35));
		
		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 5.
	public static Data<WonderfulObject> hands5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gants d�invocateur autoritaire", 30000, Type.HANDS), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelet de rouille sup�rieur", 34500, Type.HANDS), 60));
		
		return res;
	}
	
	//Objet merveilleux port� aux pieds de raret� 6.
	public static Data<WonderfulObject> hands6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serres de Leng", 67000, Type.HANDS), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gantelets de ma�tre d�armes", 110000, Type.HANDS), 40));
		
		return res;
	}
	
	//Objet merveilleux port� � la t�te de raret� 1.
	public static Data<WonderfulObject> head1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de l�homme de marbre", 500, Type.HEAD), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef de d�guisement humano�de", 800, Type.HEAD), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Calotte de lumi�re", 900, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef de d�guisement", 1800, Type.HEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef amortissant", 2000, Type.HEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de l�avare", 3000, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque du traqueur", 3500, Type.HEAD), 15));

		return res;
	}
	
	//Objet merveilleux port� � la t�te de raret� 2.
	public static Data<WonderfulObject> head2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-t�te de persuasion", 4500, Type.HEAD), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque du lutteur", 5000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de pr�sence intimidante", 5000, Type.HEAD), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Jingasa du soldat chanceux", 5000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heaume de compr�hension", 5200, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne des �p�es", 6000, Type.HEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-t�te de lumi�re destructrice", 6480, Type.HEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque du krenshar", 7200, Type.HEAD), 13));

		return res;
	}
	
	//Objet merveilleux port� � la t�te de raret� 3.
	public static Data<WonderfulObject> head3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heaume du seigneur des Mammouths", 8500, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Voilette des regards fugaces", 9000, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque encyclop�dique", 10000, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de la m�duse", 10000, Type.HEAD), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef du libre penseur", 12000, Type.HEAD), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Aur�ole de s�r�nit�", 16000, Type.HEAD), 20));

		return res;
	}
	
	//Objet merveilleux port� � la t�te de raret� 4.
	public static Data<WonderfulObject> head4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne oeil-de-chat", 18000, Type.HEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gueule de dragon", 18000, Type.HEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mitre du hi�rophante", 18000, Type.HEAD), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapeau de magicien", 20000, Type.HEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Diad�me de d�tection de pens�es", 22000, Type.HEAD),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque de la camarde", 22000, Type.HEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque hurlant", 22600, Type.HEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-t�te de lumi�re d�vastatrice", 23760, Type.HEAD), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de l�homme-poisson", 24000, Type.HEAD),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne de conqu�rant", 24600, Type.HEAD), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque batracien", 26000, Type.HEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de t�l�pathie", 27000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque anti-�pid�mie", 27000, Type.HEAD), 6));

		return res;
	}
	
	//Objet merveilleux port� � la t�te de raret� 5.
	public static Data<WonderfulObject> head5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Serre-t�te de protection des �mes", 30000, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lauriers de commandement", 30000, Type.HEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque mineur des g�ants", 30000, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couvre-chef de volont� in�branlable", 33600, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heaume du seigneur des temp�tes", 35000, Type.HEAD),17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de cent feux", 36000, Type.HEAD), 22));

		return res;
	}
	
	//Objet merveilleux port� � la t�te de raret� 6.
	public static Data<WonderfulObject> head6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perruque de juge", 59200, Type.HEAD), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de t�l�portation", 73500, Type.HEAD), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Aur�ole de menace", 84000, Type.HEAD), 16));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Masque majeur des g�ants", 90000, Type.HEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque de mille feux", 125000, Type.HEAD),15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Casque d��clat �lectrique", 125000, Type.HEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Diad�me des cieux", 150000, Type.HEAD), 8));

		return res;
	}
	
	//Objet merveilleux port� au front raret� 1.
	public static Data<WonderfulObject> forehead1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylact�re du croyant", 1000, Type.FOREHEAD), 60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du mort", 3600, Type.FOREHEAD), 40));

		return res;
	}
	
	//Objet merveilleux port� au front raret� 2.
	public static Data<WonderfulObject> forehead2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de belle allure +2", 4000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�inspiration +2", 4000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�intelligence +2", 4000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�agilit� a�rienne +2", 4500, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de m�tamorphe +2", 4500, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de r�miniscence", 5100, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de focalisation ki", 5400, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de r�solution in�branlable", 5600, Type.FOREHEAD), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Couronne de houx", 5700, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�infaillible d�termination", 6400, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylact�re du berger", 7000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�intuition", 7000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de chance renforc�e", 7700, Type.FOREHEAD), 9));

		return res;
	}
	
	//Objet merveilleux port� au front raret� 3.
	public static Data<WonderfulObject> forehead3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de l�enrag�", 8000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du serpent", 9000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de prouesse mentale +2", 10000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du chasseur", 11000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylact�re de canalisation d��nergie n�gative", 11000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Phylact�re de canalisation d��nergie positive", 11000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Oeil voil�", 12000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de vaillance", 14000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de ninjitsu", 15000, Type.FOREHEAD), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de belle allure +4", 16000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�inspiration +4", 16000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de sup�riorit� mentale +2", 16000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�intelligence +4", 16000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de m�tamorphe +4", 17500, Type.FOREHEAD), 7));

		return res;
	}
	
	//Objet merveilleux port� au front raret� 4.
	public static Data<WonderfulObject> forehead4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d��nergie magique", 20000, Type.FOREHEAD), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de contresort", 20000, Type.FOREHEAD), 40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de ma�trise des zombis", 27500, Type.FOREHEAD), 30));
		
		return res;
	}
	
	//Objet merveilleux port� au front raret� 5.
	public static Data<WonderfulObject> forehead5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Oeil des �mes", 30000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau du loup arctique", 32000, Type.FOREHEAD), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de belle allure +6", 36000, Type.FOREHEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�inspiration +6", 36000, Type.FOREHEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�intelligence +6", 36000, Type.FOREHEAD), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de m�tamorphe +6", 39000, Type.FOREHEAD), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de prouesse mentale +4", 40000, Type.FOREHEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de s�duction", 40000, Type.FOREHEAD), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�agilit� a�rienne +4", 42000, Type.FOREHEAD), 10));

		return res;
	}
	
	//Objet merveilleux port� au front raret� 6.
	public static Data<WonderfulObject> forehead6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de r�sistance mentale", 64000, Type.FOREHEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de sup�riorit� mentale +4", 64000, Type.FOREHEAD), 30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau d�agilit� a�rienne +6", 81000, Type.FOREHEAD), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de prouesse mentale +6", 90000, Type.FOREHEAD), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bandeau de sup�riorit� mentale +6", 144000, Type.FOREHEAD), 15));

		return res;
	}
	
	//Objet merveilleux port� au cou raret� 1.
	public static Data<WonderfulObject> neck1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Main du mage", 900, Type.NECK), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Effigie de gu�rison", 1500, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +1", 1500, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche de d�fense", 1500, Type.NECK), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (1er mod�le)", 1650, Type.NECK), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�armure naturelle +1", 2000, Type.NECK), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche antigolems", 2500, Type.NECK), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (2e mod�le)", 2700, Type.NECK), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche tueuse de nu�es", 3000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("M�daillon de protection spirituelle", 3500, Type.NECK), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collerette d�imitateur", 3500, Type.NECK), 5));

		return res;
	}
	
	//Objet merveilleux port� au cou raret� 2.
	public static Data<WonderfulObject> neck2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de conflit �l�mentaire", 4000, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +1", 4000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (3e mod�le)", 4350, Type.NECK), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings vertueux", 5000, Type.NECK), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (4e mod�le)", 5400, Type.NECK), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Leurre � temp�tes", 5400, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (5e mod�le)", 5850, Type.NECK),11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +2	", 6000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier de l�enfant-f�e", 6000, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cha�ne de d�tention", 7200, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme de bonne sant�", 7500, Type.NECK), 11));

		return res;
	}
	
	//Objet merveilleux port� au cou raret� 3.
	public static Data<WonderfulObject> neck3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�armure naturelle +2", 8000, Type.NECK), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de protection contre la p�trification", 8000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette anti-sommeil", 8000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pendentif garde-tombes", 8000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Main miraculeuse", 8000, Type.NECK), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Torque de la furie du lion", 8000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (6e mod�le)", 8100, Type.NECK),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier � boules de feu (7e mod�le)", 8700, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de force soudaine", 9000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier d�adaptation", 9000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�astuce magique", 10000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier du fid�le compagnon", 10000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings glac�s", 10000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cristal des mains gu�risseuses	", 12000, Type.NECK), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gorgerin de protection", 12000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("M�daillon des pens�es", 12000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme de protection contre les mal�dictions", 12000, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings ardents", 13000, Type.NECK),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +3", 13500, Type.NECK), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme de coagulation", 15000, Type.NECK), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier de s�r�nit�", 16000, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Broche d��tincelles ambr�es", 16800, Type.NECK), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Symbole de protection sanguine", 17500, Type.NECK), 2));

		return res;
	}
	
	//Objet merveilleux port� au cou raret� 4.
	public static Data<WonderfulObject> neck4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�armure naturelle +3", 18000, Type.NECK), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ampoule de sang factice", 20000, Type.NECK), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des arts magiques", 20000, Type.NECK), 11));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +2", 20000, Type.NECK), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�opposition aux dragons", 20000, Type.NECK), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette de ma�trise magique", 22000, Type.NECK), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +4", 24000, Type.NECK),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Main de pierre", 27000, Type.NECK), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Charme antipoison", 27000, Type.NECK), 15));

		return res;
	}
	
	//Objet merveilleux port� au cou raret� 5.
	public static Data<WonderfulObject> neck5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�armure naturelle +4", 32000, Type.NECK), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�antid�tection", 35000, Type.NECK), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette pare-balle +5", 37500, Type.NECK), 14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Scarab�e de protection", 38000, Type.NECK), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Collier d��toiles enchev�tr�es", 42000, Type.NECK), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +3", 45000, Type.NECK), 18));

		return res;
	}
	
	//Objet merveilleux port� au cou raret� 6.
	public static Data<WonderfulObject> neck6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette d�armure naturelle +5", 50000, Type.NECK), 35));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +4", 80000, Type.NECK), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des plans", 120000, Type.NECK), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Amulette des poings invincibles +5", 125000, Type.NECK), 15));

		return res;
	}
	
	//Objet merveilleux port� aux �paules raret� 1.
	public static Data<WonderfulObject> shoulder1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape enveloppante", 200, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de d�guisement humain", 900, Type.SHOULDERS), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de r�sistance +1", 1000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cordes de mulet", 1000, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ch�le de transfert vital", 1000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape d�fensive", 1000, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de transformiste", 1500, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du l�che accroupi", 1800, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape elfique", 2500, Type.SHOULDERS), 18));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du magicien solitaire", 2500, Type.SHOULDERS), 6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de disparition enflamm�e", 2600, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de crocs", 2800, Type.SHOULDERS), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spalli�res du serpent", 3000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape des brumes montagneuses", 3500, Type.SHOULDERS), 3));

		return res;
	}
	
	//Objet merveilleux port� aux �paules raret� 2.
	public static Data<WonderfulObject> shoulder2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de r�sistance +2", 4000, Type.SHOULDERS), 26));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du rat sanguinaire", 6000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ch�le d��cume de mer", 6000, Type.SHOULDERS), 1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du grand ch�ne", 6000, Type.SHOULDERS), 13));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de l�aigle", 7000, Type.SHOULDERS), 22));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la raie manta", 7200, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du chasseur", 7500, Type.SHOULDERS), 6));
	
		return res;
	}
	
	//Objet merveilleux port� aux �paules raret� 3.
	public static Data<WonderfulObject> shoulder3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de r�sistance +3", 9000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de Marcheur du cr�puscule", 10000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape cocon", 10000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spalli�res du taureau", 10000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de pierre", 10000, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de prestidigitateur", 10800, Type.SHOULDERS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spalli�res du lion vigilant", 10800, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape du lion", 12000, Type.SHOULDERS), 7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Houppelande de spores", 13400, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape d��vasion radieuse", 14000, Type.SHOULDERS), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de l�araign�e", 14000, Type.SHOULDERS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poncho de franc-tireur", 14000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape tentaculaire", 14000, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spalli�res � pointes d�moniaques", 14350, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape confortable", 15600, Type.SHOULDERS), 2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de r�sistance +4", 16000, Type.SHOULDERS), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ch�le de m�g�re", 16000, Type.SHOULDERS), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("P�lerine de bateleur", 17200, Type.SHOULDERS), 9));

		return res;
	}
	
	//Objet merveilleux port� aux �paules raret� 4.
	public static Data<WonderfulObject> shoulder4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�tole de justice", 18000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la m�duse", 19200, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de diplomate", 20000, Type.SHOULDERS), 8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape tranchante", 20000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de pierre sup�rieure", 20000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de d�placement mineure", 24000, Type.SHOULDERS), 12));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de r�sistance +5", 25000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la chauve-souris", 26000, Type.SHOULDERS), 12));

		return res;
	}
	
	//Objet merveilleux port� aux �paules raret� 5.
	public static Data<WonderfulObject> shoulder5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de bandit de grand chemin", 32500, Type.SHOULDERS),40));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Spalli�res de juggernaut", 40000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de charlatan", 45000, Type.SHOULDERS), 40));

		return res;
	}
	
	//Objet merveilleux port� aux �paules raret� 6.
	public static Data<WonderfulObject> shoulder6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de d�placement majeure", 50000, Type.SHOULDERS),15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ailes de vol", 54000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape �th�r�e", 55000, Type.SHOULDERS), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ailes de gargouille", 72000, Type.SHOULDERS), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de la vouivre", 78600, Type.SHOULDERS), 20));

		return res;
	}
	
	//Objet merveilleux port� aux poignets raret� 1.
	public static Data<WonderfulObject> wrist1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manches � v�tements", 200, Type.WRIST),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de lutteur", 500, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +1", 1000, Type.WRIST), 28));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de cambrioleur", 1050, Type.WRIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�assiduit�", 2000, Type.WRIST), 28));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Menottes de coop�ration", 2000, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Menottes d�ob�issance", 3280, Type.WRIST), 4));

		return res;
	}
	
	//Objet merveilleux port� aux poignets raret� 2.
	public static Data<WonderfulObject> wrist2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +2", 4000, Type.WRIST),27));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards du faucon chasseur", 4000, Type.WRIST), 1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Canons fortifi�s d�inquisiteur", 4000, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�archer", 5000, Type.WRIST), 27));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards d�incantation d�fensive", 5000, Type.WRIST), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets Broyeurs", 6000, Type.WRIST), 3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de d�fense", 6000, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de vigne", 6000, Type.WRIST), 17));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards d�allonge", 7200, Type.WRIST), 1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards d�amuseur", 7900, Type.WRIST), 1));

		return res;
	}
	
	//Objet merveilleux port� aux poignets raret� 3.
	public static Data<WonderfulObject> wrist3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de charmes", 8000, Type.WRIST),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Canons de duelliste", 8000, Type.WRIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Canons d�avant-bras mis�ricordieux", 8000, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de tacticien", 8000, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +3", 9000, Type.WRIST), 25));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fl�au des s�ducteurs", 9900, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards du chevalier vengeur", 11500, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets de ma�tre-archer", 13900, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des g�nies (�frit)", 14400, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de n�gociation", 14500, Type.WRIST), 5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets de gr�ce", 15000, Type.WRIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards du chevalier mis�ricordieux", 15600, Type.WRIST), 4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet de chances renouvel�es", 15750, Type.WRIST),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +4", 16000, Type.WRIST), 9));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Menottes de domination", 16200, Type.WRIST), 1));		
		
		return res;
	}
	
	//Objet merveilleux port� aux poignets raret� 4.
	public static Data<WonderfulObject> wrist4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des g�nies (djinn)", 18900, Type.WRIST),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des g�nies (marid)", 18900, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards des g�nies (shaitan)", 18900, Type.WRIST), 10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelet d�assistance", 19000, Type.WRIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�archer hors pair", 25000, Type.WRIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +5", 25000, Type.WRIST), 20));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brassards de vengeance", 25000, Type.WRIST), 10));
		
		return res;
	}
	
	//Objet merveilleux port� aux poignets raret� 5.
	public static Data<WonderfulObject> wrist5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cha�nes dimensionnelles", 28000, Type.WRIST),30));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets des Hauts Elfes", 30000, Type.WRIST), 15));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +6", 36000, Type.WRIST), 55));
		
		return res;
	}
	
	//Objet merveilleux port� aux poignets raret� 6.
	public static Data<WonderfulObject> wrist6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +7", 49000, Type.WRIST),60));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bracelets d�armure +8", 64000, Type.WRIST), 40));
		
		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 0.
	public static Data<WonderfulObject> withoutLocation0(){//ATTENTION RARETE 0
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (ancre)", 50, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Solvant universel", 50, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Torche ioun", 75, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Piton tenace", 100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Peinture de guerre du terrible visage", 100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir d�amour", 150, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent d�intemporalit�", 150, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (�ventail)", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Alambic � formules", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Entonnoir d�hybridation", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Savon de l��me", 200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre de dissimulation des traces", 250, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir de discr�tion instinctive", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir de nage", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir d�acrobatie", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir d�acuit� visuelle", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gouttes de vision nocturne", 250, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Huile de silence", 250, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lustrargent", 250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Outil multifonction de baroudeur", 250, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bouteille � message", 300, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (oiseau)", 300, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Vermine en papier pli�", 300, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pomme d�or all�chante", 400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (arbre)", 400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Clef de solide fermeture", 400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (bateau cygne)", 450, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Portrait anim�", 500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Mal�fice en bouteille", 500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("S�rum de v�rit�", 500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Plume magique (fouet)", 500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau � aiguiser", 500, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Th� divinatoire", 550, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sel d�abjuration", 600, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Aimant � projectiles", 600, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre obscurcissante", 600, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de feu de camp", 720, Type.WITHOUT_LOCATION),6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Torche d�archon", 750, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre de convocation durable inf�rieur", 750, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde de fer", 750, Type.WITHOUT_LOCATION),4));	
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Feuille magique", 750, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourrure de y�ti en bouteille", 800, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cirage d�foliant", 800, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poussi�re d��mulation", 800, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre d�entrailles en acier", 800, Type.WITHOUT_LOCATION),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre dessiccative", 850, Type.WITHOUT_LOCATION),3));

		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 1.
	public static Data<WonderfulObject> withoutLocation1(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("RARITY0", -9999999, Type.NONE), 3));//Le premier element am�ne � la raret� 0.
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poup�e anatomique", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille antim�tamorphose", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("P�te de lien animal", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ex-libris de rappel", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (1er niveau)", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poche de dissimulation", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Liqueur radiesth�sique", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Encens de transcendance", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (1er niveau)", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (1er niveau)", 1000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (1er niveau)", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Ciboire des domaines alt�r�s", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent d�insaisissabilit�", 1000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Nid grouillant de gu�pes", 1000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir de souffle enflamm�", 1100, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sel fun�raire", 1100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fl�te d�Hamelin", 1150, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre d�illusion", 1200, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cr�ne gobelin explosif", 1200, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�lixir de souffle draconique", 1400, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Marque-page trompeur", 1500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bouteille � paroles", 1500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre absorbante acide", 1600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre d�apparition", 1800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carquois efficace", 1800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fl�te � bruitages", 1800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau de vigueur", 1800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("B�ton de marche agile", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sang de prouesse physique", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bo�te � tintamarre", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne � poudre �tanche", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tambour de feu gobelin", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Havresac du mage", 2000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne de brume", 2000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pointe en fer illusoire", 2000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pennon du chevalier (honneur)", 2200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pilule volatile (1er niveau)", 2200, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme � �l�mentaire", 2250, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent de vol", 2250, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Colle universelle", 2400, Type.WITHOUT_LOCATION),1));	
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pomme du sommeil �ternel", 2500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (1er mod�le)", 2500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cierge de v�rit�", 2500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poup�e malfaisante", 2500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre d�alerte", 2700, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre de convocation durable interm�diaire", 2750, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de force", 3000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron � d�coction", 3000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carillon d�ouverture", 3000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Philtre d�amour", 3000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde d�escalade", 3000, Type.WITHOUT_LOCATION),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pilule volatile (2e niveau)", 3000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Linceul de d�sint�gration", 3300, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac � malice (gris)", 3400, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre de disparition", 3500, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre d�alourdissement", 3600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pyxide de vigilance", 3600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (corbeau d�argent)", 3800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pilule volatile (3e niveau)", 3800, Type.WITHOUT_LOCATION),1));

		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 2.
	public static Data<WonderfulObject> withoutLocation2(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (2e niveau)", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fili�re de pr�caution", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�chelle dimensionnelle	", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunette longue distance", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (fuseau translucide)", 4000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pigments merveilleux", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (2e niveau)", 4000, Type.WITHOUT_LOCATION),8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (2e niveau)", 4000, Type.WITHOUT_LOCATION),10));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (2e niveau)", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent de restauration", 4000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Onguent des roches", 4000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Compas des vents", 4400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tambour de feu gobelin (incendiaire)", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pennon du chevalier (bataille)", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pennon du chevalier (pourparler)", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Poudre n�antis�e", 4500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Encens de m�ditation", 4900, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fiole de m�lange", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (2e mod�le)", 5000, Type.WITHOUT_LOCATION),14));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lame d�os", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne du grand veneur", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Heurtoir de porte magique", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme rose laiteux)", 5000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maillet de b�tisseur", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bourse polymorphe", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau de coagulation", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banc d�yeux-poissons indiscrets", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau de lame discr�te", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre d�alliance", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fer de convocation", 5000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Urne fumig�ne", 5400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cuill�re nourrissante", 5400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�ventail enchant�", 5500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lanterne macabre", 5800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pi�ce de destin�e al�atoire", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor de lucidit� martiale", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Insigne de lien vital", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Larme de martyr", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fl�te de hantise", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde de nouement", 6000, Type.WITHOUT_LOCATION),1));	
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bol chantant de frappe ki", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Familier de pierre", 6000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre de convocation durable sup�rieur", 6126, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baguettes divinatoires en os de dragon", 6400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor du Bien/du Mal", 6500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bindi en �caille de naga", 6600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flacon d�ombres", 7000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cape de bravade", 7000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pont escamotable", 7000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir aux reflets protecteurs", 7000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bateau pliant", 7200, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flacon d�air pur", 7250, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (3e mod�le)", 7400, Type.WITHOUT_LOCATION),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Baume de souplesse taquine", 7500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bougie d�air pur", 7500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe de suggestion", 7500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de guerre", 7500, Type.WITHOUT_LOCATION),3));

		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 3.
	public static Data<WonderfulObject> withoutLocation3(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Coupe de larmes toxiques", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Goupillon d�exorciste", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de cr�ation des golems (de chair)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe fracassante", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Insigne de courage", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sph�re rouge sang)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sph�re bleu incandescent)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (rhombe bleu p�le)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sph�re rose et verte)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (rhombe rose vif)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (sph�re rouge et bleue)", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Aiguilles de tatouage magiques", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Outils de cambrioleur anim�s", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sifflet-garou", 8000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cartes fantasmagoriques", 8100, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cierge d�invocation", 8400, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac � malice (rouille)", 8500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (3e niveau)", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carafe intarissable", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir d�testable", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (3e niveau)", 9000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (3e niveau)", 9000, Type.WITHOUT_LOCATION),6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (3e niveau)", 9000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (hibou de chrysolite)", 9100, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapelet de pri�res mineur", 9600, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac sans fond (4e mod�le)", 10000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Craie de d�limitation", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carillon de silence retentissant", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Brique de r�paration", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe du destin", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tambour de course", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fil d�embaumement", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Oeil indicible", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (griffon de bronze)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (mouche d��b�ne)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (araign�e d�ardoise)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sablier de la derni�re chance", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (rhombe bleu nuit)", 10000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Natte de ki", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banni�re seigneuriale (diligence)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Symbole sacr� mall�able", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Coffret du minet", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Symbole de lumi�re gu�risseuse", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Moulin � pri�re de puissance morale", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cheval de pierre (coursier)", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cristal de possession", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Scell� de tr�sorier", 10000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme d��me noircie", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de cr�ation des golems (d�argile)", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Selle du ma�tre de guerre", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fl�te de dissipation", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fl�te de douleur", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lunette de d�tection de l�invisibilit�", 12000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre magique", 12500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Essences de transmutation", 12500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme d�illumination", 13000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Harpe de contagion", 13000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lyre de b�tisseur", 13000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banni�re n�antis�e", 14000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cheval de pierre (destrier)", 14800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Livre du ma�tre du savoir", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron d�abondance", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trompette du jugement", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Conque des tritons", 15000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle des sir�nes", 15300, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (chien d�onyx)", 15500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Sac � malice (ocre)", 16000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (4e niveau)", 16000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (4e niveau)", 16000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (4e niveau)", 16000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (4e niveau)", 16000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Fourreau d�aff�tage", 16000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (lions d�or)", 16500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Carillon d�interruption", 16800, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Balai volant", 17000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (�l�phant de marbre)", 17000, Type.WITHOUT_LOCATION),1));

		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 4.
	public static Data<WonderfulObject> withoutLocation4(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (fuseau iris�)", 18000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe d��pouvante abaddonienne", 18000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tapis volant (1,50 m � 1,50 m)", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne d�antagonisme", 20000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor de d�vastation", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (ellipso�de lavande)", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (fuseau blanc laiteux)", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cloche dor�e de bannissement", 20000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Atham� du n�cromancien", 20000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Puits portable", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre porte-bonheur", 20000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (ch�vres d�ivoire)", 21000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corde d�enchev�trement", 21000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de cr�ation des golems (de pierre)", 22000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe des cieux", 22000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pioche des titans", 23348, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Corne d��ternelle bravoure", 24000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (5e niveau)", 25000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("�meraude chaotique", 25000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (5e niveau)", 25000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (5e niveau)", 25000, Type.WITHOUT_LOCATION),7));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (5e niveau)", 25000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Maillet des titans", 23305, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Liens d�acier mystiques", 26000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cube de r�sistance au froid", 27000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalit� +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de perspicacit� +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� d�autorit� et d�influence +1", 27500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de compr�hension +1", 27500, Type.WITHOUT_LOCATION),4));

		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 5.
	public static Data<WonderfulObject> withoutLocation5(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Statuette merveilleuse (destrier d�obsidienne)", 28500, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron des morts", 30000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Timbales de panique", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme orange)", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme vert p�le)", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Lanterne r�v�latrice", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Balai volant (de course)", 30000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron de r�surrection", 33000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tapis volant (1,50 m � 3 m)", 35000, Type.WITHOUT_LOCATION),5));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de cr�ation des golems (de fer)", 35000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bille de bore (6e niveau)", 36000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (prisme violet vif)", 36000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe de chaos absolu", 36000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (6e niveau)", 36000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (6e niveau)", 36000, Type.WITHOUT_LOCATION),8));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de conservation alchimique (6e niveau)", 36000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron volant", 40000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Talisman d�animosit�", 40000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre ioun (ellipso�de vert et lavande)", 40000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Anneaux de transport", 40000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chaudron de vision", 42000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal", 42000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de cr�ation des golems (de pierre monumentaux)", 44000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Timbales de rapidit�", 45000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapelet de pri�res courant", 45800, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe des temp�tes", 48000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (7e niveau)", 49000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (7e niveau)", 49000, Type.WITHOUT_LOCATION),4));

		return res;
	}
	
	//Objet merveilleux sans emplacement raret� 6.
	public static Data<WonderfulObject> withoutLocation6(){
		Data<WonderfulObject> res = new Data<WonderfulObject>();
			
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (d�tection de l�invisibilit�)", 50000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor du Valhalla", 50000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (d�tection des pens�es)", 51000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Feuilles automnales des dryades", 52000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Forteresse instantan�e", 55000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalit� +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de perspicacit� +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� d�autorit� et d�influence +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de compr�hension +2", 55000, Type.WITHOUT_LOCATION),4));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banni�re seigneuriale (terreur)", 56000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Tapis volant (3 m � 3 m)", 60000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cr�ne des t�n�bres", 60000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Orbe de loi parfaite", 60000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cube de force", 62000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (8e niveau)", 64000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (8e niveau)", 64000, Type.WITHOUT_LOCATION),6));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (t�l�pathie)", 70000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cor de d�vastation sup�rieur", 70000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (deux sorts)", 70000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Gemme de vision", 75000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banni�re seigneuriale (victoire)", 75000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Boule de cristal (vision lucide)", 80000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Page de connaissances magiques (9e niveau)", 81000, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Perle de thaumaturge (9e niveau)", 81000, Type.WITHOUT_LOCATION),3));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Puits des mondes", 82000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalit� +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de perspicacit� +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� d�autorit� et d�influence +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de compr�hension +3", 82500, Type.WITHOUT_LOCATION),2));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Submersible du crabe", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bol de convocation d��l�mentaires de l�Eau", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Bras�ro de convocation d��l�mentaires du Feu", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Encensoir de convocation d��l�mentaires de l�Air", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Pierre de convocation d��l�mentaires de la Terre", 90000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir d�opposition", 92000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Chapelet de pri�res majeur", 95800, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Banni�re seigneuriale (croisades)", 100000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalit� +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de perspicacit� +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� d�autorit� et d�influence +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de compr�hension +4", 110000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de vitalit� +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de remise en forme +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Manuel de coordination physique +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de perspicacit� +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� d�autorit� et d�influence +5", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Trait� de compr�hension +5	", 137500, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Urne du mauvais g�nie", 145000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Cube des plans", 164000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Flasque de fer", 170000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir de prouesse mentale", 175000, Type.WITHOUT_LOCATION),1));
		res.add(new Tuple<WonderfulObject, Integer>(new WonderfulObject("Miroir d�emprisonnement", 200000, Type.WITHOUT_LOCATION),1));
		
		return res;
	}
}
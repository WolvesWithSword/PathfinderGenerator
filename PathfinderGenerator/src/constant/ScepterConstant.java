package constant;

import item.scepter.Scepter;
import item.scepter.Type;
import utility.Data;
import utility.Tuple;

/**
 * Les tableaux de tirages pour les sceptres magique
 * PAS DE RARETE EN DESSOUS DE 3
 * Raret� 3 : interm�diaire inf�rieur
 * Raret� 4 : interm�diaire sup�rieur
 * Raret� 5 : puissant inf�rieur
 * Raret� 6 : puissant sup�rieur
 * @author Mentra20
 *
 */
public class ScepterConstant {
	
	//sceptre de raret� 3.
	public static Data<Scepter> rarity3(){
		Data<Scepter> res = new Data<Scepter>();
		
		res.add(new Tuple<Scepter, Integer>(new Scepter("M�tamagie, mis�ricordieux", Type.MINOR, 1500), 1));
		res.add(new Tuple<Scepter, Integer>(new Scepter(1, Type.MINOR, 3000),33));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre inamovible", Type.NONE, 5000), 15));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de force assourdissante", Type.NONE, 5400), 10));
		res.add(new Tuple<Scepter, Integer>(new Scepter("M�tamagie, mis�ricordieux", Type.NORMAL, 5500), 1));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de glace", Type.NONE, 8500), 1));
		res.add(new Tuple<Scepter, Integer>(new Scepter(2, Type.MINOR, 9000), 10));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de d�tection des m�taux et des min�raux", Type.NONE, 10500), 10));
		res.add(new Tuple<Scepter, Integer>(new Scepter(1, Type.NORMAL, 11000), 5));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d�annulation", Type.NONE, 11000), 14));
			
		return res;
	}
	
	//sceptre de raret� 4.
	public static Data<Scepter> rarity4(){
		Data<Scepter> res = new Data<Scepter>();
		
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre conducteur", Type.NONE, 12000), 3));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d�ancrage", Type.NONE, 12000),3));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre du wayang", Type.NONE, 12000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre merveilleux", Type.NONE, 12000), 8));
		res.add(new Tuple<Scepter, Integer>(new Scepter("M�tamagie, mis�ricordieux", Type.SUPERIOR, 12250), 1));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre du python", Type.NONE, 13000), 10));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre du voleur de pi�ges", Type.NONE, 13500), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter(3, Type.MINOR, 14000), 22));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d��quilibre", Type.NONE, 15000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d��vasion", Type.NONE, 15000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d�extinction des feux", Type.NONE, 15000), 9));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de ruine", Type.NONE, 16000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de l�arbrisseau", Type.NONE, 16650), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d�envo�tement", Type.NONE, 18000), 6));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d�orties", Type.NONE, 18000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de la vip�re", Type.NONE, 19000), 10));
			
		return res;
	}
	
	//sceptre de raret� 5.
	public static Data<Scepter> rarity5(){
		Data<Scepter> res = new Data<Scepter>();
		
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre suzerain", Type.NONE, 20000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de nimbe enflamm�", Type.NONE, 22305),2));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de d�tection des ennemis", Type.NONE, 23500), 7));
		res.add(new Tuple<Scepter, Integer>(new Scepter(1, Type.SUPERIOR, 24500), 14));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de prestance", Type.NONE, 25000), 9));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de fl�trissement", Type.NONE, 25000), 8));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de la terre", Type.NONE, 26500), 6));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de l�aboleth", Type.NONE, 29000), 6));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre du lib�rateur", Type.NONE, 30000), 7));
		res.add(new Tuple<Scepter, Integer>(new Scepter(2, Type.NORMAL, 32500), 7));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de l�orage", Type.NONE, 33000), 9));
		res.add(new Tuple<Scepter, Integer>(new Scepter("M�tamagie, � incantation rapide", Type.MINOR, 35000), 4));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de n�gation", Type.NONE, 37000), 11));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de r�solution in�branlable", Type.NONE, 38305), 6));
			
		return res;
	}
	
	//sceptre de raret� 6.
	public static Data<Scepter> rarity6(){
		Data<Scepter> res = new Data<Scepter>();
		
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre d�absorption", Type.NONE, 50000), 8));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre du grand fl�au", Type.NONE, 50000),3));
		res.add(new Tuple<Scepter, Integer>(new Scepter(3, Type.NORMAL, 54000), 15));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de suzerainet�", Type.NONE, 60000), 2));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de s�curit�", Type.NONE, 61000), 2));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre des ombres", Type.NONE, 64305), 2));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de contr�le mental", Type.NONE, 67000), 2));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre des seigneurs de la guerre", Type.NONE, 70000), 3));
		res.add(new Tuple<Scepter, Integer>(new Scepter(2, Type.SUPERIOR, 73000), 20));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre du paradis", Type.NONE, 74000), 1));
		res.add(new Tuple<Scepter, Integer>(new Scepter("M�tamagie, � incantation rapide", Type.NORMAL, 75500), 10));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de puissance nain", Type.NONE, 80000), 2));
		res.add(new Tuple<Scepter, Integer>(new Scepter("Sceptre de vigilance", Type.NONE, 85000), 5));
		res.add(new Tuple<Scepter, Integer>(new Scepter(3, Type.SUPERIOR, 121500), 20));
		res.add(new Tuple<Scepter, Integer>(new Scepter("M�tamagie, � incantation rapide", Type.SUPERIOR, 170000), 5));
			
		return res;
	}
	
	//Sceptre metamagique de sort niveau 1
	public static Data<String> spellLevel1(){
		Data<String> res = new Data<String>();
		
		res.add(new Tuple<String, Integer>("rebonds", 4));
		res.add(new Tuple<String, Integer>("perturbateur", 5));
		res.add(new Tuple<String, Integer>("ectoplasmique", 5));
		res.add(new Tuple<String, Integer>("�l�mentaire", 5));
		res.add(new Tuple<String, Integer>("extension de port�e", 12));
		res.add(new Tuple<String, Integer>("extension de dur�e", 12));
		res.add(new Tuple<String, Integer>("�blouissant", 5));
		res.add(new Tuple<String, Integer>("concentr�", 5));
		res.add(new Tuple<String, Integer>("intense", 5));
		res.add(new Tuple<String, Integer>("soutenu", 5));
		res.add(new Tuple<String, Integer>("transper�ant", 5));
		res.add(new Tuple<String, Integer>("�loign�", 5));
		res.add(new Tuple<String, Integer>("gel�", 5));
		res.add(new Tuple<String, Integer>("s�lectif", 5));
		res.add(new Tuple<String, Integer>("incantation silencieuse", 12));
		res.add(new Tuple<String, Integer>("renversant", 5));

		return res;
	}
	
	//Sceptre metamagique de sort niveau 2
	public static Data<String> spellLevel2(){
		Data<String> res = new Data<String>();
		
		res.add(new Tuple<String, Integer>("br�lant", 11));
		res.add(new Tuple<String, Integer>("marquant", 11));
		res.add(new Tuple<String, Integer>("extension d�effet", 18));
		res.add(new Tuple<String, Integer>("persistant", 11));
		res.add(new Tuple<String, Integer>("traumatisant", 11));
		res.add(new Tuple<String, Integer>("thanatopique", 13));
		res.add(new Tuple<String, Integer>("thr�nodique", 13));
		res.add(new Tuple<String, Integer>("tonitruant", 12));

		return res;
	}
	
	//Sceptre metamagique de sort niveau 3
	public static Data<String> spellLevel3(){
		Data<String> res = new Data<String>();
		
		res.add(new Tuple<String, Integer>("h�b�tant", 20));
		res.add(new Tuple<String, Integer>("�cho magique", 20));
		res.add(new Tuple<String, Integer>("quintessence des sorts", 30));
		res.add(new Tuple<String, Integer>("extension de zone d�effet", 30));

		return res;
	}
}

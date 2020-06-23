package constant;

import item.staff.Staff;
import utility.Data;
import utility.Tuple;

/**
 * Les tableaux de tirages pour les b�tons magique
 * PAS DE RARETE EN DESSOUS DE 3
 * Raret� 3 : interm�diaire inf�rieur
 * Raret� 4 : interm�diaire sup�rieur
 * Raret� 5 : puissant inf�rieur
 * Raret� 6 : puissant sup�rieur
 * @author Mentra20
 *
 */

public class StaffConstant {
	
	//b�tons de raret� 3.
	public static Data<Staff> rarity3(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de soulagement b�ni", 7200), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des arcanes mineures", 8000), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�astuces", 8800), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de l��claireur", 9600), 14));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des eidolons", 14400), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�accompagnement", 14800), 13));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�entendement", 16000), 17));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�envo�tement", 17600), 16));
			
		return res;
	} 
	
	//b�tons de raret� 4.
	public static Data<Staff> rarity4(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de feu", 18950), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de courage", 19200), 10));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de d�nigrement", 20000), 8));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de festin et de famine", 20800), 9));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de rigueur", 20800), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton du grand essaim", 22800), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�autorit�", 23000), 8));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de rayonnement", 23200), 13));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d'alt�ration de taille", 26150), 11));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des voyages", 27200), 8));
			
		return res;
	} 
	
	//b�tons de raret� 5.
	public static Data<Staff> rarity5(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�acide", 28600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des hurlements", 28800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton du Chaos", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton sacr�", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de la Loi", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de gu�rison", 29600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton maudit", 29600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton du ma�tre", 30000), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des araign�es", 30200), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d��lectricit�", 31900), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("Fl�au de l�h�r�tique", 32000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton musical", 32000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des �mes", 32800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de toxines", 34200), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de discr�tion", 36800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton du justicier", 37310), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des aspects", 37600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de rh�torique", 39600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de givre", 41400), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de renforcement", 41600), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des mal�dictions", 43500), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de flamme noire", 47000), 7));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des ricanements", 47200), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de repr�sentation", 48800),4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton anim�", 49800), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des r�v�lations", 51008), 3));
			
		return res;
	} 
	
	//b�tons de raret� 6.
	public static Data<Staff> rarity6(){
		Data<Staff> res = new Data<Staff>();
		
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de clart�", 51500), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des obstacles", 51600), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de ciel et terre", 54000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de d�placement", 54400), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des tr�sors", 55866), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des pi�ges", 56925), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des rayons", 57200), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de puissance en mithral", 58000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de d�fense", 62000), 4));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des plans", 63960), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton des ombres affam�es", 69300), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton du dragon", 81000), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de sommeil", 81766), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d�abjuration", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d'invocation", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de divination", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d'enchantement", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d'�vocation", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton d'illusion", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de n�cromancie", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de transmutation", 82000), 5));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton m�t�o", 84066), 2));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de pierre et terre", 85800), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de vision", 86666),2));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de la for�t profonde", 100400), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de vie", 109400), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton aux cent mains", 180200), 1));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de transport", 206900), 3));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton du hi�rophante", 220000), 1));
		res.add(new Tuple<Staff, Integer>(new Staff("B�ton de surpuissance", 235000), 1));
			
		return res;
	} 
}

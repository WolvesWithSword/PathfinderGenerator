package constant;
/**
 * Les tableaux de tirages pour les objets d'arts
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

import artItem.ArtItem;
import utility.Data;
import utility.Tuple;

public class ArtItemConstant {
	
	//objet d'art de raret� 1.
	public static Data<ArtItem> rarity1(){
		Data<ArtItem> res = new Data<ArtItem>();
		
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statuette de guerrier en bronze", 15), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carillon en cuivre �labor�", 20), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�ventail peint en papier avec une armature en argent", 20), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en cuivre et en verre", 25), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacr� en argent", 25), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole sculpt�e dans la pierre", 30), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assortiment de six d�s en ivoire", 30), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en ivoire grav�s d�animaux", 40), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("poup�e de porcelaine avec des habits de soie", 40), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque de porcelaine", 40), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en bronze grav�e de guerrier", 50), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("brasero en cuivre avec des gravures religieuses", 50), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre de cuivre avec des incrustations en or", 50), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("oeuf de cristal sur un pr�sentoir en argent", 50), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d�une noble", 50), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en �b�nite polie", 50), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de b�b� en argent", 50), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�chiquier en argent", 50), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�tui � parchemin en ivoire", 60), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette en argent d�cor�e", 60), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("corne � boire en ivoire avec un embout en cuivre", 60), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceau en argent d�une famille noble", 60), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statue de dragon en argent", 65), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir en �lectrum avec des filigranes d�argent", 70), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chandelier en argent avec un symbole sacr�", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peigne en argent avec une poign�e ornement�e", 75), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("miroir � main en argent", 75), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("cr�ne en cristal", 80), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("fl�te ornement�e en argent", 80), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarab�e grav� en jade", 85), 3));
		
		return res;
	}
	
	//objet d'art de raret� 2.
	public static Data<ArtItem> rarity2(){
		Data<ArtItem> res = new Data<ArtItem>();
		
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carillon �labor� en argent", 60), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarab�e en or grav�", 75), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�ventail peint en soie avec une armature en �lectrum", 75), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("t�te d�animal empaill� mont�e sur une plaque", 75), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assortiment de six d�s en argent", 75), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en argent et en verre", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en argent grav� de lion", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque en argent", 75), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole sculpt�e dans le jade", 80), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("poup�e de porcelaine habill�e de fourrures et de bijoux", 80), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("brasero en argent avec des symboles religieux", 80), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en argent avec des symboles religieux", 80), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir d�or avec des filigranes en argent", 90), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�chiquier en or et en argent", 100), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de b�b� en or", 100), 2));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacr� en or", 100), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("lyre de ma�tre", 100), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d�une princesse", 100), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coupe en argent frapp�e du blason royal", 100), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette d�cor�e en �lectrum", 110), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statue de dragon en or", 110), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statue de lion en or", 110), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("corne � boire en ivoire avec un embout en argent", 110), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("miroir � main en or et en argent", 120), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chaudron en argent avec des symboles d�animaux", 120), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peigne en argent avec une poign�e en or", 125), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("oeuf en argent avec une figurine de dragon", 125), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre en argent avec des aigles", 125), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en argent avec des dragons grav�s", 150), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chandelier en or avec un symbole sacr�", 200), 3));
		
		return res;
	}
	
	//objet d'art de raret� 3.
	public static Data<ArtItem> rarity3(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("cr�ne de d�mon plaqu� or", 300), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole de marbre", 300), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("luth de ma�tre en �b�nite", 300), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarab�e grav� en mithral", 400), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en or et en ivoire", 400), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en or grav� de dragons", 400), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir en or avec des incrustations de platine", 400), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque en or", 450), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de b�b� en or et en mithral", 500), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�chiquier en or", 500), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en or avec des symboles religieux", 500), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bo�te � puzzle en or", 500), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacr� en platine", 500), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coupe en or frapp� du blason royal", 550), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en or grav� de griffons", 600), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre en mithral avec des incrustations d�or", 600), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette d�cor�e en or", 700), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statuette de divinit� en or et en platine", 750), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chaudron en or avec des symboles alchimiques", 750), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture de reine", 750), 4));
			
		return res;
	}
	
	//objet d'art de raret� 4.
	public static Data<ArtItem> rarity4(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("scarab�e grav� en platine", 700), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("cr�ne de dragon plaqu� or", 800), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bol en platine avec des gravures �sot�riques", 800), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("encensoir ornement� en platine", 800), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("carafe en or d�cor�e de grappes de raisin", 850), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("masque en platine", 900), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�chiquier en or et en mithral", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("plan�taire en or et en platine", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("fl�te en or", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole en or avec d��tranges gravures", 1000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("hochet de b�b� en platine", 1000), 1));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("symbole sacr� en platine d�un pr�tre c�l�bre", 1000), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("assiette d�cor�e en platine", 1100), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("chaudron de platine avec d��tranges symboles", 1100), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("flasque en platine avec des symboles religieux", 1100), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coupe en platine frapp�e du blason royal", 1200), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sceptre de platine avec incrustations d�or", 1200), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en platine avec des anges grav�s", 1200), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("statuette de divinit� en platine", 1300), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d�une reine r�alis�e par un ma�tre", 1500), 7));
			
		return res;
	}
	
	//objet d'art de raret� 5.
	public static Data<ArtItem> rarity5(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("livre de chansons oubli�es �crit par un c�l�bre barde", 3000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bo�te � musique en �b�nite et en platine", 4000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("sablier en mithral avec de la poussi�re de diamant", 4000), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("oeuf orn� de gemmes contenant le sang d�un ensorceleur �pique", 4500), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("urne en or contenant les cendres d�un h�ros", 4500), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("heaume taill� dans le cr�ne d�un diantrefosse", 5000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("texte sacr� �crit de la main d�un saint", 5000), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("peinture d�une reine bien-aim�e par un ma�tre", 5000), 10));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("idole de platine avec de myst�rieuses gravures", 5000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�p�e d�apparat incrust�e de gemmes", 6000), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("f�mur de saint grav�", 6000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("calice en platine b�ni par un saint", 6000), 5));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("m�t�ore m�tallique luisant", 6500), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("orbe royal en or incrust� de joyaux", 7000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coeur de dragon cristallis�", 7500), 3));
			
		return res;
	}
	
	//objet d'art de raret� 6.
	public static Data<ArtItem> rarity6(){
		Data<ArtItem> res = new Data<ArtItem>();
			
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�me de vampire gel�e", 7000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("corne de licorne avec incrustations de mithral", 7000), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("souffle de dieu cristallis�", 10000), 3));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("essence de v�rit�", 10000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("globe d�air pur", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("coeur de la montagne", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("gemme d��me invers�e", 10000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("orbe d�eau vivante", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("�clat de feu pur", 10000), 9));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("glace qui ne fond jamais", 10000), 8));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("bijou temporel", 11000), 7));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("casse-t�te insoluble en adamantium", 12000), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("texte sacr� �crit avec le sang d�un saint", 12000), 6));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("tribarre en mithral", 12000), 4));
		res.add(new Tuple<ArtItem, Integer>(new ArtItem("tapisserie �th�r�e", 13000), 7));
			
		return res;
	}

}

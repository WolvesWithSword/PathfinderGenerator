package constant;

import item.wand.Wand;
import utility.Data;
import utility.Tuple;

/**
 * WandConstant contient toutes les constantes pour cr��er une baguette.
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
public class WandConstant {

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
		res.add(new Tuple<Integer, Integer>(1, 80));
		res.add(new Tuple<Integer, Integer>(2, 20));
		
		
		return res;
	}
	
	//Tirage pour les potions de raret� 3.
	public static Data<Integer> rarity3(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 75));
		res.add(new Tuple<Integer, Integer>(3, 25));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 4.
	public static Data<Integer> rarity4(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(2, 20));
		res.add(new Tuple<Integer, Integer>(3, 80));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 5.
	public static Data<Integer> rarity5(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(3, 60));
		res.add(new Tuple<Integer, Integer>(4, 40));
		
		return res;
	}
	
	//Tirage pour les potions de raret� 6.
	public static Data<Integer> rarity6(){
		Data<Integer> res = new Data<Integer>();
		res.add(new Tuple<Integer, Integer>(3, 30));
		res.add(new Tuple<Integer, Integer>(4, 70));
		
		return res;
	}	
	
	// Baguette commune de niveau 0
	public static Data<Wand> commonWand0(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("aspersion acide", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("cr�ation d�eau", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("h�b�tement", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection de la magie", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("son imaginaire", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("lumi�re", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("manipulation � distance", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("r�paration", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("message", 375), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("prestidigitation", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("purification de nourriture et d�eau", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon de givre", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("lecture de la magie", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("stabilisation", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("fatigue", 375), 5));
	
		return res;
	}
	
	// Baguette commune de niveau 1
	public static Data<Wand> commonWand1(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("alarme", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("corde anim�e", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("impr�cation", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("b�n�diction", 750), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("mains br�lantes", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("frayeur", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("charme-personne", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("couleurs dansantes", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("injonction", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("compr�hension des langages", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("soins l�gers", 750), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("d�guisement", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("faveur divine", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("endurance aux �nergies destructives", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("agrandissement", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("enchev�trement", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("repli exp�ditif", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("feuille morte", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("graisse", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("identification", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure l�g�re", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("armure de mage", 750), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("morsure magique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("projectile magique", 750), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("pierre magique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("arme magique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("brume de dissimulation", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("flammes", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre le Chaos", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre le Mal", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre le Bien", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre la Loi", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon affaiblissant", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("regain d�assurance", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de la foi", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("gourdin magique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�charge �lectrique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("image silencieuse", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("sommeil", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres I", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d�alli�s naturels I", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("coup au but", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("serviteur invisible", 750), 1));
	
		return res;
	}
	
	// Baguette commune de niveau 2
	public static Data<Wand> commonWand2(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("fl�che d'acide", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aide", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("modification d'apparence", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("peau d'�corce", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("endurance de l'ours", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("flou", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("force du taureau", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("gr�ce f�line", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("soins mod�r�s", 4500), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("t�n�bres", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("vision dans le noir", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("ralentissement du poison", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("splendeur de l'aigle", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("simulacre de vie", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�t�ction des pi�ges", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lame de feu", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("sph�re de feu", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("nappe de brouillard", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ruse du renard", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("poussi�re scintillante", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("m�tal br�lant", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("immobilisation de personne", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure mod�r�e", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilit�", 4500), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("d�blocage", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("l�vitation", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("image imparfaite", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("image miroir", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("sagesse du hibou", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("pyrotechnie", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�livrance de la paralysie", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("r�sistance aux �nergies destructives", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("restauration partielle", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon ardent", 4500), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection de l�invisibilit�", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("fracassement", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("protection d�autrui", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("silence", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("cacophonie", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("pattes d�araign�e", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("arme spirituelle", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres II", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d�alli�s naturels II", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("nu�e grouillante", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("toile d�araign�e", 4500), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("vent de murmures", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("augure", 5750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("pi�ge � feu", 5750), 1));
	
		return res;
	}
	
	// Baguette commune de niveau 3
	public static Data<Wand> commonWand3(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("forme bestiale I", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("clignotement", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("appel de la foudre", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("cr�ation de nourriture et d�eau", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("soins importants", 11250), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("lumi�re du jour", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("sommeil profond", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("t�n�bres profondes", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("dissipation de la magie", 11250), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("d�placement", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("boule de feu", 11250), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("fl�ches enflamm�es", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("vol", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("�tat gazeux", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rapidit�", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("h�ro�sme", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure grave", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("n�gation de l�invisibilit�", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("sph�re d�invisibilit�", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("aff�tage", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("�clair", 11250), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre le Chaos", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre le Mal", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre le Bien", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cercle magique contre la Loi", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("morsure magique supr�me", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("panoplie magique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("arme magique supr�me", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("image accomplie", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("pri�re", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre les �nergies destructives", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("gu�rison de la c�cit�/surdit�", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�livrance des mal�dictions", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("gu�rison des maladies", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("lumi�re br�lante", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("temp�te de neige", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lenteur", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication avec les morts", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("nuage naus�abond", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("fa�onnage de la pierre", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("suggestion", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres III", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d�alli�s naturels III", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("baiser du vampire", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("respiration aquatique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("animation des morts", 23750), 1));
		
		return res;
	}
	
	// Baguette commune de niveau 4
	public static Data<Wand> commonWand4(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("marche dans les airs", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("forme bestiale II", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("tentacules noirs", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("marteau du Chaos", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("charme-monstre", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("confusion", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("d�sespoir foudroyant", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("soins intensifs", 21000), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre la mort", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("porte dimensionnelle", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("ancre dimensionnelle", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("renvoi", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("puissance divine", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("corps �l�mentaire I", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("�nergie n�gative", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("agrandissement de groupe", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("terreur", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de feu", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("colonne de feu", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("libert� de mouvement", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("globe d�invuln�rabilit� partielle", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ch�timent sacr�", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("temp�te de gr�le", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("transfert de sorts", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("blessure critique", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilit� supr�me", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("courroux de l�ordre", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("assassin imaginaire", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("sph�re d�isolement", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("scrutation", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication � distance", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cri", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("brouillard dense", 21000), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("immunit� contre les sorts", 21000), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres IV", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation d�alli�s naturels IV", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("t�n�bres maudites", 21000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("mur de feu", 21000), 5));
		res.add(new Tuple<Wand, Integer>(new Wand("mur de glace", 21000), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("divination", 22250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("annulation d�enchantement", 30000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("peau de pierre", 33500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("alli� d�outreplan", 46000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("restauration", 71000), 3));//duplication fusionn�e ici
		
		return res;
	}
	
	// Baguette hors du commun de niveau 0
	public static Data<Wand> uncommonWand0(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("signature magique", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("saignement", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("lumi�res dansantes", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection du poison", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("destruction de mort-vivant", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("illumination", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("assistance divine", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("rep�rage", 375), 9));
		res.add(new Tuple<Wand, Integer>(new Wand("berceuse", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("ouverture/fermeture", 375), 6));
		res.add(new Tuple<Wand, Integer>(new Wand("r�sistance", 375), 7));
		res.add(new Tuple<Wand, Integer>(new Wand("�tincelles", 375), 8));
		res.add(new Tuple<Wand, Integer>(new Wand("stimulant", 375), 6));
	
		return res;
	}
	
	// Baguette hors du commun de niveau 1
	public static Data<Wand> uncommonWand1(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("charge de fourmi", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aspect du faucon", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("b�n�diction d�arme", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("apaisement des animaux", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("charme-animal", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("contact glacial", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("hostilit� forc�e", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("confusion mineure", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("contact corrosif", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("perception de la mort", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection de la faune ou de la flore", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection du Chaos", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection du Mal", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection du Bien", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection de la Loi", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection des passages secrets", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection des collets et des fosses", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection des morts-vivants", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("anath�me", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier entropique", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("effacement", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lueur f�erique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�marche a�rienne", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("disque flottant", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("baie nourrici�re", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilit� pour les animaux", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("invisibilit� pour les morts-vivants", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("fou rire", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("verrouillage", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("hypnose", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("dague de stalactite", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("mauvais pr�sage", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("saut", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("grand pas", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aura magique", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("monture", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("dissimulation d�objet", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("passage sans trace", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon de fi�vre", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rapetissement", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("sanctuaire", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de foudre", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication avec les animaux", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("poing de pierre", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bouclier de pierre", 750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("convocation de monstres mineure", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("alignement ind�tectable", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("gr�ce urbaine", 750), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("disparition", 750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("ventriloquie", 750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("bouche magique", 1250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("b�n�diction de l�eau", 2000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("mal�diction de l�eau", 2000), 1));
	
		return res;
	}
	
	// Baguette hors du commun de niveau 2
	public static Data<Wand> uncommonWand2(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("arme align�e", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aspect animal", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("messager animal", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("hypnose des animaux", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("aspect de l�ours", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("savoir manier une arme", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("c�cit�/surdit�", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("regard br�lant", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("apaisement des �motions", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("m�tal gel�", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("contr�le des morts-vivants", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("h�b�tement de monstre", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("mise � mort", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("d�charge d�fensive", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("retardement de la douleur", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection de pens�es", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("d�guiser autrui", 4500), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("armure sans effort", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("caresse �l�mentaire", 4500), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("discours captivant", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("pr�servation des morts", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("baiser de la goule", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("planer", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("�l�vation du sol", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bourrasque", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("immobilisation d�animal", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("lueurs hypnotiques", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("localisation d�objet", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("r�paration int�grale", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("d�tection fauss�e", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ennui oppressant", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("protection contre les projectiles", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rapetissement d�animal", 4500), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("corde enchant�e", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("effroi", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("partage de la langue", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("ramollissement de la terre et de la pierre", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("main spectrale", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rapport", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("don des langues", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("idiotie", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("forme d�arbre", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("distorsion du bois", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("arme merveilleuse", 4500), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("fa�onnage du bois", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("zone de v�rit�", 4500), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("verrou du mage", 5750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("cons�cration", 5750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("profanation", 5750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("flamme �ternelle", 7000), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("pi�ge illusoire", 7000), 1));
		
		return res;
	}
	
	// Baguette hors du commun de niveau 3
	public static Data<Wand> uncommonWand3(){
		Data<Wand> res = new Data<Wand>();
		
		res.add(new Tuple<Wand, Integer>(new Wand("aspect animal sup�rieur", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("orbe aqueux", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("vision magique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aura d�archon", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("temp�te de cendres", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("mal�diction", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("clairaudience/clairvoyance", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("contagion", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("rabougrissement des plantes", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("domination d�animal", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("aura �l�mentaire", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("runes explosives", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("poing de force", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("immobilisation de morts-vivants", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("main du berger", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("l�vitation hostile", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("hurlement d�agonie", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("torrent hydraulique", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("singes fous", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("fusion dans la pierre", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("neutralisation du poison", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("frappe douloureuse", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("coursier fant�me", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("croissance v�g�tale", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("empoisonnement", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("extinction des feux", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("rage", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("rayon affaiblissant", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("peau r�sineuse", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("page secr�te", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("r�duction d�objet", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("collet", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("communication avec les plantes", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("croissance d��pines", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("abri", 11250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("marche sur l�onde", 11250), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("mur de vent", 11250), 3));
		res.add(new Tuple<Wand, Integer>(new Wand("manteau de col�re", 11250), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("texte illusoire", 13750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("antid�tection", 13750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("bagou", 15750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("espoir", 15750), 4));
		res.add(new Tuple<Wand, Integer>(new Wand("gu�rison de destrier", 15750), 2));
		res.add(new Tuple<Wand, Integer>(new Wand("manipulation des sons", 15750), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("glyphe de garde", 21250), 1));
		res.add(new Tuple<Wand, Integer>(new Wand("sceau du serpent", 36250), 1));
		
		return res;
	}
	
	// Baguette hors du commun de niveau 4
		public static Data<Wand> uncommonWand4(){
			Data<Wand> res = new Data<Wand>();
			
			res.add(new Tuple<Wand, Integer>(new Wand("coquille antiplantes", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("vision magique", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("aspect du cerf", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("boule de foudre", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("fl�trissement v�g�tal", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("empire v�g�tal", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("contr�le de l�eau", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("vision dans le noir sup�rieure", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("d�tection de la scrutation", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("d�tection du mensonge", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("souffle de dragon", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("simulacre de vie sup�rieur", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("mission", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("loup fantomatique", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("vermine g�ante", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("terrain hallucinatoire", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("mur illusoire", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("localisation de cr�ature", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("cr�ation mineure", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("m�morisation", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("flot obsidien", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("lueur d�arc-en-ciel", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("rapetissement de groupe", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("r�incarnation", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("r�pulsif", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("chevaucher les vagues", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("rouille", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("refuge du mage", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("convocation d�ombres", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("pas de l�ombre", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("image de foudre", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("pierres ac�r�es", 21000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("temp�te volcanique", 21000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("poussi�re d��toile", 21000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("croissance animale", 21000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("communion avec la nature", 30000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("Rejet du Chaos", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("Rejet du Mal", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("domination", 30000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("immobilisation de monstre", 30000), 4));
			res.add(new Tuple<Wand, Integer>(new Wand("�p�e sainte", 30000), 3));
			res.add(new Tuple<Wand, Integer>(new Wand("marque de la justice", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("modification de m�moire", 30000), 2));
			res.add(new Tuple<Wand, Integer>(new Wand("voyage par les arbres", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("zone de silence", 30000), 1));
			res.add(new Tuple<Wand, Integer>(new Wand("mythes et l�gendes", 33500),1));
			
			return res;
	}
}

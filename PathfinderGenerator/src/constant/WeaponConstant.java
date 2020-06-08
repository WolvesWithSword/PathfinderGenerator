package constant;
import utility.Data;
import utility.Tuple;
import weapon.Material;
import weapon.MeleeWeapon;
import weapon.Munition;
import weapon.RangeWeapon;
import weapon.Type;
import weapon.TypeDamage;
import weapon.TypeMaterial;
import weapon.Weapon;
import weapon.WeaponSpecialPropertie;

/**
 * Constant contient les constantes des armes pour les tirages du g�n�rateur.
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
public class WeaponConstant {

	// Tableau de drop pour arme de raret� 1.
	public static Data<Tuple<Integer,Integer>> rarity1(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 80));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
		
		return res;
	}
	
	//Tableau de drop pour arme de raret� 2.
	public static Data<Tuple<Integer, Integer>> rarity2(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 26));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
		
		return res;
	}
	
	//Tableau de drop pour arme de raret� 3.
	public static Data<Tuple<Integer, Integer>> rarity3(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 11), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
			
		return res;
	}	
	
	//Tableau de drop pour arme de raret� 4.
	public static Data<Tuple<Integer, Integer>> rarity4(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	//Tableau de drop pour arme de raret� 5.
	public static Data<Tuple<Integer, Integer>> rarity5(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 0), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 2), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 3), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 2), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(3, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 1), 12));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
				
		return res;
	}
	
	//Tableau de drop pour arme de raret� 6.
	public static Data<Tuple<Integer, Integer>> rarity6(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 0), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 1), 10));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 2), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 3), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(4, 4), 5));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 1), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 2), 8));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 3), 4));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 4), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 14), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(5, 23), 3));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(-1, 0), 20));
					
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 1.
	public static Data<Weapon> specificWeapon1(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle de signalisation",100), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che endormante",132), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bille de poussi�re",196), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau d�enchev�trement",226), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau hurleur",267), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague de ma�tre en argent",322), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bille de l�alchimiste",330), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e longue de ma�tre en fer froid",330), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che silencieuse",547), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che silencieuse sup�rieure",1047), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Javeline de foudre",1500), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che br�lante",1516), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che gr�sillante",1516), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle fouisseuse",1722), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau ass�chant",1730), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che mortelle",2282), 8));
		
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 2.
	public static Data<Weapon> specificWeapon2(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague en adamantium",3002), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache d�armes en adamantium",3010), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle fouisseuse sup�rieure",3447), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che mortelle sup�rieure",4057), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lance de joute",4310), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Brise-arme",4315), 20));
		
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 3.
	public static Data<Weapon> specificWeapon3(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Kukri de la saign�e",6308), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de roc",6812), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Gourdin bestial",7300), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fourche de guerre",7315), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Goupillon intarissable",7805), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("B�ton des ouragans",7840), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague venimeuse",8302), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame obscure",8810), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fronde morsure-du-froid",9380), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident de stabilit�",9815), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident d�alerte sous-marine",10115), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague de l�assassin",10320), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague jumelle",10320), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�au de terre",11315), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Grande hache de vitesse",11320), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de polarit�",12310), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Entrave",12350), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Regret du changeant",12780), 7));
			
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 4.
	public static Data<Weapon> specificWeapon4(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pi�geuse de dragons",13308), 7));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e � dix anneaux",14315), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident des tritons",15065), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de d�molition inf�rieure",16012), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Rapi�re d�sarmante",17820), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fouet urticant",18305), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Brise-bouclier",18310), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident de domination aquatique",18650), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("B�ton de l�acrobate",19100), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pistolet drake-de-feu",20300), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de ricochet",20301), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e ardente",20715), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Com�te",21324), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (0 souhait)",22060), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de pr�cision",22310), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e des plans",22315), 5));
				
		return res;
	}
	
	
	// Tableau de drop des armes sp�cifique raret� 5.
	public static Data<Weapon> specificWeapon5(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e aux neuf vies",23057), 12));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache affaiblissante",23310), 14));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Ge�lier des �mes",25302), 14));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau des nains",25312), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Arc du long serment",25600), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e voleuse de vie",25715), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Apprentie du coupe-gorge",33910), 15));
		
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 6.
	public static Data<Weapon> specificWeapon6(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Complainte des goules",35312), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse d��pouvante",38552), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fouet des Enfers",39305), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Ch�timent des dragons",40310), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache d�vitalisante",40320), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e du brave",41335), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Tourment des invocateurs",42816), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Cimeterre des bois",47315), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame spirituelle",48502), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lance coeur-de-bois",50302), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Rapi�re d�an�mie",50320), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e radieuse",50335), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Katana du soleil levant",51850), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de givre",54475), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de lancer nain",60312), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague vampirique",60802), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Cimeterre de rage assassine",61375), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (1 souhait)",62360), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame gardienne",65310), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pistolet des cieux infinis",73300), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de d�molition",75312), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Katana du moine sanctifi�",75350), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Chapardeur magique",75815), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Croc de l�araign�e",79102), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�au des d�mons",90469), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Faux du n�ant",95318), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (2 souhaits)",102660), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de justice",120630), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame du b�tard",123035), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (3 souhaits)",142960), 4));
					
		return res;
	}
	
	// Tableau de drop des armes.
	public static Data<Weapon> weaponList(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Ep�e b�tarde",Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL,35,3), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Hache d�armes",Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL,10,3), 4));
		res.add(new Tuple<Weapon, Integer>(new Munition("Bolas",TypeDamage.C,"_",5,1), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Gourdin",Type.CAC_1M,TypeDamage.C, TypeMaterial.WOOD,0,1.5), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Arc long composite", new Munition("Fl�che",0.075),TypeDamage.P,TypeMaterial.WOOD,100,1.5), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Arc court composite", new Munition("Fl�che",0.075),TypeDamage.P,TypeMaterial.WOOD,75,1), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Dague", Type.CAC_LIGHT ,TypeDamage.P_T,TypeMaterial.STEEL,2,0.5), 4));
		res.add(new Tuple<Weapon, Integer>(new Munition("Fl�chette", TypeDamage.P, "_",0.5,0.25), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Hache d�armes naine", Type.CAC_1M ,TypeDamage.T, TypeMaterial.STEEL,15,3), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Cimeterre � deux mains", Type.CAC_2M,TypeDamage.T, TypeMaterial.STEEL,75,4), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Gantelet", Type.CAC_LIGHT, TypeDamage.C, TypeMaterial.STEEL,2,0.5), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Coutille", Type.CAC_2M, TypeDamage.T, TypeMaterial.STEEL,8,5), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Grande hache", Type.CAC_2M,TypeDamage.T,TypeMaterial.STEEL,20,6), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Massue",Type.CAC_2M ,TypeDamage.C, TypeMaterial.WOOD,5,4), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Ep�e � deux mains", Type.CAC_2M, TypeDamage.T, TypeMaterial.STEEL,50,4), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Hallebarde", Type.CAC_2M ,TypeDamage.P_T, TypeMaterial.STEEL,10,6), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Hachette", Type.CAC_LIGHT ,TypeDamage.T, TypeMaterial.STEEL,6,1.5), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Arbal�te lourde", new Munition("Carreau",0.05),TypeDamage.P, TypeMaterial.STEEL,50,4), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Fl�au d�armes lourd", Type.CAC_2M,TypeDamage.C, TypeMaterial.STEEL,15,5), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Masse d�armes lourde", Type.CAC_1M,TypeDamage.C, TypeMaterial.STEEL,12,4), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Lance d�ar�on", Type.CAC_2M, TypeDamage.P, TypeMaterial.STEEL,10,5), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Arbal�te l�g�re", new Munition("Carreau",0.05),TypeDamage.P, TypeMaterial.STEEL,35,2), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Fl�au d�armes l�ger", Type.CAC_1M, TypeDamage.C, TypeMaterial.STEEL,8,2.5), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Marteau l�ger", Type.CAC_LIGHT ,TypeDamage.C, TypeMaterial.STEEL,1,2), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Masse d�armes l�g�re", Type.CAC_LIGHT,TypeDamage.C, TypeMaterial.STEEL,5,2), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Pic de guerre l�ger", Type.CAC_LIGHT ,TypeDamage.P, TypeMaterial.STEEL,4,1.5), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Arc long", new Munition("Fl�che",0.075),TypeDamage.P, TypeMaterial.WOOD,75,1.5), 4));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Pique", Type.CAC_2M,TypeDamage.P, TypeMaterial.WOOD,5,4.5), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Ep�e longue", Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL,15,2), 7));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Morgenstern", Type.CAC_1M, TypeDamage.C_P,TypeMaterial.STEEL,8,3), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Nunchaku", Type.CAC_LIGHT, TypeDamage.C, TypeMaterial.WOOD,2,1), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("B�ton", Type.CAC_2M, TypeDamage.C, TypeMaterial.WOOD,0,2), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Rapi�re", Type.CAC_1M, TypeDamage.P ,TypeMaterial.STEEL,20,1), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Sai", Type.CAC_LIGHT, TypeDamage.C_P ,TypeMaterial.STEEL,1,0.5), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Matraque", Type.CAC_LIGHT, TypeDamage.C ,TypeMaterial.WOOD,1,1), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Cimeterre", Type.CAC_1M, TypeDamage.T ,TypeMaterial.STEEL,15,2), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Faux", Type.CAC_2M, TypeDamage.C_P ,TypeMaterial.STEEL,18,5), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Arc court", new Munition("Fl�che",0.075),TypeDamage.P, TypeMaterial.WOOD,30,1), 4));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Epieu", Type.CAC_1M, TypeDamage.P ,TypeMaterial.STEEL,1,1.5), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Ep�e courte", Type.CAC_1M, TypeDamage.P ,TypeMaterial.STEEL,10,1), 5));
		res.add(new Tuple<Weapon, Integer>(new Munition("Shuriken",TypeDamage.P,"_",1,0.25), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Serpe", Type.CAC_LIGHT, TypeDamage.T ,TypeMaterial.STEEL,6,1), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Fronde", new Munition("Bille",0.25),TypeDamage.C,null,0,0), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Lance", Type.CAC_2M, TypeDamage.P, TypeMaterial.STEEL,2,3), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Trident", Type.CAC_1M,TypeDamage.P, TypeMaterial.STEEL,15,2), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Marteau de guerre", Type.CAC_1M,TypeDamage.C,  TypeMaterial.STEEL,12,2.5), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Fouet", Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL,1,1), 1));
		//Cas des armes a choisir manuellement.
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Autre arme de corps � corps l�g�re", Type.CAC_LIGHT, TypeDamage.NOTHING, null,0,0), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Autre arme de corps � corps � une main", Type.CAC_1M, TypeDamage.NOTHING, null,0,0), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("Autre arme de corps � corps � deux mains", Type.CAC_2M, TypeDamage.NOTHING, null,0,0), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("Autre arme � distance", new Munition("Autre munition",0), TypeDamage.NOTHING,null,0,0), 2));
		
		return res;
	}
	
	// Tableau de drop des munitions.
	public static Data<Weapon> weaponMunition() {
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null,"2d10",0,0),10));
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, "4d10",0,0),10));
		//Ici on met tout de meme une rangeWeapon vide pour differencer l'arme seule et l'arme avec munitions
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, new Munition(null,0),null, null,0,0), 60));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, new Munition(null, null, "2d10",0,0),null, null,0,0), 10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, new Munition(null, null, "4d10",0,0),null, null,0,0), 10));
		
		return res;
	}
	
	//Tableau de drop des munitions (pour munitions)
	public static Data<String> weaponMunitionQuantity(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("2d10", 10));
		res.add(new Tuple<String, Integer>("4d10", 10));
		res.add(new Tuple<String, Integer>("1", 60));
		res.add(new Tuple<String, Integer>("2d10", 10));
		res.add(new Tuple<String, Integer>("4d10", 10));
		
		return res;
	}
	
	// Tableau de drop des mat�riaux (m�tal).
	public static Data<Material> steelMaterial(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.PIERRE, 1));
		res.add(new Tuple<Material, Integer>(Material.OR, 1));
		res.add(new Tuple<Material, Integer>(Material.OS, 1));
		res.add(new Tuple<Material, Integer>(Material.OBSIDIENNE, 1));
		res.add(new Tuple<Material, Integer>(Material.BRONZE, 2));
		res.add(new Tuple<Material, Integer>(Material.NOTHING, 50));
		res.add(new Tuple<Material, Integer>(Material.VIRIDIUM, 2));
		res.add(new Tuple<Material, Integer>(Material.RACINE_DE_WYR, 3));
		res.add(new Tuple<Material, Integer>(Material.ACIER_VIVANT, 7));
		res.add(new Tuple<Material, Integer>(Material.FER_FROID, 7));
		res.add(new Tuple<Material, Integer>(Material.ARGENT_ALCHIMIQUE, 7));
		res.add(new Tuple<Material, Integer>(Material.CRISTAL_DE_SANG, 2));
		res.add(new Tuple<Material, Integer>(Material.MITHRAL, 6));
		res.add(new Tuple<Material, Integer>(Material.ACIER_ARDENT, 4));
		res.add(new Tuple<Material, Integer>(Material.ACIER_GLACE, 1));
		res.add(new Tuple<Material, Integer>(Material.BRONZE_ELYSEEN, 3));
		res.add(new Tuple<Material, Integer>(Material.ADAMENTIUM, 2));
		
		return res;
	}
	
	// Tableau de drop des mat�riaux (bois).
	public static Data<Material> woodMaterial(){
		Data<Material> res = new Data<Material>();
		res.add(new Tuple<Material, Integer>(Material.OS, 5));
		res.add(new Tuple<Material, Integer>(Material.NOTHING, 50));
		res.add(new Tuple<Material, Integer>(Material.BOIS_FLEXIBLE, 15));
		res.add(new Tuple<Material, Integer>(Material.EBENITE, 15));
		res.add(new Tuple<Material, Integer>(Material.BOIS_VERT, 10));
		res.add(new Tuple<Material, Integer>(Material.RACINE_DE_WYR, 5));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 1. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Solide",3000), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mim�tisme",4000), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Alliance",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse",1), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Soutient",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rappel",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive",1), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Contre-attaque",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Courageuse",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rus�e",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mortelle",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Gardienne",1), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dissipation",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu",1), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid",1), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Furieuse",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Spectrale",1), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Flammegrise",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Protection contre l'�lectricit�",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Protectrice",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cherche-coeur",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chasseresse",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Juge",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ac�r�e",1), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Focalisation ki",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("R�v�latrice",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mena�ante",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mis�ricordieuse",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enchainement",1), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mim�tique",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Neutralisante",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Intimidante",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Extinction",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Aquatique",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre",1), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Stockage de sort",1), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("D�givrante",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lancer",1), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre",1), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vaillante",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vicieuse",1), 3));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 2. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Placement",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Inamovible",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive",2), 7));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Survie",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dissipation intense",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Destruction",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ent�t�e",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Glorieuse",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflamm�e",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Percutante",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Revigorante",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Intensification ki",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("�lan vital",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Att�nuante",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense",2), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Filature",2), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie",2), 7));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sanglante",2), 9));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 3. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie3(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Affaiblissement magique",3), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Repositionnante",3), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rapide",3), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Voleuse de magie",3), 20));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 4 et 5. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie4_5(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumi�re",4), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dansante",4), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vorpale",5), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mutante",10000), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Duel",14000), 5));	
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 1. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Polyvalent",1000), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Solide",3000), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mim�tisme",4000), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Alliance",1), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse",1), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rappel",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice",1), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Pr�servation",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive",1), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rus�e",1), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Longue port�e",1), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu",1), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid",1), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chasseresse",1), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Juge",1), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("R�v�latrice",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chanceux",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mis�ricordieuse",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Fiable",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Boomerang",1), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Traqueuse",1), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre",1), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre",1), 8));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 2. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Inamovible",2), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive",2), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage",2), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Munitions in�puisables",2), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense",2), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense",2), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflamm�e",2), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel",2), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Filature",2), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie",2), 10));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 3 et 4. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie3_4(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chanceux sup�rieur",3), 25));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Fiable sup�rieure",3), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rapide",3), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumi�re",4), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage sup�rieur",4), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Preste",4), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Deuxi�me chance",4), 2));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 1. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Charge �tanche",1500), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse",1), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive",1), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rus�e",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu",1), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid",1), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Spectrale",1), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("R�v�latrice",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mis�ricordieuse",1), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire",1), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Traqueuse",1), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre",1), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre",1), 14));
			
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 2. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage",2), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense",2), 12));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense",2), 12));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflamm�e",2), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense",2), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie",2), 10));
				
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 3. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie3(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumi�re",4), 66));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage sup�rieur",4), 34));
		
		return res;
	}
	
	//Tableau de drop pour une arme tueuse.
	public static Data<String> tueuseType(){
		Data<String> res = new Data<String>();
		res.add(new Tuple<String, Integer>("Aberrations", 5));
		res.add(new Tuple<String, Integer>("Animaux", 4));
		res.add(new Tuple<String, Integer>("Cr�atures artificielles", 7));
		res.add(new Tuple<String, Integer>("Dragons", 6));
		res.add(new Tuple<String, Integer>("F�es", 5));
		res.add(new Tuple<String, Integer>("Humano�des (choisir un sous-type)", 33));
		res.add(new Tuple<String, Integer>("Cr�atures magiques", 5));
		res.add(new Tuple<String, Integer>("Humano�des monstrueux", 5));
		res.add(new Tuple<String, Integer>("Vases", 2));
		res.add(new Tuple<String, Integer>("Ext�rieurs (choisir un sous-type)", 16));
		res.add(new Tuple<String, Integer>("Plantes", 2));
		res.add(new Tuple<String, Integer>("Morts-vivants", 8));
		res.add(new Tuple<String, Integer>("Vermine", 2));

		return res;
	}
}

package utility;
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
 * Constant contient les constantes pour les tirages du g�n�rateur.
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
public class Constant {

	// Tableau de drop pour arme de raret� 1.
	public static Data<Tuple<Integer,Integer>> rarity1(){
		Data<Tuple<Integer,Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 80));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
		
		return res;
	}
	
	//Tableau de drop pour arme de raret� 2.
	public static Data<Tuple<Integer, Integer>> rarity2(){
		Data<Tuple<Integer, Integer>> res = new Data<Tuple<Integer,Integer>>();
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 0), 26));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(2, 0), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(1, 1), 27));
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
		
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
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
			
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
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
				
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
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
				
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
		res.add(new Tuple<Tuple<Integer,Integer>, Integer>(new Tuple<Integer, Integer>(0, 0), 20));
					
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 1.
	public static Data<Weapon> specificWeapon1(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle de signalisation"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che endormante"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bille de poussi�re"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau d�enchev�trement"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau hurleur"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague de ma�tre en argent"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Bille de l�alchimiste"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e longue de ma�tre en fer froid"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che silencieuse"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che silencieuse sup�rieure"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Javeline de foudre"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che br�lante"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che gr�sillante"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle fouisseuse"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Carreau ass�chant"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che mortelle"), 8));
		
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 2.
	public static Data<Weapon> specificWeapon2(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague en adamantium"), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache d�armes en adamantium"), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Balle fouisseuse sup�rieure"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�che mortelle sup�rieure"), 20));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lance de joute"), 10));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Brise-arme"), 20));
		
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 3.
	public static Data<Weapon> specificWeapon3(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Kukri de la saign�e"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de roc"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Gourdin bestial"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fourche de guerre"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Goupillon intarissable"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("B�ton des ouragans"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague venimeuse"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame obscure"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fronde morsure-du-froid"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident de stabilit�"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident d�alerte sous-marine"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague de l�assassin"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague jumelle"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�au de terre"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Grande hache de vitesse"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de polarit�"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Entrave"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Regret du changeant"), 7));
			
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 4.
	public static Data<Weapon> specificWeapon4(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pi�geuse de dragons"), 7));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e � dix anneaux"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident des tritons"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de d�molition inf�rieure"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Rapi�re d�sarmante"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fouet urticant"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Brise-bouclier"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Trident de domination aquatique"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("B�ton de l�acrobate"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pistolet drake-de-feu"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de ricochet"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e ardente"), 6));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Com�te"), 8));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (0 souhait)"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de pr�cision"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e des plans"), 5));
				
		return res;
	}
	
	
	// Tableau de drop des armes sp�cifique raret� 5.
	public static Data<Weapon> specificWeapon5(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e aux neuf vies"), 12));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache affaiblissante"), 14));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Ge�lier des �mes"), 14));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau des nains"), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Arc du long serment"), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e voleuse de vie"), 15));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Apprentie du coupe-gorge"), 15));
		
		return res;
	}
	
	// Tableau de drop des armes sp�cifique raret� 6.
	public static Data<Weapon> specificWeapon6(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Weapon("Complainte des goules"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse d��pouvante"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fouet des Enfers"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Ch�timent des dragons"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Hache d�vitalisante"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e du brave"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Tourment des invocateurs"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Cimeterre des bois"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame spirituelle"), 2));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lance coeur-de-bois"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Rapi�re d�an�mie"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e radieuse"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Katana du soleil levant"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de givre"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Marteau de lancer nain"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Dague vampirique"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Cimeterre de rage assassine"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (1 souhait)"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame gardienne"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Pistolet des cieux infinis"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Masse de d�molition"), 5));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Katana du moine sanctifi�"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Chapardeur magique"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Croc de l�araign�e"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Fl�au des d�mons"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Faux du n�ant"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (2 souhaits)"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de justice"), 3));
		res.add(new Tuple<Weapon, Integer>(new Weapon("Lame du b�tard"), 4));
		res.add(new Tuple<Weapon, Integer>(new Weapon("�p�e de bonne fortune (3 souhaits)"), 4));
					
		return res;
	}
	
	// Tableau de drop des armes.
	public static Data<Weapon> weaponList(){
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("�p�e b�tarde", null, null, Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hache d�armes", null, null,Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("bolas",null,null, new Munition("bolas"),TypeDamage.C,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("gourdin", null, null, Type.CAC_1M,TypeDamage.C, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc long composite",null,null, new Munition("fl�che"),TypeDamage.P,TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc court composite",null,null, new Munition("fl�che"),TypeDamage.P,TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("dague", null, null,Type.CAC_LIGHT ,TypeDamage.P_T,TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("fl�chette",null,null, new Munition("fl�chette"),TypeDamage.P,TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hache d�armes de nain", null, null,Type.CAC_1M ,TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("cimeterre � deux mains", null, null,Type.CAC_2M,TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("gantelet", null, null,Type.CAC_LIGHT, TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("coutille", null, null,Type.CAC_2M, TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("grande hache", null, null, Type.CAC_2M,TypeDamage.T,TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("massue", null, null,Type.CAC_2M ,TypeDamage.C, TypeMaterial.WOOD), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("�p�e � deux mains", null, null, Type.CAC_2M, TypeDamage.T, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hallebarde", null, null,Type.CAC_2M ,TypeDamage.P_T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("hachette", null, null,Type.CAC_LIGHT ,TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arbal�te lourde",null,null, new Munition("carreau"),TypeDamage.P, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fl�au d�armes lourd", null, null,Type.CAC_2M,TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("masse d�armes lourde", null, null,Type.CAC_1M,TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("lance d�ar�on", null, null,Type.CAC_2M, TypeDamage.P, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arbal�te l�g�re",null,null, new Munition("carreau"),TypeDamage.P, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fl�au d�armes l�ger", null, null,Type.CAC_1M, TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("marteau l�ger", null, null,Type.CAC_LIGHT ,TypeDamage.C, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("masse d�armes l�g�re", null, null,Type.CAC_LIGHT,TypeDamage.C, TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("pic de guerre l�ger", null, null, Type.CAC_LIGHT ,TypeDamage.P, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("arc long",null,null, new Munition("fl�che"),TypeDamage.P, TypeMaterial.STEEL), 4));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("pique", null, null, Type.CAC_2M,TypeDamage.P, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("�p�e longue", null, null, Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 7));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("morgenstern", null, null, Type.CAC_1M, TypeDamage.C_P,TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("nunchaku", null, null,Type.CAC_LIGHT, TypeDamage.C, TypeMaterial.WOOD), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("b�ton", null, null, Type.CAC_2M, TypeDamage.C, TypeMaterial.WOOD), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("rapi�re", null, null,Type.CAC_1M, TypeDamage.P ,TypeMaterial.STEEL), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("lance", null, null,Type.CAC_2M, TypeDamage.P, TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("trident", null, null,Type.CAC_1M,TypeDamage.P, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("marteau de guerre", null, null,Type.CAC_1M,TypeDamage.C,  TypeMaterial.STEEL), 3));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("fouet", null, null,Type.CAC_1M, TypeDamage.T, TypeMaterial.STEEL), 1));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps � corps l�g�re", null, Material.NOTHING, Type.CAC_LIGHT, TypeDamage.NOTHING, null), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps � corps � une main", null, Material.NOTHING, Type.CAC_1M, TypeDamage.NOTHING, null), 2));
		res.add(new Tuple<Weapon, Integer>(new MeleeWeapon("autre arme de corps � corps � deux mains", null, Material.NOTHING, Type.CAC_2M, TypeDamage.NOTHING, null), 2));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon("autre arme � distance",null,Material.NOTHING, new Munition("autre munition"), TypeDamage.NOTHING,null), 2));
		
		return res;
	}
	
	// Tableau de drop des munitions.
	public static Data<Weapon> weaponMunition() {
		Data<Weapon> res = new Data<Weapon>();
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, null, "2d10"),10));
		res.add(new Tuple<Weapon, Integer>(new Munition(null, null, null, "4d10"),10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null),null, null), 60));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null, null, null, "2d10"),null, null), 10));
		res.add(new Tuple<Weapon, Integer>(new RangeWeapon(null, null, null, new Munition(null, null, null, "4d10"),null, null), 10));
		
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
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Solide"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mim�tisme"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Alliance"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Soutient"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rappel"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Contre-attaque"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Courageuse"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rus�e"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mortelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Gardienne"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dissipation"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu"), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid"), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Furieuse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Spectrale"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Flammegrise"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Protection contre l'�lectricit�"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Protectrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cherche-coeur"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chasseresse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Juge"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ac�r�e"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Focalisation ki"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("R�v�latrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mena�ante"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mis�ricordieuse"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enchainement"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mim�tique"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Neutralisante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Intimidante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Extinction"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Aquatique"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre"), 6));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Stockage de sort"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("D�givrante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lancer"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vaillante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vicieuse"), 3));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 2. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Placement"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Inamovible"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive"), 7));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Survie"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dissipation intense"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Destruction"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ent�t�e"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Glorieuse"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflamm�e"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Percutante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Revigorante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Intensification ki"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("�lan vital"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Att�nuante"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Filature"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie"), 7));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sanglante"), 9));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 3. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie3(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Affaiblissement magique"), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Repositionnante"), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rapide"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Voleuse de magie"), 20));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 4 et 5. (m�l�e)
	public static Data<WeaponSpecialPropertie> meleeSpecialPropertie4_5(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumi�re"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Dansante"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Vorpale"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mutante"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Duel"), 5));	
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 1. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Polyvalent"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Solide"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mim�tisme"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Alliance"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rappel"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Pr�servation"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rus�e"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Longue port�e"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chasseresse"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Juge"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("R�v�latrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chanceux"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mis�ricordieuse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Fiable"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Boomerang"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Traqueuse"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre"), 8));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 2. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Inamovible"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Munitions in�puisables"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflamm�e"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Filature"), 4));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie"), 10));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 3 et 4. (distance)
	public static Data<WeaponSpecialPropertie> rangeSpecialPropertie3_4(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Chanceux sup�rieur"), 25));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Fiable sup�rieure"), 20));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rapide"), 40));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumi�re"), 9));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage sup�rieur"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Preste"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Deuxi�me chance"), 2));
		
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 1. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie1(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Charge �tanche"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tueuse"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Conductrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Corrosive"), 11));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Cruelle"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Rus�e"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu"), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid"), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Spectrale"), 8));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("R�v�latrice"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Mis�ricordieuse"), 2));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Planaire"), 1));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Traqueuse"), 5));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre"), 13));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Tonnerre"), 14));
			
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 2. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie2(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Anarchique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Axiomatique"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Explosion corrosive"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Feu intense"), 12));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Sainte"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Froid intense"), 12));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Enflamm�e"), 3));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Ancrage dimensionnel"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Foudre intense"), 10));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Impie"), 10));
				
		return res;
	}
	
	//Tableau de drop des propri�t�s speciale de raret� 3. (munition)
	public static Data<WeaponSpecialPropertie> munitionSpecialPropertie3(){
		Data<WeaponSpecialPropertie> res = new Data<WeaponSpecialPropertie>();
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Lumi�re"), 66));
		res.add(new Tuple<WeaponSpecialPropertie, Integer>(new WeaponSpecialPropertie("Marquage sup�rieur"), 34));
		
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

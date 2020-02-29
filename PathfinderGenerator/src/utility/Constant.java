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

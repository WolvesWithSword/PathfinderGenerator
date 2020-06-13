package scepter;

/**
 * Repr�sente un sceptre magique
 * @author Mentra20
 *
 */
public class Scepter {
	private ScepterBuilder sb = new ScepterBuilder();//Pour g�n�rer les sceptres m�tamagique
	
	private String name;//Nom du sceptre
	private double price;//Prix du sceptre
	private Type type;//Mineur, normal ou superieur
	
	public Scepter(String name,Type type,double price) {
		this.setName(name);
		this.setType(type);
		this.setPrice(price);
	}

	//CONSTRUCTEUR POUR SCEPTRE METAMAGIQUE
	public Scepter(int spellLevel,Type type,double price) {
		//On creer le sceptre metamagique
		this.setName("M�tamagie, "+sb.createMetamagicScepter(spellLevel));
		this.setType(type);
		this.setPrice(price);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}
}

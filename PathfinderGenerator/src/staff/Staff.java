package staff;

/**
 * Repr�sente un b�tons magique
 * @author Mentra20
 *
 */
public class Staff {
	private String name;//Nom du b�tons
	private double price;//Prix du b�tons
	private boolean particularPropertie;//True si la baguette a un indice sur sa capacit�.
	
	public Staff(String name,double price) {
		this.setName(name);
		this.setPrice(price);
		this.setParticularPropertie(false);
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

	public boolean isParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(boolean particularPropertie) {
		this.particularPropertie = particularPropertie;
	}

}

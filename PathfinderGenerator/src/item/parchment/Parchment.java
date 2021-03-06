package item.parchment;

import item.Item;
import item.TypeItem;
import utility.Debug;

/**
 * Représente un parchemin magique.
 * @author Mentra20
 *
 */
public class Parchment extends Item{
	
	private int nls;//Niveau de lançeur de sort.
	private int nds;//Niveau du sort.
	private boolean uncommon;//True si le parchemin est hors du commun.
	private boolean divine;//True si le parchemin est divin , faux si il est profane
	
	public Parchment(String name, double price) {
		super(name, price, TypeItem.PARCHMENT);
		this.setNds(-1);
		this.setNls(-1);
		this.setUncommon(false);
	}

	/* Getters and Setters */
	public int getNls() {
		return nls;
	}

	public void setNls(int nls) {
		this.nls = nls;
	}

	public int getNds() {
		return nds;
	}

	public void setNds(int nds) {
		this.nds = nds;
	}
	
	public boolean isUncommon() {
		return uncommon;
	}

	public void setUncommon(boolean uncommon) {
		this.uncommon = uncommon;
	}
	
	public boolean isDivine() {
		return divine;
	}

	public void setDivine(boolean divine) {
		this.divine = divine;
	}
	
	/* Methods */
	
	/**
	 * computeNls calcule le niveau de lançeur de sort selon le niveau du sort.
	 * @param nds : niveau du sort.
	 * @return le niveau de lançeur de sort du parchemin.
	 */
	public void computeNls() {
		switch (this.nds) {
		case 0: setNls(1);
			break;
		case 1: setNls(1);
			break;
		case 2: setNls(3);
			break;
		case 3: setNls(5);
			break;
		case 4: setNls(7);
			break;
		case 5: setNls(9);
			break;
		case 6: setNls(11);
			break;
		case 7: setNls(13);
			break;
		case 8: setNls(15);
			break;
		case 9: setNls(17);
			break;
		default: 
			Debug.error("Error compute nls");
			setNls(-1);
			break;
		}
	}

}

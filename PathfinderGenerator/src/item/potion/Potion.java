package item.potion;

import item.Item;
import item.TypeItem;
import utility.Debug;

/**
 * Potion représente une potion.
 * @author Mentra20
 *
 */
public class Potion extends Item {
	
	private int nls;//Niveau de lançeur de sort.
	private int nds;//Niveau du sort.
	private boolean uncommon;//True si la potion est hors du commun.
	
	public Potion(int nds) {
		super("_", 0, TypeItem.POTION);
		this.setNds(nds);
		this.nls = computeNls(nds);
		this.setPrice(computePrice(nds));
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
	
	/* Methods */
	
	/**
	 * computeNls calcule le niveau de lançeur de sort selon le niveau du sort.
	 * @param nds : niveau du sort.
	 * @return le niveau de lançeur de sort de la potion.
	 */
	private int computeNls(int nds) {
		switch (nds) {
		case 0: return 1;
		case 1: return 1;
		case 2: return 3;
		case 3: return 5;
		default: Debug.error("Error compute nls");
			return -1;
		}
	}
	
	/**
	 * computePrice calcule le prix de la potion selon le niveau du sort.
	 * @param nds : le niveau du sort.
	 * @return le prix de la potion.
	 */
	private double computePrice(int nds) {
		//deux cas particulier
		if(this.getName().equals("piège à feu")) return 775;
		if(this.getName().equals("antidétection")) return 800;
		
		switch (nds) {
		case 0: return 25;
		case 1: return 50;
		case 2: return 300;
		case 3: return 750;
		default: Debug.error("Error compute price");
			return -1;
		}
	}

	public boolean isUncommon() {
		return uncommon;
	}

	public void setUncommon(boolean uncommon) {
		this.uncommon = uncommon;
	}
	
	
}

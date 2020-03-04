package gemAndJewel;

/**
 * TypeCut repr�sente le type de gemme (brut ou taill�e).
 * @author Mentra20
 *
 */
public enum TypeCut {
	RAW("brute"),CUT("taill�e"),NOTHING("_");
	
	private final String cut;
	
	private TypeCut(String cut) {
		this.cut = cut;
	}
	
	public String toString() {
		return cut;
	}
}

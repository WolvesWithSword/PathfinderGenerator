package gemAndJewel;

public enum TypeCut {
	RAW("brute"),CUT("taill�e");
	
	private final String cut;
	
	private TypeCut(String cut) {
		this.cut = cut;
	}
	
	public String toString() {
		return cut;
	}
}

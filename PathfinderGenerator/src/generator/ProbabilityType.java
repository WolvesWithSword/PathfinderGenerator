package generator;

/**
 * repr�sente les differents types de probabilit�s
 */
public enum ProbabilityType {
	
	MINOR("Pleins de petits objets peu cher"),MEDIUM("Objets al�atoire"),MAJOR("Quelques objets cher");
	
    private final String type;
    
    private ProbabilityType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}

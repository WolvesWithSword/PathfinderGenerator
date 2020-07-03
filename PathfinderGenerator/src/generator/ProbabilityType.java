package generator;

/**
 * repr�sente les differents types de probabilit�s
 */
public enum ProbabilityType {
	
	MINOR("Pleins de petits objets peu cher"),MEDIUM("Objets al�atoire"),MAJOR("Des objets plut�t chers"),
	FIBONACCI("Peu d'objets mais tr�s chers");
	
    private final String type;
    
    private ProbabilityType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}

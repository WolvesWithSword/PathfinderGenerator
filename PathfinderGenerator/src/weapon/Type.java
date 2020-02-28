package weapon;
/**
 * Type repr�sente le type d'arme.
 * @author Mentra20
 *
 */
public enum Type{
    CAC_LIGHT("Corps � corps - l�g�re"),CAC_1M("Corps � corps - 1 main"),CAC_2M("Corps � corps - 2 main"),
    DIST("Distance"),MUN("Munition"),NOTHING("_");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
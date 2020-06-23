package item.armor;

/**
 * Type repr�sente le type d'armure ou bouclier.
 * @author Mentra20
 *
 */
public enum Type{
    LIGTH("L�g�re"), INTERMEDIATE("Interm�diaire"),
    HEAVY("Lourde"),SHIELD("Shield"),NOTHING("_");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}

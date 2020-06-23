package generator;

/**
 * Type repr�sente le type de tresor.
 * @author Mentra20
 *
 */
public enum Type{
    A("Les pi�ces"),B("Les pi�ces et les gemmes"),C("Objets d'art"),
    D("Les pi�ces et les objets de petite taille"),E("Les armes et les armures"),
    F("L'�quipement des combattants"),G("L'�quipement des lanceurs de sorts"),
    H("Le tr�sor des antres"),I("Le tr�sor accumul�");
    
    private final String type;
    
    private Type(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
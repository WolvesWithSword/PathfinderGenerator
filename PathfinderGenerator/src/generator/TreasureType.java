package generator;

/**
 * Type repr�sente le type de tresor.
 * @author Mentra20
 *
 */
public enum TreasureType{
    A("Les pi�ces (A)"),B("Les pi�ces et les gemmes (B)"),C("Objets d'art (C)"),
    D("Les pi�ces et les objets de petite taille (D)"),E("Les armes et les armures (E)"),
    F("L'�quipement des combattants (F)"),G("L'�quipement des lanceurs de sorts (G)"),
    H("Le tr�sor des antres (H)"),I("Le tr�sor accumul� (I)");
    
    private final String type;
    
    private TreasureType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}
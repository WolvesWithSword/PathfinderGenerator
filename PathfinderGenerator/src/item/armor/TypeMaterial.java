package item.armor;

/**
 * TypeMaterial repr�sente le type de mat�riel majoritaire de l'armure ou bouclier.
 * @author Mentra20
 *
 */
public enum TypeMaterial{
    WOOD("Bois"),STEEL("Metal"),LEATHER("Cuir"),NOTHING("Nothing");
    
    private final String typeMat;
    
    private TypeMaterial(String typeMat){
        this.typeMat = typeMat;
    }
    
    public String toString(){
        return typeMat;
    }
}
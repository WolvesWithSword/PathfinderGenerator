package weapon;
/**
 * Material repr�sente les mat�riaux des armes.
 * @author Mentra20
 *
 */
public enum Material{
	
    PIERRE("Pierre"),OR("or"),OS("Os"),
    OBSIDIENNE("Obsidienne"),BRONZE("bronze"),NOTHING("_"),
    VIRIDIUM("Viridiumr"),RACINE_DE_WYR("Racine de wyr"),ACIER_VIVANT("Acier vivant"),
    FER_FROID("Fer froid"), ARGENT_ALCHIMIQUE("Argent alchimique"),CRISTAL_DE_SANG("Cristal de sang"),
    MITHRAL("Mithral"), ACIER_ARDENT("Acier ardent"), ACIER_GLACE("Acier glac�"),
    BRONZE_ELYSEEN("Bronze �lys�en"), ADAMENTIUM("Adamentium"),BOIS_FLEXIBLE("Bois flexible"),
    EBENITE("Eb�nite"),BOIS_VERT("Bois vert"),CHOOSE("� d�terminer");

    private final String material;
    
    private Material(String material){
        this.material = material;
    }
    
    public String toString(){
        return material;
    }
    
}
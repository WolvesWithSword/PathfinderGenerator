package weapon;

/**
 * Munition repr�sente les munitions des armes.
 * @author Mentra20
 *
 */
public class Munition extends Weapon{
    private String quantity; //Quantit� de munitions.
    
    /* CONSTRUCTOR */
    public Munition(String name, String alteration, Material material,String quantity){
        super(name,alteration,material,Type.MUN,TypeDamage.NOTHING,TypeMaterial.STEEL); //Une munition est forc�ment en m�tal.
        this.quantity = quantity;
    }
    
    public Munition(String name) {//Constructeur pour munition d'arme � distance.
    	super(name,null,null,Type.MUN,TypeDamage.NOTHING,TypeMaterial.STEEL);
    	this.quantity = "_";
    }
    
    /* GETTER */
	public String getQuantity() {
		return quantity;
	}
}
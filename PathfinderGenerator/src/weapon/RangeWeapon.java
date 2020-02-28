package weapon;

/**
 * RangeWeapon repr�sente les armes � distances.
 * @author Mentra20
 *
 */
public class RangeWeapon extends Weapon{
    private Munition munition;//La munition de l'arme � distance.
    
    /* CONSTRUCTOR */
    public RangeWeapon(String name, String alteration, Material material,Munition munition, TypeMaterial typeMaterial){
        super(name,alteration,material,Type.DIST,typeMaterial);
        this.munition = munition;
    }

    /* GETTER */
	public Munition getMunition() {
		return munition;
	}
    
}
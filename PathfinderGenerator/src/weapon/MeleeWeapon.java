package weapon;

/**
 * MeleeWeapon represente les armes de m�l�es.
 * @author Mentra20
 *
 */
public class MeleeWeapon extends Weapon{
    
    public MeleeWeapon(String name,Type type, TypeDamage typeDamage, TypeMaterial typeMaterial,double price,double weight){
        super(name,type,typeDamage,typeMaterial,price,weight);
    }
    
}
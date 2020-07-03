package generator;

/**
 * Repr�sente tout les types de monstres de pathfinder.
 */
public enum MonsterType {
	Aberration("Aberration)"),Animal("Animal"),Artificial_creature("Cr�ature artificielle"),
    Magic_creature("Cr�ature magique"),Dragon("Dragon"),Exterior("Ext�rieur"),
    Fairy("F�e"),Humanoid("Humano�de"),Monstrous_umanoid("Humano�de monstrueux"),Undead("Mort-vivant"),
    Plant("Plante"),Vase("Vase"),Vermine("Vermine");
    
    private final String type;
    
    private MonsterType(String type){
        this.type = type;
    }
    
    public String toString(){
        return type;
    }
}

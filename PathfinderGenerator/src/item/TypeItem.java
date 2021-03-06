package item;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public enum TypeItem {
	COIN(1,"Pièces"),ARMOR(2,"Armure"),ART(3,"Objet d'Art"),
	GEM(4,"Gemmes"),JEWEL(5,"Bijoux"),PARCHMENT(6,"Parchemin"),
	POTION(7,"Potion"),RING(8,"Anneau"),SCEPTER(9,"Sceptre"),
	STAFF(10,"Bâton"),WAND(11,"Baguette"),WEAPON(12,"Arme"),
	WONDERFUL(13,"Objet Merveilleux");

	private final int ID;
	private final String name;

	private TypeItem(int ID, String name){
		this.ID = ID;
		this.name = name;
	}

	public int getID(){
		return this.ID;
	}

	public String getName(){return this.name;}

	public static ArrayList<String> nameToArray(){
		ArrayList<String> res = new ArrayList<>();

		for(TypeItem typeItem : TypeItem.values()){
			res.add(typeItem.getName());
		}

		return res;
	}

    public String toString() {
        return this.name;
    }

    //La hashmap pour retrouver le type
    private static final Map<String, TypeItem> lookup = new HashMap<>();

    //Remplie la hashmap au chargement.
    static
    {
        for(TypeItem type : TypeItem.values())
        {
            lookup.put(type.toString(), type);
        }
    }

    /**
     * Renvoie le type correspondant à sa chaine de caractères.
     * @param type : la représentation en string du TypeItem
     * @return : le TypeItem
     */
    public static TypeItem getTypeItem(String type) {
        return lookup.get(type);
    }
}

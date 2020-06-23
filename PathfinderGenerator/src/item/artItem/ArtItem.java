package item.artItem;

import item.Item;
import item.TypeItem;

/**
 * Repr�sente un objet d'art.
 * @author Mentra20
 *
 */
public class ArtItem extends Item{
	public ArtItem(String name,double price) {
		super(name, price, TypeItem.ART);
	}
}

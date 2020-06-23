package item.scepter;

import item.Item;
import item.TypeItem;
import item.smartItem.SmartItem;

/**
 * Repr�sente un sceptre magique
 * @author Mentra20
 *
 */
public class Scepter extends Item{
	private ScepterBuilder sb = new ScepterBuilder();//Pour g�n�rer les sceptres m�tamagique
	
	private Type type;//Mineur, normal ou superieur
	private boolean particularPropertie;//True si le sceptre a un indice.
	private SmartItem smartItem;//Pour un objet intelligent.
	
	public Scepter(String name,Type type,double price) {
		super(name, price, TypeItem.SCEPTER);
		this.setType(type);
		this.setParticularPropertie(false);
		this.setSmartItem(null);
	}

	//CONSTRUCTEUR POUR SCEPTRE METAMAGIQUE
	public Scepter(int spellLevel,Type type,double price) {
		super("_", price, TypeItem.SCEPTER);
		//On creer le sceptre metamagique
		this.setName("M�tamagie, "+sb.createMetamagicScepter(spellLevel));
		this.setType(type);
	}
	
	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public boolean isParticularPropertie() {
		return particularPropertie;
	}

	public void setParticularPropertie(boolean particularPropertie) {
		this.particularPropertie = particularPropertie;
	}

	public SmartItem getSmartItem() {
		return smartItem;
	}

	public void setSmartItem(SmartItem smartItem) {
		this.smartItem = smartItem;
	}
}

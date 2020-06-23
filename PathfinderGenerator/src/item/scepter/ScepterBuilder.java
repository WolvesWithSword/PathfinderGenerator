package item.scepter;

import java.util.Random;

import constant.ScepterConstant;
import item.smartItem.SmartItemBuilder;
import utility.Data;
import utility.Debug;

/**
 * ScepterBuilder permet de cr�er des sceptres magiques.
 * @author Mentra20
 *
 */
public class ScepterBuilder {
	Random r; //Le random pour les tirages.
	SmartItemBuilder smartItemBuilder;//Pour les objets intelligents
	
	/* CONSTRUCTOR */
    public ScepterBuilder(){
        this.r = new Random();
        this.smartItemBuilder = new SmartItemBuilder();
    }
    
    /**
     * createStaff permet de cr�er un sceptres selon la raret�
     * @param rarity : la raret� du sceptres.
     * @return le sceptres cr��
     */
    public Scepter createScepter(int rarity) {
    	Debug.debug("Creation of magic scepter of rarity "+rarity+"...");
    	
    	Data<Scepter> data = new Data<Scepter>();
    	
    	//Chargement des donn�es selon la raret�.
    	switch (rarity) {
		case 3: data.addAll(ScepterConstant.rarity3());
			break;
		case 4: data.addAll(ScepterConstant.rarity4());
			break;
		case 5: data.addAll(ScepterConstant.rarity5());
			break;
		case 6: data.addAll(ScepterConstant.rarity6());
			break;
		default: Debug.error("Error createScepter: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	Scepter scepter = data.selectObject(randomValue);
    	
    	int randomValue2 = r.nextInt(100)+1;
    	if(randomValue2 == 1) {
    		scepter.setSmartItem(smartItemBuilder.createSmartItem(scepter.getPrice()));
    		//On ajoute le nouveau prix
    		scepter.setPrice(scepter.getPrice() + scepter.getSmartItem().getPrice());
    	}
    	else if(randomValue2 <= 31) scepter.setParticularPropertie(true);
    	
    	Debug.debug("");
    	return scepter;
    }
    
    /**
     * creer un sceptre m�tamagique du niveau de sort souhait�
     * @param spellLevel : le niveau du sort de m�tamagie
     * @return le sceptre m�tamagique
     */
    public String createMetamagicScepter(int spellLevel) {
    	Debug.debug("Creation metamagic scepter of spell level "+spellLevel+"...");
    	
    	Data<String> data = new Data<String>();
    	
    	//Chargement des donn�es selon la raret�.
    	switch (spellLevel) {
		case 1: data.addAll(ScepterConstant.spellLevel1());
			break;
		case 2: data.addAll(ScepterConstant.spellLevel2());
			break;
		case 3: data.addAll(ScepterConstant.spellLevel3());
			break;
		default: Debug.error("Error createMetamagicScepter: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_metamagic = "+randomValue);
    	String scepterName = data.selectObject(randomValue);

    	return scepterName;
    	
    }
}
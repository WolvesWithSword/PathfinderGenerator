package ring;

import java.util.Random;
import constant.RingConstant;
import utility.Data;
import utility.Debug;

/**
 * RingBuilder permet de cr�er des anneaux magiques.
 * @author Mentra20
 *
 */
public class RingBuilder {
	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public RingBuilder(){
        this.r = new Random();
    }
    
    /**
     * createPotion permet de cr�er un anneau selon la raret�
     * @param rarity : la raret� de l'anneau.
     * @return l'anneau cr��
     */
    public Ring createRing(int rarity) {
    	Debug.debug("Creation magic ring of rarity "+rarity+"...");
    	
    	Data<Ring> data = new Data<Ring>();
    	
    	//Chargement des donn�es selon la raret�.
    	switch (rarity) {
		case 1: data.addAll(RingConstant.rarity1());
			break;
		case 2: data.addAll(RingConstant.rarity2());
			break;
		case 3: data.addAll(RingConstant.rarity3());
			break;
		case 4: data.addAll(RingConstant.rarity4());
			break;
		case 5: data.addAll(RingConstant.rarity5());
			break;
		case 6: data.addAll(RingConstant.rarity6());
			break;
		default: Debug.error("Error createRing: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	Ring ring = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return ring;
    }
}

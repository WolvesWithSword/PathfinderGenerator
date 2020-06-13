package staff;

import java.util.Random;
import constant.StaffConstant;
import utility.Data;
import utility.Debug;

/**
 * StaffBuilder permet de cr�er des b�tons magiques.
 * @author Mentra20
 *
 */
public class StaffBuilder {
	Random r; //Le random pour les tirages.
	
	/* CONSTRUCTOR */
    public StaffBuilder(){
        this.r = new Random();
    }
    
    /**
     * createStaff permet de cr�er un b�tons selon la raret�
     * @param rarity : la raret� du b�tons.
     * @return le b�tons cr��
     */
    public Staff createStaff(int rarity) {
    	Debug.debug("Creation magic staff of rarity "+rarity+"...");
    	
    	Data<Staff> data = new Data<Staff>();
    	
    	//Chargement des donn�es selon la raret�.
    	switch (rarity) {
		case 3: data.addAll(StaffConstant.rarity3());
			break;
		case 4: data.addAll(StaffConstant.rarity4());
			break;
		case 5: data.addAll(StaffConstant.rarity5());
			break;
		case 6: data.addAll(StaffConstant.rarity6());
			break;
		default: Debug.error("Error createStaff: switch");
			break;
		}
    	
    	//Tirage du niveau du sort.
    	int randomValue = r.nextInt(100)+1;
    	Debug.debug("n_choice = "+randomValue);
    	Staff scepter = data.selectObject(randomValue);
    	
    	Debug.debug("");
    	return scepter;
    }
}

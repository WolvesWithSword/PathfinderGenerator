package utility;
import java.util.ArrayList;

/**
 * Cette classe repr�sente une liste de donn�es avec leur probabilit� dans la DB.
 * Elle poss�de des m�thodes pour effectuer des traitements de donn�es.
 * @author Mentra20
 * @param <E> : Le type stock�e dans la donn�es
 */
public class Data<E> extends ArrayList<Tuple<E,Integer>> {
	private static final long serialVersionUID = 6299565376922637204L;
	
	/**
	 * selectObject donne l'objet d'un drop correspondant au tirage.
	 * @param number : le tirage obtenu aux d�s.
	 * @return
	 */
	public E selectObject(int number){
        int index = 0;
        int currentVal = 1;
        
        while(currentVal + this.get(index).getY() <= number){
            currentVal += this.get(index).getY();
            index++;
        }
        
        return this.get(index).getX();
	}
}

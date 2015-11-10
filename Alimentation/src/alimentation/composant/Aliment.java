/**
 * @Class Aliment.java
 */
package alimentation.composant;

import alimentation.util.MasseImpl;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public abstract class Aliment extends MasseImpl implements ComposantAlimentaire{
	
	/**
	 * Constructeur d'objet Aliment
	 * @param masse
	 */
	public Aliment(float masse){
		super(masse);
	}
	
	/**
	 * 
	 * @return Kcal de l'Aliment
	 */
	public float calculerKcal(){
		return (this.getMasse()*this.getNbKcalParG());
	}
}

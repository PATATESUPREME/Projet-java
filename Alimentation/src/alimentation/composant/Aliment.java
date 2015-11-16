package alimentation.composant;

import alimentation.util.MasseImpl;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class Aliment.java
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
	 * Méthode calculant les Kcal en fonction de la masse 
	 * et du nombre de Kcal par gramme
	 * @return Kcal de l'Aliment
	 */
	public float calculerKcal(){
		return (this.getMasse()*this.getNbKcalParG());
	}
}

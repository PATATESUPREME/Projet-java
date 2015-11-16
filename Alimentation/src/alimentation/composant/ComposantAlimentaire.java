package alimentation.composant;

import alimentation.util.Masse;

/**
 * @author K�vin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class ComposantAlimentaire.java
 */
public interface ComposantAlimentaire extends Masse {
	
	/**
	 * M�thode calculant les Kcal en fonction de la masse 
	 * et du nombre de Kcal par gramme
	 * @return Kcal de l'Aliment
	 */
	float calculerKcal();
	
	/**
	 * Getteur retournant le nombre de Kcal par gramme
	 * @return nombre de Kcal par gramme
	 */
	float getNbKcalParG();
}

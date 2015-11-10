package alimentation.composant;

import alimentation.util.Masse;

/**
 * @author K�vin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public interface ComposantAlimentaire extends Masse {
	float calculerKcal();
	float getNbKcalParG();
}

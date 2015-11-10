package alimentation.composant;

import alimentation.util.Masse;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public interface ComposantAlimentaire extends Masse {
	float calculerKcal();
	float getNbKcalParG();
}

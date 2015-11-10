package alimentation.composant;

import alimentation.util.MasseImpl;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public abstract class Aliment extends MasseImpl implements ComposantAlimentaire{
	
	public Aliment(float masse){
		super(masse);
	}
	
	public float calculerKcal(){
		return (this.getMasse()*this.getNbKcalParG());
		
	}
}

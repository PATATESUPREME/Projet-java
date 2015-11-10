package alimentation.composant;

import alimentation.util.MasseImpl;

/**
 * @author K�vin DESSIMOULIE
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

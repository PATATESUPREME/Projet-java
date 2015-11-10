package alimentation.util;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class MasseImpl implements Masse{
	private float masse;
	
	public MasseImpl(float masse) {
		if (masse < 0.0F){
			throw new IllegalArgumentException("masse < 0");
		}
		this.masse = masse;
	}
	
	@Override
	public float getMasse() {
		return this.masse;
	}
	
}

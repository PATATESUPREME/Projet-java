/**
 * @Class Lipide.java
 */
package alimentation.composant;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class Lipide extends Aliment{
	

	private static final float NB_KCAL_PAR_G=4.0F;
	
	private float masse;
	
	public Lipide(float masse) {
		super(masse);
		this.masse = masse;
	}
	
	@Override
	public float getNbKcalParG() {
		return NB_KCAL_PAR_G;
	}

	@Override
	public String toString() {
		return "Lipide [masse=" + masse + "]";
	}
}

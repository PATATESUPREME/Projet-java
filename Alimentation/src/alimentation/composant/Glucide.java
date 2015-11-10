/**
 * @Class Glucide.java
 */
package alimentation.composant;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class Glucide extends Aliment{
	private static final float NB_KCAL_PAR_G=9.0F;
	
	private float masse;
	
	public Glucide(float masse) {
		super(masse);
		this.masse = masse;
	}
	@Override
	public float getNbKcalParG() {
		return NB_KCAL_PAR_G;
	}
	
	@Override
	public String toString() {
		return "Glucide [masse=" + masse + "]";
	}
}

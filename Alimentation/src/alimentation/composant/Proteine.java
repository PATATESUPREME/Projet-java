package alimentation.composant;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class Proteine extends Aliment{
	private static final float NB_KCAL_PAR_G=4.0F;
	
	private float masse;

	public Proteine(float masse) {
		super(masse);
		this.masse = masse;
	}

	@Override
	public float getNbKcalParG() {
		return NB_KCAL_PAR_G;
	}

	@Override
	public String toString() {
		return "Proteine [masse=" + masse + "]";
	}
}

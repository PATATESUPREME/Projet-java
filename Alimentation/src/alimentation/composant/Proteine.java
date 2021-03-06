package alimentation.composant;

/**
 * @author K�vin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class Proteine.java
 */
public class Proteine extends Aliment{
	
	private static final float NB_KCAL_PAR_G=4.0F;
	
	/*
	 * Variables
	 */
	private float masse;

	/**
	 * Constructeur d'objet Proteine
	 * @param masse
	 */
	public Proteine(float masse) {
		super(masse);
	}

	/**
	 * Getteur retournant le nombre de Kcal par gramme
	 * @return nombre de Kcal par gramme
	 */
	@Override
	public float getNbKcalParG() {
		return NB_KCAL_PAR_G;
	}

	/**
	 * R��criture du ToString servant � afficher l'objet
	 */
	@Override
	public String toString() {
		return "Proteine [masse=" + masse + "]";
	}
}

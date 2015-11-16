package alimentation.composant;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class Lipide.java
 */
public class Lipide extends Aliment{
	

	private static final float NB_KCAL_PAR_G=4.0F;
	
	/*
	 * Variables
	 */
	private float masse;
	
	/**
	 * Constructeur d'objet Lipide
	 * @param masse
	 */
	public Lipide(float masse) {
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
	 * Réécriture du ToString servant à afficher l'objet
	 */
	@Override
	public String toString() {
		return "Lipide [masse=" + masse + "]";
	}
}

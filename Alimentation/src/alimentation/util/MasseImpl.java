package alimentation.util;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class MasseImpl.java
 */
public class MasseImpl implements Masse{
	
	/*
	 * Variables
	 */
	private float masse;
	
	/**
	 * Constructeur d'objet MasseImpl
	 * @param masse
	 */
	public MasseImpl(float masse) {
		if (masse < 0.0F){
			throw new IllegalArgumentException("masse < 0");
		}
		this.masse = masse;
	}
	
	/**
	 * Getteur de masse
	 * @return masse
	 */
	@Override
	public float getMasse() {
		return this.masse;
	}
	
}

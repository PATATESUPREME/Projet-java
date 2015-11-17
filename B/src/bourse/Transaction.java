package bourse;
/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class Aliment.java
 */
public class Transaction {

	private final static int ANNEE_MIN=2000;
	private final int valeur;
	private final int annee;
	
	/**
	 * Constructeur d'objet Transaction
	 * @param Valeur,annee
	 */

	public Transaction(int annee, int valeur) {
		if(annee<ANNEE_MIN){
			throw new IllegalArgumentException("annee<"+ANNEE_MIN);
		}
		this.valeur = valeur;
		this.annee = annee;
	}
	
	public int getValeur() {
		return valeur;
	}

	public int getAnnee() {
		return annee;
	}
	
	@Override
	public String toString() {
		return "Transaction [valeur=" + valeur + ", annee=" + annee + "]";
	}

}

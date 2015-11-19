package bourse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * 
 * @Class Trader.java
 */
public class Trader implements Comparable<Trader>{

	private static final String PATTERN_IDENTIFIANT="[A-Z,1-9]{1}";
	private final String identifiant;
	private final String nom;
	private final String ville;
	private List<Transaction> transactions;
	
	/**
	 * Constructeur d'objet Trader
	 * @param identifiant
	 * @param nom
	 * @param ville
	 */
	public Trader(String identifiant, String nom, String ville) {
		if(!identifiant.matches(PATTERN_IDENTIFIANT)){
			throw new IllegalArgumentException("nom!=[A-Z,1-9]{1}");
		}
		if(nom==null){
			throw new NullPointerException("nom non null");
		}
		if(nom==""){
			throw new IllegalArgumentException("nom != de chaine vide");
		}
		if(ville==null){
			throw new NullPointerException("ville non null");
		}
		if(ville==""){
			throw new IllegalArgumentException("ville != de chaine vide");
		}
		this.identifiant = identifiant;
		this.nom = nom;
		this.ville = ville;
		this.transactions=new ArrayList<>();
	}
	
	/**
	 * Redéfinition de la méthode hashCode
	 */
	@Override
	public int hashCode() {
		return this.identifiant.hashCode();
	}

	/**
	 * Redéfinition de la méthode equals
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		}
		if (!(o instanceof Trader )){
			return false;
		}
		Trader other = (Trader) o;
		return identifiant.equals(other.identifiant);
	}

	/**
	 * Implémentation de compareTo
	 */
	@Override
	public int compareTo(Trader trader) {
		return this.identifiant.compareTo(trader.identifiant);
	}

	/**
	 * Getteur d'identifiant
	 * @return identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * Getteur de nom
	 * @return nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getteur de ville
	 * @return ville
	 */
	public String getVille() {
		return ville;
	}
	
	/**
	 * Getteur de liste de Transaction
	 * @return List<Transaction>
	 */
	public List<Transaction> getTransaction(){
		return Collections.unmodifiableList(this.transactions);
	}

	/**
	 * Redéfinition du toString
	 * @return String
	 */
	@Override
	public String toString() {
		return "Trader [identifiant=" + identifiant + ", nom=" + nom + ", ville=" + ville + ", transactions="
				+ transactions + "]";
	}
	
	/**
	 * Méthode d'ajout de Transaction
	 * @param transaction
	 */
	public void addTransaction(Transaction transaction){
		if(transaction==null){
			throw new NullPointerException("transaction non null");
		}
		this.transactions.add(transaction);
	}
}

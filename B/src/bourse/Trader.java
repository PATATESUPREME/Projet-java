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
	public Trader(String identifiant, String nom, String ville) {
		
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
	
	@Override
	public int hashCode() {
		return this.identifiant.hashCode();
	}

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

	@Override
	public int compareTo(Trader trader) {
		return this.identifiant.compareTo(trader.identifiant);
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public String getNom() {
		return nom;
	}

	public String getVille() {
		return ville;
	}
	
	public List<Transaction> getTransaction(){
		return Collections.unmodifiableList(this.transactions);
	}

	@Override
	public String toString() {
		return "Trader [identifiant=" + identifiant + ", nom=" + nom + ", ville=" + ville + ", transactions="
				+ transactions + "]";
	}
	
	public void addTransaction(Transaction transaction){
		if(transaction==null){
			throw new NullPointerException("transaction non null");
		}
		this.transactions.add(transaction);
	}
}

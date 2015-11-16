package alimentation.produit;
import alimentation.util.Origine;
import alimentation.composant.Proteine;
import alimentation.composant.Lipide;
import alimentation.composant.Glucide;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class ProduitAlimentaire.java
 */
public class ProduitAlimentaire {

	/*
	 * Variables
	 */
	private final Origine origine;
	private final Proteine proteine;
	private final Lipide lipide;
	private final Glucide glucide;
	
	/**
	 * Constructeur d'objet ProduitAlimentaire
	 * @param origine
	 * @param proteine
	 * @param lipide
	 * @param glucide
	 */
	public ProduitAlimentaire(Origine origine, Proteine proteine, Lipide lipide, Glucide glucide){
		this.origine=origine;
		this.proteine=proteine;
		this.lipide=lipide;
		this.glucide=glucide;
	}
	
	/**
	 * Getteur d'Origine
	 * @return l'origine de l'aliment
	 */
	public Origine getOrigine(){
		return this.origine;
	}
	
	/**
	 * Méthode calculant les Kcal d'un produit
	 * @return Kcal du produit
	 */
	public float calculerKcalProduit(){
		return (this.proteine.calculerKcal()+
				this.lipide.calculerKcal()+
				this.glucide.calculerKcal());
	}
	
	/**
	 * Réécriture du ToString servant à afficher l'objet
	 */
	@Override
	public String toString(){
		return "Produit : [origine = "+this.origine+", proteine = "+this.proteine+", lipide = "+this.glucide+"]";
	}
}

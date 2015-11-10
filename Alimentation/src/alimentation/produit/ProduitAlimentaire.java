/**
 * @Class ProduitAlimentaire.java
 */
package alimentation.produit;
import alimentation.util.Origine;
import alimentation.composant.Proteine;
import alimentation.composant.Lipide;
import alimentation.composant.Glucide;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class ProduitAlimentaire {

	/*
	 * Variables
	 */
	private final Origine origine;
	private final Proteine proteine;
	private final Lipide lipide;
	private final Glucide glucide;
	
	/*
	 *
	 */
	public ProduitAlimentaire(Origine origine, Proteine proteine, Lipide lipide, Glucide glucide){
		this.origine=origine;
		this.proteine=proteine;
		this.lipide=lipide;
		this.glucide=glucide;
	}
	
	public Origine getOrigine(){
		return this.origine;
	}
	
	public float calculerKcalProduit(){
		return (this.proteine.calculerKcal()+
				this.lipide.calculerKcal()+
				this.glucide.calculerKcal());
	}
	
	@Override
	public String toString(){
		return "Produit : [origine = "+this.origine+", proteine = "+this.proteine+", lipide = "+this.glucide+"]";
	}
}

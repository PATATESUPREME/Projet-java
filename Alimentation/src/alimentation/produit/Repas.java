/**
 * @Class Repas.java
 */
package alimentation.produit;
import java.util.ArrayList;
import java.util.List;

import alimentation.util.Origine;

/**
 * @author K�vin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class Repas {

	private List<ProduitAlimentaire> produits;

	public Repas() {
		this.produits = new ArrayList<>();
	}
	
	public void ajouterProduitAlimentaire(ProduitAlimentaire produit, int nombre){
		if(produit==null){
			throw new NullPointerException("");
		}
		if(nombre<=0){
			throw new IllegalArgumentException("");
		}
		for(int i=0; i<nombre; i++){
			produits.add(produit);
		}
	}
	
	public float calculerKcalTotal(){
		float total=0.0F;
		
		for(ProduitAlimentaire produit : produits){
			total+=produit.calculerKcalProduit();
		}
		return total;
	}
	
	public float calculerKcalOrigineVegetalTotal(){
float total=0.0F;
		
		for(ProduitAlimentaire produit : produits){
			if(produit.getOrigine()==Origine.VEGETALE){
				total+=produit.calculerKcalProduit();
			}
		}
		return total;
	}
}

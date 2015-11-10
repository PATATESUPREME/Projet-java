/**
 * @Class TestRepas.java
 */
package alimentation.test;

import alimentation.composant.Glucide;
import alimentation.composant.Lipide;
import alimentation.composant.Proteine;
import alimentation.produit.ProduitAlimentaire;
import alimentation.produit.Repas;
import alimentation.util.Origine;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 *
 */
public class TestRepas {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ProduitAlimentaire steakHache150Grammes = new ProduitAlimentaire(Origine.ANIMAl, 
				new Proteine(27.0F), new Lipide(8.0F), new Glucide(0.0F));
		ProduitAlimentaire oeuf = new ProduitAlimentaire(Origine.ANIMAl, 
				new Proteine(6.3F), new Lipide(4.6F), new Glucide(0.9F));
		ProduitAlimentaire carottesRapees100Grammes = new ProduitAlimentaire(Origine.VEGETALE, 
				new Proteine(0.8F), new Lipide(0.0F), new Glucide(8.0F));
		ProduitAlimentaire tomates400Grammes = new ProduitAlimentaire(Origine.VEGETALE, 
				new Proteine(4.0F), new Lipide(1.0F), new Glucide(1.0F));
		ProduitAlimentaire laitEcreme200Grammes = new ProduitAlimentaire(Origine.ANIMAl, 
				new Proteine(6.3F), new Lipide(0.2F), new Glucide(9.6F));
		ProduitAlimentaire rizComplet200Grammes = new ProduitAlimentaire(Origine.VEGETALE, 
				new Proteine(14.0F), new Lipide(4.4F), new Glucide(154.0F));
		Repas repas = new Repas();
		
		repas.ajouterProduitAlimentaire(steakHache150Grammes, 3);
		repas.ajouterProduitAlimentaire(oeuf, 6);
		repas.ajouterProduitAlimentaire(carottesRapees100Grammes, 10);
		repas.ajouterProduitAlimentaire(tomates400Grammes, 3);
		repas.ajouterProduitAlimentaire(laitEcreme200Grammes, 5);
		repas.ajouterProduitAlimentaire(rizComplet200Grammes, 5);
		
		System.out.println("Kcal total : "+repas.calculerKcalTotal()+", Kcal d'origine vegetal : "+repas.calculerKcalOrigineVegetalTotal());

	}

}

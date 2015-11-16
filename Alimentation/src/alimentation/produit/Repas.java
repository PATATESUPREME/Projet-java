package alimentation.produit;
import java.util.ArrayList;
import java.util.List;

import alimentation.util.Origine;

/**
 * @author Kévin DESSIMOULIE
 * @author Baptiste BOISMORAND
 * @Class Repas.java
 */
public class Repas {

	/*
	 * Variables
	 */
	private List<ProduitAlimentaire> produits;

	/**
	 * Contructeur d'objet Repas
	 */
	public Repas() {
		this.produits = new ArrayList<>();
	}
	
	/**
	 * Méthode ajoutant un ou plusieurs ProduitAlimentaire au Repas
	 * @param produit
	 * @param nombre
	 */
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
	
	/**
	 * Méthode calculant les Kcal totales d'un Repas
	 * @return Kcal totales du Repas
	 */
	public float calculerKcalTotal(){
		float total=0.0F;
		
		for(ProduitAlimentaire produit : produits){
			total+=produit.calculerKcalProduit();
		}
		return total;
	}
	
	/**
	 * Méthodes calculant les Kcal d'Orignes Vegetal d'un Repas
	 * @return les Kcal d'Orignes Vegetal du Repas
	 */
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

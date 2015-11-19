package bourse;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class TestBourse.java
 */
public class TestBourse {

	/**
	 * @param args
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {

		/*
		 * Variable
		 */
		final Trader trader1 = new Trader("1", "T1", "V1");
		final Trader trader2 = new Trader("2", "T2", "V1");
		final Trader trader3 = new Trader("3", "T3", "V2");
		final Trader trader4 = new Trader("4", "T4", "V1");
		final Trader trader5 = new Trader("5", "T5", "V5");
		final Trader trader6 = new Trader("6", "T6", "V6");
		Transaction trans1 = new Transaction(2001, 1000);
		Transaction trans2 = new Transaction(2001, 2000);
		Transaction trans3 = new Transaction(2001, 3000);
		Transaction trans4 = new Transaction(2001, 4000);
		Transaction trans5 = new Transaction(2002, 3000);
		Transaction trans6 = new Transaction(2002, 4000);
		
		/*
		 * Ajout des Transactions
		 */
		trader1.addTransaction(trans1);
		trader1.addTransaction(trans2);
		trader1.addTransaction(trans3);
		trader1.addTransaction(trans4);

		trader2.addTransaction(trans1);
		trader2.addTransaction(trans2);
		trader2.addTransaction(trans3);
		trader2.addTransaction(trans6);

		trader3.addTransaction(trans1);
		trader3.addTransaction(trans2);
		trader3.addTransaction(trans5);
		trader3.addTransaction(trans6);
		
		/*
		 * Liste de Trader
		 */
		final List<Trader> traders = Arrays.asList(trader1, trader2, trader3, trader4, trader5, trader6);
		
		/*
		 * Affichage de la liste
		 */
		System.out.println(traders);
		/*
		 * Trie de la liste
		 */
		Collections.sort((List<Trader>) traders);
		/*
		 * Affichage de la liste trier
		 */
		System.out.println(traders);
		/*
		 * Affichage de la liste avec filtrage sur la ville "V1"
		 */
		System.out.println(new Filter().filter(traders, new Predicat<Trader>(){
			@Override
			public boolean test(Trader t){
				return "V1".equals(t.getVille()) && !t.getTransaction().isEmpty();
			}
		}));
		/*
		 * Affichage de la liste avec filtrage sur la ville "V2"
		 */
		System.out.println(new Filter().filter(traders, new Predicat<Trader>(){
			@Override
			public boolean test(Trader t){
				return "V2".equals(t.getVille()) && !t.getTransaction().isEmpty();
			}
			}));
	}

}

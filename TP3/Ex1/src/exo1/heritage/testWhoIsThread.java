package exo1.heritage;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class testWhoIsThread.java
 */
public class testWhoIsThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * V1 avec création de variable
		 */
		final WhoIsThread t = new WhoIsThread();
		t.start();
		/*
		 * V2 refactorisée
		 */
		new WhoIsThread().start();
	}

}

package exo1.heritage;

/**
 * @author DESSIMOULIE K�vin
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
		 * V1 avec cr�ation de variable
		 */
		final WhoIsThread t = new WhoIsThread();
		t.start();
		/*
		 * V2 refactoris�e
		 */
		new WhoIsThread().start();
	}

}

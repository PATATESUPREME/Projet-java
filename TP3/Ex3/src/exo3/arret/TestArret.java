package exo3.arret;

/**
 * @author DESSIMOULIE K�vin
 * @author BOISMORAND Baptiste
 *
 * @class TestArret.java
 */
public class TestArret {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		final Task t = new Task();
		
		new Thread(t).start();
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		t.setStopped(true);
	}

}

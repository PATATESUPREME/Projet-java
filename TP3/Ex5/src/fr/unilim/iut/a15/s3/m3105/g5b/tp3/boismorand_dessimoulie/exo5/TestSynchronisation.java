package fr.unilim.iut.a15.s3.m3105.g5b.tp3.boismorand_dessimoulie.exo5;

import java.util.ArrayList;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class TestSynchronisation.java
 */
public class TestSynchronisation {

	private static class ConcurrentThread extends Thread {
		private Compteur compteur = new Compteur();
		
		public void run(){
			for(int i=0; i<1_000_000; i++){
				compteur.next();
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final ArrayList<ConcurrentThread> tab = new ArrayList<ConcurrentThread>();
		
		for(int i=0; i<10; i++){
			tab.add(new ConcurrentThread());
		}
		
		for(int i=0; i<10; i++){
			tab.get(i).start();
		}
	}
}

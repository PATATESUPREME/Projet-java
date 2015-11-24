package fr.unilim.iut.a15.s3.m3105.g5b.tp3.exo6.boismorand_dessimoulie;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class Compteur.java
 */
public class Compteur {

	private long l;
	
	public long getL(){
		return l;
	}
	
	public void next(){
		l=l+1;
	}
}

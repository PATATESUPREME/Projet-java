package fr.unilim.iut.a15.s3.m3105.g5b.tp3.exo7.boismorand_dessimoulie;

import java.util.List;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class Producer.java
 */
public class Producer implements Runnable {

	private List<String> strings;
	private int SIZE;
	
	public Producer(List<String> strings, int SIZE){
		this.strings=strings;
		this.SIZE=SIZE;
	}
	
	@Override
	public void run(){
		
	}
	
	public void produce(){
		
	}
}

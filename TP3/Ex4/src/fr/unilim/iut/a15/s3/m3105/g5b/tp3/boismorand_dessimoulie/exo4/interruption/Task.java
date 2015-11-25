package fr.unilim.iut.a15.s3.m3105.g5b.tp3.boismorand_dessimoulie.exo4.interruption;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class Task.java
 */
public class Task implements Runnable {

	private boolean stopped;
	
	public Task(){
		this.stopped=false;
	}
	
	public void setStopped(boolean stopped){
		this.stopped=stopped;
	}
	
	public synchronized boolean isStopped(){
		return this.stopped;
	}
	
	@Override
	public void run(){
		while(!this.isStopped()){
			System.out.println(".");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

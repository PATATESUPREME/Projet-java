package fr.unilim.iut.a15.s3.m3105.g5b.tp3.boismorand_dessimoulie.exo1.heritage;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class WhoIsThread.java
 */
public class WhoIsThread extends Thread{

	public WhoIsThread(){}
	
	@Override
	public void run(){
		for(int i=0; i<20; i++){
			System.out.println(this);
			try{
				Thread.sleep(5000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public String toString(){
		return this.getName();
	}
}

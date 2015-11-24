package exo1.realisation;

/**
 * @author DESSIMOULIE Kévin
 * @author BOISMORAND Baptiste
 *
 * @class WhoIsThread.java
 */
public class WhoIsThread implements Runnable{

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
		return this.toString();
	}
}

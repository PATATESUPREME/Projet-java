package exo3.arret;

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

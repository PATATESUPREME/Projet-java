package exo7;

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
}

package Test1;

import java.util.concurrent.TimeUnit;

public class Daemon {

	public static void main(String[] args) throws InterruptedException {
		
		while(true) {
			
			System.out.println("Hi...");
			TimeUnit.SECONDS.sleep(30);
		    System.out.println("wating is over..");
		}
	}
}

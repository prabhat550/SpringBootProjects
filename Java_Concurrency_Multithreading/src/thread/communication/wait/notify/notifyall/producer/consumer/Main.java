package thread.communication.wait.notify.notifyall.producer.consumer;

public class Main {

	public static void main(String[] args) {
		
		SharedResource sharedResource = new SharedResource(1,20);
		Thread t1 = new Thread(new PrintEven(sharedResource));
		Thread t2 = new Thread(new PrintOdd(sharedResource));
		t1.start();
		t2.start();
		
	}
}

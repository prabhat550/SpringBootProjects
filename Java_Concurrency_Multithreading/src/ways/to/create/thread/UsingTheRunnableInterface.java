package ways.to.create.thread;

public class UsingTheRunnableInterface implements Runnable {

	public static void main(String[] args) {

		// Runnable Interface Method 1
		Thread t1 = new Thread(new UsingTheRunnableInterface());
		t1.start();

		// Runnable Interface Method 2
		Runnable run = () -> {
			System.out.println("Using Runnable Method Way 2");
		};
		Thread t2 = new Thread(run);
		t2.start();
		Thread.currentThread();
	}

	@Override
	public void run() {

		System.out.println("Using Runnable Method Way 1");

	}
}

package executor.framework.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Processor implements Runnable {

	private int id;

	public Processor(int id) {
		super();
		this.id = id;
	}

	@Override
	public void run() {
		System.out.println("Starting.....  " + (id + 1));
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Finished.....  " + (id + 1));
	}

}

public class ThreadPoolSimpleProgram {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			executorService.execute(new Processor(i));
		}
		executorService.shutdown();
	}

}

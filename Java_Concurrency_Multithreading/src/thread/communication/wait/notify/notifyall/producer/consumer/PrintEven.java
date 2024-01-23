package thread.communication.wait.notify.notifyall.producer.consumer;

public class PrintEven implements Runnable {

	private SharedResource sharedRresource;
	int numb = 0;

	public PrintEven(SharedResource sharedRresource) {
		super();
		this.sharedRresource = sharedRresource;
	}

	@Override
	public void run() {
		synchronized (this.sharedRresource) {
			while (SharedResource.startValue < sharedRresource.getCount() -2) {
				while (sharedRresource.getSharedValue() % 2 != 0) {
					try {
						this.sharedRresource.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				numb = sharedRresource.getSharedValue();
				System.out.println("PrintEven : " + numb);
				numb += 1;
				sharedRresource.setSharedValue(numb);
				SharedResource.startValue += 1;
				this.sharedRresource.notifyAll();
			}
		}
	}

}

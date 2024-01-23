package thread.communication.wait.notify.notifyall.producer.consumer;

public class SharedResource {

	private int sharedValue = 0;
	private int count = 20;
	static int startValue = 0;

	public SharedResource(int sharedValue, int count) {
		super();
		this.sharedValue = sharedValue;
		this.count = count;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getSharedValue() {
		return sharedValue;
	}

	public void setSharedValue(int sharedValue) {
		this.sharedValue = sharedValue;
	}

}

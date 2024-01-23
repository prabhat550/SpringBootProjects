package ways.to.create.thread;

public class UsingTheThreadClass extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsingTheThreadClass usingTheThreadClass = new UsingTheThreadClass();
		usingTheThreadClass.start();
	}

	public void run() {
		System.out.println("Running Thread Using Class");
	}

}

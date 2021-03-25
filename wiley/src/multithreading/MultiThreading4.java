package multithreading;

public class MultiThreading4 extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("i" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading4 bb = new MultiThreading4();
		bb.run();
		for (int i = 0; i < 5; i++) {
			System.out.println("main" + i);
		}
	}

}

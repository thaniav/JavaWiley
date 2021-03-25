package multithreading;

public class MultiThreading2Sleep extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				System.out.println("Exception raised");
			}
			System.out.println("thread" + i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading2Sleep m1 = new MultiThreading2Sleep();
		MultiThreading2Sleep m2 = new MultiThreading2Sleep();
		m1.start();
		m2.start();

	}
}

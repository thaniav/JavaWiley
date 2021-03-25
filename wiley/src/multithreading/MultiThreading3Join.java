package multithreading;

public class MultiThreading3Join extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Exception raised");
			}
			System.out.println("i" + i);
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultiThreading3Join m1 = new MultiThreading3Join();
		MultiThreading3Join m2 = new MultiThreading3Join();
		MultiThreading3Join m3 = new MultiThreading3Join();
		m1.start();

		try {
			m1.join();

		} catch (InterruptedException e) {
			System.out.println("Exception raised");
		}
		m2.start();
		m3.start();
	}

}

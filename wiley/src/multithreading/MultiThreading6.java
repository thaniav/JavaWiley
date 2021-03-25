package multithreading;

public class MultiThreading6 extends Thread{
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
			Thread.sleep(100);
			}
			catch(InterruptedException e ) {
				e.printStackTrace();
			}
			System.out.println("i" + i);
		}
	}
		public void run(int a) {
			for (int i = 0; i < 5; i++) {
				System.out.println("main" + i);
			}
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading4 bb = new MultiThreading4();
		bb.start();
	
	}
}

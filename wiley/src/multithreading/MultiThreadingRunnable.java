package multithreading;

public class MultiThreadingRunnable implements Runnable{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("thread"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreadingRunnable mm = new MultiThreadingRunnable();
		Thread bb = new Thread(mm);
		bb.start();
		
		
		for(int i=0;i<5;i++) {
			System.out.println("main"+i);
		}
	}
}

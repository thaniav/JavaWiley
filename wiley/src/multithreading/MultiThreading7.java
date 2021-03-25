package multithreading;

public class MultiThreading7 extends Thread{
	
	public void run() {
		System.out.println(Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading7 b1= new MultiThreading7();
		MultiThreading7 b2= new MultiThreading7();
		MultiThreading7 b3= new MultiThreading7();
		MultiThreading7 b4= new MultiThreading7();
		b1.setPriority(Thread.MAX_PRIORITY);
		b2.setPriority(Thread.MIN_PRIORITY);
		b3.setPriority(NORM_PRIORITY);
		b4.setPriority(7);
		b1.start();
		b2.start();
		b3.start();
		b4.start();
		

	}

}

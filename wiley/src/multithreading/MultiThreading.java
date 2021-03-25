package multithreading;

public class MultiThreading extends Thread{
	public void run() {
		for(int i=0;i<5;i++) {
		System.out.println("thread"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading mm = new MultiThreading();
		mm.start();
		
		for(int i=0;i<5;i++) {
			System.out.println("main"+i);
		}
	}

}

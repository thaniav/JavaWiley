package wiley;

public class GarbageCollector {


	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GarbageCollector a1= new GarbageCollector();
		GarbageCollector a2= new GarbageCollector();
System.out.println(a1);
System.out.println(a2);
a1=null;
a2=null;
System.gc();


	}
	

}

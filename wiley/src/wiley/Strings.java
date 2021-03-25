package wiley;

public class Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Hello");
		String s2=new String("Hello");
		
		String s3="Hi";
		String s4="Hi";
		
		if(s1==s2) {
			System.out.println("s1 and s2 are same objects");
		}
		else {
			System.out.println("s1 and s2 are different objects");
		}
		
		if(s3==s4) {
			System.out.println("s3 and s4 are same objects");
		}
		else {
			System.out.println("s3 and s4 are different objects");
		}
		
	//USING EQUALS METHOD - COMPARES ONLY THE VALUES	
		
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 have same values");
		}
		else {
			System.out.println("s3 and s4 have different values");
		}
		
		if(s3.equals(s4)) {
			System.out.println("s1 and s2 have same values");
		}
		else {
			System.out.println("s3 and s4 have different values");
		}
		

	}

}

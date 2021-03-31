//package Implementation;
//
//import java.util.*;
//
//public class ReverseUsingStack {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		Stack2 s=new Stack2(10);
//		int n=sc.nextInt();
//		while (n != 0) 
//	    {
//	        s.push(n % 10);
//	        n= n/ 10;
//	    }
//		int reverse=0;
//		int i =1;
//		 while (!s.isEmpty()) 
//		    {
//		        reverse = reverse + (s.peek() * i);
//		        s.pop();
//		        i = i * 10;
//		    }
//		 System.out.print(reverse);
//		 
//		 
//		 CharacterStack st=new CharacterStack(10);
//			String str=sc.nextLine();
//			char b[] = new char[30];
//			for (int j = 0; i < str.length(); i++) {
//				b[i] = str.charAt(j);
//				s.push(b[i]);
//			}
//			for (int j = s.top; i >=0; i--) {
//				System.out.print(s.arr[i]);
//				
//			}
//		
//	}
//
//}

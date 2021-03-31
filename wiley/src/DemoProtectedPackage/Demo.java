package DemoProtectedPackage;
enum Enums
{
    A, B, C, D;
 
    private Enums()
    {
        System.out.println(10);
    }
}
 
public class Demo
{
    public static void main(String[] args)
    {
    	String s1="welcome";
    	String s2=new String("welcome");

    	if(s1.equals(s2))
    	  System.out.println("same");
    	else
    	  System.out.println("not same");
    	
    	String str1 = "abcde";
    	System.out.println(str1.substring(1, 3)); 
       
    }
}


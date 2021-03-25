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
        Enum en = Enums.D;
    }
}


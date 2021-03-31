package DemoProtectedPackage;

public class NameofOS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( System.getProperty("os.name"));
		System.out.println( System.getProperty("user.name"));
		System.out.println( System.getProperty("java.version"));
		System.out.println( System.getProperty("java.version"));
		System.out.println( System.getProperty("java.home"));
		System.out.println( System.getProperty("os.memory"));
		System.out.println(Runtime.getRuntime().freeMemory());
		System.out.println(Runtime.getRuntime().totalMemory());
		System.out.println(Runtime.getRuntime().maxMemory());
	}

}

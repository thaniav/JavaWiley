package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class InsertPrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "thania");
			Statement stmt = con.createStatement();
			System.out.println("Enter ID");
			int id = sc.nextInt();

			System.out.println("Enter name");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.println("Enter age");
			int age = sc.nextInt();
			System.out.println("Enter course");
			sc.nextLine();
			String course = sc.nextLine();
			
			PreparedStatement ps = con .prepareStatement("Insert into sdetails values(?,?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3,age);
			ps.setString(4,course);
			ps.execute();
			
			
			
			
			}
			catch(Exception e) {
				System.out.println(e);

			}
			
	}

}

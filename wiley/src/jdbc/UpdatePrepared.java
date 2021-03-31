package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class UpdatePrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "thania");
			Statement stmt = con.createStatement();
			System.out.println("Enter Id");
			int id=sc.nextInt();
			System.out.println("Enter Name");
			sc.nextLine();
			String name=sc.nextLine();
			
			PreparedStatement ps=con.prepareStatement("Update sdetails set name=? where cid=?");
			ps.setString(1, name);
			ps.setInt(2, id);
			ps.execute();
			
			
			
			
			}
			catch(Exception e) {
				System.out.println(e);

			}
			

	}

}

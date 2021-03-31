package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public abstract class DeleteSQL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc=new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "thania");
			Statement stmt = con.createStatement();
			
			
			int id=sc.nextInt();
			
			stmt.executeUpdate("delete from sdetails where id="+id);
			
			

			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
	}

}

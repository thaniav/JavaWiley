package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class DeletePrepared {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "thania");
		Statement stmt = con.createStatement();
		
		
		PreparedStatement ps=con.prepareStatement("Update sdetails set name=? where cid=?");
		
		
		System.out.println("Enter Id to delete");
		int id=sc.nextInt();
		
		ps=con.prepareStatement("Delete from sdetails where cid=?");
		ps.setInt(1, id);
		ps.execute();
		
		}
		catch(Exception e) {
			System.out.println(e);

		}
		

	}

}

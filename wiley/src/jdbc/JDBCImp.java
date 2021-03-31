package jdbc;

import java.sql.*;
import java.sql.Connection;
import java.util.Scanner;

public class JDBCImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "thania");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("Select * from library");
			while (rs.next())
				System.out.println(rs.getString(1) + "  " + rs.getString(2) + "  " + rs.getString(3));

			String query = "delete from publication where a_id='A1'";
			int rows = stmt.executeUpdate(query);
			System.out.println(rows);

			Scanner sc = new Scanner(System.in);
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
			int rows2 = stmt.executeUpdate("insert into sdetails(cid, name, age, subject)" + " values ('" + id + "','"
					+ name + "','" + age + "','" + course + "')");

			System.out.println(rows2);

			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo2 {
	public static void main(String[] args) {
		try {
			//register and load
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("load and register done!!");
		Connection connection=	DriverManager.getConnection("jdbc:mysql://localhost:3306/firstschema", "root","root123");
		System.out.println("connected");
		//EXECUTING QUERIES..
		connection.createStatement();
		System.out.println("PLATFORM CREATED");
//		connection.
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}
}

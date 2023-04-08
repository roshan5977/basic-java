package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstschema", "root","root123");
			Statement statement = connection.createStatement();
			//prepared statetment extends statemnet  -only one statement -reduce buddoen on db
			//callable statement              
//			statement.execute("  CREATE TABLE  STUD ( ID varchar(5) PRIMARY KEY,name varchar(20))");
			statement.execute(" insert into STUD values('32','roshan') ");
//			statement.executeUpdate()
//			statement.executeQuery(null)//resultset return 
			
			
			System.out.println("done");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}



//driver--type 4 thin driver.
//connections
//statement 
//quieres-insert update delete
//Transactions

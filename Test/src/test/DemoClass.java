package test;
import java.sql.*;
/*
 * 1.import--> java.sql
 * 2.load and register the driver -->4 types of driver jdbc type 1 driver  i.e jdbc odbc bridge!! we will go with my sql driver
 * load the driver com.mysql.jdbc.Driver =we need to download it my sql connector jar
 * 3.create connection  -->interface connection
 * 4.create a statement  -->interface statement
 * 5.execute the query  -->
 * 6.process the  results
 * 7.close
 */
//7 
public class DemoClass {

	public static void main(String[] args) throws Exception
	{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(,,);
	}

}

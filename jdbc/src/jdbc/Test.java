package jdbc;
// step1   import java.sql.*
//import java.sql.*;
public class Test {
// step 2---load and register the driver
	//register -class.forName("com.mysql.jdbc.Driver")loads the driver
//	Class
// step 3---establish connection
	//interface connection is there u neeed to intantiate it...
	//Connection is a interface so i cant intantiate bug by a factory methd implementation we will get and use..
	//Connection con=DriverManager.getConnection(url,username,password)-mtd is that which gives the object
//	DriverManagement
//	Statement st=con.createStatemnetr
// step 4---statement------statement(i u want to execute the query  u can create Statemnet obj),
	//prepare statement(if u have predefined query bt u have different values )
	//collable stataement(for stored prcedure)
	//ResultSet rs=st.execute Query("select * from Student")
	//query result will sbe stored inside this set as obj rs will hold the table.
	//rs.next()//to shift the pointer....
	//rs.nextInt(1);+" "rs.getString(2)
	//rs.next()                                                                   //use while loop.
	//rs.nextInt(1);+" "rs.getString(2)
//	while(rs.next()) {//rs.next wil do two things shift the pointer and  check whether it has nextLine
//		System.out.println(rs.getInt()+""+rs.getString(2));
//	}
// step 7---execuete the query  when iu execute a query u will get data 
	//if u r creating table inside table then it return s the num of query..
// step 7---process result
// step 7---close how to do it get obj of connection and stattement and close both..
//	st.close()
//	con.close()
}

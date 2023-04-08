package com.feuji.Accounts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CustomerDAO {

//	public static void main(String[] args) {
////		Customer1 customer = new Customer1(3, "Ramesh", 234567876, "karnataka");
////		insertCustomer(customer);
//		CustomerDAO customerDAO=new CustomerDAO();
//		System.out.println("came");
//	for(	Iterator<Customer1> i=customerDAO.retrieve().iterator();i.hasNext();i.forEachRemaining(System.out::println));
//System.out.println("done");
//	}
//
//	public void insertCustomer(Customer1 customer) {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("registered");
//			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/firstschema", "root",
//					"root123");
//			Statement statement = connection.createStatement();
//			System.out.println("connected");
//
//			String qywe = "insert into firstschema.customer  values (10," + "'sik'," + 68988999 + "," + "'hv')";
//			System.out.print(qywe);
//			statement.execute(qywe);
//			System.out.println("executed");
//			statement.close();
//			connection.close();
//		} catch (ClassNotFoundException | SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}


	public  void insertCustomer(Customer1 customer) {
		Connection connection = DBConnection.getConnection();
		PreparedStatement statement = null;
if(connection!=null) {
		try {
			statement = connection.prepareStatement("INSERT INTO firstschema.customer("
					+ "	 CustomerId, CustomerName, CustomerPhno, CustomerCity) VALUES (  ?, ?, ?, ?)");
			statement.setLong(1, customer.getCustomerId());
			statement.setString(2, customer.getCustomerName());
			statement.setInt(3, customer.getCutomerPhno());
			statement.setString(4, customer.getCustomerCity());
			statement.executeUpdate();
//			System.out.println(count);
			DBConnection.closeResourses(connection, statement);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}

	public List<Customer1> retrieve() {
		Connection connection = DBConnection.getConnection();
		System.out.println("connected");
		PreparedStatement preparedStatement = null;
		List<Customer1> customers = new ArrayList<>();
		try {
			if (connection != null) {
				System.out.println("not null");
				preparedStatement = connection.prepareStatement("select * from customer");
				System.out.println("statement done");
				ResultSet resultSet = preparedStatement.executeQuery();
				while (resultSet.next()) {
					System.out.println("added");
					customers.add(new Customer1(resultSet.getInt("CustomerId"), resultSet.getString("CustomerName"), resultSet.getInt("CustomerPhno"),
							resultSet.getString("CustomerCity")));
				}
				
			}

		} catch (Exception exception) {
			System.out.println("exception");
			exception.printStackTrace();

		} finally {
			DBConnection.closeResourses(connection, preparedStatement);
		}

		return customers;

	}

}

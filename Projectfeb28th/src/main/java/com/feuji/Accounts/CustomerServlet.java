package com.feuji.Accounts;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.apache.tomcat.util.http.parser.Cookie;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class DAOCustomer
 */
@WebServlet("/CustomerServlet")
public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html;charset=UTF-8");
		  out.println("WELCOME!!!");
		int s = Integer.parseInt(request.getParameter("id"));
		String s1 = request.getParameter("name");
		int s2 = Integer.parseInt(request.getParameter("phno"));
		String s3 = request.getParameter("state");
		Customer1 customer1 = new Customer1(s, s1, s2, s3);

		CustomerService customerService=new CustomerService();
		customerService.insert(customer1);
		System.out.println("inserted");

     ObjectMapper mapper = new ObjectMapper();  
    String json= mapper.writeValueAsString(customer1);
    out.print("<br><p>"+json+"</p>");
	 out.print("<a href='CustomerDb'>Show Records</a>");

//	 request.getLocalAddr()
//	 request.getContextPath()
//	 request.get
	 
	 
		HttpSession hs = request.getSession(true);//why true same session will caried forward
		hs.setAttribute("stringNMkey","obj value");


	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		
		
//		request.getHeader(s3)
//		request.authenticate(response)
//	 request.
//	 javax.servlet.http.Cookie[] c= request.getCookies();
	 //if(coki!=null) for each loop get name and get value; set max age(0)
//	 if u dont wan to keep more information in server u store itin cokies
//	 response.addcokies( cockie);
//	 response.addCookie(new Cookie("state","banglore"));
	 
	 
 	    
	 
	HttpSession hs = request.getSession(true);//why true same session will caried forward
	
	System.out.println(hs.getAttribute("stringNMkey"));
	System.out.println(hs.getId());
//	as the same session caried out so i can use get some value in other  servlet
// hs.setMaxInactiveInterval(1);
//	hs.invalidate();
	 
	 
	 
	 
	}


}

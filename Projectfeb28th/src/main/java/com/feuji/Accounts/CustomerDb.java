package com.feuji.Accounts;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class CustomerDb
 */
@WebServlet("/CustomerDb")
public class CustomerDb extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerDb() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		CustomerService customerService=	new CustomerService();
     List<Customer1> listss= customerService.retrieve();

		response.setContentType("text/html;charset=UTF-8");

		  ObjectMapper mapper = new ObjectMapper();  
		    String json= mapper.writeValueAsString(listss);
//		    System.out.println(json);
//		    request.setAttribute("jsonarr", json);
		    out.print(json);;
//		    request.getRequestDispatcher("Customer_DB.html").forward(request, response);
		    
	  out.println("WELCOME!!!");
	  out.print("<table border = 2 width=75%>");
	  for(Customer1 custom: listss) {
		  out.print("<tr>");  
		  out.print("<td>"); 
		  out.write("<p>"+custom.getCustomerId()+"</p>");
		  out.print("</td>");  
		  out.print("<td>");  
		  out.write("<p>"+custom.getCustomerName()+"</p>");
		  out.print("</td>");  
		  out.print("<td>");  
		  out.write("<p>"+custom.getCutomerPhno()+"</p>");
		  out.print("</td>");
		  out.print("<td>"); 
		  out.write("<p>"+custom.getCustomerCity()+"</p>");
		  out.print("</td>");  
		  out.print("</tr>");  
	  }
	  out.print("</table>");
	  
	 System.out.println("shown in table");


	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

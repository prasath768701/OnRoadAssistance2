package controller;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerDAO;
import model.Customer;
import model.RequestTable;
import service.CustomerService;


/**
 * Servlet implementation class Cust_Register_Servlet
 */
@WebServlet("/CustomerRegister")
public class CustomerRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String email1, password1;
	    email1=request.getParameter("Email");
	    password1=request.getParameter("Password");
	     PrintWriter out = response.getWriter();
	     
	     
	     try {
	        
	        Customer cust=CustomerDAO.findUserByIdPwd(email1, password1);
	        if((cust !=null))
	        {
		        request.getSession().setAttribute("Customer", cust);
	            ArrayList<RequestTable> requestslist = CustomerService.getRequests(cust.getCustid());
	            request.getSession().setAttribute("requests", requestslist);
	             response.sendRedirect("CustomerRequest.jsp");

               

	        }
	        else
	        {
	        	out.println("Wrong Password");
	        }
	     }
	     catch(Exception e)
	     {
	    	 out.println(e);
	     }
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String customername=request.getParameter("UserName");
		String password=request.getParameter("Password");
		int gender=Integer.parseInt(request.getParameter("gender"));
		String dateofbirth =request.getParameter("Dateofbirth");
		String phonenumber=request.getParameter("Phonenumber");
		String email=request.getParameter("Email");
		int cust_id1=0;
		
        PrintWriter out = response.getWriter();
		
        Customer customer=new Customer(customername,password,gender,dateofbirth,phonenumber,email,cust_id1);
     
     
           try {
			  CustomerService.addCustomer(customer);
	         int no = 0;
			
			  HttpSession session=request.getSession();
	             session.setAttribute("int",no );
	        response.sendRedirect("CustomerLogin.jsp");
		} catch (SQLException | ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
          
      
         
       }
}



	



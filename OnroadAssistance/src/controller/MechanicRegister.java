package controller;

import java.awt.List;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.text.ParseException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerDAO;
import dao.MechanicRegisterDao;
import model.Customer;
import model.Mechanic;
import service.CustomerService;

/**
 * Servlet implementation class MechanicRegister
 */
@WebServlet("/MechanicRegister")
public class MechanicRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MechanicRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String email1, password1;
	    email1=request.getParameter("username");
	   
	    password1=request.getParameter("password");
	   
	     PrintWriter out = response.getWriter();
	     
	     
	     try {
	        
	      Mechanic mech1=MechanicRegisterDao.findUserByIdPwd1(email1, password1);
        if((mech1 !=null))
	        {
	             HttpSession session=request.getSession();
	   	         session.setAttribute("Mechanic", mech1);
      
	             session.setAttribute("mech_id", mech1.getMech_id()); 
	             response.sendRedirect("MechanicHomePage.jsp");
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

		
		
		
		
		


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		
		String mechanicname=request.getParameter("UserName");
		String password=request.getParameter("Password");
		int gender=Integer.parseInt(request.getParameter("gender"));
		String dateofbirth =request.getParameter("Dateofbirth");
		String phonenumber=request.getParameter("Phonenumber");
		String email=request.getParameter("Email");
		double latitude=Double.parseDouble(request.getParameter("latitude"));
		double longitude=Double.parseDouble(request.getParameter("longitude"));
		int mech_id=0;
		
		PrintWriter out = response.getWriter();
		
		Mechanic mechanic= new Mechanic(mechanicname,password ,gender,dateofbirth,phonenumber,email,latitude,longitude,mech_id);
		
		
		try
		{
			CustomerService.addMechanic(mechanic);
			int no = 0;
			 out.print("Registration successful");
			 HttpSession session=request.getSession();
	         session.setAttribute("int",no );
	         response.sendRedirect("MechanicLogin.jsp");
		} catch (SQLException | ClassNotFoundException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} 
		}
		
		
	}



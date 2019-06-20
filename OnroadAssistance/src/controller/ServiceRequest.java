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

import model.Customer;
import model.Request;
import model.Mechanic;
import service.CustomerService;

/**
 * Servlet implementation class Servicerequest
 */
@WebServlet("/ServiceRequest")
public class ServiceRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServiceRequest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String action = request.getParameter("action");
		
		HttpSession session=request.getSession();
		session.setAttribute("MechId", request.getParameter("mechid"));
		
		switch (action) {
		case "update": 
			try {
				
				 int mechid= Integer.parseInt(request.getParameter("mechid"));
				 int reqid = Integer.parseInt(request.getParameter("request_id"));
			   	CustomerService.updateRequest(reqid, mechid);
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;

		default:
			break;
		}
		
		 response.sendRedirect("checkRequestStatus.jsp");
		
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String location=request.getParameter("location");
		Float lattitude =Float.parseFloat(request.getParameter("lattitude"));
		Float longitude=Float.parseFloat(request.getParameter("longitude"));
		
		HttpSession session=request.getSession();

		session.setAttribute("longitude", longitude);
		session.setAttribute("lattitude", lattitude);
		
		Customer cust = (Customer) session.getAttribute("Customer");
			
				  Request request1=new Request(location,lattitude,longitude);
				
				
				  try {
					  // add request to database 
					 int req_id=  CustomerService.serviceRequest(cust, request1);
				     PrintWriter out = response.getWriter();
		       
			         // get all mechanics 
			        ArrayList<Mechanic> mechanics = CustomerService.getMechanics(request1.getLattitude(),request1.getLongitude());
			        if(mechanics.size()==0)
			        {
				        response.sendRedirect("NoMechanics.jsp");

			        }
			        else
			        {
			        	session.setAttribute("request_id",req_id );
			        	request.getSession().setAttribute("mechanics",mechanics);
			        	response.sendRedirect("mechanicview.jsp");
			        }
				} catch (SQLException | ClassNotFoundException | ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					
				}	
	
	}

}

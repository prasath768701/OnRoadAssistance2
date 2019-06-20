package controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CustomerRequestCheckDAO;
import model.Customer;
import model.Mechanic;

/**
 * Servlet implementation class CustomerRequestDAO
 */
@WebServlet("/CustomerRequestCheck")
public class CustomerRequestCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustomerRequestCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
		//int req_id=(int)session.getAttribute("request_id");
		int req_id=Integer.parseInt(request.getParameter("requestid"));
		request.getSession().setAttribute("request", req_id);
		try {
		
			CustomerRequestCheckDAO cdao=new CustomerRequestCheckDAO();
			String status=cdao.checkCustomerRequestStatus(req_id);
			if(status.equals("accepted"))
			{
                response.sendRedirect("CustomerRequestAccepted.jsp");
			}
			else if(status.equals("rejected"))
			{
                response.sendRedirect("CustomerRequestRejected.jsp");
			}
			else
			{
                response.sendRedirect("CustomerRequestPending.jsp");

			}
				
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

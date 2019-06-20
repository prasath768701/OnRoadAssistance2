package controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.MechanicChecksRequestDAO;
import model.Mechanic;

/**
 * Servlet implementation class MechanicChecksRequest
 */
@WebServlet("/MechanicChecksRequest")
public class MechanicChecksRequest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MechanicChecksRequest() {
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
		try {
			MechanicChecksRequestDAO mdao=new MechanicChecksRequestDAO();
			int mech_id=(int)request.getSession().getAttribute("mech_id");
			int requestCount=mdao.checkAvailableRequests(mech_id);
			if(requestCount==0)
			{
                response.sendRedirect("NoRequests.jsp");
			}
			else if(requestCount>0)
			{
                response.sendRedirect("DecideOnRequest.jsp");
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

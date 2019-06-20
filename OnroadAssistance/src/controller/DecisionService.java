package controller;


import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UpdateRequestStatusDAO;
import model.Mechanic;

/**
 * Servlet implementation class DecisionService
 */
@WebServlet("/DecisionService")
public class DecisionService extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DecisionService() {
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
        String button_response=request.getParameter("request");
      //  String button_response1=request.getParameter("request1");
        int mech_id=(int) request.getSession().getAttribute("mech_id");
      
        if("Accept".equals(button_response))
        {
        				try {
							UpdateRequestStatusDAO udao=new UpdateRequestStatusDAO();
							udao.updateAccept(mech_id);
						} catch (ClassNotFoundException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
        				response.sendRedirect("RealTimeNavigationMech.jsp");
                                           
        }
        else 
        {
        		try {
        			UpdateRequestStatusDAO udao=new UpdateRequestStatusDAO();
					udao.updateReject(mech_id);
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
        		response.sendRedirect("MechanicRejectedRequest.jsp");
                        
        }

	}

}

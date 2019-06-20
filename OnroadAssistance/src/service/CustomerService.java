package service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import dao.CustomerDAO;
import dao.MechanicDao;
import dao.MechanicRegisterDao;
import dao.RequestDao;
import model.Customer;
import model.Mechanic;
import model.Request;
import model.RequestTable;

public class CustomerService {
	
	
	public static void addCustomer(Customer customer) throws ClassNotFoundException, SQLException, ParseException {
		
		CustomerDAO cdao = new CustomerDAO();
		cdao.addCustomer(customer);
		
	}
	
	public static int serviceRequest(Customer cust, Request request) throws ClassNotFoundException, SQLException, ParseException, IOException {
		
		RequestDao reqDao= new RequestDao();
		int req_id= reqDao.addRequest(cust, request);
		return req_id;
				
	}
	
	public static void updateRequest(int reqid, int mechid) throws ClassNotFoundException, SQLException, ParseException, IOException {
			
			RequestDao reqDao= new RequestDao();
			reqDao.updateRequest(reqid, mechid);
			
		}
      @SuppressWarnings("unchecked")
	public static ArrayList<Mechanic> getMechanics(double lat , double lon) throws ClassNotFoundException, IOException, SQLException {
		
    	  MechanicDao mechDao= new MechanicDao();
    	  return mechDao.getAllMechanic(lat,lon);
		
		}

	public static void addMechanic(Mechanic mechanic) throws ClassNotFoundException, SQLException, ParseException {
		// TODO Auto-generated method stub
		MechanicRegisterDao mdao=new MechanicRegisterDao();
		mdao.addMechanic(mechanic);
		
	}
	
	public static ArrayList<RequestTable> getRequests(int cusid) throws ClassNotFoundException, IOException, SQLException {
        
        RequestDao reqDao= new RequestDao();
        return reqDao.getAllRequests(cusid);
            
            }


	
	

}

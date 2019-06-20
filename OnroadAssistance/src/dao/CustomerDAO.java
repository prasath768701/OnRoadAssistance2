package dao;
import java.io.IOException;
import java.sql.Connection;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import util.DbUtil;

import model.Customer;

import java.text.*;

public class CustomerDAO {
	
	private Connection connection;

	public int addCustomer(Customer customerRegisterService) throws SQLException, ParseException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		
		 int no =0;
		 PreparedStatement preparedStatement = null;
	      
	      try {
	    	  
	    	  connection = DbUtil.getConnection();  
	    	  
	    	  preparedStatement = connection.prepareStatement("INSERT INTO CustomerRegister VALUES(?,?,?,?,?,?,Cust_id.nextval)");
	         
	       
	    	  preparedStatement.setString(1, customerRegisterService.getCustomername());
	    	  preparedStatement.setString(2, customerRegisterService.getPassword());
	    	  preparedStatement.setInt(3, customerRegisterService.getGender());
	    	  preparedStatement.setString(4, customerRegisterService.getDateofbirth());
	    	  preparedStatement.setLong(5, Long.parseLong(customerRegisterService.getPhonenumber()));
	    	  preparedStatement.setString(6, customerRegisterService.getEmail());
	    	
	            
	             no=preparedStatement.executeUpdate();
	          
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	      
        
	      
	      return no;
	
      
        }

public static Customer findUserByIdPwd(String Email, String Password) throws SQLException, ClassNotFoundException, IOException
          {
            Connection con =DbUtil.getConnection(); 
            PreparedStatement st = con.prepareStatement("SELECT * FROM CustomerRegister WHERE Email=? AND Password=?");
            st.setString(1, Email);
            st.setString(2, Password);
            Customer i=null;
            ResultSet rs = st.executeQuery();
            if(rs.next())
               i= new Customer(rs.getString(1),rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getInt(7));
          return i; 
          }


}


	

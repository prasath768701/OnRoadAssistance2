package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import model.Customer;
import model.Mechanic;
import util.DbUtil;

public class MechanicRegisterDao {

	private Connection connection;
		public int addMechanic(Mechanic mechanicRegisterService) throws SQLException, ParseException, ClassNotFoundException {
			// TODO Auto-generated method stub
		
			
			 int no =0;
			 PreparedStatement preparedStatement = null;
		      
		      try {
		    	  
		    	  connection = DbUtil.getConnection();  
		    	  
		    	  preparedStatement = connection.prepareStatement("INSERT INTO mechanic1 VALUES(?,?,?,?,?,?,?,?,mech_id.nextval)");
		         
		       
		    	  preparedStatement.setString(1, mechanicRegisterService.getMech_name());
		    	  preparedStatement.setString(2, mechanicRegisterService.getMech_password());
		    	  preparedStatement.setInt(3, mechanicRegisterService.getMech_gender());
		    	  preparedStatement.setString(4, mechanicRegisterService.getMech_dob());
		    	  preparedStatement.setLong(5, Long.parseLong(mechanicRegisterService.getMech_contactno()));
		    	  preparedStatement.setString(6, mechanicRegisterService.getMech_emailId());
		    	  preparedStatement.setDouble(7,  mechanicRegisterService.getMech_latitude());
		    	  preparedStatement.setDouble(8,  mechanicRegisterService.getMech_longitude());
		    	//  preparedStatement.setInt(9, mechanicRegisterService.getMech_id());
		    	
		            
		             no=preparedStatement.executeUpdate();
		          
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		      
		            
		      
		      finally {
		    	  preparedStatement.close();
					if(connection!=null)
					{
						connection.close();
					}
			}
		      return no;
		
	      
	        }

	public static Mechanic findUserByIdPwd1(String Email, String Password) throws SQLException, ClassNotFoundException, IOException
	          {
	            Connection con =DbUtil.getConnection(); 
	            PreparedStatement st = con.prepareStatement("SELECT * FROM mechanic1 WHERE mech_emailid=? AND mech_password=?");
	            st.setString(1, Email);
	            st.setString(2, Password);
	            Mechanic i=null;
	            ResultSet rs = st.executeQuery();
	            if(rs.next())
	               i= new Mechanic(rs.getString(1),rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getDouble(7),rs.getDouble(8),rs.getInt(9));
	          return i; 
	          }



	}



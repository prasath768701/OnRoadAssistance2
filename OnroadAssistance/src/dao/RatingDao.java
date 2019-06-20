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
import model.Request;

import java.text.*;

	public class RatingDao {
		
		private Connection connection;

		public int addRating(int requestid,int customerid,int rate) throws SQLException, ParseException, ClassNotFoundException {
			// TODO Auto-generated method stub
		
			
			 int no =0;
			 PreparedStatement preparedStatement = null;
			 PreparedStatement preparedStatement1 = null;

		      try {
		    	  
		    	  connection = DbUtil.getConnection();  
		    	  
		    	  preparedStatement = connection.prepareStatement("INSERT INTO rating VALUES(?,?,?)");
		    	  preparedStatement1 =connection.prepareStatement("select mech_id from customerrequest where requestid=?");
		    	  preparedStatement1.setInt(1, requestid);
		    	  ResultSet rs=preparedStatement1.executeQuery();
		    	  rs.next();
		    	  int mechid=rs.getInt("mech_id");
		    	  preparedStatement.setInt(1, mechid);
		    	  preparedStatement.setInt(2, customerid);
		    	  preparedStatement.setInt(3, rate);
		            
		             no=preparedStatement.executeUpdate();
		          
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		      
	        
		      
		      return no;
		
	      
	        }
}

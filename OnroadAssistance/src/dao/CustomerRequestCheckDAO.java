package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;

import util.DbUtil;


public class CustomerRequestCheckDAO  {
	private   Connection connection;
	public  String checkCustomerRequestStatus(int req_id) throws ClassNotFoundException, SQLException, IOException{
	      
		 	connection = DbUtil.getConnection();
            PreparedStatement st = connection.prepareStatement("select status from customerrequest where requestid=?");

            st.setInt(1,req_id);
            
            ResultSet rs=st.executeQuery();
            
            String status=null;
            while(rs.next())
            {
            	status=rs.getString("status");
            }
            System.out.println(status);
            return status;
	}
}


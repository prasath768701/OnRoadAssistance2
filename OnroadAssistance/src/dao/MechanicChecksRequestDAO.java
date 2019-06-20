package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DbUtil;


public class MechanicChecksRequestDAO {
	private Connection connection;
	public int checkAvailableRequests(int mech_id) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		
		  
  	  connection = DbUtil.getConnection();  
		
        PreparedStatement st = connection.prepareStatement("select count(*) as requestCount from customerrequest where mech_id=? and status=?");
        st.setInt(1,mech_id);
        st.setString(2,"pending");
        ResultSet rs=st.executeQuery();
        int requestCount=0;
        while(rs.next())
        {
        	requestCount=rs.getInt("requestCount");
        }
        return requestCount;
	}

}

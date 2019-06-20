package dao;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import util.DbUtil;


public class UpdateRequestStatusDAO {
	private Connection connection;
	public  void updateAccept(int mech_id) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
	  
		 connection = DbUtil.getConnection();  
        PreparedStatement st = connection.prepareStatement("update customerrequest set status=? where mech_id=? and status=?");
        st.setString(1,"accepted");
        st.setInt(2,mech_id);
        st.setString(3,"pending");
        st.executeUpdate();
	}

	public  void updateReject(int mech_id) throws SQLException, ClassNotFoundException, IOException {
		// TODO Auto-generated method stub
		 connection = DbUtil.getConnection();  
        PreparedStatement st = connection.prepareStatement("update customerrequest set status=? where mech_id=? and status=?");
        st.setString(1,"rejected");
        st.setInt(2,mech_id);
        st.setString(3,"pending");
        st.executeUpdate();
	}

}

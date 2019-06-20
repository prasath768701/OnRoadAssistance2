package dao;

import java.io.IOException;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;

import util.DbUtil;

import model.Customer;
import model.Request;
import model.RequestTable;
public class RequestDao {

	private Connection connection;

	public int addRequest(Customer cust ,Request req) throws SQLException, ParseException, ClassNotFoundException, IOException {
		PreparedStatement preparedStatement=null;
		 int generatedKey =0;
		 connection = DbUtil.getConnection();
			preparedStatement = connection
					.prepareStatement("insert into customerrequest(customerid,contactnumber,email,location,lattitude,longitude,status,requestid) values (?, ?, ?, ?,?,?,?,requestid.nextval)",preparedStatement.RETURN_GENERATED_KEYS);

			preparedStatement.setInt(1, cust.getCustid());
			preparedStatement.setLong(2, Long.parseLong(cust.getPhonenumber()));
			preparedStatement.setString(3, cust.getEmail());
			preparedStatement.setString(4, req.getLocation());
			preparedStatement.setDouble(5,req.getLattitude());
			preparedStatement.setDouble(6,req.getLongitude());
			preparedStatement.setString(7, "pending");
			preparedStatement.execute();
			
		 System.out.println("DB inserted successfully");
		 PreparedStatement ps = connection
			        .prepareStatement("select requestid.currval from dual");
		 ResultSet rs = ps.executeQuery();
		
		 
         if(null != rs && rs.next())
         {
        	 generatedKey = (int) rs.getLong(1);
             System.out.println("request_id"+generatedKey);
         }else 
        	  System.out.println("else request_id"+generatedKey);
         preparedStatement.close();
		return generatedKey;
}

	public int updateRequest(int reqid,int mechid ) throws SQLException, ClassNotFoundException, IOException {
		 connection = DbUtil.getConnection();
		 System.out.println("request id "+reqid);
		 System.out.println("mechid  "+mechid);
		 
			PreparedStatement st = connection.prepareStatement("update customerrequest set mech_id=? where requestid= ?");
			st.setInt(1,mechid);
			st.setInt(2,reqid);
			int n1=st.executeUpdate();
			return n1;
	}
	public ArrayList<RequestTable> getAllRequests(int cusid) throws SQLException, ClassNotFoundException, IOException {
        // TODO Auto-generated method stub
        ArrayList<RequestTable>  requestslist = new ArrayList<RequestTable>();

        ResultSet rs = null;
        PreparedStatement statement=null;
        connection = DbUtil.getConnection();
        
        
     String selectSQL  = "select requestid,status from customerrequest where customerid=?";
     statement = connection.prepareStatement(selectSQL);
     statement.setInt(1,cusid);
        rs = statement.executeQuery();
        while (rs.next()) {
              RequestTable  req = new RequestTable(0,0,rs.getInt("requestid"),rs.getString("status"));
              requestslist.add(req);
              
        }
        connection.close();
        return requestslist;
  }    

}
package dao;

import java.io.IOException;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.Mechanic;
import util.DbUtil;

public class MechanicDao {
	private Connection connection;
	
	public ArrayList getAllMechanic(Double lat, Double lon) throws ClassNotFoundException, IOException, SQLException {
		
		ArrayList<Mechanic>  mechanics = new ArrayList<Mechanic>();
		ResultSet rs = null;
		PreparedStatement statement=null;
		 connection = DbUtil.getConnection();
		  // String sql ="select * from mechanic";
		 
		 System.out.println(lat);
		 System.out.println(lon);
		
         String selectSQL  = "SELECT"+
				  "  ( ( acos(sin(? *3.14159 / 180) * sin(mech_latitude *3.14159 / 180) + cos(? *3.14159 / 180) * cos(mech_latitude *3.14159 / 180) * cos( (? - mech_longitude) *3.14159 / 180) ) * 180"+
				"/3.14159 ) * 60 *1.1515 ) AS kit,mech_name,mech_gender,mech_DOB,mech_contactno,mech_emailid,mech_latitude,mech_longitude,mech_id FROM mechanic1 ORDER BY 'kit'";
         statement = connection.prepareStatement(selectSQL);
         statement.setDouble(1,lat);
         statement.setDouble(2,lat);
         statement.setDouble(3,lon);

		 
		
		
		rs = statement.executeQuery();
		System.out.println(rs);
		
		while (rs.next()) {
			System.out.println("record found");
			System.out.println("Date"+rs.getString("mech_DOB") );
			Mechanic  mech = new Mechanic(rs.getString("mech_name"),"",rs.getInt("mech_gender"),rs.getString("mech_dob"),rs.getString("mech_contactno"),rs.getString("mech_emailid"),
				rs.getDouble("mech_latitude"),rs.getDouble("mech_longitude"),rs.getInt("mech_id"));
			mechanics.add(mech);
			System.out.println(mechanics);
			
		}
  connection.close();
		return mechanics;
		}
	
}

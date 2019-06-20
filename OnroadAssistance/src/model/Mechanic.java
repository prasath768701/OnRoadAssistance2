package model;

import java.sql.Date;

public class Mechanic {
       String mech_name;
       String mech_password;
       int mech_gender;
       String mech_dob;
       String mech_contactno;
       String mech_emailId;
       double mech_latitude;
       double mech_longitude;
       int mech_id;
       public Mechanic()
       {
              
       }
       public Mechanic(String mech_name,
    		   String mech_password,
    		   int mech_gender, 
    		String mech_dob, 
    		   String mech_contactno, 
    		   String mech_email,
    		   double mech_lat, double mech_lon, int mech_id) {
              super();
              this.mech_name=mech_name;
              this.mech_password = mech_password;
              this.mech_gender = mech_gender;
              this.mech_dob = mech_dob;
              this.mech_contactno = mech_contactno;
              this.mech_emailId = mech_email;
              this.mech_latitude = mech_lat;
              this.mech_longitude = mech_lon;
              this.mech_id=mech_id;
       }

	@Override
	public String toString() {
		return "Mechanic [mech_name=" + mech_name + ", mech_password=" + mech_password + ", mech_gender=" + mech_gender
				+ ", mech_dob=" + mech_dob + ", mech_contactno=" + mech_contactno + ", mech_emailId=" + mech_emailId
				+ ", mech_latitude=" + mech_latitude + ", mech_longitude=" + mech_longitude + ", mech_id=" + mech_id
				+ "]";
	}

	
	public String getMech_name() {
            return mech_name;
      }
      public void setMech_name(String mech_name) {
            this.mech_name = mech_name;
      }
      public String getMech_password() {
            return mech_password;
      }
      public void setMech_password(String mech_password) {
            this.mech_password = mech_password;
      }
      public int getMech_gender() {
            return mech_gender;
      }
      public void setMech_gender(int mech_gender) {
            this.mech_gender = mech_gender;
      }
      public String getMech_dob() {
            return mech_dob;
      }
      public void setMech_dob(String mech_dob) {
            this.mech_dob = mech_dob;
      }
      public String getMech_contactno() {
            return mech_contactno;
      }
      public void setMech_contactno(String mech_contactno) {
            this.mech_contactno = mech_contactno;
      }
      public String getMech_emailId() {
            return mech_emailId;
      }
      public void setMech_emailId(String mech_emailId) {
            this.mech_emailId = mech_emailId;
      }
      public double getMech_latitude() {
            return mech_latitude;
      }
      public void setMech_latitude(double mech_latitude) {
            this.mech_latitude = mech_latitude;
      }
      public double getMech_longitude() {
            return mech_longitude;
      }
      public void setMech_longitude(double mech_longitude) {
            this.mech_longitude = mech_longitude;
      }
      public int getMech_id() {
    	  return mech_id;
		}
		public void setMech_id(int mech_id) {
		this.mech_id = mech_id;
		}
      
       
}


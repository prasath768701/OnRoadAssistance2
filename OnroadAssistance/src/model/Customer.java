package model;

public class Customer {
	
	@Override
	public String toString() {
		return "Customer [custid=" + custid + ", customername=" + customername + ", password=" + password + ", gender="
				+ gender + ", dateofbirth=" + dateofbirth + ", phonenumber=" + phonenumber + ", email=" + email + "]";
	}


	private String customername;
	private String password;
	private int gender;
	private String dateofbirth;
	private String phonenumber;
	private String email;
	private int custid;
	
	public Customer()
	{
		
	}

	public Customer(String customername, String password, int gender, String dateofbirth, String phonenumber,
			String email,int custid) {
		super();
	
		this.customername = customername;
		this.password = password;
		this.gender = gender;
		this.dateofbirth = dateofbirth;
		this.phonenumber = phonenumber;
		this.email = email;
		this.custid =custid;
		
	}
	
	

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getGender() {
		return gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getCustid() {
		return custid;
	}

	public void setCustid(int string) {
		this.custid = string;
	}
	

}

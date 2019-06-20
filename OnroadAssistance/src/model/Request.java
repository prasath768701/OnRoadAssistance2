package model;

public class Request {

private int requestid;
private String location;
private float lattitude;
private float longitude;


public Request()
{
	
}


public int getRequestid() {
	return requestid;
}


public void setRequestid(int requestid) {
	this.requestid = requestid;
}


public Request(String location, float lattitude, float longitude) {
	super();
	this.location = location;
	this.lattitude = lattitude;
	this.longitude = longitude;
}


public String getLocation() {
	return location;
}


public void setLocation(String location) {
	this.location = location;
}


public float getLattitude() {
	return lattitude;
}


public void setLattitude(float lattitude) {
	this.lattitude = lattitude;
}


public float getLongitude() {
	return longitude;
}


public void setLongitude(float longitude) {
	this.longitude = longitude;
}

}




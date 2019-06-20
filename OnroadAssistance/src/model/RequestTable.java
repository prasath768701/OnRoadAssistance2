package model;

public class RequestTable {
@Override
	public String toString() {
		return "RequestTable [mechanic_id=" + mechanic_id + ", customer_id=" + customer_id + ", request_id="
				+ request_id + ", status=" + status + "]";
	}
public int mechanic_id;
public int customer_id;
public int request_id;
public String status;
public int getMechanic_id() {
      return mechanic_id;
}
public void setMechanic_id(int mechanic_id) {
      this.mechanic_id = mechanic_id;
}
public int getCustomer_id() {
      return customer_id;
}
public void setCustomer_id(int customer_id) {
      this.customer_id = customer_id;
}
public int getRequest_id() {
      return request_id;
}
public void setRequest_id(int request_id) {
      this.request_id = request_id;
}
public String getStatus() {
      return status;
}
public void setStatus(String status) {
      this.status = status;
}
public RequestTable(int mechanic_id, int customer_id, int request_id,
            String status) {
      super();
      this.mechanic_id = mechanic_id;
      this.customer_id = customer_id;
      this.request_id = request_id;
      this.status = status;
}



}

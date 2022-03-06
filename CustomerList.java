import java.util.ArrayList;

public class CustomerList {
	
	ArrayList<Customer> customerList = new ArrayList<Customer>();
	
	public CustomerList() {
		this.customerList = new ArrayList<Customer>();
	}

	public ArrayList<Customer> getCustomerList() {
		return customerList;
	}
	

	public void setCustomerList(ArrayList<Customer> customerList) {
		this.customerList = customerList;
	}

	
}

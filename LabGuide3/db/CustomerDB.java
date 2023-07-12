package db;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import bank.customer.Customer;

public class CustomerDB {
	private List<Customer> customerList = new ArrayList<Customer>();
 
	public boolean saveCustomer(Customer customer) {
		 boolean status = false;
		 
		 status = customerList.add(customer);
		 
		 return status;
 }
	public List<Customer> getAllCustomers(){
		return customerList;
	}
	public Set<Integer> getLoanAvailedCustomers(){
		Set<Integer> loanAvailedcustomers = new TreeSet<Integer>();
		Iterator<Customer> customerIterator = customerList.iterator();
		
		while(customerIterator.hasNext()) {
			Customer customer = customerIterator.next();
			
			if(customer.isLoanAvailed()) {
				loanAvailedcustomers.add(customer.getCustomerId());
			}
		}
		return loanAvailedcustomers;
	}
}

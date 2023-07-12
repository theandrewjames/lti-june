package bank.customer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddCustomer {
 public void printCustomers(List<String> arrayList) {
	 //create the iterator to iterate over the list
	 Iterator<String> iterator = arrayList.iterator();
	 System.out.println("Customers are : ");
	 while(iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }
 }
 public static void main(String[] args) {
	 //create reference of List and object of ArrayList
	List<String> list = new ArrayList<String>();
	list.add("jack");
	list.add("harry");
	list.add("tabrez");
	list.add("leezu");
	AddCustomer addCustomer = new AddCustomer();
	//call printCustomers() to print the list
	addCustomer.printCustomers(list);
}
}

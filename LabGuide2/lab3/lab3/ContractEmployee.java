package lab3;

import java.util.Date;
import java.util.List;

public class ContractEmployee extends employee{
	
	private double rate;
	private int hours;
	private String contractor;
	private static int count = 0;
	
	public ContractEmployee(String firstName, String lastName,  String grade, double rate, int hours, String contractor,Date joinMonth) {
		super(firstName, lastName, 0, grade, new Date());
		this.rate = rate;
		this.hours = hours;
		this.contractor = contractor;
		setSalary(0);
	}
	
	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}
	
	@Override
	public void setSalary(int salary) {
		super.setSalary((int) (this.rate * this.hours));
	}
	
	public String getContractor() {
		return contractor;
	}

	public void setContractor(String contractor) {
		this.contractor = contractor;
	}
	
	public void addEE(ContractEmployee ee) {
		List<employee> eeList = employee.getEeList();
		eeList.add(ee);
		count++;
	}
	

	public static void main(String[] args) {
		ContractEmployee ee = new ContractEmployee("andrew", "velasquez", "grade", 25.0, 100, "sampleContractor",new Date());
		ee.addEE(ee);
		System.out.println(ee);
	}
}

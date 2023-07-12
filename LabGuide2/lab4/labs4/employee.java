package labs4;

import static org.hamcrest.CoreMatchers.instanceOf;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import labs4.Perm.PermProjectMgr;


public  class employee {
	private String firstName;
	private String lastName;
	private int salary;
	private String grade;
	private Date joinMonth;
	private  int employeeId;
	private int mediclaimCoverage;
	private static int count = 1;
	private static List<employee> eeList = new ArrayList<>();
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public Date getJoinMonth() {
		return joinMonth;
	}
	public int getEEId() {
		return employeeId;
	}
	public void addEmployee(employee ee) {
		eeList.add(ee);
	}
	
	public int getMediclaimCoverage() {
		return mediclaimCoverage;
	}
	public void setMediclaimCoverage(int mediclaimCoverage) {
		this.mediclaimCoverage = mediclaimCoverage;
	}
	public static List<employee> getEeList() {

		return eeList;
	}
	
	public employee(String firstName, String lastName, int salary, String grade, Date joinMonth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joinMonth = joinMonth;
		this.employeeId = count++;
	}
	@Override
	public String toString() {
		return "employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + ", grade=" + grade
				+ ", joinMonth=" + joinMonth + ", employeeId=" + employeeId + ", mediclaimCoverage=" + mediclaimCoverage
				+ "]";
	}

	

	
}

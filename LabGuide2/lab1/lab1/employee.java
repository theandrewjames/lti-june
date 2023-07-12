package lab1;

public class employee {
	private String firstName;
	private String lastName;
	private int salary;
	private String grade;
	private String joinMonth;
	private  int employeeId;
	private static int count = 1;
	
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
	public String getJoinMonth() {
		return joinMonth;
	}
	public int getEEId() {
		return employeeId;
	}
	public employee(String firstName, String lastName, int salary, String grade, String joinMonth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.grade = grade;
		this.joinMonth = joinMonth;
		this.employeeId = count++;
	}

	
}

package day4.Assignment7;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semesterFees;
	protected int feesPerMonth;
	
	public Student() {
		semesterFees = 12000;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void calculateFees() {
		feesPerMonth = (int) (semesterFees / 6.0);
	}
	public void displayDetail() {
		System.out.println("student Id:" + studentId + "student type:" + studentType +
				"name:" + studentName + "semester fees:" + semesterFees + "fees month" + feesPerMonth);
	}
	
}

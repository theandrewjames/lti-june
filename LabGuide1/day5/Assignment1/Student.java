package day5.courseregistration;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public void getDetails() {
		System.out.println("student id:" + studentId);
		System.out.println("student type:" + studentType);
		System.out.println("student name:" + studentName);
	}
	
}

package day4.Assignment5;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	public static int numStudents = 1;
	
	public Student(int studentId, char studentType, String studentName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
	}
	Student(){
		studentId = numStudents++;
	}
	
	
}

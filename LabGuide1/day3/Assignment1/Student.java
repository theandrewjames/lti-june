package day3.Assignment1;

import day2.Student9;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	
	private static int nextId = 550;
	private static int studentCount = 0;
	
	public Student() {
		this.studentId = ++studentCount;
		
	}
	
	public static int getStudentCount() {
		return studentCount;
	}

	public static void setStudentCount(int studentCount) {
		Student.studentCount = studentCount;
	}

	public Student(char sType, String fname, String lname) {
		studentType = sType;
		studentName = fname  + lname;
	}
	public static void displayDetails(Student student) {
		System.out.println(student.studentId + " " + student.studentType + " " + student.studentName + " " + studentCount);
	}
	static {
		studentCount = 10;
	}
	public static void main(String[] args) {
		Student studentone;
		studentone = new Student('D', "Bony", "Thomas");
		displayDetails(studentone);
	
}
}

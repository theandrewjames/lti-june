package day2;

public class Student4 {
	private int studentId;
	private char studentType;
	
	
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getStudentType() {
		return studentType;
	}

	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}

	Student4(){
		studentId = 10;
		studentType = 'F';
	}
	public static void main(String[] args) {
		Student4 student;
		student = new Student4();
		System.out.println(student.getStudentId());
	}
}

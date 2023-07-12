package day2;

public class Student9 {
	private int studentId = 550;
	private char studentType;
	private String studentName;
	
	public Student9() {
		++studentId;
	}
	
	public Student9(char sType, String fname, String lname) {
		this.studentType = sType;
		this.studentName = fname  + lname;
	}
	public static void displayDetails(Student9 student) {
		System.out.println(student.studentId + " " + student.studentType + " " + student.studentName);
	}
	public static void main(String[] args) {
		Student9 studentone = new Student9('D', "Bony", "Thomas");
		Student9 student = studentone;
		displayDetails(student);
		
		Student9 dinil = new Student9('H', "Dinil", "Bose");
		Student9 studentwo = dinil;
		displayDetails(dinil);
	}
}

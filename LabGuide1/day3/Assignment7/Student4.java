package day3.Assignment7;

public class Student4 {
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private long  feesPerMonth;
	
	
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
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName.concat(" " + lastName);
	}
	
	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}
	
	public long getFeesPerMonth() {
		return feesPerMonth;
	}

	Student4(){
		studentId = 10;
		studentType = 'F';
	}
	public String getStudentName() {
		return studentName;
	}
	public Student4(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName.concat(" " + lastName);
	}

	public static void main(String[] args) {
//		Student4 student;
//		student = new Student4();
//		int id = 101;
//		String firstName = "andrew";
//		String lastName = "velasquez";
//		student.setStudentId(101);
//		student.setStudentName(firstName, lastName);
//		System.out.println("ID: " + student.getStudentId() + " Name: " + student.getStudentName());
		Student4 student = new Student4();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1], args[2]);
		student.setResidentialStatus(args[3]);
		if(student.getResidentialStatus().equals("Hostelite")) {
			student.getFeesPerMonth();
		}
		System.out.println("ID: " + student.getStudentId() + "Name: " + student.getStudentName() + "status: " + 
		student.getResidentialStatus());
	}
}

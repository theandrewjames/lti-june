package day4.Assignment2;



public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double  feesPerMonth;
	
	
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
	
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}

	Student(){
		studentId = 10;
		studentType = 'F';
	}
	public String getStudentName() {
		return studentName;
	}
	public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName.concat(" " + lastName);
	}
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	public void calculateFees(double semesterFees, double hostelerFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth += hostelerFees;
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
		Student student = new Student();
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1], args[2]);
//		if(student.getResidentialStatus().equals("Hostelite")) {
//			student.calculateFees(student.getFeesPerMonth(), 100.00);
//			
//		}
//		else {
//			student.calculateFees(student.getFeesPerMonth());
//		}
	}
}


package day4.Assignment3;



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
		studentType = 'H';
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
	public void displayStudentDetails() {
		
		System.out.println("ID:" + this.studentId + " type:" + this.studentType + " name:" + this.studentName 
				+ " feesPerMonth:" + this.feesPerMonth);
	}
	public static void main(String[] args) {

		Student student = new Student();

		String type = args[1];
		char sType = type.charAt(0);
		if(sType == 'H') {
			student = new Hostelite(Integer.parseInt(args[0]), args[1].charAt(0), args[2] + args[3], Double.parseDouble(args[4]), 
					args[5], Integer.parseInt(args[6]));
			student.displayStudentDetails();
		}
		else if(sType == 'D') {
			student = new DayScholar(Integer.parseInt(args[0]), args[1].charAt(0), args[2] + args[3], Double.parseDouble(args[4]), 
					args[5]);
			student.displayStudentDetails();
		}
		
		//student.displayStudentDetails();
		
	}
}


package day4.Assignment3;

public class DayScholar extends Student{
	private String residentialAddress;
	
	DayScholar(){
		residentialAddress = "123 Main St";
	}

	public String getResidentialAddress() {
		return residentialAddress;
	}

	public DayScholar(int studentId, char type, String name, double feesPerMonth, String residentialAddress) {
		super();
		this.studentId = studentId;
		this.studentType = type;
		this.studentName = name;
		this.feesPerMonth = feesPerMonth;
		this.residentialAddress = residentialAddress;
	}

	@Override
	public void displayStudentDetails() {
		System.out.println("ID:" + this.studentId + " type:" + this.studentType + "name:" + this.studentName 
				+ " feesPerMonth:" + this.feesPerMonth + " address:" + this.residentialAddress);
		//super.displayStudentDetails();
	}

	
	
}

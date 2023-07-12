package day4.Assignment8;


public class Hostelite extends Student{
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	
	@Override
	public void displayStudentDetails() {
		System.out.println("ID:" + this.studentId + " type:" + this.studentType + "name:" + this.studentName 
				+ " feesPerMonth:" + this.feesPerMonth + " hostel:" + this.hostelName + " room#" +
				this.roomNumber);
		//super.displayStudentDetails();
	}
	public Hostelite(int studentId, char type, String name, double feesPerMonth, String hostelName, int roomNum) {
		super();
		this.studentId = studentId;
		this.studentType = type;
		this.studentName = name;
		this.feesPerMonth = feesPerMonth;
		this.hostelName = hostelName;
		this.roomNumber = roomNum;
	}
	public Hostelite() {
		hostelName = "sampleHostel";
		roomNumber = 101;
	}
	public static void main(String[] args) {
		
//		Hostelite hostelite = new Hostelite();
//		hostelite.setStudentId(101);
//		hostelite.setStudentType('F');
//		hostelite.setFeesPerMonth(100.0);
//		hostelite.setStudentName("andrew", "velasquez");
//		System.out.println("hostel: " + hostelite.getHostelName() + " Room#:" + hostelite.getRoomNumber() + " stuent ID:"
//				+ hostelite.getStudentId() + " type: " + hostelite.getStudentType() + " name:" + hostelite.getStudentName() +
//				"fees per month:" + hostelite.getFeesPerMonth());
	}
	@Override
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
		//add hostel fees 1200
		feesPerMonth += 1200;
	}
	

	
}

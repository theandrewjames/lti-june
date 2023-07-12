package day4.Assignment1;

public class Hostelite extends Student{
	private String hostelName;
	private int roomNumber;
	
	public String getHostelName() {
		return hostelName;
	}
	public int getRoomNumber() {
		return roomNumber;
	}
	Hostelite(){
		
	};
	public Hostelite(String hostelName, int roomNumber) {
		super();
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
	}
	
	public static void main(String[] args) {
		Hostelite hostelite = new Hostelite("sampleHostel", 102);
		hostelite.setStudentId(101);
		hostelite.setStudentType('F');
		hostelite.setFeesPerMonth(100.0);
		hostelite.setStudentName("andrew", "velasquez");
		System.out.println("hostel: " + hostelite.getHostelName() + " Room#:" + hostelite.getRoomNumber() + " stuent ID:"
				+ hostelite.getStudentId() + " type: " + hostelite.getStudentType() + " name:" + hostelite.getStudentName() +
				"fees per month:" + hostelite.getFeesPerMonth());
	}

	
}

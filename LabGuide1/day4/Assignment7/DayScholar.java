package day4.Assignment7;



public final class DayScholar extends Student{
	private String residentialAddress;
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

//	@Override
//	public void getDetails() {
//		// TODO Auto-generated method stub
//		super.getDetails();
//		
//		System.out.println("student name:"  + studentName);
//		System.out.println("residential address:" + residentialAddress);
//	}
	public void displayDaySDetails() {
		super.displayDetail();
		System.out.println("address:" + residentialAddress);
		
	}
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar();
		dayscholar.setStudentId(1002);
		dayscholar.setStudentName("andrew");
		dayscholar.setStudentType('D');
		dayscholar.setResidentialAddress("123 Main st");
		dayscholar.calculateFees();
		dayscholar.displayDaySDetails();
	}
	
}

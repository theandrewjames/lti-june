package day4.Assignment6;

public class DayScholar extends Student{
	private String residentialAddress;

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	@Override
	public void getDetails() {
		// TODO Auto-generated method stub
		super.getDetails();
		System.out.println("student name:"  + studentName);
		System.out.println("residential address:" + residentialAddress);
	}
	
	
}

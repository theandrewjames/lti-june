package day5.registrationpack;

import day5.studentpack.Student;

public class DayScholar extends Student{
	private String residentialAddress;

	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getDetails() {
		System.out.println("student id:" + studentId);
		System.out.println("student type:" + studentType);
		System.out.println("student name:" + studentName);
	}
}

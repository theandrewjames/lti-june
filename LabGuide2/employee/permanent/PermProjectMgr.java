package com.seed.employee.permanent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import labs6.Certification;

public class PermProjectMgr extends PermanentEmployee implements Certification{
	public boolean PMIcertified;
	
	
	public boolean isPMIcertified() {
		return PMIcertified;
	}

	public void setPMIcertified(boolean pMIcertified) {
		PMIcertified = pMIcertified;
	}

	@SuppressWarnings("deprecation")
	public PermProjectMgr(String firstName, String lastName, int salary, String grade, Date joinMonth, boolean PMIcertified) {
		super(firstName, lastName, salary, grade, joinMonth);
		Date current = new Date();
		int years = current.getYear() - joinMonth.getYear();
		this.setSalary(years * 1000);
		this.setMediclaimCoverage(salary);
		this.setPMIcertified(PMIcertified);
	}

	@Override
	public String toString() {
		Date current = new Date();
		return "PermProjectMgr [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade() + ", getJoinMonth()=" + getJoinMonth()
				+ ", years exp:" + (current.getYear() - getJoinMonth().getYear()) + ", getPMICertified()=" + isPMIcertified()+ ", getEEId()=" + getEEId() + ", getMediclaimCoverage()=" + getMediclaimCoverage() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public static void main(String[] args) {
		PermProjectMgr pm = new PermProjectMgr("andrew", "velasquez", 1000, "PM", new Date(), true);
		System.out.println(pm.getCerts());
	}

	@Override
	public List<String> getCerts() {
		List<String> certList = new ArrayList<String>();
		if(PMIcertified == true) {
			certList.add("PMI");
		}
		return certList;
	}
	

	

}

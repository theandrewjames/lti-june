package com.seed.employee.permanent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import labs4.employee;
import labs6.Certification;

public class PermTechnicalAssociate extends PermanentEmployee implements Certification{
	int technicalCerts;
	public boolean SCJP;
	public boolean SCWCD;
	public boolean SCBCD;
	
	public PermTechnicalAssociate(String firstName, String lastName, int salary, String grade, Date joinMonth, int technicalCerts,
			boolean SCJP, boolean SCWCD, boolean SCBCD) {
		super(firstName, lastName, salary, grade, joinMonth);
		this.setMediclaimCoverage(salary * 2);
		Date current = new Date();
		int years = current.getYear() - joinMonth.getYear();
		this.technicalCerts = getCerts().size();
		this.setSalary(5000 * years + (technicalCerts * 1000));
	}
	

	public int getTechnicalCerts() {
		return technicalCerts;
	}


	public void setTechnicalCerts(int technicalCerts) {
		this.technicalCerts = technicalCerts;
	}


	public boolean isSCJP() {
		return SCJP;
	}


	public void setSCJP(boolean sCJP) {
		SCJP = sCJP;
	}


	public boolean isSCWCD() {
		return SCWCD;
	}


	public void setSCWCD(boolean sCWCD) {
		SCWCD = sCWCD;
	}


	public boolean isSCBCD() {
		return SCBCD;
	}


	public void setSCBCD(boolean sCBCD) {
		SCBCD = sCBCD;
	}


	@Override
	public String toString() {
		Date current = new Date();
		return "PermTechnicalAssociate [technicalCerts=" + technicalCerts + ", SCJP=" + SCJP + ", SCWCD=" + SCWCD
				+ ", SCBCD=" + SCBCD + ", getTechnicalCerts()=" + getTechnicalCerts() + ", isSCJP()=" + isSCJP()
				+ ", isSCWCD()=" + isSCWCD() + ", isSCBCD()=" + isSCBCD() + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade()
				+ ", getJoinMonth()=" + getJoinMonth() + ", years exp:" + (current.getYear() - getJoinMonth().getYear())+ ", getEEId()=" + getEEId() + ", getMediclaimCoverage()="
				+ getMediclaimCoverage() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	@Override
	public List<String> getCerts() {
		List<String> certList = new ArrayList<String>();
		if(SCJP == true) {
			certList.add("SCJP");
		}
		else if(SCWCD == true) {
			certList.add("SCWCD");
		}
		else if(SCBCD == true) {
			certList.add("SCBCD");
		}
		return certList;
	}
	

	
	
}

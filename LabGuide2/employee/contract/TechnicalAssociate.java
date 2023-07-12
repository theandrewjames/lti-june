package com.seed.employee.contract;

import java.util.Date;

public class TechnicalAssociate extends ContractEmployee{

	public TechnicalAssociate(String firstName, String lastName, String grade, double rate, int hours,
			String contractor, Date joinMonth) {
		super(firstName, lastName, grade, rate, hours, contractor, joinMonth);
		if(hours <= 40) {
			this.setSalary((int) (rate * hours));
		}
		else {
			this.setSalary((int) (40 * rate + (hours -40) * rate * 2));
		}
		
	}
	
	

	@Override
	public String toString() {
		return "TechnicalAssociate [getRate()=" + getRate() + ", getHours()=" + getHours() + ", getContractor()="
				+ getContractor() + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade() + ", getJoinMonth()=" + getJoinMonth()
				+ ", getEEId()=" + getEEId() + ", getMediclaimCoverage()=" + getMediclaimCoverage() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}



	public static void main(String[] args) {
		TechnicalAssociate ta = new TechnicalAssociate("andrew", "velasquez", "grade", 10.0, 30, "sampleC", new Date());
		System.out.println(ta);
	}
}

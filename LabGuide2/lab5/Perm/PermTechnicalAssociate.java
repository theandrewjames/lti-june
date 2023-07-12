package labs5.Perm;

import java.util.Date;

import labs4.employee;

public class PermTechnicalAssociate extends PermanentEmployee{
	int technicalCerts;
	
	
	public PermTechnicalAssociate(String firstName, String lastName, int salary, String grade, Date joinMonth, int technicalCerts) {
		super(firstName, lastName, salary, grade, joinMonth);
		this.setMediclaimCoverage(salary * 2);
		Date current = new Date();
		int years = current.getYear() - joinMonth.getYear();
		this.setSalary(5000 * years + (technicalCerts * 1000));
	}


	@Override
	public String toString() {
		Date current = new Date();
		return "PermTechnicalAssociate [technicalCerts=" + technicalCerts + ", getFirstName()=" + getFirstName()
				+ ", getLastName()=" + getLastName() + ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade()
				+ ", getJoinMonth()=" + getJoinMonth() + ", years exp:" + (current.getYear() - getJoinMonth().getYear())+ ", getEEId()=" + getEEId() + ", getMediclaimCoverage()="
				+ getMediclaimCoverage() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}


	
	
}

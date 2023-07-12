package labs5.Perm;

import java.util.Date;

import labs4.employee;

public class PermProjectMgr extends PermanentEmployee{

	@SuppressWarnings("deprecation")
	public PermProjectMgr(String firstName, String lastName, int salary, String grade, Date joinMonth) {
		super(firstName, lastName, salary, grade, joinMonth);
		Date current = new Date();
		int years = current.getYear() - joinMonth.getYear();
		this.setSalary(years * 1000);
		this.setMediclaimCoverage(salary);
	}

	@Override
	public String toString() {
		Date current = new Date();
		return "PermProjectMgr [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getSalary()=" + getSalary() + ", getGrade()=" + getGrade() + ", getJoinMonth()=" + getJoinMonth()
				+ ", years exp:" + (current.getYear() - getJoinMonth().getYear()) + ", getEEId()=" + getEEId() + ", getMediclaimCoverage()=" + getMediclaimCoverage() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	public static void main(String[] args) {
		PermProjectMgr pm = new PermProjectMgr("andrew", "velasquez", 1000, "PM", new Date());
		System.out.println(pm);
	}
	

	

}

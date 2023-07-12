package labs4.Perm;

import java.util.Date;

import labs4.employee;

public class PermProjectMgr extends PermanentEmployee{

	public PermProjectMgr(String firstName, String lastName, int salary, String grade, Date joinMonth) {
		super(firstName, lastName, salary, grade, joinMonth);
		this.setMediclaimCoverage(salary);
	}
	
	

	

}

package labs5.Perm;

import java.util.Date;
import java.util.List;

import labs4.employee;

public abstract class PermanentEmployee extends employee{
	private static int count = 0;
	
	public PermanentEmployee(String firstName, String lastName, int salary, String grade, Date joinMonth) {
		super(firstName, lastName, salary, grade, joinMonth);
		
	}
	public void addEE(PermanentEmployee ee) {
		List<employee> eeList = employee.getEeList();
		eeList.add(ee);
		count++;
	}
	

	
}

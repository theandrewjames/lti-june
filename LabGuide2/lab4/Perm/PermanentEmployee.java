package labs4.Perm;

import java.util.Date;
import java.util.List;

import labs4.employee;

public class PermanentEmployee extends employee{
	private static int count = 0;
	
	public PermanentEmployee(String firstName, String lastName, int salary, String grade, Date joinMonth) {
		super(firstName, lastName, salary, grade, joinMonth);
		
	}
	public void addEE(PermanentEmployee ee) {
		List<employee> eeList = employee.getEeList();
		eeList.add(ee);
		count++;
	}
	

	public static void main(String[] args) {
		PermanentEmployee p1 = new PermanentEmployee("andrew", "velasquez", 1090, "grade", new Date());
		p1.addEE(p1);
		
		System.out.println(p1.getJoinMonth());
	}
}

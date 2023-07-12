package day2;

public class DefaultConstructor5 {
	 public static void main(String[] args) {
		 char fresher = 'F';
		Student4 student = new Student4();
		student.setStudentId(101);
		student.setStudentType(fresher);
		
		
		System.out.println(student.getStudentType());
	}
}

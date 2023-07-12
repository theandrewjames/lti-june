package day4.Assignment5;

public class DayScholar extends PostGradStudent{
	private String residentialAddress;
	public DayScholar(int courseId, String courseName, int courseFees, int studentId, char studentType,
			String studentName, String residentialAddress) {
		super(courseId, courseName, courseFees, studentId, studentType, studentName);
		this.residentialAddress = residentialAddress;
	}
	public int calculateFees() {
		return postCoursefees /6;
	}
	public int getFees() {
		return calculateFees();
	}
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(5, "OOP", 16000, 1001, 'D', "Manu", "N0 32/3 Vijayanagar");
		System.out.println(dayscholar.getFees());
	}
}

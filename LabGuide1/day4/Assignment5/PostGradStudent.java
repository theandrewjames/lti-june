package day4.Assignment5;

public class PostGradStudent extends Student{
	protected int postCourseId;
	protected String postCourseName;
	protected int postCoursefees;
	
	
	public PostGradStudent(int courseId, String courseName, int courseFees,int studentId, char studentType, String studentName) {
		super(studentId, studentType, studentName);
		this.postCourseId = courseId;
		this.postCourseName = courseName;
		this.postCoursefees = courseFees;
	}


	public String getPostCourseName() {
		return postCourseName;
	}


	public int getPostCoursefees() {
		return postCoursefees;
	}
	
	
	
	
	
}

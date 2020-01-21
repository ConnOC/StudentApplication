
public class Student 
{
	private int studentId;
	private String studentName;
	private double studentScore;
	private Course studentCourse;
	
	
	
	public Student()
	{
		
	}
	
	
	
	public Student(int studentId, String studentName, double studentScore, Course studentCourse) {
		
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentScore = studentScore;
		this.studentCourse = studentCourse;
	}
	
	
	public double getStudentScore() {
		return studentScore;
	}
	public void setStudentScore(double studentScore) {
		this.studentScore = studentScore;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Course getStudentCourse() {
		return studentCourse;
	}
	public void setStudentCourse(Course studentCourse) {
		this.studentCourse = studentCourse;
	}
	
	
	
}

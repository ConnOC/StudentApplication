import java.util.ArrayList;

public class Course
{
	private int courseID;
	private String courseName;
	private ArrayList<Student> courseList = new ArrayList<Student>();
	public int getCourseID() {
		return courseID;
	}
	public void setCourseID(int courseID) {
		this.courseID = courseID;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String counrseName) {
		this.courseName = counrseName;
	}
	public ArrayList<Student> getCourseList() {
		return courseList;
	}
	public void setCourseList(ArrayList<Student> courseList) {
		this.courseList = courseList;
	}
	public Course()
	{
		
	}
	
	public Course(int courseID, String courseName) {
		this.courseID = courseID;
		this.courseName = courseName;
	}
	public void resetCourseList()
	{
		courseList.clear();
	}
	public void printCourseList()
	{
		if(courseList.isEmpty())
		{
			System.out.println("NO students enrolled at this time in "+courseName);	
		}
		else
		{
			for(Student s: courseList)
			{
				System.out.println(s.getStudentId()+ "\t" + s.getStudentName());
			}
			System.out.println("Total number of students in the class is " + courseList.size());
		
		}
		
	}
	
	public void addStudent(Student s)
	{
		courseList.add(s);
	}
	
	public void removeStudent(Student s)
	{
		courseList.remove(s);
	}
}

import java.util.ArrayList;

public class StudentApplication
{
	static ArrayList<Student> allStudents = new ArrayList<Student>();
	static ArrayList<Course> allCourses = new ArrayList<Course>();
	
	public static void main(String[] args)
	{
		
		exercise1();
	}
	
	public static void exercise1()
	{
		//int studentID, String studentName, Course studentName
		
		Course compSci = new Course(1001,"Computer Science");// create the course computer science
		allCourses.add(compSci);//ad cs to the list of all courses
		compSci.printCourseList();
		
		Student s1 = new Student(101, "joe bloggs",63, compSci); // creates student s1 i.e. Joe Bloggs
		compSci.addStudent(s1);// this adds joe bloggs to computer science arrayList
		allStudents.add(s1); //Add s1 to global list of all students
		
		Course law = new Course(1002, "Law");
		allCourses.add(law);
		
		Student s2 = new Student(102, "mary Smith" ,55, law);
		law.addStudent(s2);
		allStudents.add(s2);
		
		Student s3 = new Student(103, "Bob Adams", 71, compSci);
		compSci.addStudent(s3);
		allStudents.add(s3);
		
		Course games = new Course(103,"Games");
		allCourses.add(games);
		
		double totalScore = 0;
		for(Student s: allStudents)
		{
			totalScore = totalScore+ s.getStudentScore();
		}
		double average = totalScore/allStudents.size();
		System.out.println("Average score is "+average);
		
		//better way
		for(Course c: allCourses)
		{
			c.printCourseList();
		}
		
					
		//ineficient way
		compSci.printCourseList();
		law.printCourseList();
		games.printCourseList();
		
		
	}
	
}

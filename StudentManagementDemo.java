 import java.util.ArrayList;
 enum Gender {
	MALE,
	FEMALE,
	STRAIGHT
}

 class Person {

	protected String name;
	protected Gender gender;

	Person (String name,Gender gender) {


		this.name = name;
		this.gender = gender;
	}


} 

class Student extends Person {
	private int student_id;

	Student(String name,Gender gender,int student_id) {

		super(name,gender);
		this.student_id = student_id;
	}

	public int getId() {
		return student_id;
	}

	public String getInfo() {
		return "Student id" + student_id + ", Name : " + name + " , Gender " + gender;
	}


}

class Course {
	private int course_id ;
	private String name;

	Course (int course_id,String name) {
		this.course_id = course_id;
		this.name = name;
	}

	public int getId() {
		return course_id;
	}

	public String getInfo() {
		return "Course ID : " + course_id + " , Name : " + name;
	}
}

class Enrollement {
	private Student student;
	private Course course;

	Enrollement (Student student, Course course) {
		this.student = student;
		this.course = course;
	}

	public String getInfo() {
		return student.getInfo() + ", Enroll - > " + course.getInfo();
	}
}

public class StudentManagementDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> student = new ArrayList<>();
		ArrayList<Course> course = new ArrayList<>();
		ArrayList<Enrollement> enrollement = new ArrayList<>();

		Student students = new Student("Aung Aung",Gender.MALE,14);
		Student students1 = new Student("Mya Mya",Gender.FEMALE,15);

		student.add(students);
		student.add(students1);

		Course courses = new Course(01,"English Speaking");
		Course courses1 = new Course(02,"English Listening");

		course.add(courses);
		course.add(courses1);

		Enrollement en = new Enrollement(students,courses);
		Enrollement en1 = new Enrollement(students1,courses1);

		enrollement.add(en);
		enrollement.add(en1);

		for(Enrollement e : enrollement) {
			System.out.println(e.getInfo());
		}
	}

}



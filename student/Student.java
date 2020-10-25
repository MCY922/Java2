package student;

public class Student extends Course {
	public String courses = "а╫це";
	public Student(String name,String sex,int number) {
		super();
	    this.name=name;
	    this.sex=sex;
	    this.number=number;
	}
	void setCourse(String course) {
		this.courses=course;
	}
	
}
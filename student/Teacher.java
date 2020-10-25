package student;
public class Teacher extends Course{
	public String lessonname;
	public String time;
	Teacher(int number,String name,String sex) {
		super();
		this.number=number;
	    this.name=name;
	    this.sex=sex;
	}
	void setCourse1(String lessonname) {
		this.lessonname=lessonname;
	}
}
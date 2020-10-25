package student;
public class test {
	public static String toString(Student stu) {
		return " 学生姓名: "+stu.name+" 学号: "+stu.number+" 学生性别: "+stu.sex+" 已选课程: "+stu.courses;
	}
	public static String toChoose(Teacher tea) {
		return " 老师编号: "+tea.number+" 老师姓名: "+tea.name+" 老师性别: "+tea.sex+" 所教课程: "+tea.lessonname;
	}
	public static void main(String args[]) {
	    Student stu = new Student("小明","男",2019311321);//学生信息
	    Teacher tea1 = new Teacher(001,"张","女");//老师信息
	    tea1.setCourse1("大物");
	    Teacher tea2 = new Teacher(002,"李","女");
	    tea2.setCourse1("离散");
	    System.out.println(toString(stu));
	    stu.setCourse("大物");
	    System.out.println(toChoose(tea1));
	    System.out.println(toChoose(tea2));
	  }
}
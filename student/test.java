package student;
public class test {
	public static String toString(Student stu) {
		return " ѧ������: "+stu.name+" ѧ��: "+stu.number+" ѧ���Ա�: "+stu.sex+" ��ѡ�γ�: "+stu.courses;
	}
	public static String toChoose(Teacher tea) {
		return " ��ʦ���: "+tea.number+" ��ʦ����: "+tea.name+" ��ʦ�Ա�: "+tea.sex+" ���̿γ�: "+tea.lessonname;
	}
	public static void main(String args[]) {
	    Student stu = new Student("С��","��",2019311321);//ѧ����Ϣ
	    Teacher tea1 = new Teacher(001,"��","Ů");//��ʦ��Ϣ
	    tea1.setCourse1("����");
	    Teacher tea2 = new Teacher(002,"��","Ů");
	    tea2.setCourse1("��ɢ");
	    System.out.println(toString(stu));
	    stu.setCourse("����");
	    System.out.println(toChoose(tea1));
	    System.out.println(toChoose(tea2));
	  }
}
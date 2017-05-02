package oo.stati;

public class Tester {

	public static void main(String[] args) {
		System.out.println("Student.pass");  //比static晚print
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		
		Student s1 = new Student();
		
		GraduateStudent gstu = new GraduateStudent(68,85,89);
		gstu.print();
	}
}

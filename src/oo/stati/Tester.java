package oo.stati;

import java.util.ArrayList;

public class Tester {//extends Object-隱藏版自動繼承

	public static void main(String[] args) {
		System.out.println("Student.pass");  //比static晚print
		Student stu1 = new Student(58, 98, 66);
		Student stu2 = new Student(67, 56, 77);
		Student stu3 = new Student(88, 99, 85);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		stu3.print();
		GraduateStudent gstu1 = new GraduateStudent(66,87,66);
		GraduateStudent gstu2 = new GraduateStudent(78,89,60);
		gstu1.print();
		gstu2.print();
		//
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(58, 98, 66));
		list.add(new Student(67, 56, 77));
		list.add(new Student(88, 99, 85));
		list.add(new GraduateStudent(66,87,66));
		list.add(new GraduateStudent(78,89,60));
		for (int i=0; i<list.size(); i++){
			Student stu = list.get(i);
			stu.print();  //gstu也是用自己的print
		}
		
		Student stu = new Student();
		System.out.println(stu); //oo.stati.Student@15db9742


	}
}

package oo.member;

public class Member {

	String id;
	private int age;
	String name;
	
	public Member() {
		super();
	}
	public Member(String name){
		System.out.println("member constructor");
		this.name = name;
	}
	
	void setAge(int age){
		if (age < 0){
			age = 0;
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
	
}

package oo.stati;

public class Student {

	int english;
	int math;
	int chinese;
	static int pass = 60;  //大家都是60分pass	
	static{
		System.out.println("STATIC!!!");
//		System.out.println(english); 物件(english)還沒生成就會被執行
		System.out.println(pass);   //pass也屬於static
	}  //static-什麼都還沒做就會執行
	
	
	public Student(int english, int math, int chinese) {
		super();
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	
	private String getScore(int score){
		if (score < pass) {
			return String.valueOf(score) + "*";
		}else{
			return String.valueOf(score);
		}
	}
	
	public void print(){
		System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese));
	}
}

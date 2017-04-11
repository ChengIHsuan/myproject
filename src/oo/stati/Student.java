package oo.stati;

public class Student {

	int english;
	int math;
	int chinese;
	static int pass = 60;  //ÀRºA¡A¦@¥Îpass	

//¥kÁä¡÷Source¡÷Generate Constructor
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

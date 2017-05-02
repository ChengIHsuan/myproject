package oo.stati;

public class GraduateStudent extends Student{ //繼承

		int thesis;
		
		public GraduateStudent(int chinese, int english, int math){
			this.chinese = chinese;
			this.english = english;
			this.math = math;
		}
		
		@Override  //編譯之前檢查  
		public void print(){  //子類別複寫父類別方法  private-->protected
			System.out.println(getScore(english) + "\t" + getScore(math) + "\t" + getScore(chinese) + "\t" + thesis);
		}
		
}

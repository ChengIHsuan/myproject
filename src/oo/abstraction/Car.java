package oo.abstraction;

public class Car {
	int id;
	String brand;
	String name;
	int cc;
	String type;
	int status;
	float milage;
	
	public Car(String brand, String name, int cc){   //建構子
		this.brand = brand;
		this.name = name;
		this.cc = cc;
	}
	
	public void setMilage(int m){	//兩個字:第一個字全小寫 第二個字首大寫
		milage = m;
	}
	
	public float addMilage(int m){
		milage = milage + m;
		return milage;
	}
	
	public void maintain(){
		status = 5;
		
	}
	
}

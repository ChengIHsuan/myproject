package oo.mid;

import java.util.ArrayList;

public class Ticket {

	ArrayList<String> a = new ArrayList();
	int id;
	String name;
	float price;
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setPrice(float price){
		this.price = price;
	}
	public float getPrice(){
		return price;
	}

}

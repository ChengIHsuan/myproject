package oo.mid;

import java.util.Scanner;

public class MealTester {

	public static void main(String[] args) {
		Meal m = new Meal();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("請問要點幾號餐?(1~8號餐)");
		m.order();
		System.out.print("套餐飲料 1可樂 2雪碧 3紅茶");
		m.choose();
		System.out.print("是否要加49元多一份麥克雞塊? 1是 2否");
		m.add();
		
	}

}

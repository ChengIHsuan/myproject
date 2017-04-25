package oo.mid;

import java.util.Scanner;

public class Meal {
	Scanner scanner = new Scanner(System.in);
	int meal;
	int price;
	String drink;
	
	

//	public Meal(int meal, String drink) {
//		super();
//		this.meal = meal;
//		this.drink = drink;
//	}

	public void order() {

		int order = scanner.nextInt();
		if (order == 1) {
			meal = 1;
			price = price + 99;
		}
		if (order == 2) {
			meal = 2;
			price = price + 99;
		}
		if (order == 3) {
			meal = 3;
			price = price + 109;
		}
		if (order == 4) {
			meal = 4;
			price = price + 119;
		}
		if (order == 5) {
			meal = 5;
			price = price + 109;
		}
		if (order == 6) {
			meal = 6;
			price = price + 139;
		}
		if (order ==7) {
			meal = 7;
			price = price + 159;
		}
		if (order == 8) {
			meal = 8;
			price = price + 149;
		}
	}

	public void choose() {
		int choose = scanner.nextInt();
		if (choose == 1) {
			drink = ("可樂");
		}
		if (choose == 2) {
			drink = ("雪碧");
		}
		if (choose == 3) {
			drink = ("紅茶");
		}
	}
	public void add() {
		int choose = scanner.nextInt();
		if (choose == 1) {
			price = price + 49;
			System.out.println("確定加點4塊麥克雞塊");
			System.out.print("為您確認餐點，您點的是" + meal + "號餐，飲料是" + drink + "，點一份麥克雞塊，總共是" + price + "元");
		}
		if (choose == 2) {
			System.out.print("為您確認餐點，您點的是" + meal + "號餐，飲料是" + drink + "，總共是" + price + "元");

		}
	}

}

package oo.mid;

public class Meal2 {
	String name;
	int price;
	String snack;

	public Meal2(String name, int price, String snack) {
		super();
		this.name = name;
		this.price = price;
		this.snack = snack;
	}

	public void print() {
		System.out.println("請輸入餐點號碼:");

	}

	public int discount() {
		int dis = (int) (price * 0.9f);
		return dis;
	}
}

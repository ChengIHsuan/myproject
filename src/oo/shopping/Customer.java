package oo.shopping;

public class Customer {

	int money;
	
	public Customer() {
		super();
	}
	
	public Customer(int money){
		this.money = money;
	}
	
	public void print(){
		System.out.println(money + "\t" + money + "\t" + "0");
	}
	
/*	public void print(int m){
		System.out.println("消費金額:" + m);
		System.out.println("折扣後金額:" + m);
		System.out.println("還原金:" + 0);
	}
	*/
}

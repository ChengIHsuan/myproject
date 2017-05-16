package oo.shopping;

public class GoldenCustomer extends SilverCustomer{
	
	float returnRate = 0.05f;

	public GoldenCustomer() {
		super();
	}
	public GoldenCustomer(int money){
		this.money = money;
	}
	public void print(){
		System.out.println(money + "\t" + money*discount + "\t" + money*returnRate);		
	}
}

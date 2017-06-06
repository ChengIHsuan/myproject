package oo.shopping2;

public class SilverCustomer extends NormalCustomer{
	
	float discount = 0.9f;
	
	public SilverCustomer(){
		super();
	}
	
	public SilverCustomer(int money){
		this.money = money;
	}
	
	@Override
	public void print() {
		System.out.println(money + "\t" + money * discount + "\t" + "0");
	}
}

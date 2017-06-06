package oo.shopping2;

public class GoldenCustomer extends SilverCustomer{

	float returnRate = 0.05f;
	
	public GoldenCustomer() {
		super();
	}

	public GoldenCustomer(int money) {
		this.money = money;
	}

	@Override
	public void print() {
		System.out.println(money + "\t" + money*discount + "\t" + money*returnRate);		
	}

	

}

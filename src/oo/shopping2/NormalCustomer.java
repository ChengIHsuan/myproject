package oo.shopping2;

public class NormalCustomer implements Customer{

	int money;
	
	public NormalCustomer() {
		super();
	}

	public NormalCustomer(int money){
		this.money = money;
	}
	
	@Override
	public void print() {
		System.out.println(money + "\t" + money + "\t" + "0");		
	}

}

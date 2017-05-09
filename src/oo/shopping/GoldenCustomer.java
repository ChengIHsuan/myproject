package oo.shopping;

public class GoldenCustomer extends SilverCustomer{
	
	@Override
	public void print(int m){
		System.out.println("消費金額:" + m);
		System.out.println("折扣後金額:" + (m*0.9));
		System.out.println("還原金:" + (m*0.05));
	}
}

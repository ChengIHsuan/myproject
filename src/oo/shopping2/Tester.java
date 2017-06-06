package oo.shopping2;

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {
		System.out.println("原價" + "\t" + "折扣後" + "\t" + "還原金");
		ArrayList<Customer> list = new ArrayList();
		list.add(new NormalCustomer(10000));
		list.add(new NormalCustomer(10000));
		list.add(new SilverCustomer(10000));
		list.add(new GoldenCustomer(10000));
		list.add(new NormalCustomer(10000));
		list.add(new SilverCustomer(10000));
		
	}
}

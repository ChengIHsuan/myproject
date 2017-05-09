package oo.shopping;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Customer cus = new Customer();
		SilverCustomer sc = new SilverCustomer();
		GoldenCustomer gc = new GoldenCustomer();

		Scanner scanner = new Scanner(System.in);
		System.out.println("1.一般客戶 2.銀級客戶 3.金級客戶");
		int c = scanner.nextInt();

		System.out.println("輸入消費金額:");
		int m = scanner.nextInt();
		
		if (c == 1) {
			cus.print(m);
		}
		if (c == 2) {
			sc.print(m);
		}
		if (c == 3) {
			gc.print(m);
		}
	}

}

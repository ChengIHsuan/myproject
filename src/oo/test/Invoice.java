package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {
	public static void main(String[] args) {

		ArrayList<String> a = new ArrayList();
		// 331 821 886 554 讓使用者輸入發票號碼(長度不限)判斷末3碼是否中獎
		// String n = "54156415416541654156331";
		// System.out.println(n.length());

		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");
		// boolean flag = true;
		int m = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入發票號碼：");
		String num = scanner.nextLine();
		String n = num.substring(num.length() - 3);

		for (int i = 0; i < 4; i++) {
			if (n.equals(a.get(i))) {
				System.out.println("中獎");
				break;
			} else {
				m = m + 1;
			}
			if (m == 4) {
				System.out.println("沒中獎");
			}
		}
	}
}
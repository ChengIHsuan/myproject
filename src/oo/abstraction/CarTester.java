package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		/*
		 * Car c1 = new Car(); c1.cc = 1800; c1.brand = "TOYOTA"; c1.name =
		 * "ALTIS";
		 * 
		 * Car c2 = new Car(); c2.cc = 2000; c2.brand = "HONDA"; c2.name =
		 * "ACCORD";
		 * 
		 * Car c3 = new Car(); c3.cc = 2000; c3.brand = "TOYOTA"; c3.name =
		 * "WISH";
		 */

		Car c1 = new Car("TOYOTA", "ALTIS", 1800);
		Car c2 = new Car("HONDA", "ACCORD", 2000);
		Car c3 = new Car("TOYOTA", "WISH", 2000);

		int[] n = new int[5];
		n[0] = 0;
		n[1] = 0;
		// n[2] = 0; 可以不用設初始值
		n[3] = 0;
		System.out.println(n[2]);

		Car[] cars = new Car[3];
		cars[0] = new Car("TOYOTA", "ALTIS", 1800);
		cars[1] = new Car("HONDA", "ACCORD", 2000);
		cars[2] = new Car("TOYOTA", "WISH", 2000);
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
		System.out.println(cars[1].name); // null

		int i = 0;
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].name);
		}
		System.out.println(i);
		for (i = 1; i <= 9; i = i + 2) {
			System.out.println(i);
		}
		System.out.println(i);

	}

	class AA {
		AA a = new AA();

	}

}

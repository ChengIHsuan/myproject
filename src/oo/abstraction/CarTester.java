package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		/*		Car c1 = new Car();
		c1.cc = 1800;
		c1.brand = "TOYOTA";
		c1.name = "ALTIS";

		Car c2 = new Car();
		c2.cc = 2000;
		c2.brand = "HONDA";
		c2.name = "ACCORD";

		Car c3 = new Car();
		c3.cc = 2000;
		c3.brand = "TOYOTA";
		c3.name = "WISH";
		*/
		
		Car c1 = new Car("TOYOTA", "ALTIS", 1800);
		Car c2 = new Car("HONDA", "ACCORD", 2000);
		Car c3 = new Car("TOYOTA", "WISH", 2000);
	}

}

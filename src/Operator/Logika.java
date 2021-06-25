package Operator;

public class Logika {
	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;
		boolean d = true;
		boolean e = false;
		boolean c;

		// Konjungsi (dan)
		c = a && b;
		System.out.println("true && false = " + c);

		c = a && d;
		System.out.println("true && true = " + c);

		c = b && e;
		System.out.println("false && false = " + c);

		// Disjungsi (atau)
		c = a || b;
		System.out.println("true || false = " + c);

		c = a || d;
		System.out.println("true && true = " + c);

		c = b || e;
		System.out.println("false && false = " + c);

		// Negasi (bukan)
		System.out.println("Negasi, !true = " + !a);

	}
}

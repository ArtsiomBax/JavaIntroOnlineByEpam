package by.epam.tc.modul1.branches.task5;

/*
 	Вычислить значение функции:
 
 */

public class Task5 {
	static double x = 4;
	static double fX;

	public static void main(String[] args) {

		if (x <= 3) {
			fX = Math.pow(x, 2) - 3 * x + 9;
			System.out.println("F(x) при (х <=3) = " + fX);
		}
		if (x > 3) {
			fX = 1 / (Math.pow(x, 3) + 6);
			System.out.println("F(x) при (х >3) = " + fX);
		}

	}

}

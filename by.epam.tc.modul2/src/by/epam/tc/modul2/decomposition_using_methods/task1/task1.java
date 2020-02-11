package by.epam.tc.modul2.decomposition_using_methods.task1;
/*
 	Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух 
	натуральных чисел.
 */

public class task1 {

	static int a = 9;
	static int b = 9;

	public static void main(String[] args) {
		System.out.println("Наибольший общий делитель " + "(" + a + "," + b + ")" + " = " + nod(a, b));
		System.out.println("Наименьшее общее кратное " + "(" + a + "," + b + ")" + " = " + nok(a, b));

	}

	public static int nod(int a, int b) {
		while (a != 0 && b != 0) {
			if (a > b) {
				a %= b;
			} else {
				b %= a;
			}
		}

		return a + b;
	}

	public static int nok(int a, int b) {

		return a * b / nod(a, b);
	}

}

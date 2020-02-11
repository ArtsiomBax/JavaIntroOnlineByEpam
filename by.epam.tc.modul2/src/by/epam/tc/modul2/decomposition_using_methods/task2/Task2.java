package by.epam.tc.modul2.decomposition_using_methods.task2;

/*
  	Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */

public class Task2 {

	static int a = 48;
	static int b = 56;
	static int c = 96;
	static int d = 74;

	public static void main(String[] args) {

		System.out.println(nod4(a, b, c, d));

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

	public static int nod4(int a, int b, int c, int d) {
		return nod(nod(a, b), nod(c, d));
	}

}

package by.epam.tc.modul1.cycles.task2;

/*
 	Вычислить значения функции на отрезке [а,b] c шагом h:
 */

public class Task2 {

	public static void main(String[] args) {
		int a = -8;
		int b = 11;
		int h = 2;
		int x;
		int y = 0;

		for (x = a; x <= b -h; x += h) {
			if (x > 2) {
				y = x;
			}
			if (x <= 2) {
				y = -x;
			}
			System.out.println("При X = " + x);
			System.out.println("Y = " + y);

		}

	}

}

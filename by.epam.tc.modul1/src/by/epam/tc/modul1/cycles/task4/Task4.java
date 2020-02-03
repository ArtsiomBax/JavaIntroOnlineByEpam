package by.epam.tc.modul1.cycles.task4;

/*
 	Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Task4 {

	public static void main(String[] args) {

		int com = 1;
		for (int i = 1; i <= 200; i++) {
			com *= Math.pow(i, 2);
		}
		System.out.println(com);

	}

}

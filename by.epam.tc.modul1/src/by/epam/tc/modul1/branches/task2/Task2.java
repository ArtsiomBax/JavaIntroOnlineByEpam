package by.epam.tc.modul1.branches.task2;

import java.util.Scanner;

/*
	����� max{min(a, b), min(c, d)}. 

*/

public class Task2 {
	static double a;
	static double b;
	static double c;
	static double d;
	static double minAB;
	static double minCD;
	static double max;

	public static void main(String[] args) {

		System.out.println("������� ����� A: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.println("������� ����� B: ");
		b = scan.nextInt();
		System.out.println("������� ����� C: ");
		c = scan.nextInt();
		System.out.println("������� ����� D: ");
		d = scan.nextInt();
		scan.close();

		if (a > b) {
			minAB = b;
			System.out.println("Min (A, B) = " + minAB);
		} else {
			minAB = a;
			System.out.println("Min (A, B) = " + minAB);
		}
		if (c > d) {
			double minCD = d;
			System.out.println("Min (C, D) = " + minCD);
		} else {
			double minCD = c;
			System.out.println("Min (C, D) = " + minCD);
		}
		if (minAB < minCD) {
			max = minCD;
			System.out.println("MAX (minAB, minCD) = " + max);
		} else {
			max = minAB;
			System.out.println("MAX (minAB, minCD) = " + max);
		}
	}

}

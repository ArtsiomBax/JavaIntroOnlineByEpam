package by.epam.tc.modul1.cycles.task8;

import java.util.Scanner;

/*
 	Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
 */

public class Task8 {

	public static void main(String[] args) {
		int iA;
		int iB;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите два числа: ");
		iA = scan.nextInt();
		iB = scan.nextInt();
		String sA = Integer.toString(iA);
		String sB = Integer.toString(iB);
		char[] numA = sA.toCharArray();
		char[] numB = sB.toCharArray();
		for (int i = 0; i < sA.length(); i++) {
			for (int j = 0; j < sB.length(); j++) {
				if (numA[i] == numB[j]) {
					System.out.println(numA[i]);

				}
			}

		}
	}

}

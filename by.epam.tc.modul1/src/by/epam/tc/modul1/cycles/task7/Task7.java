package by.epam.tc.modul1.cycles.task7;

import java.util.Scanner;

/*
  	Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
	m и n вводятся с клавиатуры.
   
 */

public class Task7 {

	public static void main(String[] args) {
		int m;
		int n;

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите  M и N: ");
		m = scan.nextInt();
		n = scan.nextInt();
		for (int i = m; i <= n; i++) {

			for (int e = 2; e < n; e++) {
				if (i % e == 0 && i != e) {
					System.out.print(e);

				}

			}

		}

	}

}

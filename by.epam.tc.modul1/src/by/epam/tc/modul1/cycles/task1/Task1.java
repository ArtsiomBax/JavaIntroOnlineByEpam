package by.epam.tc.modul1.cycles.task1;

import java.util.Scanner;

/*
	Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
	все числа от 1 до введенного пользователем числа.
 */

public class Task1 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое положительное число: ");
		int a = scan.nextInt();
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}

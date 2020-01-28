package by.epam.tc.modul1.branches.task1;

import java.util.Scanner;

/*
 	Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
	он прямоугольным.
 
 */

public class Task1 {
	static double a;
	static double b;

	public static void main(String[] args) {
		
		System.out.println("Введите угол A: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.println("Введите угол B: ");
		b = scan.nextInt();
		scan.close();
		
		if (a+b<180) {
			System.out.println("Треугольник с заданными углами существует");
		} else {
			System.out.println("Треугольник с заданными углами не существует");
		}
		if (a+b-180 == 90 || a==90 || b==90) {
			System.out.println("Треугольник прямоугольный");
		}

	}

}

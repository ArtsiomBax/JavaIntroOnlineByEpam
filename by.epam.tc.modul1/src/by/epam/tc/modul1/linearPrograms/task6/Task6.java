package by.epam.tc.modul1.linearPrograms.task6;

import java.util.Scanner;

/*
 	Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
	принадлежит закрашенной области, и false — в противном случае:
 
 */

public class Task6 {
	static int x;
	static int y;
	static boolean res;

	public static void main(String[] args) {
		System.out.println("Введите X");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("Введите Y:");
		y = scan.nextInt();
		System.out.println("Координаты точки X = " + x + "; " + "Y= " + y + ";");
		scan.close();
		if (x <= 4 & x >= -4 & y <= 0 & y >= -3) {
			res = true;
			System.out
					.println("Точка с кооардинатой (" + x + "," + y + ")" + " пренадлежит закрашенной области: " + res);
		} else if (x <= 2 & x >= -2 & y <= 4 & y >= -3) {
			res = true;
			System.out
					.println("Точка с кооардинатой (" + x + "," + y + ")" + " пренадлежит закрашенной области: " + res);
		} else {
			res = false;
			System.out
					.println("Точка с кооардинатой (" + x + "," + y + ")" + " пренадлежит закрашенной области: " + res);
		}

	}

}
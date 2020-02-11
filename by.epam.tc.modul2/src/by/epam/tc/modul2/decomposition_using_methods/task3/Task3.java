package by.epam.tc.modul2.decomposition_using_methods.task3;

import java.util.Scanner;

/*
 	Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади 
	треугольника. 
 */

public class Task3 {

	public static void main(String[] args) {
		int a;
		double hexArea;
		a= enterFromConsole("Сторона шестиугольника = ");
		hexArea = hexagonArea(a);
		System.out.printf("Площадь правильного шестиугольника со стороной " + a + " = " + "%.2f", hexArea);

	}
	
	public static int enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		int value;

		System.out.println(message);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}
		value = scan.nextInt();

		return value;

	}
	
	
	public static double hexagonArea(int x) {
		double area = 3* Math.sqrt(3)*Math.pow(x, 2)/2;
		
		return area;
		
	}

}

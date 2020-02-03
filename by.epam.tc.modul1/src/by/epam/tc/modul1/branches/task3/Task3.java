package by.epam.tc.modul1.branches.task3;

/*
 	Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 
 */

public class Task3 {
	static double x1 = 3;
	static double x2 = 4;
	static double x3 = 7;
	static double y1 = 5;
	static double y2 = 3;
	static double y3 = 9;

	public static void main(String[] args) {

		if ((y3 - y1) / (y2 - y1) == (x3 - x1) / (x2 - x1)) {
			System.out.println("Точки расположенны на одной прямой.");
		} else {
			System.out.println("Точки не расположены на одной прямой.");

		}

	}

}

package by.epam.tc.modul1.branches.task3;

/*
 	���� ��� ����� �(�1,�1), �(�2,�2) � �(�3,�3). ����������, ����� �� ��� ����������� �� ����� ������.
 
 */

public class Task3 {
	static double x1 = 3;
	static double x2 = 4;
	static double x3 = 7;
	static double y1 = 5;
	static double y2 = 3;
	static double y3 = 9;


	public static void main(String[] args) {
		
		if((y3 - y1)/(y2- y1) == (x3-x1)/(x2 - x1) ) {
			System.out.println("��� ����� ����������� �� ����� ������.");
		} else {
			System.out.println("��� ����� �� ����������� �� ����� ������.");

		}

	}

}

package by.epam.tc.modul1.branches.task4;

/* 
 ������ ������� �, � �������������� ��������� � ������� �, �, z �������. ����������, ������� �� ������ �����
 ���������.

 */

public class Task4 {
	static double a = 5;
	static double b = 5;
	static double x = 5;
	static double y = 8;
	static double z = 9;

	public static void main(String[] args) {

		if ((a >= x & b >= y) || (a >= y & b >= x) || (a >= x & b >= z) || (a >= z & b >= x) || (a >= z & b >= y)
				|| (a >= y & b >= z)) {
			System.out.println("������ ��������!");
		} else {
			System.out.println("������ �� ��������!");
		}

	}
}

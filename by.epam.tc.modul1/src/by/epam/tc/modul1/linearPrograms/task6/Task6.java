package by.epam.tc.modul1.linearPrograms.task6;

import java.util.Scanner;

/*
 ��� ������ ������� ��������� �������� ���������, ������� �������� true, ���� ����� � ������������ (�, �)
 ����������� ����������� �������, � false � � ��������� ������.
 
 */

public class Task6 {
	static int x;
	static int y;
	static boolean res;

	public static void main(String[] args) {
		System.out.println("������� �:");
		Scanner scan = new Scanner(System.in);
		x = scan.nextInt();
		System.out.println("������� Y: ");
		y = scan.nextInt();
		System.out.println("���������� ����� X = " + x + "; " + "Y= " + y + ";");
		scan.close();
		if (x <= 4 & x >= -4 & y <= 0 & y >= -3) {
			res = true;
			System.out
					.println("����� � ������������ (" + x + "," + y + ")" + " ����������� ����������� �������: " + res);
		} else if (x <= 2 & x >= -2 & y <= 4 & y >= -3) {
			res = true;
			System.out
					.println("����� � ������������ (" + x + "," + y + ")" + " ����������� ����������� �������: " + res);
		} else {
			res = false;
			System.out
					.println("����� � ������������ (" + x + "," + y + ")" + " ����������� ����������� �������: " + res);

		}

	}

}

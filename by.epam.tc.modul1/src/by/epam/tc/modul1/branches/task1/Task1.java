package by.epam.tc.modul1.branches.task1;

import java.util.Scanner;

/*
 	���� ��� ���� ������������ (� ��������). ����������, ���������� �� ����� �����������, � ���� ��, �� ����� ��
	�� �������������.
 
 */

public class Task1 {
	static double a;
	static double b;

	public static void main(String[] args) {
		
		System.out.println("������� ���� A: ");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		System.out.println("������� ���� B: ");
		b = scan.nextInt();
		scan.close();
		
		if (a+b<180) {
			System.out.println("����������� � ��������� ������ ����������");
		} else {
			System.out.println("����������� � ��������� ������ �� ����������");
		}
		if (a+b-180 == 90 || a==90 || b==90) {
			System.out.println("����������� �������������");
		}

	}

}

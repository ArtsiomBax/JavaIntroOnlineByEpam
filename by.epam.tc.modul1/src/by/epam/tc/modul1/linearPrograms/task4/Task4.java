package by.epam.tc.modul1.linearPrograms.task4;

/* ���� �������������� ����� R ���� nnn.ddd. �������� ������� � ����� ����� �����
   � ������� ���������� ��������
*/

public class Task4 {
	static double r = 456.256;
	static double res;

	public static void main(String[] args) {
		int n = (int) r; // ��������� ����� ����� �����

		double d = r - n;
		double nnn = (double) n / 1000;
		double ddd = d * 1000;
		res = ddd + nnn;

		System.out.printf("%.3f", res);

	}

}

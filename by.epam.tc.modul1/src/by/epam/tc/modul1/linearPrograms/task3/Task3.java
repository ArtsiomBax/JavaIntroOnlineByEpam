package by.epam.tc.modul1.linearPrograms.task3;

/*
��������� �������� ��������� �� ������� (��� ���������� ��������� �������������� ��������): 

((sin x + cos y) / (cos x - sin y)) * tg xy

*/

public class Task3 {
	static double x = 50;
	static double y = 45;
	static double a;

	public static void main(String[] args) {

		a = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
		System.out.println(a);

	}

}

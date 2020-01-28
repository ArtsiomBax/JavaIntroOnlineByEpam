package by.epam.tc.modul1.linearPrograms.task4;

/* 
Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
дробную и целую части числа и вывести полученное значение числа.
*/

public class Task4 {
	static double r = 456.256;
	static double res;

	public static void main(String[] args) {
		int n = (int) r; // èçâëåêàåì öåëóþ ÷àñòü ÷èñëà

		double d = r - n;
		double nnn = (double) n / 1000;
		double ddd = d * 1000;
		res = ddd + nnn;

		System.out.printf("%.3f", res);

	}

}

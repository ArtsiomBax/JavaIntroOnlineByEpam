package by.epam.tc.modul1.linearPrograms.task2;

/*
Вычислите значение выражения по формуле (все переменные принимают действительные значения): 

b + (sqrt(b^2 + 4ac)/2a) - a^3c + b^-2

*/

public class Task2 {
	static double a = 1;
	static double b = 2;
	static double c = 3;
	static double x;

	public static void main(String[] args) {
		x = (b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
		System.out.println(x);
	}

}

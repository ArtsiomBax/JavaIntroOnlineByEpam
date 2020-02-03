package by.epam.tc.modul1.cycles.task5;
/*
 	Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
	заданному е. Общий член ряда имеет вид:
 */

public class Task5 {

	public static void main(String[] args) {
		int n = 1;
		double e = 0.000000001;
		double aN;
		double sum = 0;
		for (int i = 1; i <= 1000; i++) {
			aN = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
			if(Math.abs(aN)>=e) {
				sum += aN;
			}
			System.out.println(aN);
			n++;
			
		}
		System.out.println("Сумма: " +sum);

	}

}

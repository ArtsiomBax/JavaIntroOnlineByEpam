package by.epam.tc.modul1.linearPrograms.task5;

/*  
	Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. 
 	Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
	ННч ММмин SSc.
*/

public class Task5 {

	static int t = 7966;

	public static void main(String[] args) {

		int hh = t / 3600;
		int mm = t % 3600 / 60;
		int ss = t % 3600 % 60;

		System.out.println(hh + "ч" + " " + mm + "м" + " " + ss + "с");

	}

}

package day30_dateTime;

import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {
		
		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 11, 14);
		int fark=bugun.compareTo(date);
		System.out.println("fark : "+fark);

	}

}

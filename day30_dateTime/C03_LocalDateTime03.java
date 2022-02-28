package day30_dateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


public class C03_LocalDateTime03 {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		
		System.out.println("aktuel tarih ve zaman : "+ldt);
		LocalDate date=LocalDate.of(2016, 1, 10);
		
		LocalTime time=LocalTime.of(13, 30);
		
		LocalDateTime ldt1=LocalDateTime.of(date, time);
		System.out.println(date);
		System.out.println(time);
		System.out.println(ldt1);
		System.out.println(ldt.getHour());
		

	}

}

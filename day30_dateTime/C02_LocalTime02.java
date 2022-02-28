package day30_dateTime;


import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class C02_LocalTime02 {

	public static void main(String[] args) {
		
		LocalTime zaman=LocalTime.now();
		
		System.out.println("aktual zaman : "+zaman);
		
		LocalTime time1=LocalTime.of(12, 35, 23);
		
		System.out.println(time1);
		System.out.println("su zamandan 2 saat ileri 34 dk geri 45 sn ileri : "+zaman.plusHours(2).minusMinutes(34).plusSeconds(45));
		
		for (int i = 0; i < 10000; i++) {
			System.out.print(i);
		}

		LocalTime zaman2=LocalTime.now();
		System.out.println("");
		System.out.println(zaman2);
		
		//ulke saatlari hesaplama
		ZonedDateTime japan=ZonedDateTime.now(ZoneId.of("Japan"));
		
		System.out.println(japan);
		
		ZonedDateTime newyork=ZonedDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println(newyork);
		
		ZonedDateTime amsterdam=ZonedDateTime.now(ZoneId.of("Europe/Amsterdam"));
		
		System.out.println(amsterdam);
	}

}

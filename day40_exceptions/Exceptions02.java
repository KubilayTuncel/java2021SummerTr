package day40_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
	

		@SuppressWarnings({ "resource", "unused" })
		FileInputStream fis = new FileInputStream("/Users/kerimmac/eclipse-workspace/java2021SummerTr/src/day39_exceptions/file");
		
		//thowrs keyword "checked exceptions" icin kullanilir
		//try-catch blogu exception ile handle etmekde kullanilir
		//throws keyword'u ise sadece declaration'dir. Dolayisiyla throw kullanilan bir method da 
		//bir exception olusursa KOD BLOKE OLUR
		
		int k=0;

			while ((k=fis.read())!=-1) {
				System.out.print((char)k);
				
				//Eger birden fayla exception icin throws keyword'u kullanacaksak
				//yazacagimiz exceptionlarin arasindaki iliskisi ve siralama onemlidir
				//eger yazdigimiz exception'lar arasinda parent-child iliskisi varsa
				//once child exception yazilmalidir, aksi takdirde child exc. erisilemez olur
				
				//Eger yazacaklarimiz arasinda parent-child iliskisi varsa
				//istersek sadece parent'i yazmamiz yeterli olur
			}
	}

}

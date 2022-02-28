package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions03 {

	public static void main(String[] args) {
		// icice try-catch yerine bir tane try ve multiple catch blogu kullanabiliriz
		//Ancak bu durumda yazdigimiz exception arasinda parent ve exception iliskisi varsa
		//ilk once child exception kismini yazmaliyiz
		//aksi takdirde (yani once parent yazdigimizda) child'a is kalmaz
		//Java erisilemez catch-blogu diyerek CTE verir.
		
		/*
		 * Ayrica parent child iliskisi varsa child silinebilir, 
		 * ama child silinirse spesifik olarak hata tam olarak neyden kaynaklanir bilemeyebiliriz.
		 */
		try {
			FileInputStream fis = new FileInputStream("/Users/kerimmac/eclipse-workspace/java2021SummerTr/src/day39_exceptions/file");
			
			int k=0;

				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
					fis.close();
				}
		}catch (FileNotFoundException e) { //child class
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder //parent class
				// TODO Auto-generated catch block
				e.printStackTrace();
		
			
			
		} 
	
	}

}

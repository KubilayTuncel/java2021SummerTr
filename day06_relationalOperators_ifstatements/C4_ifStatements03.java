package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C4_ifStatements03 {

	public static void main(String[] args) {
		/* Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin 
	    Ornek:  ilkHarf=P output = “Pazar, Pazartesi veya Persembe”             ilkHarf=S output = “Sali”
	    	    *** Buyuk kucuk harf problem olmamasi icin toUpperCase methodunu kullanin

		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen istediginiz gun harfinin ilk harfini giriniz");
		
		char ilkHarf=scan.next().toLowerCase().charAt(0);
		

		if (ilkHarf== 'p') {
			
			System.out.println("Pazartesi, persembe ve ya pazar");
			
		}
		
		if (ilkHarf=='s') {
			
			System.out.println("Sali");
			
		}
		
		if (ilkHarf=='c') {
			
			System.out.println("carsamba, cuma ve ya cumartesi");
		}
		
		
		if (ilkHarf!='p' && ilkHarf!='c' && ilkHarf!='s') {
			
			System.out.println("Girdiginiz harf gecerli degildir");
		}
		
		scan.close();
	}

}

package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C5_ifStatements04 {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//ve dikdortgenin kare olup olmadigini yazdirin

		Scanner scan=new Scanner(System.in);
				
		System.out.println("Lutfen kenar uzunluklarindan birini tamsayi olarak giriniz");
	
		int kenar1=scan.nextInt();
		
		System.out.println("Lutfen diger kenar uzunlugunu tamsayi olarak giriniz");
		
		int kenar2=scan.nextInt();
		
		
		if(kenar1==kenar2) {
			
			System.out.println("bu cisim karedir");
			
					
		}
		
		if (kenar1!=kenar2) {
			
			System.out.println("bu cisim kare degildir");
		}
		
		scan.close();
		
	}

}

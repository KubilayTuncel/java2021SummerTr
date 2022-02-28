package day18_doWhileLoopScope;

import java.util.Scanner;

public class C01_WhileLoop01 {

	public static void main(String[] args) {

		// Kullanicidan iki pozitif sayi isteyin
		// kullanici negatif sayi girdiginde
		// girilen negatif sayilari yok sayip, yeniden deger isteyin
		// kullanici dogru giris yaptiginda "well done" ve sayilarin carpimini yazdirin

		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki pozitif sayi giriniz:");
		
		int sayi1=0; //istemedigimiz bir degeri atiyoruz while loop un icine girebilmesi icin.
		int sayi2=0;
		while (sayi1<=0 || sayi2<=0) {
			
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();	

				if (sayi1>0 && sayi2>0) {
					
					System.out.println("well done \ngirilen sayilarin carpimi : " +sayi1*sayi2);
					
						
				}else {
					
					System.out.println("Lutfen pozitif iki sayi giriniz");
				}
			
		}

		scan.close();
		
	}

}

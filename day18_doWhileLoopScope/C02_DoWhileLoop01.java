package day18_doWhileLoopScope;

import java.util.Scanner;

public class C02_DoWhileLoop01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki pozitif sayi giriniz:");
		
		int sayi1=5; //bu seferde do while olunca istedigimiz bir degeri giriyoruz ve do while loop a
		int sayi2=10; // oyle giriyor
		
		do {
			 sayi1=scan.nextInt();
			 sayi2=scan.nextInt();	

				if (sayi1>0 && sayi2>0) {
					
					System.out.println("well done \ngirilen sayilarin carpimi : " +sayi1*sayi2);
					
						
				}else {
					
					System.out.println("Lutfen pozitif iki sayi giriniz");
				}
			
		}while (sayi1<=0 || sayi2<=0);

		scan.close();

	}

}

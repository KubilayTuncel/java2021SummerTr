package day17_whileLoops;

import java.util.Scanner;

public class C06_WhileLoop04 {

	public static void main(String[] args) {
		// Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini
		// yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen bir sayi giriniz:");

		int sayi = scan.nextInt();

		int rakam = 0;
		int rakamTop = 0;
		int i = sayi;
		int rakam1=0;
		int rakamTop1=0;
		int sayi1=sayi;

		for(int k=1;k<=sayi1;k*=10) {
			
			rakam1=sayi%10;
			rakamTop1+=rakam1;
			sayi/=10;
			
		}
		System.out.println("For dongsunde rakamlar toplami; "+rakamTop1);
		
		
		while (i > 0) {

			rakam = i % 10;
			rakamTop += rakam;
			i /= 10;

		}

		System.out.println("Rakamlar toplami: " + rakamTop);
		scan.close();
	}

}

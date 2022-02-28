package day08_ternaryOperator;

import java.util.Scanner;

public class C4_Ternary02 {

	public static void main(String[] args) {
		// Soru1 ) Kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lutfen iki sayi giriniz");

	double sayi1=scan.nextDouble();
	double sayi2=scan.nextDouble();
	
	double sonuc;
	System.out.println(sonuc=(sayi1>sayi2 ? sayi2 : sayi1));
	
	++sonuc;
	
	System.out.println(sonuc);
	
	scan.close();
	
	}

}

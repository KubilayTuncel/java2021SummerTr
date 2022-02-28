package day38_exceptions;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		// kullanicidan iki tam sayi alin ve bolumlerini yazdirin
		
		Scanner scanner=new Scanner(System.in);

		System.out.println("Lutfen bolunecek sayiyi giriniz: ");

	int sayi1=scanner.nextInt();
	System.out.println("Lutfen bolecek sayiyi giriniz: ");
	
	int sayi2=scanner.nextInt();
	//System.out.println("bolme isleminin sonucu : "+ sayi1/sayi2);
	//java exception'i handle etmek icin try-catch blogu olusturmus.
	
	try {
		System.out.println("bolme isleminin sonucu : "+ sayi1/sayi2);
	} catch (Exception e) {
		e.getMessage();
		System.out.println("sayiyi sifir a bolunemez");
	}
	

	scanner.close();
		
	}

}

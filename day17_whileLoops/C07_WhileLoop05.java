package day17_whileLoops;

import java.util.Scanner;

public class C07_WhileLoop05 {

	public static void main(String[] args) {
		// Kullanicidan toplamak uzere sayi isteyin
		// toplam 200 oluncaya kadar sayi istemeye devam edin
		// toplam 200'u gectiginde
		// kullanicinin kac sayi girdigini ve bu sayilarin toplaminin kac oldugunu
		// yazdirin

		Scanner scan = new Scanner(System.in);

		int tekrar = 0;
		int toplam = 0;
		while (toplam <= 200) {

			System.out.println("Lutfen sayi giriniz:");
			int sayi = scan.nextInt();
			toplam = toplam + sayi;
			tekrar++;

		}

		System.out.println("Girdiginiz sayilarin toplamlari= " + toplam + " \ngirdiginiz sayi adedi= " + tekrar);
		scan.close();
	}

}

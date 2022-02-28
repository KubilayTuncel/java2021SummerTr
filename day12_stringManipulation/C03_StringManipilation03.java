package day12_stringManipulation;

import java.util.Scanner;

public class C03_StringManipilation03 {

	public static void main(String[] args) {
		/*
		 * Soru 6) Kullanicidan bir sifre girmesini isteyin. 
		 * Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”, 
		 * sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
 		- Ilk harf buyuk harf olmali
 		- Son harf kucuk harf olmali
 		- Sifre bosluk icermemeli
 		- Sifre uzunlugu en az 8 karakter olmali

		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sifre giriniz");
		
		String sifre=scan.nextLine();
		
		boolean ilkHarfKont = sifre.charAt(0)>='A' && sifre.charAt(0)<='Z' ;
		boolean sonHarfKont = sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z';
		boolean spaceKont =! sifre.contains(" ");
		boolean sifreuzun = sifre.length()>=8;
		
		if (ilkHarfKont && sonHarfKont && spaceKont && sifreuzun) {
			System.out.println("Sifre basari ile tamamlandi");
		}else {
			System.out.println("islem basarisiz, Lutfen yeni bir sifre giriniz.");
		}
		
		scan.close();
		
	}

}

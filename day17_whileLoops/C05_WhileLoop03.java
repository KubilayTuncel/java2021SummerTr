package day17_whileLoops;

import java.util.Scanner;

public class C05_WhileLoop03 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan baslangic ve bitis haflerini alin ve baslangic harfinden baslayip
		 *  bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin.
		 *  Kullanicinin hata yapmadigini farz edin.
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen baslangic harfi giriniz:");
		
		char basHarf=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lutfen bitis harfini giriniz: ");
		
		char sonHarf=scan.next().toUpperCase().charAt(0);
		
		char harf=basHarf;
		
		while (harf<=sonHarf) {
			
			System.out.print(harf+" ");
			harf+=1;
			
		}
		scan.close();
		
	}

}

package day10_stringManipulations;

import java.util.Scanner;

public class C4_StringManipulation04 {

	public static void main(String[] args) {
		/*
		 * Soru 2) Kullanicidan bir cumle ve bir kelime isteyin,
		 *  kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
 			- Girilen kelime cumlede kullanilmamis.
 			- Girilen kelime cumlede 1 kere kullanilmis.
 			- Girilen kelime cumlede 1’den fazla kullanilmis.

		 */
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bi cumle giriniz:");
		
		String cumle=scan.nextLine().toLowerCase();
	
		System.out.println("Lutfen bi kelime giriniz:");
		
		String kelime=scan.next().toLowerCase();
		
		int ilkkullanimIndexi=cumle.indexOf(kelime);
		int sonKullanimIndexi=cumle.lastIndexOf(kelime);
		
		System.out.println(ilkkullanimIndexi);
		System.out.println(sonKullanimIndexi);
		
		if (ilkkullanimIndexi==-1) {
			System.out.println("girilen kelime cumle de kullanilmamis");
		}else if (ilkkullanimIndexi==sonKullanimIndexi)  {
			System.out.println("girilen kelime cumlede bir kere kullanilmis");
		}else {
			System.out.println("kelime cumlede birden fazla kullanilmis");
		}
		
		scan.close();
		
	}

}

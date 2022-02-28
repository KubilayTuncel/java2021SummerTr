package day10_stringManipulations;

import java.util.Scanner;

public class C5_StringManipulation05 {

	public static void main(String[] args) {
		 /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
           - Girilen kelime cumlede kullanilmamis.
           - Girilen kelime cumlede 1 kere kullanilmis.
           - Girilen kelime cumlede 1’den fazla kullanilmis.
        */
       
       Scanner scan=new Scanner(System.in);
       System.out.println("Lutfen bir cumle giriniz");
       String cumle=scan.nextLine().toLowerCase();
       System.out.println("Lutfen bir kelime giriniz...");
       String kelime=scan.next().toLowerCase();
       
       int ilkKullanimIndexi= cumle.indexOf(kelime); // 0
       int sonKullanimIndexi=cumle.lastIndexOf(kelime); // 16
       
       System.out.println(ilkKullanimIndexi);
		System.out.println(sonKullanimIndexi);
       
       if (ilkKullanimIndexi==-1) {
           System.out.println("Girilen kelime cumlede kullanilmamis.");
       } else if (ilkKullanimIndexi==sonKullanimIndexi) {
           System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
       } else {
           System.out.println("Girilen kelime cumlede birden fazla kullanilmis.");
       }
           
       scan.close();

	}

}

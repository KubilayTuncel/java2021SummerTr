package day11_stringManipulations;

import java.util.Scanner;

public class C01_StringManipulation01 {

	public static void main(String[] args) {
		 /*
        Soru 2) Kullanicidan bir cumle ve bir kelime isteyin, 
        kelimenin cumlede kullanilip kullanilmadigina bakiniz.
		  */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		System.out.println("Lutfen bir kelime giriniz");
		
		String kelime=scan.next().toLowerCase();
		
		if (cumle.indexOf(kelime)!=-1) { //indexof kullamilirsa bi esitlik yapilmasi gerekir
			
			System.out.println("Cumlede bu kelime kullanilmis");
			
		}else {
			
			System.out.println("Kelime cumlede kullanilmamis");
			
		}
		
		if (cumle.contains(kelime)) { //contains kullanildigi icin direk bo
			
			System.out.println("cumlede bu kelime kullanilmis");
			
		}else {
			System.out.println("Kelime cumlede kullanilmamis");
		}
		
		scan.close();
		
	}

}

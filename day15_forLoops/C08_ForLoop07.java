package day15_forLoops;

import java.util.Scanner;

public class C08_ForLoop07 {

	public static void main(String[] args) {
		// Soru 8 ) Interview Question Kullanicidan bir String isteyin 
		//ve Stringi tersine ceviren bir program yazin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen bir cumle giriniz:");
		
		String cumle=scan.nextLine();
		
		int uz=cumle.length();
		
		for (int i=0;i<uz;i++) {
			
		cumle+=cumle.substring(uz-i-1,uz-i);
		
			
		}
		
		System.out.println(cumle);
		
		scan.close();
		
	}

}

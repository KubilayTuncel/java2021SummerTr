package day15_forLoops;

import java.util.Scanner;

public class C07_ForLoop06 {

	public static void main(String[] args) {
		// Soru 7 ) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir kelime giriniz:");
		
		String kelime=scan.nextLine();
		
		int uz=kelime.length();
		
		for (int i=0;i<uz;i++) {
			
			System.out.print(kelime.substring(uz-1-i,uz-i));
			
		}
		scan.close();
	}

}

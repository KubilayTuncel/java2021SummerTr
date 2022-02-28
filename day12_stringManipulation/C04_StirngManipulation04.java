package day12_stringManipulation;

import java.util.Scanner;

public class C04_StirngManipulation04 {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.
		//4 harften uzun ve ya kisa ise "Lutfen 4 harfli bir kelime giriniz." yazdirin
		//eger dogru girdiyse kelimeyi tersten yazdirin

		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		
		String kelime=scan.nextLine();
		
		if (kelime.length()!=4) {
		System.out.println("Lutfen 4 harfli bir kelime giriniz");
		}else {
			
			System.out.println(kelime.substring(3,4)+ kelime.substring(2,3)+
					kelime.substring(1,2)+kelime.substring(0,1));
			
		}
		
		scan.close();
	}

}

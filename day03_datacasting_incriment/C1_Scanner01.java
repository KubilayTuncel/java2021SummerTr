package day03_datacasting_incriment;

import java.util.Scanner;

public class C1_Scanner01 {

	public static void main(String[] args) {
		
		
		/* Soru 5) Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
		 Isminiz : Mehmet
		 Soyisminiz : Bulut
		 Kursumuza katiliminiz alinmistir,tesekkur ederiz
		 */
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen isminizi ve soyisminizi yaziniz, \nisminizi yazdiktan sonra ENTE'a basiniz");
		
		//  syso icinden alt satira gecmek istedigimizde \n yazariz.
		//  \n den sonra bosluk birakirsak ikinci satirin basinda bosluk olur
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		//next()sadece ilk kelimeyi alir, girilen deger daha uzunsa ilk kelimeden sonrasini alir
		//nextLine() ise o satirin sonuna kadar girilen tum degerleri alir
		
		System.out.println("Isminiz : " + name + "\nSoyisminiz : " + surname + "\nKursumuza katiliminiz alinmistir,tesekkur ederiz");
		
		scan.close();
		
		
		
	}

}
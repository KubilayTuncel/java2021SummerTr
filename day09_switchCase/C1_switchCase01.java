package day09_switchCase;

import java.util.Scanner;

public class C1_switchCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini
		// yazdirin

		Scanner scan = new Scanner(System.in);

		System.out.println("Lutfen haftanin kacinci gununde oldugunu yaziniz");

		int gun = scan.nextInt();

		switch (gun) {
		case 1:
			System.out.println("pazartesi");
			break;
		case 2:
			System.out.println("sali");
			break;
		case 3:
			System.out.println("carsamba");
			break;
		case 4:
			System.out.println("Persembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;
		default:
			System.out.println("Girdiginiz sayi gun icermemekte");
		}
		
		scan.close();
	}

}

package day08_ternaryOperator;

import java.util.Scanner;

public class C7_NestedTernary {

	public static void main(String[] args) {
		// Soru4 ) Kullanicidan dikdortgenin uzunlugunu ve genisligini alin,
		//girilen degerlere  gore dikdorgenin kare olup olmadigini yazdirin.

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin uzun kenarini giriniz:");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin kisa kenarini giriniz:");
		
		double kenar2=scan.nextDouble();
		
		System.out.println(kenar1<=0 || kenar2<=0 ? "Lutfen gecerli uzunluk giriniz" 
				: kenar1==kenar2 ? "Kare" : "Kare degil");
		
		scan.close();
	}

}

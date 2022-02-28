package day06_relationalOperators_ifstatements;

import java.util.Scanner;

public class C3_ifStatements02 {

	public static void main(String[] args) {
		
		//Kullanicidan bir tamsayi isteyin ve sayinin tek ve ya cift oldugunu yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz");
		
		int girSayi=scan.nextInt();
		
		if (girSayi%2==0) {
			
			System.out.println("Girdiginiz sayi cift sayi");
		}
		
		if (girSayi%2==1) {
			
			System.out.println("Girdiginiz sayi tek sayi");
		}
		
		
		if (girSayi<0) {
			
			System.out.println("Lutfen pozitif sayi giriniz");
		}
		scan.close();
	}

}

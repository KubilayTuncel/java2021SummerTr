package day07_ifElseStatements;

import java.util.Scanner;

public class C2_ifElse01 {

	public static void main(String[] args) {
	
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdorgenin kenarlarini giriniz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girdiginiz dikdortgen kare");
		} else {
			System.out.println("Girdiginiz dikdortgen kare degil");
		}
		
		scan.close();

	}

}

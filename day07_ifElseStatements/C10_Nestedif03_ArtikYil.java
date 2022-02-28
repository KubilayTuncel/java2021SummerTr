package day07_ifElseStatements;

import java.util.Scanner;

public class C10_Nestedif03_ArtikYil {

	public static void main(String[] args) {
		// artik yil sorusu
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yili giriniz");
		
		int yil=scan.nextInt();
		
		if (yil%400!=0) {
			if (yil%100!=0) {
				if(yil%4==0) {
					System.out.println("Girdiginiz yil artik yildir");
				}else {
					System.out.println("Girdiginiz yil artik yil degildir");
				}
			}else {
				System.out.println("Girdiginiz yil artik yil degildir");
			}
		}else {
			System.out.println("Girdiginiz yil artik yildir");
		}
		
		scan.close();
	}

}

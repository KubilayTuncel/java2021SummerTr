package day07_ifElseStatements;

import java.util.Scanner;

public class C4_ifElse03 {

	public static void main(String[] args) {
		// Soru 3) Kullaniciya yasini sorun, 
		//eger yas 65’den kucuk ise “emekli olamazsin, calismalisin”,
		//65’den buyukse “Emekli olabilirsin” yazdirin

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen yasinizi giriniz:");
		
		double yas=scan.nextDouble();
		
		if (yas<=65) {
			
			System.out.println("emekli olamazsin, calismalisin");
		}else {
			
			System.out.println("Emekli olabilirsin");
		}
			
			
		scan.close();
		
	}

}

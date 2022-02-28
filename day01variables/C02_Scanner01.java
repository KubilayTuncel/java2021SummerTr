package day01variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		
		System.out.println("Lütfen isminizi giriniz");

		String kullanicininIsmi= scan.nextLine();
		
		System.out.println("Lutfen soyadinizi giriniz");
		String kullanicininIsmi2=scan.nextLine();
		
		System.out.println("Girdiginiz isim : "+kullanicininIsmi);
		
		System.out.println("Girdiginiz soyad : "+kullanicininIsmi2);
		
		scan.close();
	}

}

package day39_exceptions;

import java.util.Scanner;

public class Exceptions05 {

	public static void main(String[] args) {
		/*
		 * kullanicidan carpma yapmak icin bir String isteyin
		 * kullanicinin girdigi String sadece sayilardan olusuyorsa sayiyi 2 ile carparak sonucu yazdirin.
		 * Kullanici sayilardan olusmayan bir String girerse 
		 * Girdiginiz String sayiya cevrilemez yazdirin.
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen 2 ile carpmak icin bir String girin ");
		
		String str=scanner.nextLine();
		
		try {
			System.out.println(2*Integer.parseInt(str));
		} catch (NumberFormatException e) {
			System.out.println("Girdiginiz String sayiya cevrilemez.");
		}
		scanner.close();
	}

}

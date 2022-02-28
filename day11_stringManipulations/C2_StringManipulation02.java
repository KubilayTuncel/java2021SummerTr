package day11_stringManipulations;

import java.util.Scanner;

public class C2_StringManipulation02 {

	public static void main(String[] args) {
		/*Soru 1) Kullanicidan email adresini girmesini isteyin, mail @gmail.com iceriyorsa   
		 * “Email adresiniz kaydedildi”, icermiyorsa “Lutfen gmail mail adresinizi giriniz.. “ yazdirin
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen gmail adresinizi girin");
		
		String mail=scan.nextLine();
		
		if (mail.contains("@gmail.com")) {
			
			System.out.println("Mail adresiniz kaydedildi");
			
		}else {
			
			System.out.println("Lutfen gmail adresinizi giriniz.");
			
		}
		
		scan.close();

	}

}

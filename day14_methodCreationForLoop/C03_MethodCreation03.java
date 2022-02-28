package day14_methodCreationForLoop;

import java.util.Scanner;

public class C03_MethodCreation03 {

	public static void main(String[] args) {
		/*Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre 
		 - @ isareti icermiyorsa gecersiz email yazdirin
		 - @gmail.com icermiyorsa “lutfen gmail adresinizi girin” yazdirin
		 - @gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
		 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen E-mail adresinizi giriniz");
		
		String email=scan.nextLine();
		
		emailKontrol(email);
		
		scan.close();
		
	}

	public static void emailKontrol(String email) {

		if (!email.contains("@")) {
			
			System.out.println("gecersiz mail");
			
		}else if (!email.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi giriniz");
		}else if (!email.endsWith("@gmail.com")) {
			System.out.println("YAzimda bir sorun var, maili kontrol ediniz");
		}else {
			System.out.println("Email adresiniz basariyla kaydedildi.");
		}
		
		
	}

}

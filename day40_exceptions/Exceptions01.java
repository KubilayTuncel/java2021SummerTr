package day40_exceptions;

import java.util.Scanner;

public class Exceptions01 {

	public static void main(String[] args) {
		// kullanicidan yasini girmesini isteyiniz. 
		//Kodunuzu kullanici sifirdan kucuk bir sayi girerse Exception verecek sekilde yaziniz
		
		/*Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz : ");
		int yas=scanner.nextInt();
		
		if (yas>=0) {
			System.out.println("Girdiginiz yas : "+yas);
		}else {
			throw new IllegalArgumentException();
		}
		*/

		//bu sekilde yazdigimizda Java exception throw eder ama
		//kodumuz bloke olmus olur
		//bloke olmasini engellemek isterseniz kodu try catch ile surround yapabiliriz

		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen yasinizi giriniz : ");
		int yas=scanner.nextInt();
		try {
			
		
		if (yas>=0) {
			System.out.println("Girdiginiz yas : "+yas);
		}else {
			throw new IllegalArgumentException();
		}
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		System.out.println("Kod bloke olmamis.");
	}

}

package day08_ternaryOperator;

import java.util.Scanner;

public class C5_Ternary03 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayinin mutlak degerini yazdirin.
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz:");
		
		double sayi=scan.nextDouble();
		
				
		System.out.println(sayi>=0 ? sayi : sayi*(-1));
		
		scan.close();
	}

}

package day18_doWhileLoopScope;

import java.util.Scanner;

public class C03_DoWhileLoop02 {

	public static void main(String[] args) {
		/*
		 * Soru 3) Kullanicidan toplamak uzere pozitif sayilar isteyin, 
		 * islemi bitirmek icin 0’a basmasini soyleyin.
 		 *Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini 
 		 *ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
 		 *Kullanici negatif sayi girerse ignore edin.
		 */

		Scanner scan=new Scanner(System.in);
		
		
		
		double sayi=1;
		int sayac=0;
		double toplam=0;
		
		//do while loop ta 1 dongu kazaniyoruz while loop a gore.
		
		do {
			System.out.println("Lutfen istediginiz kadar sayi giriniz:"
					+ "\nislemi bitirmek icin 0'a basiniz.");
			sayi=scan.nextDouble();
			
			if (sayi>0) {
				
			 toplam+=sayi;
			 sayac++;
				
			}else if (sayi<0) {
				
				System.out.println("pozitif sayi girmeliydiniz"
						+"\nbu sayi negatif oldugu icin yok sayiyorum");
				
			}
			
			
		}while (sayi!=0.0);
		System.out.println("Girdiginiz sayilardan " + sayac + " tanesi pozitifti"
				+"\nGirdiginiz sayilarin toplami: "+toplam);
		
		scan.close();
		
	}

}

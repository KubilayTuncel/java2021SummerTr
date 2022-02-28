package day04_increment_matematiksel_islemler;

public class C4_modulus {

	public static void main(String[] args) {
		
		//bir sayinin rakamlar toplamini bulmak icin her basamak degerinde 3 islem yapariz.
		
		int sayi=5496;
		
		int rakamlartoplami=0;
		
		
		//1- sayi%10 ile son basamagi elde ederiz
		
		int rakam= sayi%10;
		
		//2 bu rakami rakamlar toplamina ekleriz
		
		rakamlartoplami+=rakam;
		
		//3- degerini aldigimiy son basamaktan kurtulmak icin sayiyi 10'a boleriz
		
		sayi/=10;
		
		//bu satira geldigimizde sayi=549 , rakamlar toplami = 6
		
		rakam=sayi%10;
		
		rakamlartoplami+=rakam;
		
		sayi/=10;
		//sayi=54 rakamlar toplami=15
		
		rakam=sayi%10;
		
		rakamlartoplami+=rakam;
		
		sayi/=10;
		
		//sayi=5 rakamlar toplami=19
		
		rakam=sayi%10;
		
		rakamlartoplami+=rakam;
		
		System.out.println("rakamlar toplami : " + rakamlartoplami);
		

	}

}

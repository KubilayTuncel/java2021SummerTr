package day04_increment_matematiksel_islemler;

public class C1_incerementDecrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		sayi1-=5;
		sayi2+=10;
		
		System.out.println(sayi2 / sayi1); // 6
		
		sayi1*=2;
		sayi2++;
		
		System.out.println(sayi2 / sayi1); // 3
		
		sayi1 /=2;
		
		double sayi3= sayi2/10;   //burada sayi ilk int olarak hesaplar ve double atar. Bu yuzden sonuc 3.1 degil 3 olur 
		
		System.out.println(sayi1 * sayi2); //155
		
		System.out.println(sayi1 * sayi3); //15.0
		
		sayi3= (double) sayi2/10;  // Burada ise sayinin sonucunu double olarak direk hesaplar ve sonuc 3.1 cikar.
								   // Ve burada gecici olarak sayi2 yi double yapar. ama double terimini basa yazarsak kalici yapar.
		
		System.out.println(sayi3);        //3.1
		

	}

}

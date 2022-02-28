package day36_inheritance;

public class C02_Memur extends C02_Personel {
	
	public int maas;

	public C02_Memur() {
		super(); //Parent class taki Parametresiz cons. a goturuyor. Super Keyword goturdu.
		
		System.out.println("Child Class parametresiz cons. calisti.");
	}



	/*
	 * Inheritance da bir cons. olusturdugumuzda java'nin otomatik olarak cons. a koydugu super() keyword onemlidir.
	 * Super() keyword default cons. gibidir. Biz gormesekte calisir, ancak yerine baska bir keyword yazarsak etkisiz hale gelir.
	 * extends varsa yerine birsey yazmadikca super() calisir.
	 */

	public C02_Memur( int maas) {
		super("ali",6000);

		System.out.println("Child Class parametli cons. calisti.");
	}



	public static void main(String[] args) {

		C02_Memur obj1=new C02_Memur(2400);

	}




}

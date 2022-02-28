package day36_inheritance;

public class C02_Personel {
	
	public String isim;
	public int sayi;

	public C02_Personel(String isim, int sayi) { //parametreli cons. olusturdum.
		// super();
		/*javadan yardim alarak bir cons. olusturdugumuzda java cons. ilk satirina super keyword unu ekler. eger icinde oldugumuz class 
		 * bir child class degilse super(); keqword u silinebilir. bugune kadar biz olsuturdugumuz cons. da super(); keyword kullanmadik.
		 * ancak bizim classlarimiz scild class olmadigindan sorun olmadi 
		 */
		System.out.println("Personel parametli cons. calisti.");

	}

	public C02_Personel() { //parametresiz cons. olusturdum.
		// super();
		
		System.out.println("Personel parametresiz cons. calisti.");
	}
	

	

	/*
	 * her class default constructor'a sahiptir.
	 * DEfault constructor'in parametresi yoktur.
	 * Biz parametreli ve ya parametresiz bir cons. olusturdugumuzda default cons. silinir.
	 * Eger biz sadece 1 tane parametreli cons. olusturursak, Java default olani soldigi icin
	 * parametresiz cons. kalmaz.
	 * Dolasiyla parametreli bir cons. olusturdugumuzda mutlaka default cons. yerine parametresiz bir cons. olusturmamiz gerekir.
	 */
	
}

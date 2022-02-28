package day37_inheritanceOverriding;

public class C02_GeciciIsci extends C02_Isci {
	
	public String calistigiBolum="Yemekhane";

	public static void main(String[] args) {
		
		//Overriding 
		//bir child Class da parent class dan miras alinan method'u degistirmeye overriding denir
		
		C02_GeciciIsci gi1=new C02_GeciciIsci();
		System.out.println(gi1.maasHesapla());
		gi1.mesai();
		
	}
	
	
	//overriding yapmak icin parent class'daki method signuteru'i ile child class'da bir method olusturulur.
	//signuture ayni oldugundan sadece body degisir.
	//boylece parent class'daki method child class icin gecersiz hale gelir
	public int maasHesapla() {
		
		return 30*8*10;
	}
    //@Override //annotation
	public void mesai() {
		//super.mesai();
		
		System.out.println("Gecici isciler haftalik 25 saat calisir");
		
	}
	//annotation : aciklama, dipnot
	//java 26 satirda kodu inceleyenler icin bir aciklama getiriyor
	//annotation olmasi ile olmamasi arasindaki fark
    //override yaptigimiz method'u surekli kontrol eder ve parent class'daki
	//ovveridden method signiture'si degistirilirse CTE verir.
	
	//eger override edilen parent class'daki method 'un da calismasini da istiyorsak,
	//Overriding method'un ilk satirina super. Overriding methodismi yazilir.
	//eger  overriding method'da super. yazilmazsa overriden method calismaz
	
	//return type
	//eger overriden method'un returm type'i primitive ve ya void ise
	//overriding method'un da ayni olmali
	//eger return type primitive degilse
	//(overriding method'un return type'i) IS-A (overidden method'un returm type-i) olmalidir. Yani kapsamali parent taki
}

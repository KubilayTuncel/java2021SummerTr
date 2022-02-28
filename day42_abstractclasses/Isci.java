package day42_abstractclasses;

public class Isci extends Personel{

	public static void main(String[] args) {
	
		Isci isci1=new Isci();
		
		isci1.maasHesapla(); // Iscilerin maasi 5000 tl'dir.
		isci1.mesaiBilgisi(); //Isciler gunluk 8 saat calisir.
		isci1.isim="Kazim"; //abstract parent class'daki variable'lari istersem kullanabilirim.
		System.out.println(isci1.isim);
		isci1.ozelSigorta(); //abstract parent class daki concrete method'u istersem kullanabilirim.
		
	}
	@Override
	public void maasHesapla() {
		// parent class daki abstract methodlari implement (uyarlama) etti
		//parent class daki method da body olmadigi icin onu kullanmanin anlami yok
		//biz child class'da body olan method (concrete) kullanip islem yapmaliyiz
		
		System.out.println("Iscilerin maasi 5000 tl'dir.");
		
	}

	@Override
	public void mesaiBilgisi() {
		System.out.println("Isciler gunluk 8 saat calisir.");
		
	}

}

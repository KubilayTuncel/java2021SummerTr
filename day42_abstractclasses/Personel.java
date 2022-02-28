package day42_abstractclasses;

public abstract class Personel {

	//bir class i abstract yapmak icin class keyword'unden once abstract yazmak yeterlidir
	//abstract bi class'in icerisinde variable olabilir
	//variable lar abstract olmaz
	//abstrackt class in tum concrete child'lari abstract class'daki tum dinamik ozellikleri yani methodlari override etmek zorundadir
	//bir method abstract olur
	//Bir abstract class concrete method yazilabilir
	public String isim;
	public int maas;
	public abstract void maasHesapla();
	public abstract void mesaiBilgisi();
	
	public void ozelSigorta() {
		System.out.println("Bu personel ozel sigorta kapsamindadir.");
	}

}

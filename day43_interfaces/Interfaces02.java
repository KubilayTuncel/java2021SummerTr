package day43_interfaces;

public interface Interfaces02 {
	//Soru : Buradaki default ve static bizim bildigimiz default ve static mi?
	//cevap : Hayir
	default void deneme() {
		System.out.println("default keyword'li method calisti.");
	}
	
	//bizim bildigimiz default acces modifier'di
	//bir method'da birden fazla access modifier olur mu?
	//bizim interfaces'de olusturdugumuz tum method'lar public'tir
	//interfaces'de default keyword kullanrak concrete method olusturabiliriz
	//buradaki default keyword'u access modifier degil
	//Java'nin ozel bir cozumudur.
	//BUradaki default keyword basina yazildigi method'un concrete oldugunu belirtir
	static void denem2 () {
		System.out.println("static keyword'li method calisti.");
	}

	//yukarida yazdigimiz tum bilgiler static keyword u icinde gecerlidir
	
	//static ve default keyword'u kullanilarak olusturdugumuz method'lar override edilmek ZORUNDA DEGILDIR.
}

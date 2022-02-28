package day43_interfaces;

public interface Interfaces01 {
	
	public void motor(); //interface icinde abstract method'lar ve OZEL concrete method'lar olabilir.

	/*
	 * Bir abstract method'un body'si olmadigindan o method'un istenen dinamik ozelligi
	 * nasil gerceklestirecegini bilmemiz mumkun degildir.
	 * sadece ne yapacagimizi biliriz
	 * 
	 * bu method bize sunu anlatir :
	 * Beni inherit eden her concrete class'in dinamik motor ozelligi olmalidir.
	 */
	void vites(); //beni inherit eden her concrete class'in dinamik vites ozelligi olmalidir
	abstract void kasa(); //beni inherit eden her concrete class'in dinamik kasa ozelligi olmalidir
	
	//interface'de sadece ABSTRACT, PUBLIC method'lar olur
	//bu iki keyword'u yazsak da yazmasak da Java tum methodlari bu sekilde kabul eder.
	
	String ISIM ="kubilay"; //Java isim kelimesini italik ve bold yapti
							//Demek ki tum veriable'lar final ve static'tir. 
}



package day05_Wrapper_Cocatenation;

public class C2_Concatenation {

	public static void main(String[] args) {
		
		String str1="Hello";
		String str2="World";
		int sayi1=3;
		int sayi2=4;
		
		
		// kesinlikle sayi ve harf yazmadan, sadece veriable isimlerini kullanarak
		
		//Hello1 yazdirin
		
		System.out.println(str1+(sayi2-sayi1));
		
		//Hello 5 World
		
		System.out.println(str1+" "+(sayi1+(sayi2/2))+" "+ str2);
		
		//Hello 34
		
		System.out.println(str1+ " "+sayi1+sayi2);
		
		//7World
		
		System.out.println(sayi1+sayi2+str2);
		
		//34
		
		System.out.println(sayi1+""+sayi2); //data turu String'tir.
		
		//int'i String'e cevirmek icin method a ihtiyac yok, ama istersek kullanabiliriz.
		
		String intdanCeviren=""+sayi1; // bu yontem method kullanmadan int'i String'e cevirir.
		
		
		
	}

}

package day03_datacasting_incriment;

public class C4_DataCasting02 {

	public static void main(String[] args) {
		
		double sayi1 = 200.14;
		
		int sayi2 = (int)sayi1;
		
		System.out.println("double degisken : "+ sayi1);
		
		System.out.println("int degisken : "+ sayi2);
		
		
		//Java'da explicit narrowing yapilirken data kayiplari olabilir. 
		
		byte sayi3 = (byte) sayi2;
       
		System.out.println("byte degisken : "+ sayi3);
		
		
		// hatta data kucuk data turune uymasi icin degistirebilir
		
		int sayi4 = 95;
		
		int sayi5 = 5;
		
		System.out.println("bolme sonucu : "+ sayi4/sayi5);
		
		//bolunen sayi ve bolen sayi ikisi de int ise java sonucu int olarak verir.
		
		double sayi6=2000;
		
		System.out.println(sayi6/sayi5);
		
		
		double sayi7=5;
		
		System.out.println(sayi4/sayi7);
		
		
		
	}

}

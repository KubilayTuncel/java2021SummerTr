package day38_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// try catch blogundaki e nin gorevi
		int sayi1=10;
		int sayi2=0;
		System.out.println(sayi1/sayi2);
		try {
			System.out.println("bolme isleminin sonucu : " + sayi1 / sayi2);
		} catch (ArithmeticException e) {
			//ArithmeticException java'da bir class ve e objesi icin data turu
			//e ise ArithmeticException class'indan olusturdugumuz objenin adi
			//o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir
			e.printStackTrace(); //hatanin tamamini yazdirir.
			e.getMessage(); //hatanin sebebini yazdirir
			
			System.out.println("sayiyi sifir a bolunemez");
		}

	}

}

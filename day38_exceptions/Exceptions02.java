package day38_exceptions;

import java.util.Scanner;

public class Exceptions02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int count = 0;

		while (count <= 100) {

			System.out.println("Lutfen bolunecek sayiyi giriniz: ");

			int sayi1 = scanner.nextInt();
			System.out.println("Lutfen bolecek sayiyi giriniz: ");

			int sayi2 = scanner.nextInt();

			count++;

			// java exception'i handle etmek icin bir cozum uretmezsek
			// java exception ile karsilastirdiginda calismayi durdurur(stops executaion)
			// throws exception (exception firlatir) (problemin kaynagini bize gosterir)
			// tum aplication durmus olur
			// musterinin kullandigi bir uygulama icin KABUL EDILEMEZ
			// Bunun icin kod yazan kisi muhtemel sorunlari ongormeli ve
			// java'ya bu sorunla handle edebilmesi icin yol gostermelidir.

			try {
				System.out.println("bolme isleminin sonucu : " + sayi1 / sayi2);
			} catch (ArithmeticException e) {
				//ArithmeticException java'da bir class ve e objesi icin data turu
				//e ise ArithmeticException class'indan olusturdugumuz objenin adi
				//o zaman ismi e olmak zorunda degiliz ama genelde e kullanilir
				e.printStackTrace();
				
				System.out.println("sayiyi sifir a bolunemez");
			}
		}

		scanner.close();
	}

}

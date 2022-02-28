package day19_arrays;

import java.util.Arrays;

public class C01_Arrays01 {

	public static void main(String[] args) {

		short arr1[] = new short[5];
		// arr1 bir array , data turu non-primitive
		// short array'in degil icine koyacagimiz degerlerin data turu
		// eger non-primitive bir datayi direk syso ile yazdirmaya calisirsaniz
		// java arr1'in referans bilgisini yazdirir

		// diger olusrutma sekli

		short arr2[] = { 1, 2, 3 };

		// Soru 1: Elemanlari “Ali” , “Veli”, “Ayse” ve “Fatma” olan
		// bir array olusturun ve bu array’i yazdirin.

		// 1. yontem olusturup, sonra istedigim indexlere deger atiyorum.
		String isimler[] = new String[4];

		isimler[0] = "Ali";
		isimler[1] = "Veli";
		isimler[2] = "Ayse";
		isimler[3] = "Fatma";

		// 2. yontem olustururken atama yapilabilir.

		String isimler2[] = { "Ali", "Veli", "Ayse", "Fatma" };

		isimler[1] = "Hasan";
		// isimler[5]="Hakan"; //java 5.index var mi yok mu bilmiyor.
		// syntax acisindan sorun olmadigi CTE vermiyor
		// ama run ettigimizde 5.index'i bulamadigi icin hata (RTE) verir.
		System.out.println(isimler.length); // 4
		System.out.println(isimler[3]); // Fatma
		System.out.println(isimler2[1]); // Veli

		// tum elemanlari yazdirma
		// 1. yol Loop kullanma
		// sadece degerleri yazdirmis oluruz
		for (int i = 0; i < isimler2.length; i++) {

			System.out.print(isimler2[i] + " ");

		}
		System.out.println("");

		// 2.yol Arrays class'in dan yardim alabiliriz

		System.out.println(Arrays.toString(isimler));

	}

}

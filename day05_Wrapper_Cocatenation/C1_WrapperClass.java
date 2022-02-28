package day05_Wrapper_Cocatenation;

public class C1_WrapperClass {

	public static void main(String[] args) {

		String isim = "Kubilay";
		int sayi = 10;

		// isim. dedigimizde bircok method listeleniyor, Cunku isim veriable data turu
		// String
		// ve String non-primitive dir.
		// non-primitivlerde degerin yaninda method'lar vardir.
		// sayi. veriable'nin data turu int
		// ve int primitive dir.
		// primitive data turleri sadece value'ya sahiptirler methodlari yoktur.

		// Java primitive data turleri icin de method'larin kullanilabilmesi icin
		// her primitive data turleri icin bir WRAPPER CLASS olusturmustur.

		Integer sayi2 = 10;
		System.out.println(sayi2.MAX_VALUE); // int'in alabilecegi max deger 2147483647
		System.out.println(sayi2.MIN_VALUE); // int#in alabilecegi min deger -2147483647

		// short'un min ve max degerlerini yazdirin

		Short sayi3 = 10;

		System.out.println(sayi3.MAX_VALUE); // 32767

		System.out.println(sayi3.MIN_VALUE); // -32767

		// Wrapper Class kullanimina bir ornek verelim.

		String okulNo = "858";

		// Eger String bir variable sadece sayilardan olusuyorsa, bu String'i int'a
		// cevirebiliriz

		int okulNoSayiOlarak = Integer.parseInt(okulNo);

		// System.out.println(okulNo++); okulNo String olarak tanimlandigi icin
		// matematiksel islem yapilamaz.

		System.out.println(++okulNoSayiOlarak);

		Character basHarf = 'a';
		System.out.println(Character.hashCode('a'));

	}

}

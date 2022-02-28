package day50_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda04 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<>(Arrays.asList("Ali","Ali","Aysima","Abdurrahman","Mehmet","Mustafa","Bedirhan","Yüksel","Süleyman"));

		yazdirBuyuk1(l);
		System.out.println();
		siraliYazdir(l);
		System.out.println();
		farkliSonHarfSirala(l);
		System.out.println();
		uzunlukSiralaIlkEleman(l);
		System.out.println();
		yazdirAileBaslayanlari(l);
		System.out.println();
		yazdirAileBaslayanlariveyaIileBitenler(l);
		System.out.println();
		büyütSirala(l);
		System.out.println();
		isimUzunlukSirala(l);
		System.out.println();
		dokuzuncuSoru(l);
		System.out.println();
		onuncuSoru(l);
		System.out.println();
		sondanIkinciSiralaIlk(l);
		System.out.println();
		tertenSiralaIlkYazdir(l);
	}

	//1)List in elemanlarini buyuk harfle yazdir
	public static void yazdirBuyuk1(List<String> l) {
		l.stream().map(t->t.toUpperCase()).forEach(methodLambda02::bosluklaYazdir);
		System.out.println();
		l.stream().map(String::toUpperCase).forEach(methodLambda02::bosluklaYazdir);
		
	}
	//2)Elemanlari uznluklarina gore sirala ve yazdir
	public static void siraliYazdir(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).forEach(methodLambda02::bosluklaYazdir);
		System.out.println();
		l.stream().sorted(Comparator.comparing(String::length).reversed()).forEach(methodLambda02::bosluklaYazdir);
	}
	//3) farklı elemanlarını son harflerine göre sıralayıp yazdır
	public static void farkliSonHarfSirala(List<String> l) {
		l.stream().sorted(Comparator.comparing(t->t.substring(t.length()-1))).forEach(methodLambda02::bosluklaYazdir);
		
	}
	//4) Elemanları uzunluklarına ve ardından (aynı uzunlukta olanları) ilk karakterlerine göre sıralamak için bir yöntem oluşturun
	public static void uzunlukSiralaIlkEleman(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.substring(0,1))).forEach(methodLambda02::bosluklaYazdir);
	}
	//5)Büyük harflerle, "A" ile başlayan liste öğelerini yazdırmak için bir yöntem oluşturun
	public static void yazdirAileBaslayanlari(List<String> l) {
		l.stream().filter(t->t.startsWith("A")).map(String::toUpperCase).sorted().forEach(methodLambda02::bosluklaYazdir);
		
	}
	//6)  Küçük harflerle, "A" ile başlayan veya "i" ile biten liste öğelerini yazdırmak için bir yöntem oluşturun   
	public  static void yazdirAileBaslayanlariveyaIileBitenler(List<String> l) {
		l.stream().map(String::toLowerCase).filter(t->t.startsWith("a")|| t.endsWith("i")).sorted().forEach(methodLambda02::bosluklaYazdir);
		
	}
	//7) Öğeleri uzunluklarına göre sıraladıktan sonra büyük harflerle yazdırmak için bir yöntem oluşturun
	public static void büyütSirala(List<String> l) {
		l.stream().map(String::toUpperCase).sorted(Comparator.comparing(String::length)).forEach(methodLambda02::bosluklaYazdir);
		
	}
	//8) Elemanları uzunluklarına göre sıralayın önce elemanı sonra uzunluğunu yazdırın

	public static void isimUzunlukSirala(List<String> l) {
		l.stream().sorted(Comparator.comparing(String::length)).map(t->t+": "+t.length()).forEach(methodLambda02::bosluklaYazdir);
		
	}
	//9) Her elemanın uzunluğunun karesini alıp tekrarlıları sil, bunların 20'den büyük olanlarını ters sırada  yazdırın


	public static void dokuzuncuSoru(List<String> l) {
		l.stream().map(t->t.length()*t.length()).distinct().filter(t->t>20).sorted(Comparator.reverseOrder()).forEach(methodLambda02::bosluklaYazdir);
		
	}
	//10) Tüm elemanların uzunluklarının 12'den az olup olmadığını kontrol etmek için bir metod oluşturun
	//bütün elemanların "x" ile başlamadığını kontrol etmek için bir yöntem oluşturun
	//en az 1 tane "R" ile biten eleman olup olmadığını kontrol etmek için bir metod oluşturun.

	public static void onuncuSoru(List<String> l) {
		boolean result1=l.stream().allMatch(t->t.length()<12);
		System.out.println("Elemanlarin uzunluklari 12 den kücük mü? : "+result1);
		boolean result2=l.stream().noneMatch(t->t.startsWith("X"));
		System.out.println("X ile baslayan öge yok : "+result2);
		boolean result3=l.stream().anyMatch(t->t.endsWith("R"));
		System.out.println("herhangi bir tane eleman r ile bitiyor mu? : "+result3);
		
	}
	//11)elemanları sondan 2. elemanlarına göre sıralayıp ilk elemanı yazdır
	public static void sondanIkinciSiralaIlk(List<String> l) {
		System.out.println(l.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-2))).findFirst());
	}
	//12)elemanlari uzunluklarina gore tersten siralayip ilk elemani yazdir

	private static void tertenSiralaIlkYazdir(List<String> l) {
		System.out.println(l.stream().sorted(Comparator.comparing(String::length).reversed()).findFirst());
		//9) Eleman 'A', 'a' ile başlıyor veya 'N', 'n' ile bitiyorsa o elemanı silin
		l.removeIf(t->t.toUpperCase().startsWith("A")||t.toUpperCase().endsWith("N"));
		System.out.println(l);
		
	}
}
	
	

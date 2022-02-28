package day50_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
	/*
	 * lambda( functional programing ) - java ( structured programing ) 1) nasıl
	 * yaparım, ne yaparım - ne yaparımdan çok nasıl yaparım düşünülür 2) kod
	 * kısalığı, kod okunabilirliği ve hatasız - kod genelde uzundur, başkası sizin
	 * kod yazma bakımındna elverişli ne yaptığınızı anlamaybilir 3) lambda sadece
	 * collection larda array lerde kullanılır (map lerde kullanılmaz)
	 * 
	 * 
	 */
	public static void main(String[] args) {

		List<Integer> l = new ArrayList<>(Arrays.asList(14, 9, 13, 4, 9, 2, 4, 14, 15));
		yazdirJava(l);
		System.out.println();
		yazdirLambda(l);
		System.out.println();
		ciftSayiJava(l);
		System.out.println();
		ciftSayiLamda(l);
		System.out.println();
		tekSayiKare(l);
		System.out.println();
		farkliTekKup(l);
		System.out.println();
		ciftSayiKareToplam(l);
		System.out.println();
		tekrarsizCiftKupCarpim(l);
		System.out.println();
		tersDüzSirala(l);

	}



	// 1) list in elemanlarını yanyana yazdır (java- structured)
	public static void yazdirJava(List<Integer> list) {
		for (Integer w : list) {
			System.out.print(w + " ");

		}
	}

	// lambda (functional)
	public static void yazdirLambda(List<Integer> l) {
		l.stream().forEach(t -> System.out.print(t + " "));
	}

	// 2)List in elemanlarından ÇİFT olanları aralarında boşluk bırakarak yazdıran
	// metod oluştur(Structured)
	public static void ciftSayiJava(List<Integer> l) {
		for (Integer each : l) {

			if (each % 2 == 0) {
				System.out.print(each + " ");
			}

		}

	}

	public static void ciftSayiLamda(List<Integer> l) {

		l.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));

	}

	// 3) tek sayilari bulup sayilarin küplerini alan method yazdirin
	public static void tekSayiKare(List<Integer> l) {

		l.stream().filter(t -> t % 2 == 1).map(t -> t * t).forEach(t -> System.out.print(t + " "));
	}

	// 4) Listedeki tekrarlı elemanları silip tek sayı olanların küplerini yazdıran
	// metod oluştur
	public static void farkliTekKup(List<Integer> l) {
		l.stream().distinct().filter(t -> t % 2 == 1).map(t -> t * t * t).forEach(t -> System.out.print(t + " "));
		//distinct method u list teki tekrarli elemanlari almiyor.
		//map degislik yapmak icin kullanilan methodtur

	}
	////5)List'deki tekrarlı elemanları silip çift sayi olanların karelerinin toplamını yazdıran method olustur.

	public static void ciftSayiKareToplam(List<Integer> l) {
		System.out.println(l.stream().distinct().filter(t -> t % 2 == 0).map(t -> t*t).reduce(1, (a, b) -> a * b));
		
	}

	public static void tekrarsizCiftKupCarpim(List<Integer> l) {
		int kup= l.stream().distinct().filter(t->t%2==0).map(t-> t*t*t).reduce(1, (x,y)->x*y);
		System.out.println(kup);
	}
	//7)Listedeki elemanları sıralayarak ve ters sıralayarak yazdır

	public static void tersDüzSirala(List<Integer> l) {
		l.stream().sorted().forEach(t->System.out.print(t+ " ")); 
		//sorted methodu list i kucukten biyige siraladi
		System.out.println();
		l.stream().sorted(Comparator.reverseOrder()).forEach(t->System.out.print(t+ " "));
		
	}

	
}

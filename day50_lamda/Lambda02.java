package day50_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
	public static void main(String[] args) {
		// Method Reference'da bizim oluşturduğumuz metodları  veya Java metodlarını kullanırız.
		        //Method Reference Syntax ı ==> ClassName::MethodName  System.out.println();  ==  System.out::println;
		List<Integer> l= new ArrayList<>(Arrays.asList(15,14,9,13,4,9,2,4,14,6));
		elemanYazdir(l);
		        System.out.println();
		ciftSayiYazdir(l);
		        System.out.println();
		        tekSayiKare(l);
		        System.out.println();
		        tekSayiKupTekrarsiz(l);
		        System.out.println();
		        farkliCiftSayiKareToplam(l);
		        System.out.println();
		        farkliCiftSayiKupCarpim(l);
		        System.out.println();
		        System.out.println(farkliTersSirala(l));
		        System.out.println();
		        enBuyukEleman(l);
		    
		 
		
	}
			//1)List in elemanlarını aralarında boşluk bırakarak yanyana yazdır.(Method Reference- kendi metodumuz)
		    public static void elemanYazdir(List<Integer> l) {
		       l.stream().forEach(methodLambda02::bosluklaYazdir); //kendi metodumuz  15,14,9,13,4,9,2,4,14
		      // l.stream().forEach(System.out::print); java nın metodu
		    }
		    //2)List in elemanlarından çift olanları aralarında boşluk bırakarak yanyana yazdır..(Method Reference)
		    public static void ciftSayiYazdir(List<Integer> l) {
		        l.stream().filter(methodLambda02::ciftSayi).forEach(methodLambda02::bosluklaYazdir);
		    }
		    //3)List teki tek sayıların karelerini alıp aralarında boşluk bırakarak yanyana yazdır
		    public static void tekSayiKare(List<Integer> l) {
		        l.stream().filter(methodLambda02::tekSayi).map(methodLambda02::kareAl).forEach(methodLambda02::bosluklaYazdir);
		    }
		    //4)List teki tekrarlı olanları silip tek sayıların küplerini alıp aralarında boşluk bırakarak yanyana yazdır.
		    public static void tekSayiKupTekrarsiz(List<Integer> l) {
		        l.stream().distinct().filter(methodLambda02::tekSayi).map(methodLambda02::kupAl).forEach(methodLambda02::bosluklaYazdir);
		    }
		    //5)Farklı çift sayıların karelerinin toplamını yazdır (Use Method Reference)
		    public static void farkliCiftSayiKareToplam(List<Integer> l) {
		      int num=  l.stream().distinct().filter(methodLambda02::ciftSayi).map(methodLambda02::kareAl).reduce(0,Math::addExact);
		        System.out.println(num+" "); //252
		    }
		    //6)Farklı çift sayıların küplerinin çarpımını yazdır .(Use Method Reference)
		    public static void farkliCiftSayiKupCarpim(List<Integer> l) {
		       int num= l.stream().distinct().filter(methodLambda02::ciftSayi).map(methodLambda02::kupAl).reduce(1,Math::multiplyExact);
		        System.out.println(num);//303464448
		    }
		    //7)List teki farklı ve 5 ten büyük ve çift elemanlarının yarısını alıp ters sıralayarak list olarak yazdır.
		    public static List farkliTersSirala(List<Integer> l) {
		     return    l.stream().distinct().filter(t->t>5 && t%2==0).map(t->t/2).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		    }
		    
		    //8)listeki en buyuk ve en kucuk elemani bul
		    
		    public static void enBuyukEleman(List<Integer> l) {
				System.out.println(l.stream().reduce(Integer.MAX_VALUE,Math::min)); // 2
				System.out.println(l.stream().reduce(Integer.MIN_VALUE, Math::max)); // 15
				l.stream().sorted(Comparator.reverseOrder()).limit(1).forEach(methodLambda02::bosluklaYazdir); // en buyuk 15
				System.out.println();
				l.stream().sorted().limit(1).forEach(methodLambda02::bosluklaYazdir); // en kucuk 2
		    }
}

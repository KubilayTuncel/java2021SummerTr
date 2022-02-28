package day20_arrays;

import java.util.Arrays;

public class C04_Array04 {

	public static void main(String[] args) {
		
		int [] arr= {1,10,2,6,3,8,};
		
		//siralamayi bulmak icin ilk once sort ederek array i siralamamiz gerekiyor.
		Arrays.sort(arr);
		
		System.out.println(Arrays.binarySearch(arr, 1)); // bu bize index doner ve cevap 0 olur
		System.out.println(Arrays.binarySearch(arr, 5)); //bu sefer array in icinde 5 olmadigi iicn 5 in siralamada gelebilecegi siraya gore eksi doner
														 //ve -4 doner
		
		String str="Java, candir.";
		
		
		
		String arr1[]=str.split(","); //burada virgul u siler array in yazilimindan dolayi virgul gelir ve kelimeyi virgulden sonra ayirdigi icin
									  //candir kelimesinin onundeki boslugu da kapsar ve 2 bosluklu yazar
		
		
		System.out.println(Arrays.toString(arr1)); 
		
		String arr2[]=str.split("a");
		
		System.out.println(Arrays.toString(arr2));
		
		String arr3[]=str.split(""); //String i karakterlere ayirir.
		
		System.out.println(Arrays.toString(arr3));
		
		int uzunluk=arr3.length;
		
		System.out.println("Array in karakter sayisi"+uzunluk);
		
		String cumle="Java ogren, rahat yasa";
		
		String arr4[]=cumle.split(" ");
		
		int kelimesayisi=arr4.length;
		
		System.out.println("Cumledeki kelime sayisi : "+ kelimesayisi);
		
		//harf sayisini bulmak icin
		
		String cumle2=cumle.replaceAll("\\W", "");
		System.out.println(cumle2.length()); //18
		
		String harfArrayi[]=cumle2.split("");
		System.out.println(harfArrayi.length); //18

	}

}

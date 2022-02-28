package day22_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class C04_List04 {

	public static void main(String[] args) {
		// verilen bir array'de tekrar eden elementleri silip
				// tekrarsiz yeni bir array haline getirin
				
				int arr[]= {2,3,5,7,3,5,2,6,3,1,4,2,3};
				
				List<Integer> sayilar = new ArrayList<>();
				
				for (int i = 0; i < arr.length; i++) {
					
					if (!sayilar.contains(arr[i])) {
						sayilar.add(arr[i]);
					}
					
				}
				System.out.println(sayilar);
				Collections.sort(sayilar); //list seklindeki array lerin yaziminda *Collections* methodu kullaniliyor
										   //normal array lerde ise *Arrays.toString* methodu kullaniliyor.
				System.out.println(sayilar);
				
				int yeniArr[] = new int[sayilar.size()]; //size methodu list Array lerde List 'Array in uzunlugunu verir.
														 //Normal Array lerde length methodunu kullaniyoruz.
				
				for (int i = 0; i < yeniArr.length; i++) {
					
					yeniArr[i]=sayilar.get(i); //get metodu elemanlari getirir.
					
				}
				
				System.out.println("Tekrarsiz Array: "+Arrays.toString(yeniArr));
				
	}

}

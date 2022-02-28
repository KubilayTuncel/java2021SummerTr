package day29_passByValue_mutableClass;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

	public static void main(String[] args) {
		/*
		 * Soru3 : Bir list olusturalim. Eleman olarak 10,11,12 ekleyelim. Iki method olusturup list elemanlarini artirmayi deneyelim
- 1. Method’da elemanlari for each loop kullanarak artirin
- 2. Method’da elemanlari set method’u kullanarak artirin
- Method’lari arka arkaya cagirip artislarin kalici olup olmadiklarini kontrol edelim.
		 */
	
	List<Integer> sayiList=new ArrayList<>();
	
	sayiList.add(10);
	sayiList.add(11);
	sayiList.add(12);
	
	System.out.println("ilk olusturdugumuz liste : " + sayiList);
	
	forLoopIleArtir(sayiList);
	
	System.out.println("ForLoop Method'dan sonra list : "+sayiList);
	
	setIleArtir(sayiList);
	
	System.out.println("Set Method'dan sonra main method da List : "+sayiList);
	}

	private static void setIleArtir(List<Integer> sayiList) {
		//set ile elmanlari artiralim
		
		for (int i = 0; i < sayiList.size(); i++) {
			
			sayiList.set(i, sayiList.get(i)+5);
			
		}
		
		//loop'dan sonra listeyi yazdiralim
		System.out.println("set Method'u icinde artirimdan sonra list : "+sayiList);
		
	}

	private static void forLoopIleArtir(List<Integer> sayiList) {
		// for Each loop ile elemanlari artiralim
		
		for (Integer each : sayiList) {
			
			each+=5;
			System.out.print(each+" "); //15 16 17
			
		}
		System.out.println("");
		System.out.println("foreach loop'dan sonra list : "+sayiList); //10 11 12
	}

}

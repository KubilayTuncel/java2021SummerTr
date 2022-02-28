package day46_collections;

import java.util.HashSet;
import java.util.Set;

import day20_arrays.C03_ArraySiralama;

public class C01_Set01 {

	public static void main(String[] args) {
		 

	Set<String> set1 =new HashSet<>();
	set1.add("A");
	set1.add("B");
	set1.add("C");
	set1.add("A");
	set1.add("B");
	System.out.println(set1); //
	//set'de onemli olan ozellik No duplication ve elemanin kumede var olup olmadigi
	//Siralama set icin onemli degildir.
	//set icin elemanlari girdigimiz sirada verir ve ya elemanlari natural siralama ile verir gibi bir cumle KULLANAMAYIZ
	
	System.out.println(set1.hashCode());
	//Collections'da hashCode() metod'u collection icindeki tum elemanlarin hash code'larinin toplamini verir.
	//yeni elman eklersek dogal olarak hash code da degisir
	}

}

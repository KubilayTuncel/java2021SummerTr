package day44_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators01 {

	public static void main(String[] args) {
		List<String> list =new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list); //[A, B, C, D]
		
		for (String each : list) {
			each+="B";
			System.out.print(each +" "); //AB BB CB DB 
		}
		System.out.println(" ");
		System.out.println(list); //[A, B, C, D]

		//Collections"da her yapi index'i desteklemez. Örnegin Set'de index olmaz.
		//Index olmayinca mecburen tum elemanlara ulasmak icin For-each loop kullanilir.
		//For-each loop ile de update ve ya delete yapamayiz.
		//Bunun icin Java Iterator inteface'ini olusturmustur...
		
		Iterator it1= list.iterator();
		//next(); hasNext(); ve remove(); methodlarina sahiptir.
		//listedeki tum elemanlari iterator kullanarak silelim
		
		while (it1.hasNext()) { // list de eleman var mi sorar
			it1.next(); //bir sonraki elemani getirir
			it1.remove(); //elemani siler
			
			
		}
		System.out.println(list); //[] bos list döndü.
	}

}

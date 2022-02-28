package day45_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C01_LinkedList01 {

	public static void main(String[] args) {
		/* link bagli demektir
		 *link list'te tum elemanlar tren gibi birbirine baglidir
		 *Collection da obje olustururken olusturmak istedigimiz collection in class mi yoksa interface mi olduguna bakmaliyiz
		 *eger olusturmak istedihgimiz collection interface ise data turu olarak interface'i, 
		 *constructor olarak ise uygun bir class secmeliyiz
		 *Simdiye kadar List(Interface) olustururken constructor olarak ArrayList() seciyorduk
		 */
		List<String> liste=new ArrayList<>();
		liste.add("X");
		liste.add("Y");

		LinkedList<String> li1=new LinkedList<>();
		
		li1.add("A");
		li1.add("B");
		System.out.println(li1); // [A, B]
		li1.add(1, "C");
		System.out.println(li1); // [A, C, B]
		li1.addAll(liste); 
		System.out.println(li1); //[A, C, B, X, Y]
		
		li1.addAll(2, liste);
		System.out.println(li1); // [A, C, X, Y, B, X, Y]
		
		li1.addLast("K");
		System.out.println(li1); // [A, C, X, Y, B, X, Y, K]
		
		//LinkedList List ve Queue interface'lerine implimentle child oldugundan
		//her iki Interface'deki tum methodlari override etmek zorundadir
		//Islev olarak ayni isi yapan addList() queue ve add() ise List'den inherit edilmistir
		
		//Ben bir linkedlist istiyorum ama sadece List ozellikleri tasisin
		
		List<String> listList=new LinkedList<>();
		listList.add("Sadece list'ten gelen ozellikler var");
		
		Queue<String> queueListQueue=new LinkedList<>();
		queueListQueue.add("Sadece queue'ten gelen ozellikler var");

		
	}

}

package day47_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C1_Queue01 {

	public static void main(String[] args) {
		//Queue bir interface'dir dolayisiyla obje uretemeyiz
		//Child class'i olan PriorityQueue ve LinkedList constructor secimine gore
		//olusturdugumuz Queue'nun davranislari degisir
		Queue<String> k1=new PriorityQueue<>();
		k1.add("D");
		k1.add("C");
		k1.add("M");
		k1.add("A");
		System.out.println(k1); // [A, M, C, D]
		
		/*
		 * Queue (kuyruk) yapisi geregi insertion order'a gore siralama yapmasi beklenir
		 * Ancak constructor olarak PriorityQueue sectigimiz icin java tarafindan belirlenen priority'e gore siralama yapar
		 * Biz de istersek priority kuralini tanimlayabiliriz.. O zaman bizim istegimize gore siralar
		 */
		Queue<String> k2=new LinkedList<>();
		
		//ayni elemanlarla fakat LinkedList constructor'i kullanilarak olusturdugumuz
		//Queue ise beklenenlerle uygun olarak ekleme sirasina gore yazdirir
		k2.add("D");
		k2.add("C");
		k2.add("M");
		k2.add("A");
		
		System.out.println(k2); // [D, C, M, A]
		
		//Queue'nun yapisi geregi FIFO(first in first out) kurali gecerlidir
		k2.offer("Z");
		System.out.println(k2); // [D, C, M, A, Z]
		
		System.out.println(k2.peek()); // D
		//silmeden ilk elemani bize döndürür
		System.out.println(k2); // [D, C, M, A, Z]
		k2.remove();
		System.out.println(k2); // [C, M, A, Z]
		k2.remove();
		System.out.println(k2); // [M, A, Z]
		System.out.println(k2.remove("A")); // true
		k2.poll();
		System.out.println(k2); // [Z]
		// poll method u ilk elemani siler
		System.out.println(k2.element()); // Z
		//silmeden ilk elemani döndürür
		k2.remove();
		System.out.println(k2.isEmpty()); // true
		
		k2.poll(); // poll bos bir Queue de kullanilirsa excep. vermez, null döndürür
	}

}

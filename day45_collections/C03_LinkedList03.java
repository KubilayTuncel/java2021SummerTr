package day45_collections;

import java.util.LinkedList;

public class C03_LinkedList03 {

	public static void main(String[] args) {
LinkedList<String> li1=new LinkedList<>();
		
		li1.add("A");
		li1.add("B");
		System.out.println(li1); // [A, B]
		
		System.out.println(li1.remove(0));  // A remove(index) indexteki elemani siler ve sildigi elemani bize döndürür.
		
		System.out.println(li1); // [B]
		
		li1.add("A");
		li1.add("B");
		System.out.println(li1);
		
		System.out.println(li1.remove("B")); // true ya da false döndürür
		
		li1.addFirst("B");
		System.out.println(li1); // [B, A, B]
		System.out.println(li1.removeFirstOccurrence("B")); // true ya da false döndürür
		System.out.println(li1); // [A, B] ilk buldugu B'yi siler
		

	}

}

package day45_collections;

import java.util.LinkedList;

public class C04_LinkedList04 {

	public static void main(String[] args) {
		// 

	LinkedList<String> li1=new LinkedList<>();
		
		li1.add("A");
		li1.add("B");
		System.out.println(li1); // [A, B]
		
		li1.contains("A"); // true ya da false doner
		System.out.println(li1.contains("A"));
		LinkedList<String> li2=new LinkedList<>();
		
		li2.add("A");
		li2.add("B");
		li2.add("C");
		li2.add("D");
		System.out.println(li2);	
		System.out.println(li2.containsAll(li1)); //true
		System.out.println(li1.contains(li2)); //false
		System.out.println(li2.get(2)); // C
		System.out.println(li2.getFirst()); // A
		System.out.println(li2.getLast()); // D
		
	}

}

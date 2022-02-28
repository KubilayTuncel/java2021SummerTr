package day45_collections;

import java.util.LinkedList;

public class C02_LinkedList02 {

	public static void main(String[] args) {
		LinkedList<Object> ll1=new LinkedList<>();
		ll1.add("A");
		ll1.add(20);
		ll1.add('C');
		System.out.println(ll1); //[A, 20, C]

		LinkedList ll2=new LinkedList<>();
		ll2.add("B");
		ll2.add(25);
		ll2.add('K');
		System.out.println(ll2); // [B, 25, K]
		
		LinkedList <String> ll3=new LinkedList<>();
		ll3.add("D");
		ll3.add(""+15);
		ll3.add(""+'Z');
		System.out.println(ll3); // [D, 15, Z]

	}

}

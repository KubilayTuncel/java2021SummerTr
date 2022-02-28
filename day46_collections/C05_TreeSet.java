package day46_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class C05_TreeSet {

	public static void main(String[] args) {
		//TreeSet method'u elemanlari natural olarak siralar
		Set<String> set1 =new TreeSet<>();
		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("D");
		System.out.println(set1); // [A, B, C, D]

		System.out.println(System.currentTimeMillis());
		for (int i = 0; i < 1000; i++) {
			set1.add(""+i);
		}

		System.out.println(System.currentTimeMillis());
		
		Set<String> set2=new HashSet<>();
		System.out.println(System.currentTimeMillis());
		
		for (int i = 0; i < 1000; i++) {
			set2.add(""+i);
		}
		TreeSet<String> set3= new TreeSet<>(set2);
		System.out.println(System.currentTimeMillis());

	}

}

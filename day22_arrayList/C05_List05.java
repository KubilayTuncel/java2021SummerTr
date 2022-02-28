package day22_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_List05 {

	public static void main(String[] args) {
		//200 e kadar olan fibonacci sayilarini bir list olarak yazdiriniz

		List<Integer> fibonacci = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		fibonacci.add(1);
		
		int sayi=0;
		int index=1;
		while (sayi<200) {
			
			sayi=fibonacci.get(index)+fibonacci.get(index+1);
			index++;
			if (sayi<200) {
				fibonacci.add(sayi);
			}
			
		}
		System.out.println(fibonacci);
		
		List<Integer> fibonacci2 = new ArrayList<>();
		fibonacci2.add(0);
		fibonacci2.add(1);
		fibonacci2.add(1);
		sayi=0;
		index=1;
		
		do {
			
			sayi=fibonacci2.get(index)+fibonacci2.get(index+1);
			index++;
			if (sayi<200) {
				fibonacci2.add(sayi);
			}
			
			
		} while (sayi<200);
		
		System.out.println(fibonacci2);
		
	}

}

package day21_multimensionalArrays;

import java.util.Arrays;

public class C04_MDArrays04 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Asagidaki multi dimensional array’in ic array’lerindeki tum
		 * elemanlarin toplamini birer birer bulan ve herbir sonucu yeni bir array’in
		 * elemani yapan ve yeni array’i ekrana yazdiran bir program yaziniz { {1,2,3},
		 * {4,5}, {6,7} } Ornek; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6 4+5=9 6+7=13 ==>
		 * output: {6, 9, 13}
		 */

		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 6, 7 } };
		int toplamlarArrayi[] = new int[arr.length];

		for (int i = 0; i < arr.length; i++) {
			int elementlertoplami = 0;
			for (int j = 0; j < arr[i].length; j++) {

				elementlertoplami += arr[i][j];

			}
			toplamlarArrayi[i] += elementlertoplami;
		}

		System.out.println(Arrays.toString(toplamlarArrayi));
	}

}

package day20_arrays;

import java.util.Arrays;

public class C03_ArraySiralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {3,15,10,11,9};
		
		
		
		arr=arraySirala(arr);
		
	    arr=arrayiTerstenSirala(arr);
		System.out.println(Arrays.toString(arr));

		
		
	}

	

	private static int[] arrayiTerstenSirala(int[] arr) {

	int temp[]=new int[arr.length];
		
		for (int i = 0; i < temp.length; i++) {
			
			temp[i]=arr[arr.length-1-i];
			
		}
		
		
		return temp;
		
	}



	private static int[] arraySirala(int[] arr) {
		//oncelikle array i kucukten buyuge siralamaliyiz
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
		
		
	}

}

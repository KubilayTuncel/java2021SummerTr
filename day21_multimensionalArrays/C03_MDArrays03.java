package day21_multimensionalArrays;

public class C03_MDArrays03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr [][]={ {1,2,3}, {4,5},{6} };
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = arr[i].length-1; j < arr[i].length; j++) {
				
				
				carpim*=arr[i][j];
				
			}
			
			
		}
		
		System.out.println(carpim);
		
	}

}

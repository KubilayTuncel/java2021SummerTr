package day24_lists_forEachLoops;

public class C04_ForEachLoop02 {

	public static void main(String[] args) {
		//Soru 1:
		//Bir integer array olusturunuz ve
		// bu array’deki tum sayilarin carpimini For-each loop kullanarak bulunuz. 
		//Sonucu ekrana yazdiriniz.
		
		int arr[]= {2,4,5,7,8,2,23};
		int carpim=1;
		
		for (int each : arr) {
			
			carpim*=each;
			
		}
		
		System.out.println(carpim);
		
	}

}

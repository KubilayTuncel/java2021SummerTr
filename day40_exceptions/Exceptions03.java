package day40_exceptions;

public class Exceptions03 {

	public static void main(String[] args) {
		// 
		int arr[]= {1,3,7,8};
		
		try {
			System.out.println(arr[2]);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}finally {
			System.out.println("ne olursa olsun bu satir yazilsin");
		}
		

		//finally blogu try-catch blogu ile ve ya sadece try blogu ile de calisabilir
		//finally blogu catch blogu ile bir sorun oldugunda calistigi gibi
		//ongoremedigimiz exception'dan sonra da calisir
		
	}

}

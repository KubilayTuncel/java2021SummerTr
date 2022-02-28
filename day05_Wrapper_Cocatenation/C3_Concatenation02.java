package day05_Wrapper_Cocatenation;

public class C3_Concatenation02 {

	public static void main(String[] args) {

		int sayi = 7;

		char ilkHarf = 'a';

		String str = "Java";

		System.out.println(sayi + str + ilkHarf); // 7Javaa

		System.out.println(sayi + ilkHarf + str); // 104Java
		
		System.out.println(sayi+""+ilkHarf); //7a

	}

}

package day28_staticBlock_passByValue;

public class C01_StaticBlocks {

	static int sayi=10;
	
	static {
		System.out.println("1. static blok calisti");
		sayi=20;
	}
	

	static {
		System.out.println("2.static blok calisti");
		sayi=30;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("main metho'un ilk satirinda sayi : "+sayi);
	}

}

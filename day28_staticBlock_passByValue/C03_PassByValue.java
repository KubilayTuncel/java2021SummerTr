package day28_staticBlock_passByValue;

public class C03_PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double fiyat=100;
		
		System.out.println(indirimYap(fiyat)); //fiyatta %10 indirim yapicam ve yeni fiyati dondurucem //90.0
		
		System.out.println("method calistiktan sonra fiyat : "+fiyat);//100
		
	}

	private static double indirimYap(double fiyat) {
		// TODO Auto-generated method stub
		
		fiyat=fiyat*90/100;
		System.out.println("methodda ki fiyat : "+fiyat);//90.0
		
		return fiyat;
		
	}

		


}

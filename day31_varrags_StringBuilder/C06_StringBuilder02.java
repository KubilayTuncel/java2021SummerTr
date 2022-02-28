package day31_varrags_StringBuilder;

public class C06_StringBuilder02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuilder sb1=new StringBuilder();
		
		sb1.append("Kubilay");
		System.out.println("sv1 ilk hali : "+sb1);
		sb1.append(" Tuncel");
		System.out.println("sb1 soyisim eklenmis hali : "+sb1);
		System.out.println("sb1 uzunluk : "+sb1.length());
		System.out.println("sb1 kapasitesi : "+sb1.capacity()); // 16 
		System.out.println("sb1 son hali : "+sb1.append(" guzel insan"));
		System.out.println("sb1 son hali kapasitesi : "+sb1.capacity()); //34
	}

}

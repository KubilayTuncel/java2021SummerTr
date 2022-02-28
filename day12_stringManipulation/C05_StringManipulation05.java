package day12_stringManipulation;

public class C05_StringManipulation05 {

	public static void main(String[] args) {
		/* Soru 2) String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
		 String str1 = “$13.99”
				 String str2 = “$10.55”
				 ipucu : Double.parseDouble() methodunu kullanabilirsiniz.
				 */
		
		String str1= "$13.99";
		String str2= "$10.55";
		
		str1=str1.replace("$","");
		str2=str2.replace("$","");
		
		double str11=Double.parseDouble(str1);
		double str22=Double.parseDouble(str2);
		
		System.out.println("fiyatlarin toplami : $" +(str11+str22));
		
	}

}

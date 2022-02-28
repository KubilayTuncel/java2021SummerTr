package day33_StringBuilderAndAccessModifier;

public class C01_StringBuilderManipulation {

	public static void main(String[] args) {
		// String ile StringBuilder karsilastirilmasi : equals ===> SB' de equals methodu string
				// class' indan farkli calisir. String class' indaki == operatoru ile ayni islemi yapar.
				// Hem icerik hem de referans esitligine bakar.
				
				String s = "hayat";
				
				StringBuilder sb = new StringBuilder ("hayat");
				
				// System.out.println(s == sb); ===> Farkli data type' lari karsilastirma operatoru
				// derleyemez, CTE verir
				
				System.out.println(s.equals(sb)); // false yazdirir
				
				// SB, toString methodu ile string' e cevirilerek string manipulation methodlari kullanilabilir
				
				System.out.println(s.equals(sb.toString())); // true yazdirir, string-string karsilastirmasi
															 // equals methodu normal calistirir, sadece
															 // icerige bakar
				
				System.out.println(sb.equals(sb.toString())); // false yazdirir, string-string karsilastirmasi
															  // equals methodu normal degil, == gibi 
															  // calistirir, sadece icerige degil icerik
															  // ve referansa bakar
				
				// StringBuilder index parametreli appent : farkli string' den parca ekleme ===>	​
				System.out.println(sb.toString().concat("guzel"));
				
				System.out.println(sb);
				
				System.out.println(sb.append(s, 2, 5)); // sb' ye, s' nin 2 ile 5 arasini append et ekle
	    
	    
	}

}

package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception01 {

	public static void main(String[] args) {
		//Java'ya bir dosyayi okumasini ve ya dosyaya yazmasini soyledigimizde
		//Java'ya dosyayi bulmazsam der ve bizden cozum uretmemizi ister.
		//dosya bulma ile ilgili exception turu : FileNotFoundException
		//Java kodu yazar yazmaz buradaki olasi problemi gorur ve CTE verir.
		//Kodumuzu yazdigimiz anda ortaya cikan bu tur exception'lara Checked Expection diyoruz.
		
		try {
			FileInputStream fis = new FileInputStream("/Users/kerimmac/eclipse-workspace/java2021SummerTr/src/day39_exceptions/file");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

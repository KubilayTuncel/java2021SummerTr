package day31_varrags_StringBuilder;

import java.util.Arrays;

public class C01_Varargs01 {

	public static void main(String[] args) {
		// Varargs kullanarak verilen Stringleri birlestiren concat isimli bir method
        // olusturunuz
        concat("m", "e", "r", "v", "e");
        String[] arr= {"m","e","r","v","e"};
        System.out.println(concat(arr));
      
    }
    private static String concat(String... string) {
        String s = "";
        for (String w : string) {
            s = s.concat(w);
        }
        System.out.println(s);
        
        return s;

    }

}

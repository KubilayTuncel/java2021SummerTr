package day39_exceptions;

import java.util.ArrayList;
import java.util.List;


public class Exceptions04 {

	public static void main(String[] args) {
		/*
		 * data turlerini casting yaparken uygun olmayan islem yaparsaniz java ClassCastException verir.
		 * eger tamamen sayilardan olusan bir sayiyi bir integer a cevirirseniz Java NumberFormatException verir.
		 */
	
		String str1=" ";
		String str2="";
		String str3=null;
		
		System.out.println(str1.length()); //1
		System.out.println(str2.length()); //0
		//System.out.println(str3.length()); //NullPointerException
		
		int arr[]= {1,2,5,6};
		System.out.println(arr[1]); //2
		System.out.println(arr[3]); //6
		//System.out.println(arr[5]); //ArrayIndexOutOfBoundsException
		
		List<String> list = new ArrayList<>();
		list.add("Kazim");
		list.add("CElil");
		list.add("Bahhattin");
		//System.out.println(list.get(5)); //IndexOutOfBoundsException
		
		String sayi="123456";
		
		System.out.println(sayi+10); //12345610
		
		int strsayi=Integer.parseInt(sayi);
		System.out.println(strsayi+10); //123466
		
		String str21="123a45";
		//System.out.println(Integer.parseInt(str21)); //NumberFormatException
		
		Object sayi2=40;
		//String sayiStr=(String)sayi2; //ClassCastException
		
	}

}

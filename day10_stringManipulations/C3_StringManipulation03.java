package day10_stringManipulations;

import java.util.Scanner;

public class C3_StringManipulation03 {

	public static void main(String[] args) {
		// '' char ""String ama indexOf() acisindan farklari yoktur
		
		String str="Java ogrenmek ne guzel";
		
		System.out.println(str.indexOf("e")); //8
		
		System.out.println(str.indexOf(' ')); // 4
		
		System.out.println(str.indexOf("mek")); // 10
		
		System.out.println(str.indexOf("")); // 0
		
		System.out.println(str.indexOf("j")); // -1
 		
		System.out.println(str.indexOf("J")); // 0
		
		System.out.println(str.indexOf('e', 10)); // 11
		
		Scanner scan=new Scanner (System.in);
		
		System.out.println("Lutfen bir cumle yaziniz");
		
		String cumle=scan.nextLine().toLowerCase();
		
		
		if (cumle.indexOf("java")==-1) {
			System.out.println("daha cok calisman lazim");
		}else {
			System.out.println("Aferin");
		}
		
		System.out.println(cumle.indexOf("java")==-1 ? "daha cok calisman lazim" : "Aferin");
		
		scan.close();
		
	}

}

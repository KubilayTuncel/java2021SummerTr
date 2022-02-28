package day39_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions02 {

	public static void main(String[] args) {
		/*
		 * eger kodumuzu yazdigimizda birden fazla exception'la iliskili durum olusuyorsa
		 * Icice try-catch bloklari olusturabiliriz
		 * bu ornekte ilk once dosyayi okumak istedik
		 * Java "ya bu dosyayi bulamazsam?" diye bizden yardim istedi
		 * Biz de try-catch blogu ile FileNotFoundException ile handle etmesinde yardimci olduk
		 * Sonra dosyadaki yazilari okumaya calistik ve Java yeniden "Ya dosyayi okuyamazsam " diye yardim istedi
		 * Biz de try-catch blogu ile IOException ile handle etmesini sagladik.
		 */


		try {
			FileInputStream fis = new FileInputStream("/Users/kerimmac/eclipse-workspace/java2021SummerTr/src/day39_exceptions/file");
			
			int k=0;
			try {
				while ((k=fis.read())!=-1) {
					System.out.print((char)k);
				}
			} catch (IOException e) {//dosyalarla ilgili genel yazma ve okuma sorunlari ile handle eder
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

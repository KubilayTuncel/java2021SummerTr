package day24_lists_forEachLoops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class C01_List01 {

	public static void main(String[] args) {
		/*
		 * 1)Kullanicidan isimler isteyin ve bunlari bir list’te depolayin.
		 *  Kullanici yeter yazana kadar isim istemeye devam edin.
      		Kullanici isim girmeyi bitirdiginde toplam kac isim girdigini ve bunlardan kac
      		tanesinin asagidaki listede olan isimlerden oldugunu yazdirin
 			isimList=Ali , Veli, Ayse, Fatma, Zeki, Kemal
 			Not : kucuk buyuk harf onemli degil
		 */

		Scanner scanner=new Scanner(System.in);
		
		List<String> girilenIsimler=new ArrayList<>();
		String isim1;
		String isim;
		do {
			System.out.println("Lutfen listeye girmek istediginiz ismi giriniz"
					+ "\nBitirmek icin yeter yaziniz ");
			
			isim1=scanner.nextLine();
			isim=isim1.substring(0,1).toUpperCase()+isim1.substring(1,isim1.length()).toLowerCase();

			if (!isim.equals("Yeter")) {
				
				girilenIsimler.add(isim);
				
				
			}
		} while (!isim.equals("Yeter"));
		
		//karsilastirmak istedigimiz listeyi olusturalim
		//listenin uzunlugu degismeyecegi icin array olusturup, list'e cevirelim
		//boylece 6 ismi tek tek eklemek zorunda kalmam
		
		String isimler[]= {"Ali", "Veli", "Ayse", "Fatma", "Zeki", "Kemal"};
		
		List <String> isimList=Arrays.asList(isimler);
		
		//elimizde 2 tane liste var
		//1-Kullanicidan aldigimiz isimlerin oldugu girilenIsimler
		//2-Karsilastiracagimiz liste isimList
		
		System.out.println("Toplam : " +girilenIsimler.size()+ " isim girdiniz");
		
		int count=0;
		
		for (int i = 0; i < girilenIsimler.size(); i++) {
			
			if(isimList.contains(girilenIsimler.get(i))) {
			
				count++;
				
			}
			
		}
		System.out.println("Girdiginiz isimlerden " +count+ " tanesi listede var" );
		scanner.close();
	}

}

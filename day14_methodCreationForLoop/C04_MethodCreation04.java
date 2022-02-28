package day14_methodCreationForLoop;

import java.util.Scanner;

public class C04_MethodCreation04 {

	public static void main(String[] args) {
		/*
		 * Soru 4) Kullanicidan ismini, soyismini ve 
		 * bosluk birakmadan 16 hane olarak kredi karti numarasini alin. 
		 * Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde, 
		 * KK numarasini ise 4 rakamlik 4 blok ve aralarinda bosluk olacak sekilde duzelten 2 method yazin, 
		 * ve programda kullanabilmek icin duzenlenmis hallerini geri dondurun.
		 */

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi girniz.");
		
		String isim=scan.nextLine();
		
		System.out.println("Lutfen soyisminizi girniz.");
		
		String soyisim=scan.nextLine();
		
		System.out.println("Lutfen Kredi Karti numarinizi arada bosluk olmadan giriniz");
		
		String KKno=scan.nextLine();
		
		isimDuzelt(isim);
		soyisimDuzelt(soyisim);
		KKnoDuzelt(KKno);
		
		isim=isimDuzelt(isim);
		soyisim=soyisimDuzelt(soyisim);
		KKno=KKnoDuzelt(KKno);
		
		
		System.out.println(isim +" "+ soyisim + " "+ KKno);
		
		scan.close();
	}

	public static String KKnoDuzelt(String KKno) {
		KKno=KKno.replace(" ","");
		KKno=KKno.substring(0,4)+ " " + KKno.substring(4,8)+ " " 
		+ KKno.substring(8,12)+ " " + KKno.substring(12,16);
		
		return KKno;
		
	}

	public static String soyisimDuzelt(String soyisim) {
		soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();
		return soyisim;
	}

	public static String isimDuzelt(String isim ) {
		
		isim=isim.trim();
		
		if (isim.contains(" ")) {
			
			int bosluk=isim.indexOf(' ');
			
			isim=isim.substring(0,1).toUpperCase()+isim.substring(1,bosluk).toLowerCase()+ " "+
					isim.substring(bosluk+1,bosluk+2).toUpperCase()+isim.substring(bosluk+2);
			
		}else if (!isim.contains("")){
		
		isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
		}
		
		return isim;
	}

}

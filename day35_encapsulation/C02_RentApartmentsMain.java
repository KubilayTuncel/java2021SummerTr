package day35_encapsulation;

import java.util.Scanner;

public class C02_RentApartmentsMain {

	public static void main(String[] args) {
		/*Burada iki adet class vardır. Biri Main diğeri ise rentApartments
    rentApartments'ın içinde;
    Bu variable'ları private olarak oluşturun;
    String name
    int roomCount
    boolean balconyOrNo

   Bütün variable'lar için getter ve setter oluşturunuz.

    4 farklı Apartment(apartman dairesi) vardır. 0, 1, 2, 3 rooms(odalı)
    -----------------------------------------------------------------
    Bir method oluşturun;
    Eğer room sayısı 0 ise,
    rent(kira) 1400
    Eğer oda sayısı 1 ise,
    rent  1700
    Eğer oda sayısı 2 ise,
    rent 2200
    Eğer oda sayısı 3 ise,
    rent 2700
    rent'i return'leyin.
    ----------------------------------------------------------------
    Bir method oluşturun.
    Eğer balconyOrNo  true ise,
    rent'e 200 dollar ekleyin.

    Main class'ın içinde;
    userName rent is amountOfRent
    */
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Lutfen isminizi giriniz : ");
		String name=scanner.nextLine();
		
		System.out.println("Lutfen oda sayisini giriniz : ");
		int odaSayisi=scanner.nextInt();
		
		System.out.println("Balkon istiyor musunuz true ya da false giriniz : ");
		boolean balcony=scanner.nextBoolean();
		
		C01_RentApartments kiraci=new C01_RentApartments();
		kiraci.setName(name);
		kiraci.setBalconyOrNo(balcony);
		kiraci.setRoomCount(odaSayisi);
		
		int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesaplama(odaSayisi);
		
		System.out.println("Sayin "+kiraci.getName()+" Bey siz "+kiraci.getRoomCount()+" odali ev icin "+toplamKira+" Euro odemelisiniz.");

	}

}

package day35_encapsulation;

import java.util.Scanner;

public class C04_BookMain {

	public static void main(String[] args) {
		/*  Book class'ı verilmiştir.
		    İki tane attributes oluşturunuz.
		    bookName ve authorName (String ile)
		    Book class'ını kapsülleyin. (Encapsulate)
		    Main class'ın içine object  oluşturun ve sonucu yazdırınız.

		todo  "Book name is BOOKNAME and Author is AUTHORNAME"
		*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz : ");
		String isim=scanner.nextLine();
		System.out.println("Kitap ismi giriniz : ");
		String kitapString=scanner.nextLine();
		
		C03_Book sahipBook=new C03_Book();
		
		sahipBook.setAuthorName(isim);
		sahipBook.setBookName(kitapString);
		
		System.out.println(sahipBook.getAuthorName()+" Bey "+sahipBook.getBookName()+" kitabiniz kayit altina alinmistir.");
	}

}

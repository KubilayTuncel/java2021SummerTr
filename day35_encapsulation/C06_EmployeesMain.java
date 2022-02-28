package day35_encapsulation;

import java.time.LocalDate;
import java.util.Scanner;

public class C06_EmployeesMain {

	public static void main(String[] args) {
		/* TODO
	    Burada iki adet class vardır. Biri Main diğeri ise Employees,
	    Employees(Çalışanlar) class'ında;
	    Bu variable'ları oluşturunuz;
	    private String name,
	    private int salary,
	    private String dob (date of birth) (Doğum tarihi)
	    getter ve setter oluşturunuz.
	 Main class'ın içinde; kullanicidan name dob ve slary bilgilerini alip
	    Eğer employee 18 yaşında büyükse, Welcome to our company Fernando your salary is 80000. yazdırınız.
	    Eğer Fernando 18 yaşından küçükse, come back when you are 18 years old. yazdırınız.
	    Eğer Fernando 18 yaşındaysa,  we can have inter with you after that you can have a 80000 salary yazdırınız.
	  Örnek:
	    Name is Fernando
	    dob is 11/23/2000
	    Salary is 80000
	todo  ageCalculator isminde bir method oluşturunuz. Şuanki tarih - doğum yılı = employee age
	*/
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Lutfen isminizi giriniz : ");
		String isim=scanner.nextLine();
		System.out.println("Lutfen dogum tarihini giriniz : ");
		String dogumTarihi=scanner.nextLine();
		System.out.println("Maasinizi giriniz : ");
		int salary=scanner.nextInt();
		
		C05_Employees calisan=new C05_Employees();
		
		calisan.setName(isim);
		calisan.setDogTarih(dogumTarihi);
		calisan.setSalary(salary);
		int calisanYas=calisan.yasHesapla(dogumTarihi);
		
		if (calisanYas>18) {
			
			System.out.println("Welcome to our company "+calisan.getName()+ " your salary "+calisan.getSalary());
			
		}else if (calisanYas<18) {
			System.out.println(calisan.getName()+" come back when you are 18 years old");
		}else if (calisanYas==18) {
			System.out.println("we can have inter with you after that you can have a "+calisan.getSalary()+" salary");
		}
		

	}

}

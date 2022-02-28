package day35_encapsulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class C05_Employees {

	private String name;
	private int salary;
	private String dogTarih;
	private int maas=0;
	
	public void setName(String name) {
		
		name=name.substring(0,1).toUpperCase()+name.substring(1,name.length()).toLowerCase();
		this.name=name;
		
		
	}

	public String getName() {
		
		return name;
		
	}
	
	public void setSalary(int salary) {
		
		this.salary=salary;
				
	}
	
	public int getSalary() {
		return salary;
	}
	public void setDogTarih(String dogTarih) {
		
		this.dogTarih=dogTarih;
		
		
	}

	public String getDogTarih() {
		
		return dogTarih;
		
}
	public int yasHesapla(String dogTarih) {
		
	
	String strDate=dogTarih;
	LocalDate bugunDate=LocalDate.now();
	DateTimeFormatter format=DateTimeFormatter.ofPattern("MM/dd/yyyy");
	LocalDate dTarihi=LocalDate.parse(strDate,format); //Kullacinin String girdigi MM/dd/yyyy formata gore parcala
	
	int age=bugunDate.getYear()-dTarihi.getYear();// kullanicinin yasi hesaplandi.
	return age;
	}
	
}

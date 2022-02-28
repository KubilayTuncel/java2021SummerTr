package day37_inheritanceOverriding;

public class C02_Formen extends C02_Isci {
	
	public String sorumluOldBolum="Bakim";
	public String isim="Emrullah";
	
	public static void main(String[] args) {
		
		//Inheritance'da data turu olarak class ismi kullanimi
		//Bir class'da obje iretirken data turu olarak class'in kendisini veya parentlarini kullaniriz.
		//Olusturdugumuz obje ile variable kullanmamiz gerekirse, hangi degeri alacagina anlamak icin 
		//once Data turu olan class'a gideriz orada aradigimiz variable varsa kullaniriz,
		//yoksa parentlarina bakariz, yukari dogru giderken olk buldugumuz degeri kullaniriz
		
		C02_Formen fr1=new C02_Formen();
		fr1.sorumluOldBolum="Marangozhane";
		fr1.maas=2000;
		System.out.println(fr1.isim+ " "+ fr1.sorumluOldBolum+ " "+ fr1.maas);
		//Kubilay Marangozhane 2000
		
		C02_Isci fr2=new C02_Formen();
		
		//data turu olarak isci secildii icin
		fr2.bolum="Kaynak Atolyesi";
		// fr2.isim="Yakup";
		System.out.println(fr2.isim+ " "+ fr2.bolum+ " "+ fr2.maas);
		//Yakup Kaynak Atolyesi 10000
		//Mesut Kaynak Atolyesi 10000
		
		C02_Personel fr3=new C02_Formen();
		System.out.println(fr3.isim); //Kubilay
	}

}

package day37_inheritanceOverriding;

public class C02_Isci extends C02_Personel {
	
	public String bolum="Kaynak Atolyesi";
	public int maas=5000;
	public String isim="Mesut";
	
	public int maasHesapla() {
		
		return (30*8*30);
		
	}

	public void mesai() {
		
		System.out.println("isciler gunluk 8 saat calisir");
		
	}
	
	//Overloding : ayni isimde ama farkli method signoture larina sahip methodlar.
	
	
}

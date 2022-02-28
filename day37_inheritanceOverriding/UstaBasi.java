package day37_inheritanceOverriding;

public class UstaBasi extends Isci{
	
	public String bolum="Bakimhane";
	public int sorumluOldIsci=20;

	public static void main(String[] args) {
		
		UstaBasi ub1=new UstaBasi();
		
		System.out.println(ub1.bolum);
		System.out.println(ub1.sorumluOldIsci);
		System.out.println(ub1.saatUcreti);
		System.out.println(ub1.isim);
		
		UstaBasi ub2=new UstaBasi();
		
		//Extens ile birbirine bagli olan class larda Is A relation data turleri
		//istege bagli olarak kullanilir.
		//daha genis data turu yazmanin avantaji kapsamin daha genis olmasi
		//Daha genis data turu yazmanin dezavantaji : Data turu olarak sectigimiz class ve parent'larina ait data turlerine ulasabiliriz

	}

}

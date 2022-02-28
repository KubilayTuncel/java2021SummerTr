package day36_inheritance;

public class Muhasebe extends Personel {
	/*
	 * Muhasebe class'inin personel Class'inin child i oldugunu deklere etmek icin
	 *  class ismine extend keyword ile yazilir
	 */
	
	public int saatUcreti;
	public String statu;
	public int maas;
	
	public int maasHesapla() {
		
		maas=30*8*saatUcreti;
		
		return maas;
		
	}

}

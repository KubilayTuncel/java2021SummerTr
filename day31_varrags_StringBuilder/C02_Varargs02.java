package day31_varrags_StringBuilder;

public class C02_Varargs02 {

	public static void main(String[] args) {
		// verilen iki sayinin toplamini bulan bir method yaziniz
        // verilen uc sayinin toplamini bulan bir method yaziniz
        
        int sayi1=17;
        int sayi2=20;
        int sayi3=35;
        
        topla(17,20,35);
        ikiSayiTopla(sayi1,sayi2);
        ucSayiTopla(sayi1,sayi2,sayi3);
        Carp(1,2,3,45,6,7,8);
    }
    private static void Carp(int... i) {
		// Varargs icin method gibi olusturulur sadece 3 nokta ekleniyor.
		
    	int carpim=1;
    	for (int j : i) {
			carpim*=j;
			
		}
    	System.out.println("Benim yaptigim varargs sonucu : "+carpim);
	}
	private static void ucSayiTopla(int sayi1,int sayi2, int sayi3) {
        System.out.println("uc sayi toplami : "+(sayi1+sayi2+sayi3));
        
    }
    private static void ikiSayiTopla(int sayi1,int sayi2) {
        
        System.out.println("iki sayi toplami : "+(sayi1+sayi2));
        
    }
    public static void topla(int ... sayi) {
        
        int toplam=0;
        for (int i : sayi) {
            toplam+=i;
        }
        System.out.println("varargs toplam : "+toplam);

	}

}

package day31_varrags_StringBuilder;

public class C03_Varargs03 {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.
int topla1=topla(2,5,55,21,33);
 topla(0, 45,35,34);
 topla1=topla(3, 1,23,4,5,43,22,56,78,7,9);
 System.out.println(topla(0, 45,35,34));
 System.out.println(topla1);

}
private static int topla(int carpilacakSayi, int ...toplanacaklar) {
int toplam=0;

for (int each : toplanacaklar) {
    toplam+=each;
}
int sonuc=carpilacakSayi*toplam;

return sonuc;

	}

}

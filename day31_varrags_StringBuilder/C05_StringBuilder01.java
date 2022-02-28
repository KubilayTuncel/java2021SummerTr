package day31_varrags_StringBuilder;

public class C05_StringBuilder01 {

	public static void main(String[] args) {
		/*
        1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
         StringBuilder  class'i uretmistir.
        2) Java'da StringBuilder ile hemen hemen ayni isi yapan birde StringBuffer clasi vardir.
        "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
        "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
        "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
        3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
            Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
            
     */
    String s="sabah nur";
    concat(s);
    System.out.println(s);
    /*
     String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.            
    Bunun iki sebebi vardir:
        1) Java pass-by-value kullanir 2) String Class'i immutable Class'dir.
     */
}
private static void concat(String s) {
    System.out.println(s+" dagtekin");
    

	}

}

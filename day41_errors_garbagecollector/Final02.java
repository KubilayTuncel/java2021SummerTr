package day41_errors_garbagecollector;

public class Final02 extends Final01{

	public static void main(String[] args) {
	System.out.println(FinalFinallyFinalized.SAYI2);

	//FinalFinallyFinalized.SAYI2=40;
	//final variable lar static tanimlansa bile degistirilemez
	//final static variable isimlerini Java mavi ve bold yapar
	//bizde convention olarak buyuk harfle yazmaliyiz
	
	Final02 obj=new Final02();
	
	obj.deneme();
	obj.deneme2();
	
	
	}

	public static void deneme() {
		// TODO Auto-generated method stub
		
	}
	 /*public static void deneme2() {
			// final inheritance da kullanilamaz
			
		}
		*/

}

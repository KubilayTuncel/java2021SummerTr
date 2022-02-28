package day15_forLoops;

public class C02_ForLoop01 {

	public static void main(String[] args) {
		// 10'dan 20 ye kadar olan sayilari yazdiran bir forloop olusturunuz
		
		for (int i=10;i<=20;i++) {
			
			System.out.print(i+" ");
			
		}

		//100 ile 200 dahil aralarindaki 10 ile bolunebilen sayilari yazdirin.
		System.out.println("");
		for (int k=100;k<=200;k+=10) {
			
			System.out.print(k+" ");
			
		}
		
		//50'den 10'ye kadar (sinirlar dahil) 3'er 3'er gero sayarak yazdiralim.
		System.out.println("");
		for(int i=50;i>=10;i-=3) {
			
			System.out.print(i+" ");
			
		}
		
		//50 ile 100 arasinda uc ile bolunebilen sayilari yazdirin
		System.out.println("");
		for (int i=50; i<=100; i++) {
			
			if(i%3==0) {
				
				System.out.print(i+ " ");
				
			}
			
		}
		
	}

}

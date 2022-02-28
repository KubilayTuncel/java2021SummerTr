package day15_forLoops;

import java.util.Scanner;

public class C06_ForLoop05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir sayi giriniz:");
		int sayi=scan.nextInt();
		
		for (int i=1;i<=sayi;i++) {
			
			if (i%3==0 && i%5==0) {
				
				System.out.print(" java guzeldir, ");
				
			}else if (i%5==0) {
				
				System.out.print(" guzeldir, ");
				
			}else if (i%3==0) {
				
				System.out.print(" java, ");
				
			}else {
				System.out.print(i+" ");
			}
			
		}
		
		scan.close();

	}

}

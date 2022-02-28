package day50_lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda03 {
	 public static void main(String[] args) {
	        List<Integer>l=new ArrayList<>(Arrays.asList(7,12,14,4,9,2,4,12,16));
	        ilkDortEleman(l);
	        System.out.println();
	        ilkDortElemanGec(l);
	        System.out.println();
	        araElemanBul(l);
	    
	   
		
	}
		//1) küçükten büyüğe sırala sonra ilk 4 elemanı yazdır
	    public static void ilkDortEleman(List<Integer> l) {
	        l.stream().sorted().limit(4).forEach(methodLambda02::bosluklaYazdir);
	    }
	    //2) küçükten büyüğe sırala ilk 4 elemanı atla
	    public static void ilkDortElemanGec(List<Integer> l) {
	        l.stream().sorted().skip(4).forEach(methodLambda02::bosluklaYazdir);
	    }
	    //3)3 ile 6 arasindaki list elemanlarini yazdir
	    public static void araElemanBul(List<Integer> l) {
			l.stream().sorted().limit(6).skip(3).forEach(methodLambda02::bosluklaYazdir);
			System.out.println();
			l.stream().sorted().skip(3).limit(3).forEach(methodLambda02::bosluklaYazdir);
	    
	    }
}

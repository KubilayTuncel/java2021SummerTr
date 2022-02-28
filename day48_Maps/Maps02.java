package day48_Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps02 {

	public static void main(String[] args) {
	//Asagida Verilen bir map'te yazilim dili java olan kisi isimlerini bir liste olarak yazdiran bir method yazdirin.
		Map<Integer, String> map1 =new HashMap<>();
		
		map1.put(101, "Ali, Can, Java");
		map1.put(102, "Veli, Yan, Java");
		map1.put(103, "Ali, Yan, C#");
	
		String istenenDil="Java";
		List<String> isimList=javaBilenler(map1,istenenDil);
		System.out.println(isimList);

	}

	private static List<String> javaBilenler(Map<Integer, String> map1, String istenenDil) {
		
		List<String> isimList=new ArrayList<>();
		
		for (String each : map1.values()) {
			String arr[]=each.split(", ");
			
			if (arr[2].equalsIgnoreCase(istenenDil)) {
				isimList.add(arr[0]);
			}
		}
		
		System.out.println(map1.values()); // [Ali, Can, Java, Veli, Yan, Java, Ali, Yan, C#]
		
		return isimList;
	} 

}

package day48_Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps01 {

	public static void main(String[] args) {
	Map<Integer, String> map1 =new HashMap<>();
	HashMap<Integer, String> map2 =new HashMap<>();
	
	map1.put(101, "Ali, Can, Java");
	map1.put(102, "Veli, Yan, Java");
	map1.put(103, "Ali, Yan, C#");
	System.out.println(map1); // {101=Ali, Can, Java, 102=Veli, Yan, Java, 103=Ali, Yan, C#}
	
	map2.put(101, "Vehpi, Bas, Java");
	map2.put(102, "Esra, Coban, SQL");
	
	System.out.println(map2); // {101=Vehpi, Bas, Java, 102=Esra, Coban, SQL}
	
	map1.putAll(map2);
	System.out.println(map1); //  {101=Vehpi, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#}
	// eger key ler ayniysa direk uzerine yeni geleni yazar
	
	map2.put(104, "Ömer, Ari, SQL");
	map1.putAll(map2);
	System.out.println(map1); // {101=Vehpi, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Ömer, Ari, SQL}
	
	map1.putIfAbsent(102, "Ahmet, Demir, Java");
	System.out.println(map1); // {101=Vehpi, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Ömer, Ari, SQL}
	
	map1.putIfAbsent(100, "Ahmet, Demir, Java");
	System.out.println(map1); // {100=Ahmet, Demir, Java, 101=Vehpi, Bas, Java, 102=Esra, Coban, SQL, 103=Ali, Yan, C#, 104=Ömer, Ari, SQL}
	
	System.out.println(map1.containsKey(101)); // true
	System.out.println(map1.containsValue("java")); //false
	System.out.println(map1.containsValue("Vehpi, Bas, Java")); // true (value tam esit olmalidir sadece tek String e bakmaz)
	
	
	
	}

}

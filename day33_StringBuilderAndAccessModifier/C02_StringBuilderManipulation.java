package day33_StringBuilderAndAccessModifier;

public class C02_StringBuilderManipulation {

	public static void main(String[] args) {
		// Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak cümleyi ters çeviren
		// ve cümlenin palindrom olup olmadigini kontrol eden (buyuk/kucuk harf duyarliligi olmadan)
		// bir Java programi yazin. (without case sensitivity)
		
	    // Eg : input : I love Java
	    // Output: "Reversed sentence : avaJ evol I .
	    // It is not a palindrome"

		String str  = "tras neden sart";
		
		StringBuilder sB = new StringBuilder();
		
		sB.append(str);
		
		String tersString = sB.reverse().toString();
		
		if (str.equalsIgnoreCase(str)) {
			
			System.out.println("Girdiginiz cumle polindrome' dur ===> " + tersString);
			
		}
		
		else {
			
			System.out.println("Girdiginiz cumle polindrome degildir " + tersString);
			
		}

	}

}

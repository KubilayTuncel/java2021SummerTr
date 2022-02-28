package day34_accessModifier;

public class C02_GetSetMethodu02 {

	public static void main(String[] args) {
		
		C01_GetSetMethodu01 insan1=new C01_GetSetMethodu01();
		
		insan1.name="Kubilay";
		insan1.surName="Tuncel";
		insan1.yasAta(-31);
		System.out.println(insan1.name);
		System.out.println(insan1.surName);
		System.out.println(insan1.yasGoster());
		
	}

}

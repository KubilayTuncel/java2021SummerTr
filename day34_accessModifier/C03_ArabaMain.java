package day34_accessModifier;

public class C03_ArabaMain {

	public static void main(String[] args) {
	
		C04_Araba volvo=new C04_Araba("xc90", "beyaz", -2000, -2010);
		C04_Araba audi=new C04_Araba("Q7", "bej", -1500, -2005);
		C04_Araba honda=new C04_Araba();
		honda.model="Accord";
		honda.renk="gri";
		honda.setYil(1999);
		honda.setMotor(1400);
		System.out.println(honda.getYil());
		

	}

}

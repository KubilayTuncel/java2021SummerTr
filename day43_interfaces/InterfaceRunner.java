package day43_interfaces;

public class InterfaceRunner implements Interfaces02 {

	public static void main(String[] args) {
		
		//Static olarak tanimlanmis bir veriable veya method baska class'dan classIsmi.methodIsmi seklinde cagrilabilir
		
		Interfaces02.denem2();
		
		//default keyword'u ile olusturdugumuz method ise obje uzerinden cagirilabilir.
		
		InterfaceRunner obj1= new InterfaceRunner();
		obj1.deneme();

	}

}

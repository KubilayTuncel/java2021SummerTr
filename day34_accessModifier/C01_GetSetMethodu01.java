package day34_accessModifier;

public class C01_GetSetMethodu01 {
	
	String name;
	String surName;
	private int age;

	public static void main(String[] args) {
	

	}

	public void yasAta(int age) {
		if (age<0) {
			
			this.age=-age;
						
		}else this.age=age;
		
	}
	public int yasGoster() {

		return this.age;
	}
	
}

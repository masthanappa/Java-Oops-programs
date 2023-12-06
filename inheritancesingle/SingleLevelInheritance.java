package com.kn.inheritancesingle;

public class SingleLevelInheritance {

	public static void main(String[] args) {
		
		Parent p1=new Parent();
		p1.eyeColor="yellow";
		System.out.println("========");
		System.out.println("Parent");
	    System.out.println("eyeColor" +p1.eyeColor);
	    
	    
		Child c1 = new Child();
		c1.eyeColor="Blue";
		System.out.println("============");
		System.out.println("Child");
		System.out.println("eyeColor" +c1.eyeColor);
		

	}

}

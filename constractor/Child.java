package com.kn.constractor;

public class Child extends Parent {

	String name;
	int age;
	
	public Child(int age) {
		this("Ramu",2);
		System.out.println("Child 1-int arg");
		this.age=age;
		
	}

	public Child(String name, int age) {
		//super(name,age);
		System.out.println("Child Name="+this.name);
		System.out.println("Child age="+this.age);
		this.name=name;
		this.age=age;
		
		System.out.println("Parent Name="+super.name);
        System.out.println("Parent age="+super.age);
		

		System.out.println("Child Name="+this.name);
        System.out.println("Child age="+this.age);
	}
}

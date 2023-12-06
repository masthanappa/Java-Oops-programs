package com.kn.encapsulation;

public class DogDemo {

	public static void main(String[] args) {
		Dog d1=new Dog("kutti","pink",6,"breed");
		System.out.println("name="+d1.getName());
		System.out.println("color="+d1.getColor());
		System.out.println("age="+d1.getAge());
		System.out.println("breed="+d1.getBereed());
		
        d1.setName("jani");
        d1.setColor("black");
        d1.setAge(9);
        d1.setBereed("breede");
        System.out.println("===>>>name="+d1.getName());
        System.out.println("===<<<color="+d1.getColor());
        System.out.println("===>>>age="+d1.getAge());
        System.out.println("===<<<breed="+d1.getBereed());


	}

}

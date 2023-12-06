package com.kn.inheritancemultilevel;

public class MultiLevelInheritanceDemo {

	public static void main(String[] args) {
		
		Vehical v1 = new Vehical();
		v1.registrationNumber=8552;
		System.out.println("Vhical");
		System.out.println("Vehical"+v1.registrationNumber);
		
        Car c1 = new Car();
        c1.registrationNumber=111;
        System.out.println("Car");
        System.out.println("Car="+c1.registrationNumber);
        
        Sedan s1= new Sedan();
        s1.registrationNumber=143;
        System.out.println("Sedan");
        System.out.println("Sedan"+s1.registrationNumber);
	}

}

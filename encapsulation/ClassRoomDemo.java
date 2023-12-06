package com.kn.encapsulation;

import java.util.Scanner;

public class ClassRoomDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ClassRoom c1 = new ClassRoom();
		System.out.println("temprature ="+c1.getTemprature());
		System.out.println("Enter temprature =");
		c1.setTmprature(scan.nextInt());
		System.out.println("temprature ="+ c1.getTemprature());
		
		
		
		

	}

}
 
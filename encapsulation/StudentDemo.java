package com.kn.encapsulation;

public class StudentDemo {

	public static void main(String[] args) {
		Student s1=new Student(111,"manu",99,"male");
		System.out.println("rollNumber="+s1.getRollNumber());
		System.out.println("name="+s1.getName());
		System.out.println("marks="+s1.getMarks());
		System.out.println("gender="+s1.getGender());
		
s1.setRollNumber(123);
s1.setName("ram");
s1.setMarks(80);
s1.setGender("male");
System.out.println("==<<<rollNumber="+s1.getRollNumber());
System.out.println("===<<<name="+s1.getName());
System.out.println("===<<<marks="+s1.getMarks());
System.out.println("===<<<gender="+s1.getGender());

	}

}

package com.kn.encapsulation;

public class Student {

	private int rollNumber;
	private String name;
	private int marks;
	private String gender;
	//Gettr And Settr 
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	//Alt Shift s o
	public Student(int rollNumber, String name, int marks, String gender) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.marks = marks;
		this.gender = gender;
	}

}

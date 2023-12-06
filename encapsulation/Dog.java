package com.kn.encapsulation;

public class Dog {

	String name;
	String color;
	int age;
	String bereed;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBereed() {
		return bereed;
	}
	public void setBereed(String bereed) {
		this.bereed = bereed;
	}
	//alt shift s o
	public Dog(String name, String color, int age, String bereed) {
		super();
		this.name = name;
		this.color = color;
		this.age = age;
		this.bereed = bereed;
	}
	
	}
	


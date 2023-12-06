package com.kn.constractor;

public class EngStudent extends Student {

	String branch;
	int sem;
	public EngStudent(String name,int age,String branch,int sem) {
		super(name,age);
		this.branch=branch;
	    this.sem=sem;
	}
	public Student() {
	}
    public Student(String name) {
    	this.name=name;
    }
    public Student(int age) {
    	this("Arun");
    	this.age=age;
    	
    }
}

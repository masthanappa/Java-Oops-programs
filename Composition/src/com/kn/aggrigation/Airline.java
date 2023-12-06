package com.kn.aggrigation;

public class Airline {

	String name;
	Pilot pilot;
	
	public Airline(String name, Pilot  pilot) {
		this.name=name;
		this.pilot=pilot;
	}
		public void opreation() {
			System.out.println(this.name+ "is Opreating Sucssfully");
			pilot.fly();
		}
		
	}
	


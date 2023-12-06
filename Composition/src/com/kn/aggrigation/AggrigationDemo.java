package com.kn.aggrigation;

public class AggrigationDemo {

	
	public static void main(String[] args) {
		
		Pilot pilot = new Pilot("Flying Beast");
		Airline airline = new Airline("Emirates", pilot);
		
		airline.opreation();
		
		airline=null;
		System.out.println("----->Airaline has been SHUTDOWN.");
		pilot.fly();
				
	}
}

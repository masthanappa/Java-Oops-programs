package com.kn.encapsulation;

public class ClassRoom {

	private int temprature;
	
	public int getTemprature() {
		return this.temprature;
	}
	 public void setTmprature(int temprature) {
		 
		 if(temprature >= 16 && temprature<=25) {
			 this.temprature=temprature;
		 }else {
			 System.out.println("invalid temprature it must be in range of 16 to 25");
		 }
		  
	}
}

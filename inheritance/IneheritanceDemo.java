package com.kn.inheritance;

public class IneheritanceDemo {

	public static void main(String[] args) {
		chefRobo chef1 = new chefRobo();
		chef1.name="Chitti";
		chef1.type="v2.0";
		chef1.walk();
		chef1.talk();
		chef1.charge();
		
		DriverRobo d=new DriverRobo();
		d.drive();
		
		TeacherRobo t=new TeacherRobo();
		t.teach();
		

	
	}
}

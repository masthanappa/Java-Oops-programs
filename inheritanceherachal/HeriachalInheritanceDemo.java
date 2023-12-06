package com.kn.inheritanceherachal;

public class HeriachalInheritanceDemo {

	public static void main(String[] args) {
	
		Employee e1=new Employee();
		e1.name="Manu";
		e1.salary=200000;
		System.out.println("Employee");
		System.out.println("Name"+e1.name + " salary "+e1.salary);
     
		Devloper d1=new Devloper();
		d1.name="Seenu";
		d1.salary=10000;
		System.out.println("Devloper");
		System.out.println("Name"+d1.name + " salary "+d1.salary);
		
		TestEngineer t=new TestEngineer();
		t.name="Ram";
		t.salary=50000;
		System.out.println("TestEngineer");
		System.out.println("Name"+t.name + " salary "+t.salary);
		
		Manager m=new Manager();
		m.name="Somu";
		m.salary=80000;
		System.out.println("Manager");
		System.out.println("Name"+m.name + " salary "+m.salary);
		
		TeamLead tl=new TeamLead();
		tl.name="Giri";
		tl.salary=120000;
		System.out.println("TeamLeadr");
		System.out.println("Name"+tl.name + " salary "+tl.salary);
	     
	     
		
	     
	     
	}

}

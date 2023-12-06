package cim.kn.inheritancehybrid;

public class HybridInheritance {

	public static void main(String[] args) {
	
		Student s1= new Student();
		s1.name="Manu";
		System.out.println("Student");
		System.out.println("name"+s1.name);
		
		EnguneeringStudent es= new EnguneeringStudent();
		es.name="Giri";
		System.out.println("Engineering Student");
		System.out.println("name"+es.name);
		
		MedicalStudent ms= new MedicalStudent();
		ms.name="Mayuri";
		System.out.println("Medical Student");
		System.out.println("name"+ms.name);
		
		Trainer t1=new Trainer();
		t1.name="Arun";
		System.out.println("Trainer");
		System.out.println("name"+t1.name);
		
        JavaTrainer jt=new JavaTrainer();
        jt.name="Hanuma";
        System.out.println("Java Trainer");
        System.out.println("name"+jt.name);
        
        SqlTrainer st = new SqlTrainer();
        jt.name="keshv";
        System.out.println("Sql Trainer");
        System.out.println("name"+jt.name);
	}

}

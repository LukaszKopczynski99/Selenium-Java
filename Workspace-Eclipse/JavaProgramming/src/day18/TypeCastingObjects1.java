package day18;

class Parent{
	String name = "John";
	
	void m1() {
		System.out.println("This is m1 from parent...");
	}
}

class Child extends Parent {
	int id=101;
	
	void m2() {
		System.out.println("This is m2 from child ...");
	}
}


public class TypeCastingObjects1 {

	public static void main(String[] args) {
		
//		Child c = new Child();
//		System.out.println(c.name);
//		c.m1();
//		System.out.println(c.id);
//		c.m2();
//		
		
//		Parent p = new Child(); // upcasting
//		System.out.println(p.name);
//		p.m1();
		// System.out.println(p.id); - we can not access
		// p.m2(); - we can not access 
		
		
		//downcasting
//		Child c = (Child) new Parent ();
//		
//		System.out.println(c.name);
//		System.out.println(c.id);
//		c.m1();
//		c.m2();
		
		
	}

}

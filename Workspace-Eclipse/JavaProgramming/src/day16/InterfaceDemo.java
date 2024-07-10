package day16;

interface Shape{
	int lenght=10; //final and static as a default
	int width=10;
	
	void cyrcle(); //abstract method - no implementation
	
	 default void square() {
		 System.out.println("this is square...");
		 
	 }
	 
	  static void rectangle() {
		 System.out.println("This is rectangle - static method");
	 }
	
}

public class InterfaceDemo implements Shape {

	public void cyrcle() {
		System.out.println("This is circle - abstract method");
	}
	
	void triangle() {
		System.out.println("this is triangle... ");
	}
	
	public static void main(String[] args) {
		
		//Scenario 1
		
//		InterfaceDemo idobj = new InterfaceDemo();
//		idobj.cyrcle(); //abstract
//		idobj.square(); //default
//		Shape.rectangle(); //static method can directly can access from interface

		//Scenario 2
		
		Shape sh = new InterfaceDemo();
		
		sh.cyrcle(); // abstract method
		sh.square(); //default method
		Shape.rectangle(); // static method can directly access from interface
	}

	

}

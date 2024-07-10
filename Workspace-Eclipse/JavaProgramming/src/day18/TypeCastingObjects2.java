package day18;

//Cat ct = (Cat) an;
//A	  B 	C 	  D

//   RULES: 
//1) There should be some relationship between C and D 
//2) 'C' must be either same or child of 'A'
//3) The underlying object type of 'd' must be either same or child of 'C'

class Animal {}

class Dog extends Animal{}
class Cat extends Animal{}


public class TypeCastingObjects2 {

	public static void main(String[] args) {
		
//		Animal an=new Dog();
//		Cat ct=(Cat) an; // valid as per rule 1
//		Dog dg = new Dog();
//		Cat ct = (Cat) dg; // invalid as per Rule 1

//		Animal an = new Dog();
//		Cat ct = (Cat) an; // valid as per Rule 2 
		
//		Animal an = new Dog();
//		Cat ct = (Cat) an; // invalid as per Rule 3
		
		Animal an = new Dog();
		Dog dg = (Dog) an;
	}

}

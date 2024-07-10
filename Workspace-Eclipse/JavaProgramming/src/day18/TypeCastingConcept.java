package day18;

//Upcasting - converting value from smaller --> larger (automatic)

// int ---> long 
//float ---> double 

//Downcasting - converting value from larger --> smaller
//long --> int 
//double --> float 

public class TypeCastingConcept {

	public static void main(String[] args) {
		
		//upcasting - automatic ----- smaller to larger
//		int intvalue = 100;
//		long longvalue = intvalue; 
//		System.out.println(longvalue);
		
//		float floatvalue = 10.5f;
//		double doublevalue = floatvalue;
//		System.out.println(doublevalue);
		
		//downcasting - manually --- larger to smaller 
		
//		long longvalue =100000;
//		int intvalue = (int) longvalue;
//		System.out.println(intvalue);
		
		double doublevalue=125.555555555;
		float floatvalue = (float) doublevalue;
		System.out.println(floatvalue);

		
	}

}

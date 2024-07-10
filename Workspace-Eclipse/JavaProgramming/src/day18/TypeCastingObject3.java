package day18;

//A b = (C) d;

//RULES: 
//1) There should be some relationship between C and D 
//2) 'C' must be either same or child of 'A'
//3) The underlying object type of 'd' must be either same or child of 'C'

public class TypeCastingObject3 {

	public static void main(String[] args) {
		
//		Ex1
//		Object o = new String("welcome");
//		StringBuffer sb = (StringBuffer) o;// Rule1 - yes , Rule 2 - yes , Rule 3 - failed
		
		//Ex2
//		String s = new String ("welcome");
//		StringBuffer sb = (StringBuffer) s; //Rule 1 - failed - do not check other Rules
		
		//Ex3
//		Object o = new String("welcome");
//		StringBuffer sb = (StringBuffer) o; //Rule1- yes, Rule 2-yes, Rule3- failed
		
		//Ex4
//		Object o = new String("welcome");
//		StringBuffer sb = (String) o; //Rule1- yes, Rule2- failed - Rule3- no need to check
		
		
		//Ex5:
//		String s = new String("welcome");
//		StringBuffer sb=(String) s; //Rule1-yes, Rule2-failed
		
		//Ex6:
//		Object o = new String("welcome");
//		StringBuffer sb=(StringBuffer) o; //Rule1 - passed Rule2 - passed Rule3-failed
		
		//Ex7:
		Object o = new String("welcome");
		String s = (String) o; //Rule 1 - passed , Rule 2- passed , Rule 3 - passed
		System.out.println(s);
		
	}

}

package day17;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String --> int 
		
		//String s = "welcome"; // cannot convert to int because this is not a number
		
		
//		String s1="10";
//		String s2="20";
//		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); 
		
	
		//String --> double
//		String s1="10.5";
//		String s2="20.0";
//		
//		System.out.println(Double.parseDouble(s1)+Double.parseDouble(s2));
		
		//String -> Boolean
//		String s="tRuE"; // it will return false if u pass other things than false
//		System.out.println(Boolean.parseBoolean(s));
		
		//int, double, bool, char ---> String
		
		int a =10;
		double d=10.5;
		char c='A';
		boolean bool=true;
		
		String s=String.valueOf(a);
		System.out.println(s);
		
		String db = String.valueOf(d);
		System.out.println(db);
		
		String ch = String.valueOf(c);
		System.out.println(ch);
		
		String bo = String.valueOf(bool);
		System.out.println(bo);
		
		System.out.println(s+db+ch+bo);
		
		
		
		
		

	}

}

package StrMetods;

import java.util.Arrays;

public class StringMetods {

	public static void main(String[] args) {
		
		String s="welcome";
		String ns=new String("other string");
		
		System.out.println(ns);
		
		//lenght() metod - number of character in the string 
		
		int lenS=s.length();
		System.out.println(lenS);
		
		//concat - joining strings
		
		String s1="welcome";
		String s2="to java";
		String s3=" automation";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println(s1.concat(s2).concat(s3));
		
		//trim - remove spaces right and the left side
		String sTrim="   welcome   ";
		int lbefore = sTrim.length();
		System.out.println(sTrim);
		System.out.println(sTrim.trim());
		int lafter = (sTrim.trim()).length();
		
		System.out.println(lbefore);
		System.out.println(lafter);
		
		//charAt() - return a character frome a string based on index
		//index ALWAYS starts from 0
		s="welcome";
		System.out.println(s.charAt(3));
		
		//contains()
		String part = "wel";
		System.out.println(s.contains(part));
		
		//equals(), equalIgnoreCase() - comare string 
		
		s1="welcome";
		s2="welcome";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals("welcome"));
		System.out.println(s1.equalsIgnoreCase("WeLcoMe"));
		
		//replace() - replace single or multiple characters in a string
		
		String replaceMe="welcome to selenium java selenium python selenium c#";
		
		String replaced = replaceMe.replace('e', 'X');
		
		System.out.println(replaced);
		
		String big_replace = replaceMe.replace("selenium", "HUGO");
		
		System.out.println(big_replace);
		
		//substring() - extract substring from the main string 
		
		s="Selenium";
		System.out.println(s.substring(2,4));
		
		//Converting the case
		//toUpperCase() toLowerCase()
		
		s="Welcome";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		
		//split() - split the string into multiple parts based on delimeter
		
		s="abc@gmail.com";
		String spliter []=s.split("@");
		System.out.println(spliter[0]);
		System.out.println(spliter[1]);
		
		//ex1
		String amount="$15,20,55";
		
		System.out.println(amount.replace("$","").replace(",", ""));
		
		//ex2
		
		s="abc,123@xyz";
		
		String arr[] = s.split(",");
		System.out.println(Arrays.toString(arr));
		String arr2[] = arr[1].split("@");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println(arr[0]+"\n"+arr2[0]+"\n"+arr2[1]);
		
		s="abc 123";
		String ar[] = s.split(" ");
		System.out.println(Arrays.toString(ar));
		
		//ex4 
		
		String name ="John Kenedy";
		//john - is part of the string or not 
		String arrSplit[] = name.split(" ");
		
		System.out.println(arrSplit[0].equalsIgnoreCase("john"));
		
		
		
		
		
		
		
	
		
	}

}

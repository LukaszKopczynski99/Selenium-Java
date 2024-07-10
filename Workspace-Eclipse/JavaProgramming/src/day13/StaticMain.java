package day13;

public class StaticMain {
	public static void main(String[] args) 
	{
		//1) static method can access static stuff directly (without object)
		System.out.println(StaticDemo.a);
		StaticDemo.m1();
		
		//System.out.println(b); cannot access b is non-statc
		//m2(); // cannot access, m2() is non-static 
		
		//2) static methods can access non-static stuff through object
	
		StaticDemo sd = new StaticDemo ();
		System.out.println(sd.b);
		sd.m2();
		//3) non-static methods can access everything direclty. 
		sd.m();
	}
}

package day13;

public class StaticDemo 
{

	static int a=10; // static variable
	int b=20; 	//non static variable
	
	static void m1()
	{
		System.out.println("this is m1 static method ... ");
	}
	
	void m2() 
	{
		System.out.println("This is m2 non-static method... ");
	}
	
	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	/*public static void main(String[] args) 
	{
		//1) static method can access static stuff directly (without object)
		//System.out.println(a);
		//m1();
		
		//System.out.println(b); cannot access b is non-statc
		//m2(); // cannot access, m2() is non-static 
		
		//2) static methods can access non-static stuff through object
		
		StaticDemo sd = new StaticDemo ();
		//System.out.println(sd.b);
		//sd.m2();
		//3) non-static methods can access everything direclty. 
		sd.m(); 
	} */
	

}

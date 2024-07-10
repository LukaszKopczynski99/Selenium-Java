package day11_Classes;

public class ConstructorDemo {

	int x,y;
	ConstructorDemo(){ // default constractor
		x=100;
		y=200;
	}
	ConstructorDemo(int a, int b){ // parametreized constractor 
		x=a;
		y=b;
	}
	
	
	
	void sum() {
		System.out.println(x+y);
	}
	
	
	public static void main(String[] args) {
		
		//ConstructorDemo cd = new ConstructorDemo(); //invoke default constructor
		ConstructorDemo cd=new ConstructorDemo(10,20); //parametreized  constructor
		
		cd.sum();

	}
	
	

}

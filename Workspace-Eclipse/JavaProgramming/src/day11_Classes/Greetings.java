package day11_Classes;

public class Greetings {

	//1) No params / No Return value
	
	void m1(){
		System.out.println("FL STUDIO");
	}
	
	//2) No params / Return value
	
	String m2(){
		return "FL Studio is the best DAW";
	}
	
	//3) Takes params / No return value
	
	void m3(String name){
		System.out.println("Hello "+name);
		
	}
	
	//4) Takes params / Return values
	
	float m4(float pierw) {
		return (float) Math.sqrt(pierw);
	}
	
	String m5(String name){
		return ("Hello "+name);
		
	}
	
}

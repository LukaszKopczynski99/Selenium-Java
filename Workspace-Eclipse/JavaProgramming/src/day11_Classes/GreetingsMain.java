package day11_Classes;

public class GreetingsMain {

	public static void main(String[] args) {
		
		String name = "Lukasz";
		
		Greetings gr=new Greetings();
		gr.m1();//1

		String temp = gr.m2();//2
		System.out.println(temp);
		
		gr.m3(name);
		
		float pierw =(float)gr.m4(22);
		System.out.println(pierw);
		
		String s = gr.m5(name);
		System.out.println(s);
	}

}

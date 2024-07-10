package day12_Poli;

public class AdderMain {

	public static void main(String[] args) {
	
		Adder addobj = new Adder();
		
		addobj.sum(); //1
		
		addobj.sum(100, 200); //2
		
		addobj.sum(10, 10.5); //3
		
		addobj.sum(10.5, 2); //4
		
		addobj.sum(5, 5, 5); //5
		
		

	}

}

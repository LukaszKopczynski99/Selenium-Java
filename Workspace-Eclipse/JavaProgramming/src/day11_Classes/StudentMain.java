package day11_Classes;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu = new Student();
		
		//1) using object reference variables
//		stu.sid=101;
//		stu.sname="John";
//		stu.grad='A';
		
		// 2) using method
		
//		stu.setStudentData(101, "Lukasz", 'A');
//		stu.printStudentData(); 

		//3) Using Constructor 
		
		Student stu = new Student(101,"Lukasz",'A');
		stu.printStudentData();
	}

}

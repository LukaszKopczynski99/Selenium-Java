package day11_Classes;

public class Student {
	
	int sid;
	String sname;
	char grad;
	
	
	void printStudentData()
	{
		System.out.println(sid+" "+sname+" "+grad);
	}

	void setStudentData(int id, String name, char gr) {
		sid=id;
		sname=name;
		grad=gr;	
	}
	
	Student(int id, String name, char gr)
	{
		sid=id;
		sname=name;
		grad=gr;
	}
}

package day12_Poli;

public class Box {

	double width, height, depth;
	
	
	Box() // 1 defaul constructor - no params
	{ 
//		width = 0;
//		height = 0;
//		depth = 0;
		
		width=height=depth=0;
	}
	
	Box(double w, double h, double d) // paramterized const
	{ 
		width=w;
		height=h;
		depth=d;
	}
	
	Box(double len) //3
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return (width*height*depth);
		
	}
	
	
	
}

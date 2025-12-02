package Lesson1;

public class Swap2variables2 {

	public static void main(String[] args) {
		//Swap two variables
		
		// need to create temp string 
		
		String x = "Hello";
		String y ="World";
		String xx = "Hello";
		String yy ="World";
		String temp =null;
			
		temp=xx;
		xx=yy;
		yy=temp;
		
		x=y;	// you will get both World
		y=x; // you will get both World
		
		// syso+space key
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		
	
		System.out.println("xx: " + xx);
		System.out.println("yy: " + yy);
	}
		

}

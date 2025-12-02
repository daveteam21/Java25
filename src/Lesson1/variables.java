package Lesson1;

public class variables {

	public static void main(String[] args) {
		// Variable is a container where we can store data. A placeholder for a value  	
	
		// data type 	variable name		  assign		value
		//	int		 		a			    	=		      6;

		
	//	int a;		// (declaration) declare an empty variable not assigned yet and use it later
	//	a = 6; 		// Assignment 
		 int a = 6; //(declaration + assignment) Create a variable and assigned data at the same time
		System.out.println("a");// not with ""
		System.out.println(a); // Get the value of the variable you want to print the value from the variable
								// you have to just specify the variable inside the print statement
		
		a= 10;
		a=15;
		a=12;
		a=13;
		
		// the value of variable can always be varies 
		System.out.println(a);

	
	// Approach 1	all the variables belongs to different data types
		/*
		int c=3;
		String s = "David";
		int e=5;
		System.out.println(c);
		System.out.println(s);
		System.out.println(e);
		*/
		
		// Approach 2 All the variables are belongs to the same data type
		
		int c, e;
		c=6;
		e=5;
		
		System.out.println(c);
		System.out.println(e);
	/*	
		
		// Approach 3
		
		int c= 8, e=9;
			
		System.out.println(c);
		System.out.println(e);
		
		System.out.println(c+ " "+ e);
		*/
	}

}

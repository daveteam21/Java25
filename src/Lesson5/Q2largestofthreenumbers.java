package Lesson5;

public class Q2largestofthreenumbers {
	//Find the largest of three numbers using comparison operators.
	public static void main(String[] args) {
		
		  int x = 15, y = 30, z = 25;
	    

	        if (x >= y && x >= z )
	        {
	        	System.out.println("The largest number is: " + x);
	         
	        } 
	        else if (y >= x && y >= z)
	        {
	        	System.out.println("The largest number is: " + y);
	        }
	        else
	        {
	          System.out.println("The largest number is : " + z);
	        }

	        
	}

}

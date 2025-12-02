package Lesson4;

public class LoopingIterativeStatements
{

	public static void main(String[] args)
	{
		// Run the same piece of statement(code) over and over again until a certain condition is no longer true.
		// Don’t need to keep writing the same code multiple times.

		//1. for loop - Used when you know exactly how many times you want to repeat.
	//		for(initialization; condition; inc/dec) {
		//where to start, how many times repeats, inc/dec
			for (int i = 1; i <= 5; i++)
			{
            System.out.println("Count: " + i);
            //System.out.println("Count: " + 2);	// dont need to write statement over and over again
            //System.out.println("Count: " + 3);
			}
			System.out.println("______________________________________________________________");	
			for (int i = 1; i <= 5;)
			{
            System.out.println("Count: " + i);
            //System.out.println("Count: " + 2);	// dont need to write statement over and over again
            //System.out.println("Count: " + 3);
            i++;
            
			}
			System.out.println("______________________________________________________________");	
			int i = 1;
			for (; i <= 5;)
			{
            System.out.println("Count: " + i);
            //System.out.println("Count: " + 2);	// dont need to write statement over and over again
            //System.out.println("Count: " + 3);
            i++;
            
			}
			
			
			
	/*		System.out.println("_________________________infinite looping_____________________________________");	
			
			for (; ;) <-- blank condition is equal to True Always!!! 
			{
            System.out.println("Count: " + i);
            //System.out.println("Count: " + 2);	// dont need to write statement over and over again
            //System.out.println("Count: " + 3);
            i++;
            
			}
			
			System.out.println("_________________________infinite looping_____________________________________");	
			
			for (; true ;)// <-- blank condition is equal to True Always!!!   can not write false   
			{				// it is called Dead Code or Unreachable code
            System.out.println("Count: " + i);
            //System.out.println("Count: " + 2);	// dont need to write statement over and over again
            //System.out.println("Count: " + 3);
            i++;
			}
	
			
	/*		
			System.out.println("_________________________infinite looping_____________________________________");
			for (int z = 2;  ;z ++)
			{
				System.out.println("Hellooooo ");
           // System.out.println("Count: " + i);
            //System.out.println("Count: " + 2);	// dont need to write statement over and over again
            //System.out.println("Count: " + 3);
			}
	}
			}
	*/
			
		//2.while loop - when you don’t know how many times to loop.
			//Runs as long as the condition is true.
			int z = 1; // Initialization
	        while (z <= 5) { // condition 1,2,3,4,5  6 condition is false it will stop repeating
	            System.out.println("Number: " + z); // statements
	            z++;	//inc/dec
	        }
	    //3.do-while loop runs at least once (because condition is checked after execution).
	        
	    
	                int i1 = 5;
	                do {
	                    System.out.println("Value: " + i1);		//do runs the body first
	                    i1++;	//inc/dec
	                } while (i1 <= 5); // checks the condition is true
}	            }
	       



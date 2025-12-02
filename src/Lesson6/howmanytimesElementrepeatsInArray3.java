package Lesson6;

public class howmanytimesElementrepeatsInArray3
{		// how many times number repeated 
	

	public static void main(String[] args)
	
	{
		//32;15
	
		int a[] = {100,200,300,100,500,100,400}; 
		int findElement =100;
		int count =0; // count need to make zero
		
		for(int value:a) 
		{
			
				//System.out.println(a); // instead print x
				if(findElement == value ) // compare the value if value is equal to the number  	
				{
					count ++; //asap value immediate increase by 1 when it matches with the value it will increase
				}
				
		}	System.out.println("Found number " + findElement + " " + count + "Times");
				
	
	}
	
}


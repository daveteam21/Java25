package Lesson6;

public class SearchingElementInArray
{
	

	public static void main(String[] args)
	
	{
	
		int a[] = {100,200,300,400,500}; 
		int searchElement =400;
		
		/*
		for(int j=0; j<=a.length -1; j++)
		{
			if(a[j]==searchElement)
			{
				System.out.println("Found Element" + j);

				break;
			}
			else 
			{
				System.out.println("here");
			}
		}
				System.out.println("Not Found");
			}
} */

		// Step A: Create an integer array with 5 values
		int S[] = {100, 200, 300, 400, 500};

		// Step B: The value we want to search for in the array
		int searchElement2 = 0;

		// Step C: A flag to remember whether we found the element (false = not found)
		boolean status = false; // false -> not found; true -> found

		// Step D: Loop through the array elements by index (j goes from 0 to a.length-1)
		for (int j = 0; j <= S.length - 1; j++) {
		    // Step E: Compare the current array element to the search value
		    if (S[j] == searchElement2) {
		        // Step F: If equal, print message and update the flag
		        System.out.println("Found Element");
		        status = true; // change status to true because we found it
		        // Step G: Stop the loop early since we already found what we wanted
		        break;
		    }
		}
		// Step H: After the loop, if status is still false, element wasn't found
		if (status == false)
		    System.out.println("Not Found");
	}
}

	



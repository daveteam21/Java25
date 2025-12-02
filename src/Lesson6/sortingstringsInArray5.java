package Lesson6;

import java.util.Arrays;

public class sortingstringsInArray5
{		// sorting strings
	

	public static void main(String[] args)
	
	{		
		char stringName [] = {'m','o','n','e','y'};
	
		//String stringName[] = {"Apple","Zelle", "Ham", "Money", "House"};
	
	System.out.println("Before Sorting .... " + Arrays.toString(stringName));
	
	Arrays.sort(stringName); // sorting using the build-in methods
	
	System.out.println("After Sorting .... " + Arrays.toString(stringName));
		
	
	}
}
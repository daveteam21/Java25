package Lesson6;

import java.util.Arrays;

public class sortingintArray4
{		// sorting
	

	public static void main(String[] args)
	
	{
		int a[] = {100,200,300,100,500,100,400}; 
		 for(int i=0; i<=a.length-1;i++)
		{
			System.out.print(a[i] + " ");
		} 
		

		
		System.out.println("Before Sorting .... ");
		
		System.out.println(Arrays.toString(a)); //Arrays.toString()methods available in java It is a shortcut for printing only 
					// dont need to write for loop to print all array elements
		
			Arrays.sort(a);
			System.out.println("After Sorting .... ");
			
			System.out.println(Arrays.toString(a)); 
		
		{
			for(int value :a)
			{
				System.out.println("Looping value " + value);
			}
			
		}
	}
}

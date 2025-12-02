package Lesson5;
	
// row and column
	/* 1- declare an array
	 * 2- add values into array
	 * 3- find length value from an array
	 * 4- read single value from an array
	 * 5- read multiple value from an array
*/
public class ZArrayObj3
	// want to store heterogenous data the array type will be object.
	// object can hold any type of data 
{
	public static void main(String[] args)
	{	
		Object a[] = {100, 100.5, 'A', "David", true};
		
		
		for(int i=0; i<a.length-1; i++)
		{
			System.out.println(a[i]);
		}
	
	/*	
		for(Object x:a)
		{
			System.out.println(x);
		}
		*/
	}
	
}
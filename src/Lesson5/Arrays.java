package Lesson5;

public class Arrays 
{
		// is collection of elements of same data type (homogeneous data)
		//we can store multiple values into a single variable 
		// one row
		// single dimensional
		/*
		 * 1- declare an array
		 * 2- add values into array
		 * 3- find length value from an array
		 * 4- read single value from an array
		 * 5- read multiple value from an array
		 */
	int[]a = {12,13};
	String name[] = {"Ijjou", "Zia"};
	char last[]= {'s','d','h'};

	
	
		public static void main(String[] args)
		{
			/* know how many elements/data want to store
			 dont want to add anymore values in the future
			 the size is fixed
			 * Approach 1 
			int a[] = new int[5]; //<- declaration declare the variable
			a[0] =100;   // index will always start from zero
			a[1] =100;
			a[2] =100;		// <- assigned some data into the array
			a[3] =100;
			a[4] =100;  
	//		a[5]=400;
			System.out.println(a);
			System.out.println(a[4]);
			
			*/
	
			
		
			
			
			/* more dynamic you can add more or remove number of values
			 * add more in the future
			 *  
			 * Approach 2
			 *			0	1	2	3	4 <- index number
			 
			  int a[]={0,400,500,800,1000,500,600,700}; // <-no new keyword add or decease  value
			  String name[]= {"John","Min","Popy"};
			  char ch[]= {'a','v','f'};
			
			// find length of an array How many value store in an array
			  System.out.println("The length of array: "+ a.length);
			  System.out.println("The length of array: "+ name.length);
			  System.out.println("The length of array: "+ ch.length);
			  // read single value from an array
			  System.out.println(a[3]); //3 is the index
			  */
		
			  //  read multiple value from an array	  by looping statement
				//	0	1	2	3	4	5 6
			
			int a[] = new int[1]; //<- declaration declare the variable
			a[0] =100;   // index will always start from zero
			a[1] =100;
			a[2] =100;		// <- assigned some data into the array
	
		
			
			//int a[]={0,400,500,800,1000};
			
			  for(int i=0; i<a.length; i++) // no index 5 
				  System.out.println(a[i]); 
				  				
			//  for(int i=0; i<a.length; i++)		// i<=4, i<5, i<=a.length-1, <a.length
			// for(int i=0; i<=a.length-1; i++) // - because no index 5 
			//  {
				//  System.out.println(a[i]); 
				  		//instead write statement multiple times we can write one single time by change index number
				
			  } 
		}



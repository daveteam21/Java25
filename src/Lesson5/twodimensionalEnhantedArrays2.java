package Lesson5;
	
// row and column
	/* 1- declare an array
	 * 2- add values into array
	 * 3- find length value from an array
	 * 4- read single value from an array
	 * 5- read multiple value from an array
*/
public class twodimensionalEnhantedArrays2

{
	public static void main(String[] args)
	{
		// * Approach 1
		// know how much data you want to store in the future and dont have any plan to add new data
		// go for the fix type array
							//rows columns
		
		//bracket before after between variables are all correct
			//int []a[] = new int[4][3];
			//int [][]a = new int[4][3];
			int a[][] = new int[4][3];
			
			a[0][0]=100;
			a[0][1]=100;
			a[0][2]=100;
		
			a[1][0]=100;
			a[1][1]=100;
			a[1][2]=100;
	
			a[2][0]=100;
			a[2][1]=100;
			a[2][2]=100;
		
			a[3][0]=100;
			a[3][1]=100;
			a[3][2]=100;
			
			/* Approach 2 	 more dynamic you can add more or remove number of values
			 * add more in the future */
			
			int f[][]= {	{100,200,300, 400},		//1 row
							{10,20,300,32},		//2 row
							{200,300,360, 400}		//3 row
					};
			//find length value from an array
			System.out.println("Lenght of rows " + f.length);
			System.out.println("Lenght of columns "+ f[2].length); // in a particular row 
			
			
			//read single value from an array	
			System.out.println(f[0][3]);
			System.out.println(f[2][2]);
			
	
			//read multiple value from an array
			
			for(int r=0; r<3;r++) //increment value by one  // 0		outer forloop
			{
			//	for (int c=0; c<=3; c++)				//	0 1 2 3		inner forloop
				for (int c=0; c<=f[r].length-1; c++)
				{
					System.out.print(f[r][c]);
				}
				System.out.println();
			}
	}
}

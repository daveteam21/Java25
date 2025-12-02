package Lesson5;
	
// row and column
	/* 1- declare an array
	 * 2- add values into array
	 * 3- find length value from an array
	 * 4- read single value from an array
	 * 5- read multiple value from an array
*/
public class twodimensionalArrays

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
								//	colum	
			a[0][0]=100;		// 100 200 300	row
			a[0][1]=200;		// 400 2100 300
			a[0][2]=300;		// 200 150 10
								//	1 130 110
			a[1][0]=400;
			a[1][1]=2100;
			a[1][2]=310;
	
			a[2][0]=200;
			a[2][1]=150;
			a[2][2]=10;
		
			a[3][0]=1;
			a[3][1]=130;
			a[3][2]=110;
/*			
 * Index 4 out of bounds for length 4
			a[4][0]=101;
			a[4][1]=101;
			a[4][2]=101;
			
			*/
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
					System.out.print(f[r][c] + " ");
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				
					//	colum	
					// 100 200 300	row
					// 400 2100 300
					// 200 150 10
					//	1 130 110
				
				for(int arr[]: a)		// "a" will capture the entire row  100,200,300
										// then it will store in a single dimensional Arrays arr[] multiple values into single varible
										// contain 3 values 
				{
					for (int x:arr)		// arr contain 3 values first it will store 100, next 200, n 300
										// go out of for loop n go to the second row 400 2100 300
										// when "a" have no more rows it will exit out of looping
					{
						System.out.println("Get all the value from the array "+x);
					}
}
			}
	}
}

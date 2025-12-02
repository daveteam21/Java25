package Lesson6;

public class SearchingElementInArray2
{
	

	public static void main(String[] args)
	
	{
	
		int a[] = {100,200,300,400,500,400,400}; 
		int searchElement =400;
		
		boolean status = false;
		
		for(int x:a)  //	for (int j = 0; j <= S.length - 1; j++) {
		{
			if(x==searchElement)
			{
				System.out.println("Found Element");
				status=true; // change the status to true
				break;
			}
		}
		if (status == false	) 
		{
			System.out.println("Not Found");
		}		
			
	
	}
	}



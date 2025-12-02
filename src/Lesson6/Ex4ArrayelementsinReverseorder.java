package Lesson6;

public class Ex4ArrayelementsinReverseorder
{		// print array elements in reverse order
	


	public static void main(String[] args)
	{
		String name [] = {"Sam", "Ijjou", "Zia"};
	
		for (int i = name.length - 1; i >= 0; i--)
		{
			System.out.print(name[i] + " ");
		}
		
		/*int Num[] = {100, 200, 300};

    // loop from last index to 0
    for (int i = Num.length - 1; i >= 0; i--) {
        System.out.println(Num[i]);
 }
*/
   
}

}
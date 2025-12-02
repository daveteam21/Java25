package Lesson3;

public class LogicalOperators {

	public static void main(String[] args) {
		// Determine the logic between variables or value
	/*	
		&&	Logical AND			Returns true if both conditions are true	(5 > 3) && (8 > 5) → true
		||	Logical OR			It returns true if at least one of the conditions is true. (5 < 3)||(8 > 5)
								It returns false only if both conditions are false. (5 < 3) || (8 < 5)
		!	Logical NOT			Reverses the boolean value							!(5 > 3) → false
		
	 */
		
		        int x = 5;
		        int y = 10;

		        // AND					t		t			t
		        System.out.println((x > 0) && (y > 0));  // true

		        // OR				 t			f			t
		        System.out.println((x > 0) || (y < 0));  // true
		        //					f			f			
		        System.out.println((x < 0) || (y < 0));  // false
		        // NOT				!(false) = true 
		        System.out.println(!(x > y));            // true
	}

}

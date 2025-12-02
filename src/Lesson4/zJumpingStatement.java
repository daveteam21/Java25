package Lesson4;

public class zJumpingStatement {

	public static void main(String[] args) {
		//Jumping statements are used to change the normal flow of execution inside loops or methods
		// used with looping statement and conditional statement
		
		// Skips the current iteration of a loop and moves to the next one.
		//Want to ignore certain values but keep looping.
		
		 for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                continue; // skip when i = 3
	            }
	            System.out.println("Value: " + i);
	            
	        }
		 System.out.println("------------------------------------");
		 
		 //Break Stops the loop/switch completely 
		 for (int i = 1; i <= 5; i++) {
	            if (i == 3) {
	                break; // stop loop when i = 3
	            }
	            System.out.println("Value: " + i);
	        }
	
	}

}

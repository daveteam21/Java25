package Lesson8;

public class ReverseString2 {

	public static void main(String[] args) {
		
		// Approach 2 without using string methods
	
		String e = "Welcome";     // (1) Create the original string 'e'
		String rev = "";          // (2) Create an empty string 'rev' that will hold the reversed result

		char[] ar = e.toCharArray(); // (3) Convert the string to a char array: ['W','e','l','c','o','m','e']

		for (int i = ar.length - 1; i >= 0; i--) { // (4) Loop from last index down to 0
		    rev = rev + ar[i];                    // (5) Append the current char to 'rev'
		}

		System.out.println(rev); // (6) Print the final reversed string
		
	}
}

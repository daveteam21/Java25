package Lesson8;

public class ReverseString {

	public static void main(String[] args) {
		// no direct method available for ReverseString
		//need to write logic coding
		// s="Welcome"  reverse string = "emoclew"
		// need to capture the last character from the string
		// need to use length method until reached 0
		
		// Approach 1 with Length() and CharAt()
		
		String e = "Welcome";	// create the original string e
		String rev = "";		// Initialize an empty string rev which will accumulate the reversed characters.
		
		for(int i =e.length()-1; i>=0; i--) //e.length() - 1 gives 6, which is the index of the last character (because Java string indexing is 0-based)
		{									// decrements i (i--) until i becomes 0 capture first character
		//	System.out.println(e.charAt(i));
			rev = rev +e.charAt(i);  // Take the current value of rev, add (append) the current character from e.charAt(i) to the end of it, 
									//and store the new combined string back into rev;
		}
		System.out.println("Before Reverse String is "+ e);
		System.out.println("Reverse String is " + rev);

	}

}

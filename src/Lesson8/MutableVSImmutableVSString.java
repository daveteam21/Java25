package Lesson8;

import java.util.Arrays;

public class MutableVSImmutableVSString {

	public static void main(String[] args) {
		// Mutable can change
		// Immutable can not change
		
		int a[]= {10,40,50,20,30};
		System.out.println(Arrays.toString(a));
		Arrays.sort(a); // mutable change the original element
		System.out.println(Arrays.toString(a));
		System.out.println(" Immutable==========================>");
		String s = new String("Welcome");
		System.out.println(s);
		s.concat("to Java"); 	
		System.out.println(s); // Immutable can not change
		
		// need to store into another string 
		
		String concatString = s.concat(" to IT world");
		System.out.println(concatString);
	}

}

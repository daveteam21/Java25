package Lesson8;

import java.util.Arrays;

public class MutableVSImmutable {

	public static void main(String[] args) {
	
		String s = "Welcome";
		s.concat(" to IT world");	// for string we use concat
	
	System.out.println(s);	// immutable cannot change original value of s
	
	//String buffer - mutable object
	
	StringBuffer sb = new StringBuffer("Welcome");
	sb.append(" to Java");	// builder or buffer we use append
	System.out.println(sb); // mutable can change value 
	
	//StringBuilder - mutable object
	StringBuilder we = new StringBuilder("Holy");
	we.append(" Cow");	// builder or buffer we use append
	System.out.println(we); // mutable can change value 
	
	}

}

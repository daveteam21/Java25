package Lesson7;

import java.util.Arrays;

public class JavaString {

	public static void main(String[] args)
	{
// two types of methods Built in method - java is already provide those methods
	// Custom Metholds we create our own mwethods
	
	// find the total number of chars in a string
	
	// String name = "welcome"; 
	String name = new String("Welcome");
	System.out.println(name);	
		
// methods	length is method to return the number of chars in a string
	
	String name2 ="Ijjou";
	int num = name2.length(); // built in methods in java itself
	System.out.println(num);
	//System.out.println(name2.length()); or directly with variable 
	System.out.println("John".length()); // directly with string value
	
	//Concat - join two or more strings at a time
	String s1 ="Welcome";
	String s2 ="Jave";
	String s3= "World";
	System.out.println(s1+s2);
	System.out.println(s1.concat(s2));
	System.out.println("-----------------------------");
	System.out.println(s1+s2+s3);
	System.out.println(s1.concat(s2).concat(s3));
	System.out.println(s1+s2.concat(s3));
	System.out.println("Without variable--------------------");
	System.out.println("Welcome" + "World");
	System.out.println("Another way".concat(" of writing"));
	System.out.println("Trim methods ========================= ");
	//trim() remove spaces right and left
	s1="        Take out the space between    ";
	System.out.println(s1);
	System.out.println(s1.trim());
	System.out.println("Before the trim is " + s1.length());
	System.out.println("After the trim is " + s1.trim().length());
	
	//CharAt() - returns a character from a string based on index
	// index start from 0 
	//	 01234567
	s2= "0123r56a";
	System.out.println(s2.charAt(4));
	System.out.println(s2.charAt(7));
	System.out.println("contains() ==============>");
	
	// contains() always written in boolean value true or false 
	//String value Case sensitive
	// string sequence need to match
	//checks the string is part main string or not
	s3= "Java2025";
	
	System.out.println(s3.contains("Jav")); // true
	System.out.println(s3.contains("25"));// true
	System.out.println(s3.contains("java"));// false 
	
	System.out.println("equals() equalsIgnoreCase() =================>");
//	equals() equalsIgnoreCase() - compare strings
	
	String Fname= "Ijjou";
	String Lname="Ijjou";
	
	System.out.println(Fname == Lname); // sometime does work with both string
	System.out.println(Fname.equals(Lname));
	System.out.println(Fname.equals("ijjou"));
	System.out.println(Fname.equalsIgnoreCase("ijjou"));
	System.out.println("replace() =================>");
	
	// replace() replace single/multiple or sequence characters in a string
	Fname ="welcome to the world";
	String d = Fname.replace('e', 'X'); // '' replace character
	System.out.println(d);
	System.out.println(Fname.replace("world", "Eclipse")); // "" replace string
	
	String SubString ="WelcomeWorld";
	System.out.println("Substring() =================>");		//  0123456
	// SubString() extract substring from the main string
	//Substring two parameters passing starting index ending index	welcome
	// Starting index - 0
	// Ending index plus -1
	System.out.println(SubString.substring(1, 5)); // elco
	System.out.println(SubString.substring(0, 3)); //wel
	
	System.out.println("toUpperCase() toLowerCase() =================>");
	Fname ="JohNNy";
	// converting all character into uppercase or lowercase 
	System.out.println(Fname.toUpperCase());
	System.out.println(Fname.toLowerCase());
	System.out.println("split() ===========================>");
	//split() split the String involves dividing a string or sequence of data into smaller parts,
	// or substrings, based on a specified delimiter
	// string into multiple parts In arrays of elements
	
	//	  0      1	
	s1= "abcs@gmail.com";
	System.out.println(s1.split("@")); // need to store in single dimensional array
	String a[] =s1.split("@");
	System.out.println(a[0]);
	System.out.println(a[1]);
	System.out.println(Arrays.toString(a)); // find the values of arrays
	
	}
	

}

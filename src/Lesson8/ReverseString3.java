package Lesson8;

public class ReverseString3 {

	public static void main(String[] args) {
		
		// Approach 3 using StringBuffer class
		// String is a immutable object
		//Stringbuffer and String Builder are mutable objects
	/*
		//Stringbuffer class have direct method to reverse string
		StringBuffer sb = new StringBuffer("Welcome");
		System.out.println(sb);
		System.out.println(sb.reverse()+ " this is with the stringbuffer");
		System.out.println("StringBuilder=============================>");
	*/	
		//Stringbuilder class have direct method to reverse string
		StringBuilder sb = new StringBuilder("Welcome");
		System.out.println(sb);
		System.out.println(sb.reverse()+ " this is with the StringBuilder");
	}
}

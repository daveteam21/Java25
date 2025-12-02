package Lesson2;

import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name please: ");
		//Strings are constant; their values cannot be changed after they are created. 
		//String buffers support mutable strings.
		//Because String objects are immutable they can be shared
		String name =scanner.nextLine(); 
		
		System.out.println("Enter age please ");
		int age =scanner.nextInt();	// new line read only int
		System.out.println("Enter amount of money you want ");
		int money=scanner.nextInt();
		
		scanner.nextLine(); // to clear it
		System.out.println("What name of the program language you using: ");
		String language =scanner.nextLine(); 
		
		
		System.out.println("Hi " + name);
		System.out.println("Age is " + age);
    	System.out.println("Language " + language);
		System.out.println("I got " + money);
		
		scanner.close(); // close it
	}

}

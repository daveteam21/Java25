package Lesson7;

import java.util.Arrays;

public class Example {

	public static void main(String[] args) {

		String s1 ="abc";
		String s2 = "$15,123,111.00";
		
		// ex1
	
		
		s2="$15,123,111";		// exp 15123111 need to remove $ ,
		System.out.println(s2.replace("$", "")); //15,123,111.00
		System.out.println(s2.replace("$", "").replace(",", "")); //15123111.00
		
	
		
		//ex2
		System.out.println("Step 1 ===================================>");
		s1="abc,123@gmail.com";						//abc 123 gmail.com
		String arr1[] =s1.split(",");				//  Split by comma → ["abc", "123@gmail.com"]
		System.out.println(Arrays.toString(arr1));	//[abc, 123@gmail.com] now need to capture 123@gmail.com n  
		System.out.println("this is index 0 cature the value of "+ arr1[0]);
		System.out.println("this is index 1 cature the value of "+ arr1[1]);
		
		System.out.println("Step 2 ===================================>");
		String arr2[] = arr1[1].split("@");			// split 123@gmail.com by '@' → ["123", "gmail.com"]
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("Step 3 ===================================>");
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);  // arr 1, arr2 ,arr 3 contain mulp value can not combine together 
		
	//ex 3
		String d1 = "abc 123 !@#";		// remove space
		System.out.println("before space " + d1);
		String arr[] = d1.split(" ");
		System.out.println(Arrays.toString(arr));
		
		//ex4  
		String name = "John Dole";
		System.out.println(name.contains("john")); //false
		
		name.replace("J", "j");
		System.out.println(name.contains("john"));//true
		System.out.println(name.toLowerCase().contains("john"));
	}

}

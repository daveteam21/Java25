package Lesson4;

public class ConditionalStatements {

	public static void main(String[] args) {
		/*
		 * 1. Conditional Statements - Used when you want to make decisions in your program.
		 * Examples:
		 * if
		 * if-else
		 * if-else if-else
		 * nested if else
		 * switch
		 */
		
		
		// 1. if Statement executes code only if condition is true.
			
			int age = 20;
				//	20>=18
				// 18 >18 18 ==18
	        if (age >= 18) {   // condition true
	            System.out.println("You can vote."); // runs because condition is true
	        }
	        
	     //2. if-else Statement  two paths: one if condition is true, another if false.
	     // else block will execute only if condition is false
	       
	        int old = 16;

	        if (old >= 18)
	        {
	            System.out.println("You can vote.");
	        }
	        else
	        {
	            System.out.println("You are too young.");
	        }  
	     
	        
	        //3 if-else if-else (Ladder)Conditions are checked one after another in sequence.
	        //As soon as one condition is true → remaining ones are skipped.


	        int marks = 75;
	        	// 75 >90 75==90
	        if (marks >= 90)
	        {
	            System.out.println("Grade: A");
	           
	        }	//	75 > 75 75 == 75
	        else if (marks >= 75)
	        {
	            System.out.println("Grade: B");
	        }
	        else if (marks >= 50)
	        {
	            System.out.println("Grade: C");
	        }
	        else
{
	            System.out.println("Fail");
	        }
	        System.out.println("---------------------------------------------");
	   // 4. Nested if-else → An if statement inside another if or else block.
	  // Used when you need to check multiple conditions in a hierarchical (step-by-step) way.
	  // Only one block of statements will be executed, depending on the conditions.
	        /* Can put either expression or directly put boolean value
		      */  
	        if(true)
	        {
	        	if(false)
	        	{
	        		System.out.println("abc");
	        	}
	        	if(false)
	        	{
	        		System.out.println("123");
	        	}
	        	else
	        	{
	        		System.out.println("Not");
	        	}
	        	
	        	{
	        	//else why take out dont need it
	        		System.out.println("xyz");
	        	} 
	        
	        }
	        else
	        {
	        System.out.println("hgf");	
	        }
	        
	        if(1==1)
	        {
	        	System.out.println("The if statement is true");
	        }
	        else
	        {
	        	System.out.println("If is false so else statement is printing");
	        }
		 
	    // 5. switch Statement - Compares a value against multiple cases 
	        //Use break to stop after match, use default no match
	        
	        int day = 1;

	        switch (day) {
	            case 1:
	            	System.out.println("Monday");
	            	break;
	            case 2:
	            	System.out.println("Tuesday");
	            	break;
	            case 3:
	            	System.out.println("Wednesday");
	            	break;
	            case 4:
	            	System.out.println("Thursday");
	            	break;
	            case 5:
	            	System.out.println("Friday");
	            	break;
	            case 6:
	            	System.out.println("Saturday");
	            	break;
	            case 7:
	            	System.out.println("Sunday");
	            	break;
	            default:
	            	System.out.println("Invalid day");
	        }
	    }

	}


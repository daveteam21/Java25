package Lesson3;

public class ArithmeticOperators {

	public static void main(String[] args) {
		// Arithmetic operators – math operators Used to perform common mathematical operations
		
		/*	Operator		Name		Description
		 * 
		 *		+			Addition	Adds two values together
		 *		-			Subtraction	Subtracts one values from another
		 *		*			Multiplication	Time two values
		 *		/			Division	Divides one value by another
		 *		%			Modulus		Returns the division remainder
		 *		++			Increment	Increases the value of a variable by 1
		 *		--			Decrement	Decreases the value of a variable by 1
		 *  
		 */

		
		int a =2;
		int b =3;
		int o=3;
		
		int c=a+b;		//5
		int d = b-a;	//1
		int e = b * a;	//6
		int f= e/a;	    //3
		int g = c%a;	//1
		int h = 10;
		int j =h++;
		
		int i =12;
		int k=i--;
	
					//	2	+	3	=	5
	System.out.println( a + "+" + b +"= " + c);
	
	System.out.println(b + "-" + a +"= " + d);
	System.out.println(a + "*" + b +"= " + e);
	System.out.println(e + "/" + a +"= " + f);
	System.out.println(c + " divide by " + a + " Remainder is " + g);
	System.out.println(j + " Increment by 1 is " + h);
	System.out.println(k + " decrement by 1 is " + i);

	
	
	}

}

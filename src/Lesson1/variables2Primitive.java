package Lesson1;

public class variables2Primitive {

	public static void main(String[] args) {
		// Primitive  
		/*These are built-in data types that Java provides.
		They are the simplest forms of data, not objects.
		Always written in lowercase
		They store only one value at a time.
		
	/*	data types - 8 primitive 
	 * 
	 * 	data type			size		Value 
	 * 
		boolean				1bit		true or false
		byte 				1byte		-128 to 127
		short				2bytes		-32,768 to 32,767	
		int 				4bytes		-2,147,483,648 to 2,127,483,647
		long				8bytes		-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (L)
		
		float				4bytes		storing 6 to 7 decimal digits (3.142324f)
		double				8bytes		storing 15 decimal digits (3.1403425254224)
		
		char				2bytes		single character/letter
		
				
				semicolon ; at the end of the statement 
*/			
		
		byte x;			// declaration 
		x = 127;		//assignment value
		int a = 234; 	//initialization 
		
		System.out.println(x);
		System.out.println(a);
		
		// print a string concatenation(+) with a variable name
		
		System.out.println("My number is printing " + x +" "+a);
		
	
		long john = 9223372036854775807L;
		byte sam = 100;
		float kim =3.14f;	// need f at the end
		double Hen =3.145; 
		boolean fact = true;	// true or false only
		char peter = 'd';
		
		
		System.out.println(peter);
	}

}

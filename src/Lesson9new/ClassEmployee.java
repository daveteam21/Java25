package Lesson9new;

public class ClassEmployee { //<-- class contains methods and variables

	

		//Variables
		int id;
		String name;
		String job;
		int Salary;
		
		//methods<-- we can access the class variable or create our own variables inside methods
		//methods <-- normal method you cannot execute
		void display() 
		
		{
			System.out.println(id);
			System.out.println(name);
			System.out.println(job);
			System.out.println(Salary);
			
		}
		
		/*
		 * void display() 		Cannot create a method within another method
		 * 						Only method contains variables 
		
			{		
				void display() 
					{
					
					}
		
			{
		
		 * 
		 * 
		 * 
		 * 
		 */
		public static void main(String[] args) { //<-- without main method can not execute the class
												//<-- object should be created within the main method not anywhere else
											
			
		/*	
			
			void display() //<--  method should not write in the main method
			{
			
			}
	*/
			
			ClassEmployee emp = new ClassEmployee();  //<-- object emp able to access all the variables
			emp.id= 121;
			emp.name="Joe";
			emp.job="QA Tester";
			emp.Salary=100000;
			emp.display();
					
			ClassEmployee emp2 = new ClassEmployee();
			emp2.id= 212;
			emp2.name="Ijjou";
			emp2.job="Scrum Master";
			emp2.Salary= 500000;
			emp2.display();
			
	}

}

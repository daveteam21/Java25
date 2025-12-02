package Lesson9new;

import Lesson9anew.ClassEmployee3; //<-- need to import from different package name and class
					

public class ClassEmployee2Main { 
			
	
		public static void main(String[] args) {
	
			ClassEmployee2WOMain emp = new ClassEmployee2WOMain();  //<-- object emp able to access all the variables
			emp.id= 121;
			emp.name="Joe";
			emp.job="QA Tester";
			emp.Salary=100000;
			emp.display();
					
			ClassEmployee2WOMain emp2 = new ClassEmployee2WOMain();
			emp2.id= 212;
			emp2.name="Ijjou";
			emp2.job="Scrum Master";
			emp2.Salary= 500000;
			emp2.display();
			
			ClassEmployee3 emp3 = new ClassEmployee3();
			
	}

}

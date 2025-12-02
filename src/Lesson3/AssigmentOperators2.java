package Lesson3;

public class AssigmentOperators2 {


		    public static void main(String[] args) {
		        int a = 10;
		        
		        System.out.println("Initial a = " + a);
		        //				a = 10 =5	a=15
		        a += 5;  // 15	a= a + 5
		        System.out.println("a += 5 -> " + a);
		        	//	a= 15 -3
		        a -= 3;  // 12
		        System.out.println("a -= 3 -> " + a);
		     //  	a= 12*2
		        a *= 2;  // 24
		        System.out.println("a *= 2 -> " + a);
		        // a = 24/4
		        a /= 4;  // 6
		        System.out.println("a /= 4 -> " + a);
		        // a = 6/4 reminder 2
		        a %= 4;  // 2
		        System.out.println("a %= 4 -> " + a);

		        
		        System.out.println("----------------------------need to find out-----------");
		        a &= 1;  // bitwise AND
		        System.out.println("a &= 1 -> " + a);

		        a |= 2;  // bitwise OR
		        System.out.println("a |= 2 -> " + a);

		        a ^= 3;  // bitwise XOR
		        System.out.println("a ^= 3 -> " + a);

		        a <<= 1; // left shift
		        System.out.println("a <<= 1 -> " + a);

		        a >>= 1; // right shift
		        System.out.println("a >>= 1 -> " + a);
		    }
		}

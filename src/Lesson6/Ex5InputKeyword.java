package Lesson6;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5InputKeyword {

	public static void main(String[] args) {
	
		int a[] = new int[6];
	
		Scanner scanner = new Scanner(System.in);
		for(int s =0; s<= a.length-1; s++)
		{
			System.out.println("Enter number please  ");
			a[s] =scanner.nextInt();
		}
		System.out.println("Your array number --------------");
		System.out.println(Arrays.toString(a));
		
	}
}
package main;

import java.util.Scanner;

/*
 * 2I Coding Challenge
 * Brief:
 * In a language of your choice could you please provide code that iterates in multiples of 7 up to 100,
 * then in multiples of 8 up to 200, 
 * then in multiples of 9 up to 300
 */
public class Main {
	public static void main(String[] args) {
		try {
		Boolean exit = false;
		Scanner in = new Scanner(System.in);		
		while(!exit) {
			System.out.println("\nChoose an option from the following:");
			System.out.println("1. Run All.\n2. Run multiples of 7 (to 100)\n3. Run multiples of 8 (to 200)");
			System.out.println("4. Run multiples of 9 (to 300)\n5. Custom Multiple & Goal\n6. Exit");
			switch(in.nextInt()) {
				case 1:
					System.out.println(seven());
					System.out.println(eight());
					System.out.println(nine());
					break;
				case 2:
					System.out.println(seven());
					break;
				case 3:
					System.out.println(eight());
					break;
				case 4:
					System.out.println(nine());
					break;
				case 5:
					System.out.println("Enter a value to iterate in multiples of: i.e. 7");
					int multiple = in.nextInt();
					System.out.println("Enter a value to iterate up to: i.e. 100");
					int goal = in.nextInt();
					System.out.println("\n" + multiples(multiple, goal));
					break;
				case 6:
					System.out.println("Exiting...");
					exit = true;
					break;
				default:
					System.out.println("Invalid input. Please try again.");
			}
		}
		} catch (Exception e) {
			System.out.println("Exception Caught! Input only accepts number values - no letter characters, exclamation marks, etc.");
			main(args);
		}
	}
	
	public static String seven() {
		System.out.println("\nMultiples of 7: (up to 100)");
		return(multiples(7, 100));	
	}
	
	public static String eight() {
		System.out.println("\nMultiples of 8: (up to 200)");
		return(multiples(8, 200));
	}
	
	public static String nine() {
		System.out.println("\nMultiples of 9: (up to 300)");
		return(multiples(9, 300));
	}
	
	public static String multiples(int multiple, int goal) {
		Integer counter = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(counter);
		
		// Run through multiples till reaching the desired number
		while (counter + multiple <= goal) {
			counter += multiple;
			sb.append(", ");
			sb.append(counter);		
		}
		
		return(sb.toString());
	}
}

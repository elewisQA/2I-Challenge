package main;
/*
 * 2I Coding Challenge
 * Brief:
 * In a language of your choice could you please provide code that iterates in multiples of 7 up to 100,
 * then in multiples of 8 up to 200, 
 * then in multiples of 9 up to 300
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("Multiples of: 7:");
		multiples(7, 100);	
		
		System.out.println("\nMultiples of 8:");
		multiples(8, 200);
		
		System.out.println("\nMultiples of 9:");
		multiples(9, 300);
	}
	
	public static void multiples(int multiple, int goal) {
		Integer counter = 0;
		StringBuilder sb = new StringBuilder();
		sb.append(counter);
		
		// Run through multiples till reaching the desired number
		while (counter + multiple <= goal) {
			counter += multiple;
			sb.append(", ");
			sb.append(counter);		
		}
		
		System.out.println(sb.toString());
	}
}

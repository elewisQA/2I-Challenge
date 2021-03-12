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
		int counter = 0;
		System.out.println("Increments of: 7\n");
		System.out.println(counter);
		while (counter + 7 <= 100) {
			counter += 7;
			System.out.println(counter);
		}
		
		counter = 0;
		System.out.println("\nIncrements of: 8\n");
		while (counter + 8 <= 200) {
			counter += 8;
			System.out.println(counter);
		}
		
		counter = 0;
		System.out.println("\nIncrements of: 9\n");
		while (counter + 9 <= 300) {
			counter += 9;
			System.out.println(counter);
		}
		
	}
}

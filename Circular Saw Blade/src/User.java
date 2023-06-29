/*
 * Student Name: Ting Wang
 * Lab Professor: Wafa Hasanain
 * Due Date: November 25
 * Description: Assignment 02 (22F) Starter Code
 */
/* - create a method inputPositiveDouble(String prompt) that ensures that only 
 *   positive numbers are entered, use this in the programs main method logic.
 */
import java.util.Scanner;
/*
 * This class provides utility for getting user input from the console using
 * an instance of Scanner set to new Scanner(System.in) and has methods that 
 * prevent program crashes from text inputs when numbers are expected.
 */
public class User {
	
	private static Scanner keyboard = new Scanner(System.in);
	
	/*
	 * This is a utility class with only static members, prevent
	 * Instantiation.
	 */
	private User() {}
	
	/*
	 * Does not prompt the user, reads in an int value when there is one. If
	 * the user does not provide input that can be converted into an int an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public static int inputInteger() {
		boolean isInputBad = true;
		int value = 0;
		while(isInputBad) {
			if(keyboard.hasNextInt()) {
				value = keyboard.nextInt();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter an integer number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;
	}
	/*
	 * This method prompts the user using the argument sent to message
	 * and then calls to method inputInteger() to get the actual input value.
	 */
	public static int inputInteger(String message) {
		System.out.printf("%s", message);
		int value = inputInteger(); 
		return value;
	}
	/*
	 * Does not prompt the user, reads in a double value when there is one. If
	 * the user does not provide input that can be converted into a double an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right. A future version of 
	 * the program might have a sanity check to break the loop after several 
	 * failed attempts and then shut down the program, rather than looping
	 * (in theory) forever.
	 */
	public static double inputDouble() {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		while(isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if(hasNextDouble) {
				value = keyboard.nextDouble();
				isInputBad = false; // break out of loop
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;	
	}
	/*
	 * This method prompts the user using the argument sent to message
	 *  and then calls to method inputDouble() to get the actual input value.
	 */
	public static double inputDouble(String message) {
		System.out.printf("%s", message);
		double value = inputDouble();
		return value;
	}
	/*
	 * this method is used to get a line of text from the console, it reads
	 * until it encounters a line terminator character.
	 */
	public static String inputString() {
		String value = keyboard.nextLine();
		return value;
	}
	/*
	 * This method prompts the user using the argument sent to message, 
	 * then calls to method inputString() which reads in the actual text.
	 */
	public static String inputString(String message) {
		System.out.printf("%s", message);
		String value = inputString();
		return value;
	}
	
	/*
	 * Does not prompt the user, reads in a positive double value when there is one. If
	 * the user does not provide a positive input that can be converted into a double an
	 * error message is printed requesting a correct input and a loop is used
	 * to trap the user until they get this right.
	 */
	public static double inputPositiveDouble(String prompt) {
		boolean isInputBad = true;
		boolean hasNextDouble;
		double value = 0.0;
		System.out.printf(prompt);
		while(isInputBad) {
			hasNextDouble = keyboard.hasNextDouble();
			if(hasNextDouble) {
				value = keyboard.nextDouble();
				if(value>=0) {
					isInputBad = false; // break out of loop	
				}
				else {
					System.out.println("Enter positive number only. ");
					System.out.printf(prompt);
				}
			}
			else {
				System.out.print("Invalid input. Enter a number: ");
			}
			keyboard.nextLine(); // clean up input stream
		}
		return value;	
	}
}
//public static double inputPositiveDouble(String prompt) {
//	boolean isInputBad = true;
//	double value = 0.0;
//	while(isInputBad) {
//	    value = inputDouble(prompt);
//	    if(value >= 0) {
//	    	isInputBad = false;
//	    }
//	    else {
//	    	System.out.println("Enter positive number only.");
//	    }
//	}
//	return value;
//}
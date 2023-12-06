/*
 * A program that returns all even numbers from a given list of numbers
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println(
				"Enter the list numbers you would like to evaluate separated by an empty space:");
		String input = sc.nextLine();

		sc.close();

		// split input into an array
		String[] split = input.split(" ");

		// extract all even numbers
		String[] even = setArray(split);

		// output
		String result = joinArray(even);

		System.out.println(result);

	}

	// methods

	// method to join a String array to the required String output
	static String joinArray(String[] input) {

		// initialize a string to hold output
		String join = "";

		// iterate and update the String variable
		for (int i = 0; i < input.length; i++)
		{
			// special case for last index
			if (i == input.length - 1) join += input[i];
			else join += input[i] + " ";
		}

		return join;

	}

	// method to create a String array of even numbers
	static String[] setArray(String[] input) {

		// initialize an array to hold the even numbers
		String[] evenNumbers = new String[evenCounter(input)];

		// initialize a counter variable for evenNumber[] index
		int counter = 0;

		// iterate, check, and update array
		for (int i = 0; i < input.length; i++)
		{
			if (isEven(input[i]))
			{
				evenNumbers[counter] = input[i];
				counter++;
			}
		}

		return evenNumbers;

	}

	// method to count how many values are even
	static int evenCounter(String[] input) {

		// initialize a counter variable
		int counter = 0;

		// iterate, check, and update counter
		for (String value : input)
		{
			if (isEven(value)) counter++;
		}

		return counter;

	}

	// method to check if a value is even
	static boolean isEven(String value) {

		// initialize a variable to convert the String input to an int
		int convert = Integer.valueOf(value);

		return convert % 2 == 0;

	}

}

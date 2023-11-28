/*
 * A program that determines animals nearby based on noise
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final String LION = "Grr";
	public static final String TIGER = "Rawr";
	public static final String SNAKE = "Ssss";
	public static final String BIRD = "Chirp";

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("What noises did you hear?");
		String input = sc.nextLine();

		sc.close();

		// split the input into an array
		String[] inputArr = input.split(" ");

		// output
		System.out.println(analyzeNoise(inputArr));

	}

	// methods

	// method to join an array's Strings into a single String
	static String join(String[] arr) {
		// initialize a variable to hold output
		String output = "";
		// iterate
		for (int i = 0; i < arr.length; i++)
		{
			// special case for last value
			if (i == arr.length - 1) output += arr[i];
			else output += arr[i] + " ";
		}
		return output;
	}

	// method for determining which animals are around based on noise (input)
	static String analyzeNoise(String[] input) {
		// initialize an array to store results
		String[] animals = new String[input.length];

		// iterate
		for (int i = 0; i < input.length; i++)
		{
			String current = input[i];
			if (current.equals(LION)) animals[i] = "Lion";
			else if (current.equals(TIGER)) animals[i] = "Tiger";
			else if (current.equals(SNAKE)) animals[i] = "Snake";
			else animals[i] = "Bird";
		}
		return join(animals);
	}

}

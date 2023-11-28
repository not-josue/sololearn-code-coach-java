/*
 * A program that checks if a String has no repeating letters
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("Which word would you like to check?");
		String input = sc.nextLine();

		sc.close();

		System.out.println(isIsogram(input));

	}

	// methods

	// method that checks whether an array contains a String
	static boolean contains(char[] arr, char current) {
		for (char letter : arr)
		{
			if (letter == current) return true;
		}
		return false;
	}

	// method to split the user input into an array, iterate, and track letters
	// that have been used
	static String isIsogram(String input) {
		// initialize an array to split user input
		char[] split = input.toCharArray();
		// initialize an array to hold letters already used
		char[] used = new char[split.length];
		// iterate
		for (int i = 0; i < split.length; i++)
		{
			if (contains(used, split[i]) && i >= 1) return "false";
			else used[i] = split[i];
		}
		return "true";
	}

}

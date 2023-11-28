/*
 * A program that iterates a String and checks if any character is used more than once
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		
		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// get user input
		System.out.println("Enter a String:");
		String input = sc.nextLine();
		
		sc.close();
		
		// iterate and print output
		iterateInput(input);

	}
	
	// methods
	
	// method to check if a char matches a char in an array
	static boolean containsChar(char letter, char[] arr) {
		for (char x: arr) {
			if (letter == x) return true;
		}
		return false;
	}
	
	// method for iterating the user's String input
	static void iterateInput(String input) {
		
		// initialize a char array
		char[] letters = new char[input.length()];
		// iterate
		for (int i = 0; i < input.length(); i++)
		{
			// special case for the first char
			if (i == 0) letters[i] = input.charAt(i);
			else
			{
				// current char is found in an array that stores previous chars used
				if (containsChar(input.charAt(i), letters))
				{
					System.out.println("Deja Vu");
					System.exit(0);
				}
				// store into array
				letters[i] = input.charAt(i);
			}
		}
		System.out.println("Unique");
	}

}

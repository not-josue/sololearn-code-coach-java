/*
 * A program that finds English alphabet characters, and spaces from an encrypted message 
 * that contains symbols, and numbers
 * Written By: Josue
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("Type your encrypted message, and I will decode it:");
		String input = sc.nextLine();

		sc.close();

		// extract from input
		String extracted = decipher(input);

		// reverse the extracted message
		String deciphered = reverse(extracted);

		// output
		System.out.println(deciphered);

	}

	// methods

	// method that extracts English alphabet characters and spaces
	static String decipher(String input) {
		// initialize a variable to hold extracted chars
		String extracted = "";

		// create an instance of Pattern and Matcher
		Pattern pattern = Pattern.compile("[a-zA-Z\s]+");
		Matcher matcher = pattern.matcher(input);

		// iterate
		while (matcher.find())
		{
			// update the extracted variable for every match
			extracted += matcher.group();
		}

		return extracted;

	}

	// method to reverse a String
	static String reverse(String input) {
		// initialize a return variable
		String reversed = "";

		// convert input into a char array
		char[] inputArr = input.toCharArray();

		// iterate and update
		for (int i = inputArr.length - 1; i >= 0; i--)
			reversed += inputArr[i];

		return reversed;

	}

}

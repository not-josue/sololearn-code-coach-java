/*
 * A program to encode a message using the same position of each letter in a backwards version of the alphabet
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final String NORMAL = "abcdefghijklmnopqrstuvwxyz";
	public static final String BACKWARDS = "zyxwvutsrqponmlkjihgfedcba";

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("Enter the message you would like to encode:");
		String input = sc.nextLine().toLowerCase();

		sc.close();

		// convert to char array
		char[] convert = input.toCharArray();

		// output
		String result = encode(convert);

		System.out.println(result);

	}

	// methods

	// method to encode a String using the alphabet backwards
	static String encode(char[] input) {

		// initialize a String to hold the output
		String encode = "";

		for (int i = 0; i < input.length; i++)
		{
			// case for a blank space
			if (input[i] == ' ') encode += input[i];
			else encode += BACKWARDS.charAt(location(input[i]));
		}

		return encode;

	}

	// method to find the alphabet location
	static int location(char letter) {

		// initialize a variable to hold the index
		int index = -1;

		// iterate and check
		for (int i = 0; i < NORMAL.length(); i++)
		{
			if (NORMAL.charAt(i) == letter) index = i;
		}

		return index;

	}

}

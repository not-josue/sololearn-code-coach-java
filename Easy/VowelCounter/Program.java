/*
 * A program that counts how many vowels are in a user's input
 * By: Josue
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// create an instance of scanner
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter a word or phrase to check how many vowels it contains:");
		// create a variable to take user input
		String input = sc.nextLine();
		// create a counter variable
		int counter = 0;

		// iterate over user input and check if each letter is a vowel
		for (int i = 0; i < input.length(); i++)
		{
			// charAt(i) retrieves the character at the current index of the String,
			// but it returns a character type
			// String.valueOf converts the character to a String to match the expected
			// argument type for the isVowel method
			if (isVowel(String.valueOf(input.charAt(i))))
			{
				counter++;
			}
		}

		sc.close();
		System.out.println(counter);

	}

	// returns true if the input letter is a vowel (ignoring case), otherwise
	// returns false
	static boolean isVowel(String letter) {

		// create an array that contains all vowels
		String[] vowels = {"a", "e", "i", "o", "u"};
		// iterate the vowel array
		for (int i = 0; i < vowels.length; i++)
		{
			// compare the current vowel with the input whilst ignoring case
			if (vowels[i].equalsIgnoreCase(letter))
			{
				return true;
			}
		}
		return false;

	}

}

/*
 * A program that converts words, and sentences into Pig Latin
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// welcome msg and take user input
		System.out.println("Write a sentence to convert it to Pig Latin");
		String input = sc.nextLine();

		sc.close();

		// split words by using an empty character as the delimiter
		String[] words = input.split(" ");

		// initialize an array to hold the transformed words
		String[] pigLatin = new String[words.length];

		// iterate the words array
		for (int i = 0; i < words.length; i++)
		{
			pigLatin[i] = transformToPigLatin(words[i]);
		}

		System.out.println(concatenateWords(pigLatin));

	}

	// methods

	// method to transform word to pig latin
	static String transformToPigLatin(String word) {
		// convert the word into a char array
		char[] letters = word.toCharArray();
		// initialize a variable to hold the transformed word
		String altered = "";
		// transform the word into pig latin
		altered = altered.copyValueOf(letters, 1, word.length() - 1) + letters[0]
				+ "ay";

		return altered;

	}

	// method to join an array of Strings
	static String concatenateWords(String[] arr) {
		// initialize a variable that will hold the complete sentence
		String joined = "";
		// iterate over the array of Strings
		for (int i = 0; i < arr.length; i++)
		{
			if (i == arr.length - 1)
			{
				joined += arr[i];
			}
			else
			{
				joined += arr[i] + " ";
			}
		}

		return joined;
	}

}

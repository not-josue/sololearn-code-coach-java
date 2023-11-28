/*
 * A program to reverse String so that extra-terrestrials can understand you
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("What would you like to say?");
		String input = sc.nextLine();

		sc.close();

		System.out.println(reverse(input));

	}

	// methods

	// method to reverse a String
	static String reverse(String input) {
		// initialize an array that splits the input into separate characters
		String[] letters = input.split("");
		// initialize a variable to hold output
		String reverse = "";
		// iterate backwards
		for (int i = letters.length - 1; i >= 0; i--)
		{
			reverse += letters[i];
		}
		return reverse;
	}

}

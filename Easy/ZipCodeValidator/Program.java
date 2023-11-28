/*
 * A program that determines if user input is a valid zip code based on length, and if input contains only numbers
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int INPUTLENGTH = 5;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("Enter a zip code (5 consecutive digits):");
		String input = sc.nextLine();

		sc.close();

		// check user input
		if (correctLength(input) && isANumber(input)) System.out.println("true");
		else System.out.println("false");

	}

	// methods

	// method that determines if input length is equal to the required length
	static boolean correctLength(String input) {
		return input.length() == INPUTLENGTH;
	}

	// method that determines if each character is a number
	static boolean isANumber(String input) {
		try
		{
			int convert = Integer.parseInt(input);
			return true;
		}
		catch (NumberFormatException e)
		{
			return false;
		}
	}

}

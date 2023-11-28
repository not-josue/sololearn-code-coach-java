/*
 * A program that outputs the number of 1s that an integer has in its
 * binary representation
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int BASE = 2;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("Enter a positive integer:");
		int input = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		toBinary(input);

	}

	// methods

	// method to convert an int into its binary representation
	static void toBinary(int input) {
		// declare, and initialize variables to temporarily hold values
		int current = input;
		int remainder;
		// initialize a counter variable
		int counter = 0;
		// iterate
		while (current != 0)
		{
			remainder = current % BASE;
			if (remainder == 1) counter++;
			current = current / BASE;
		}
		System.out.println(counter);
	}

}

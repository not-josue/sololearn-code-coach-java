/*
 * A program that outputs different sounds depending on how many Rice Krispies you 
 * have in your bowl
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int BOWLS = 6;

	public static final int DIVIDER = 3;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// declare an array based on user input
		int[] bowls = getInput(BOWLS, sc);

		sc.close();

		// display output
		getSounds(bowls);

	}

	// methods

	// method to store user input into an array
	static int[] getInput(int bowls, Scanner sc) {
		// initialize a local array
		int[] arr = new int[bowls];

		// iterate to get user input
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("Amount of Rice Crispies in bowl " + (i + 1));
			arr[i] = sc.nextInt();
			sc.nextLine(); // fix-up
		}
		return arr;
	}

	// method that sets the sound each bowl makes depending on the amount in the
	// bowl
	static String setSound(int amount) {
		if (amount % DIVIDER == 0) return "Pop";
		else if (amount % 2 == 0) return "Crackle";
		else return "Snap";
	}

	// method to determine what sound each bowl makes
	static void getSounds(int[] bowls) {
		// declare a String variable that will contain all sounds
		String sounds = "";

		// iterate
		for (int i = 0; i < bowls.length; i++)
		{
			if (i == bowls.length - 1) sounds += setSound(bowls[i]);
			else sounds += setSound(bowls[i]) + " ";
		}

		System.out.println(sounds);
	}

}

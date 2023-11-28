/*
 * A program that determines whether you should cheer after a football play.
 * The type of output depends on how many yards your team gained during the play.
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	// constants for different output

	// output for a play that is > 10 yards
	public static final String BIGPLAY = "High Five";
	// output for a play that is < 1 yard
	public static final String BADPLAY = "shh";
	// output for a play that is 1 - 9 yards
	public static final String NORMALPLAY = "Ra!";

	public static void main(String[] args) {

		// create an instance of scanner
		Scanner sc = new Scanner(System.in);
		// get user input
		System.out.println("How many yards did the team gain or lose?");
		int yards = sc.nextInt();
		sc.nextLine(); // fix up
		// call the reaction method to determine how you should react to the play
		reaction(yards);

		sc.close();

	}

	// methods

	// method that loops based on the integer given, and outputs a cheer everytime
	static void shout(int yards, String cheer) {
		for (int i = 0; i < yards; i++)
		{
			// use print to stay on the same line
			System.out.print(cheer);
		}
	}

	// method that outputs the type of cheer you do based on the integer provided
	static void reaction(int yards) {
		// output if yards > 10
		if (yards > 10)
		{
			System.out.println(BIGPLAY);
		}
		// output if yards < 1
		else if (yards < 1)
		{
			System.out.println(BADPLAY);
		}
		// output if yards is >= 1 and <= 10
		else
		{
			shout(yards, NORMALPLAY);
		}
	}

}

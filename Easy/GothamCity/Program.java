/*
 * A program that helps a gotham city police officer (GCPO) decide whether to go to a crime scene alone, with batman, or just
 * let batman go alone
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int LOWER_LIMIT = 5;
	public static final int UPPER_LIMIT = 10;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("How many criminals are at the scene?");
		int people = sc.nextInt();

		sc.close();

		if (people < LOWER_LIMIT) System.out.println("I got this!");
		else if (people > UPPER_LIMIT) System.out.println("Good Luck out there!");
		else System.out.println("Help me Batman");

	}

}

/*
 * A program that determines how long it will take for you to get from a ship, to the beach via ferry
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int BOAT_LIMIT = 20;
	public static final int WAIT_TIME = 10;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("How many people are ahead of you?");
		int input = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		// output
		System.out.println(waitTime(input));

	}

	// methods

	// method to see if anyone is still in line
	static boolean emptyLine(int people) {
		return people <= 0;
	}

	// method to calculate when the ferry is full of people, and add a timer
	static int waitTime(int people) {
		// initialize a variable for the number of people in line (including
		// yourself)
		int inLine = (people + 1) - BOAT_LIMIT;
		// initialize a variable to act as a timer
		int timer = WAIT_TIME;
		// loop until the waiting line falls to 0
		while (!emptyLine(inLine))
		{
			// update waiting line count
			inLine -= BOAT_LIMIT;
			// update timer (10 minutes each way)
			timer += 2 * WAIT_TIME;
		}
		return timer;
	}

}

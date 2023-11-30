/*
 * A program that determines if you have enough carrots left over to make a cake after packing the carrots 
 * in boxes evenly
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int CARROTS_NEEDED = 7;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("What is the total number of carrots?");
		int total = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("How many boxes do you have to fill?");
		int boxes = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		int remaining = packCarrots(total, boxes);

		if (remaining >= CARROTS_NEEDED) System.out.println("Cake Time");
		else
			System.out
					.println("I need to buy " + (CARROTS_NEEDED - remaining) + " more");

	}

	// methods

	// method that determines how many carrots you have left after boxing your
	// total carrots evenly
	static int packCarrots(int total, int boxes) {
		return total % boxes;
	}

}

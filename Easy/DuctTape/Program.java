/*
 * A program that determines the total amount of duct tape rolls needed to cover the area of a door
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	// duct tape roll length in feet
	public static final double ROLLLENGTH = 60;
	// duct tape width length in inches
	public static final double ROLLWIDTHINCHES = 2;
	// duct tape width length converted into feet
	public static final double ROLLWIDTHFEET = ROLLWIDTHINCHES / 12;
	// per roll total area
	public static final double ROLLCOVERAGE = ROLLLENGTH * ROLLWIDTHFEET;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("What is the height of the door?");
		int height = sc.nextInt();
		System.out.println("What is the width of the door?");
		int width = sc.nextInt();

		sc.close();

		// calculate the total area needed of both sides of a door
		double totalArea = 2 * (height * width);

		// calculate the amount of rolls needed by rounding up, and type casting to
		// an int
		int rollsNeeded = (int) Math.ceil(totalArea / ROLLCOVERAGE);

		// output
		System.out.println(rollsNeeded);

	}

}

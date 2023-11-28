/*
 * A program that calculates whether you have enough snacks to get your pet iguana down from a tree
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int POINTS_NEEDED = 10;
	// points per snack
	public static final int LETTUCE = 5;
	public static final int CARROT = 4;
	public static final int MANGO = 9;
	public static final int CHEESEBURGER = 0;
	// output
	public static final String ENOUGH_POINTS = "Come on Down!";
	public static final String BELOW_POINTS = "Time to wait";

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("Which snacks did you bring?");
		String input = sc.nextLine();

		sc.close();

		// initialize an array to split user input into separate Strings
		String[] inputArr = input.split(" ");

		// initialize a variable to calculate how many points you for the
		// combination of snacks
		int points = countPoints(inputArr);

		// output based on points
		outputMsg(points);

	}

	// methods

	// method to calculate the amount of total points accumulated
	static int countPoints(String[] input) {
		// initiate a counter variable
		int points = 0;
		// iterate over the Sring array to update the points variable
		for (String snack : input)
		{
			if ("Lettuce".equalsIgnoreCase(snack)) points += LETTUCE;
			else if ("Carrot".equalsIgnoreCase(snack)) points += CARROT;
			else if ("Mango".equalsIgnoreCase(snack)) points += MANGO;
			else points += CHEESEBURGER;
		}
		return points;
	}

	// method to generate output based on accumulated points
	static void outputMsg(int points) {
		if (points >= POINTS_NEEDED) System.out.println(ENOUGH_POINTS);
		else System.out.println(BELOW_POINTS);
	}

}

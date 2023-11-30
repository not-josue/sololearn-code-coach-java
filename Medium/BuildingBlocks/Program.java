/*
 * A program that determines how many blocks are left over after you distribute blue, red, green, and yellow 
 * blocks evenly to x students
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int STUDENTS = 15;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("Enter all the blocks you have matching the prompt");

		System.out.println("Blue:");
		int blue = sc.nextInt();
		sc.nextLine(); // fix-up

		System.out.println("Red:");
		int red = sc.nextInt();
		sc.nextLine(); // fix-up

		System.out.println("Green:");
		int green = sc.nextInt();
		sc.nextLine(); // fix-up

		System.out.println("Yellow:");
		int yellow = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		// initialize an array with all colors
		int[] blocks = {blue, red, green, yellow};

		// initialize an output variable
		int result = distributeBlocks(blocks);

		// output
		System.out.println(result);

	}

	// methods

	// method that determines how many blocks you have left over after even
	// distribution
	static int distributeBlocks(int[] blocks) {

		// initialize a counter variable
		int counter = 0;

		// iterate and check
		for (int amount : blocks)
			counter += amount % STUDENTS;

		return counter;

	}

}

/*
 * A program that takes a number and calculates the sum of all numbers below it that are multiples of 3 or 5
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int THREE = 3;
	public static final int FIVE = 5;

	public static void main(String[] args) {
		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		// get user input
		System.out.println("Which value would you like to evaluate?");
		int input = sc.nextInt();
		// calculate the sum by calling the getMultiples method
		int total = getMultiples(input);
		// display output
		System.out.println(total);

		sc.close();

	}

	// methods

	// method that calculates the sum of all multiples of 3 or 5
	static int getMultiples(int number) {
		// initialize a sum variable
		int sum = 0;
		// start at 3 since it is the minimum required to increase the sum variable
		for (int i = 3; i < number; i++)
		{
			// evaluate the current i to see it is a multiple of either 3 or 5
			if (i % THREE == 0 || i % FIVE == 0)
			{
				// update the sum variable if true
				sum += i;
			}
		}

		return sum;

	}

}

/*
 * A program that finds how many apples you have, and outputs how many apple pies you can make
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	// constant for the required amount of apples needed to make an apple pie
	public static final int AMOUNTNEEDED = 3;

	public static void main(String[] args) {

		// create an instance of scanner
		Scanner sc = new Scanner(System.in);
		// ask the user how many total fruit they have and get input
		System.out.println("How many total fruit do you have?");
		int totalFruit = sc.nextInt();
		sc.nextLine(); // fix up
		// call the halve method to calculate how many of the fruit are apples
		int apples = halve(totalFruit);
		// call the wholePies method to log how many apple pies the user can make
		System.out.println(wholePies(apples));

		sc.close();

	}

	// methods

	// method that halves the amount of fruit
	static int halve(int totalFruit) {
		return totalFruit / 2;
	}

	// method that calculates how many whole pies can be made
	static int wholePies(int apples) {
		return apples / AMOUNTNEEDED;
	}

}

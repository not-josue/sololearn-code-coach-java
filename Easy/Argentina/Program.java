/*
 * A program that converts Argentine pesos and converts them to US Dollars so the user can find the cheapest price of an item.
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final double EXCHANGERATE = .02;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("What is the price in pesos?");
		int pesos = sc.nextInt();
		System.out.println("What is the price in dollars?");
		int dollars = sc.nextInt();

		sc.close();

		// convert pesos to dollars
		double convertedPesos = convertPesos(pesos);

		// output
		betterPrice((int) convertedPesos, dollars);

	}

	// methods

	// a method to convert Argentine pesos to dollars
	static double convertPesos(int pesos) {
		return pesos * EXCHANGERATE;
	}

	// a method that compares the price in pesos vs the price in dollars
	static void betterPrice(int pesos, int dollars) {
		if (pesos < dollars)
		{
			System.out.println("Pesos");
		}
		else
		{
			System.out.println("Dollars");
		}
	}

}

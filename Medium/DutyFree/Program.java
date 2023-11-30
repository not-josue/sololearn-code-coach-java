/*
 * A program that checks if each item you bought (in Euros) is less than x US Dollars
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final double EXCHANGE_RATE = 1.10;
	public static final double LIMIT = 20.00;

	public static final String PASS = "On to the terminal";
	public static final String FAIL = "Back to the store";

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println(
				"List all the prices of the items bought separated by a space:");
		String input = sc.nextLine();
		sc.close();

		// split input
		String[] split = input.split(" ");

		// convert input
		double[] convert = string2Double(split);

		// check each value and output
		String result = (priceCheck(convert)) ? PASS : FAIL;

		System.out.println(result);

	}

	// methods

	// method to convert a String array to a double array
	static double[] string2Double(String[] input) {

		// initialize a double array
		double[] convert = new double[input.length];

		// iterate and convert
		for (int i = 0; i < convert.length; i++)
			convert[i] = Double.valueOf(input[i]) * EXCHANGE_RATE;

		return convert;

	}

	// method to check the value in a double array
	static boolean priceCheck(double[] input) {

		// iterate and check
		for (double value : input)
		{
			if (value > LIMIT) return false;
		}

		return true;

	}

}

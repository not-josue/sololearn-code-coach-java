/*
 * A program that checks if a given input is divisible by a given array of integers
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static final String PASS = "divisible by all";
	public static final String FAIL = "not " + PASS;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input

		System.out.println("Enter the integer you would like to check:");
		int input = sc.nextInt();
		sc.nextLine(); // fix-up

		System.out.println(
				"Enter the numbers you want to divide by separated by a space:");
		String inputArr = sc.nextLine();

		sc.close();

		// split input array
		String[] split = inputArr.split(" ");

		// convert split array to an int array
		int[] convert = string2Int(split);

		// output
		String result = (divByAll(input, convert)) ? PASS : FAIL;

		System.out.println(result);

	}

	// methods

	// method to convert a String array into a int array
	static int[] string2Int(String[] input) {

		// initialize a local array
		int[] convert = new int[input.length];

		// iterate and convert
		for (int i = 0; i < convert.length; i++)
			convert[i] = Integer.valueOf(input[i]);

		return convert;

	}

	// method to check if an int is divisible by all int in an array
	static boolean divByAll(int target, int[] numbers) {

		// iterate and check
		for (int number : numbers)
		{
			if (target % number != 0) return false;
		}

		return true;

	}

}

/*
 * A program that calculates the total savings of a purchase when you pay full price for the most expensive 
 * item, and only 70% for the remaining items, tax rate is 7%, an you leave a tip for any amount under a dollar
 * Written By: Josue
 */
import java.util.Arrays;
import java.util.Scanner;
public class Program {

	// constants

	public static final double DISCOUNT = 0.30;
	public static final double TAX_RATE = 1.07;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		String input = sc.nextLine();
		sc.close();

		// split input
		String[] split = input.split(",");

		// convert input
		double[] convert = stringToDouble(split);

		// sort input (descending)
		double[] sorted = descendingSort(convert);

		System.out.println(calculateSavings(sorted));

	}

	// methods

	// method to convert a String array to a double array
	static double[] stringToDouble(String[] arr) {

		// initialize local array
		double[] convert = new double[arr.length];

		// iterate and convert
		for (int i = 0; i < arr.length; i++)
			convert[i] = Double.valueOf(arr[i]);

		return convert;
	}

	// method to sort in descending order
	static double[] descendingSort(double[] arr) {

		// initialize local array
		double[] sorted = Arrays.copyOf(arr, arr.length);

		// selection sort
		for (int i = 0; i < sorted.length; i++)
		{
			// initialize pointer
			int largestIndex = i;
			// iterate and compare
			for (int j = i + 1; j < sorted.length; j++)
			{
				if (sorted[i] < sorted[j]) largestIndex = j;
			}
			// check if the pointer moved
			if (largestIndex != i)
			{
				// initialize temp
				double temp = sorted[i];
				// update the current index (largest available value)
				sorted[i] = sorted[largestIndex];
				// send the current index to the swapped index location
				sorted[largestIndex] = temp;
			}
		}

		return sorted;

	}

	// method to calculate savings
	static int calculateSavings(double[] arr) {

		// initialize sum variable
		double beforeTax = 0.00;

		// iterate and update sum variable
		for (int i = 1; i < arr.length; i++)
			beforeTax += arr[i] * DISCOUNT;

		// add tax
		double afterTax = beforeTax * TAX_RATE;

		// round, convert, and return
		return (int) Math.floor(afterTax);

	}

}

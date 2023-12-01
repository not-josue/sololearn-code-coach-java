/*
 * A program that takes x number of lines as integer inputs, then gives the sum of even integers
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("How many integers will the list contain?");
		int length = sc.nextInt();
		sc.nextLine(); // fix-up

		System.out.println("Input values one at a time");
		int[] list = setList(sc, length);

		sc.close();

		// output
		int sum = calculateSum(list);
		System.out.println("Sum:");
		System.out.println(sum);

	}

	// methods

	// method for taking user input and storing it into an array
	static int[] setList(Scanner sc, int length) {

		// initialize a local array to store input
		int[] list = new int[length];

		// iterate and get input
		for (int i = 0; i < list.length; i++)
		{
			list[i] = sc.nextInt();
			sc.nextLine(); // fix-up
		}

		return list;

	}

	// method for calculating the sum of even numbers in an array
	static int calculateSum(int[] list) {

		// initialize a sum variable
		int sum = 0;

		// iterate and update the sum variable
		for (int value : list)
		{
			if (value % 2 == 0) sum += value;
		}

		return sum;

	}

}

/*
 * A program that determines which rectangle has a greater area based on user input
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner to get user input
		Scanner sc = new Scanner(System.in);

		// get user input for first apartment
		System.out
				.println("What is the length, and width of apartment A's balcony?");
		String input = sc.nextLine();
		// set area of the first apartment's balcony
		int firstBalcony = inputParser(input);

		// get user input for the second apartment
		System.out
				.println("What is the length, and width of apartment B's balcony?");
		input = sc.nextLine();
		// set area of the second apartment's balcony
		int secondBalcony = inputParser(input);

		sc.close();

		// output
		biggerApt(firstBalcony, secondBalcony);

	}

	// methods

	// a method that calculates the area of a rectangle (length * width)
	static int calculateArea(int length, int width) {
		return length * width;
	}

	// a method to parse user input into two ints
	static int inputParser(String input) {
		// create an instance of Scanner that reads user input, and set the
		// delimiter
		Scanner parser = new Scanner(input).useDelimiter(",");
		int length = parser.nextInt();
		int width = parser.nextInt();
		parser.close();
		return calculateArea(length, width);
	}

	// a method that determines which apartment's balcony is greater
	static void biggerApt(int areaA, int areaB) {
		if (areaA > areaB)
		{
			System.out.println("Apartment A");
		}
		else
		{
			System.out.println("Apartment B");
		}
	}

}

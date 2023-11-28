/*
 * A program that converts RGB color values to hex color values
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	// base number you will be using to divide
	public static final int BASE = 16;

	// numbers that need to be converted
	public static final String TEN = "a";
	public static final String ELEVEN = "b";
	public static final String TWELVE = "c";
	public static final String THIRTEEN = "d";
	public static final String FOURTEEN = "e";
	public static final String FIFTEEN = "f";

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to RGB to Hex Convertor!!!\n");

		// get user input
		System.out.println("Red:");
		int red = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("Blue:");
		int blue = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("Green:");
		int green = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		// initialize an array to store all int values
		int[] calculations = {red / BASE, red % BASE, blue / BASE, blue % BASE,
				green / BASE, green % BASE};

		// output
		System.out.println(convert(calculations));

	}

	// methods

	// method to convert integers greater than 9 to their hex value
	static String toHex(int integer) {
		switch (integer) {
			case (10) :
				return TEN;
			case (11) :
				return ELEVEN;
			case (12) :
				return TWELVE;
			case (13) :
				return THIRTEEN;
			case (14) :
				return FOURTEEN;
			default :
				return FIFTEEN;
		}
	}

	// method for converting int values to hex values, and generating output
	static String convert(int[] arr) {
		// declare a variable to return output
		String hex = "#";
		// iterate
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > 9) hex += toHex(arr[i]);
			else hex += String.valueOf(arr[i]);
		}
		return hex;
	}

}

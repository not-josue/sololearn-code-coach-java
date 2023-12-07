/*
 * A program that converts time from a 12 hour clock to a time from a 24 hour clock
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("Enter a time XX:XX AM/PM");
		String input = sc.nextLine();

		sc.close();

		// split input by space to determine if AM or PM
		String[] split = input.split(" ");

		String result = (split[1].equalsIgnoreCase("AM"))
				? split[0]
				: toMilitary(split);

		System.out.println(result);

	}

	// methods

	// method to convert a PM time to military time
	static String toMilitary(String[] input) {

		// initialize an array to split by a colon
		String[] split = input[0].split(":");

		// initialize int to convert hours
		int hour = string2Int(split[0]);

		// convert hour to a String
		String convert = String.valueOf(hour);

		// initialize a String for minutes
		String[] minutes = split[1].split(" ");

		// output
		return convert + ":" + minutes[0];

	}

	// method to convert a String to an int and return it in military time
	static int string2Int(String time) {

		// convert input to an int
		int convert = Integer.valueOf(time);

		// special case for 12 PM
		int result = (convert == 12) ? convert : convert + 12;

		return result;

	}

}

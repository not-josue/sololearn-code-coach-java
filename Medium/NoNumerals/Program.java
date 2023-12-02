/*
 * A program that replaces the numerals 0-10 with their word counterparts
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final String[] NUMBERS =
	{
			"zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
			"nine", "ten"
	};

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("Enter the phrase you would like to change:");
		String input = sc.nextLine();

		sc.close();

		// split input
		String[] inputArr = input.split(" ");

		// convert input
		String[] convert = convertInput(inputArr);

		// output
		System.out.println(joinArr(convert));

	}

	// methods

	// method to search and replace numerals
	static String[] convertInput(String[] input) {

		// initialize a local array to store the converted phrase
		String[] convert = new String[input.length];

		// iterate and check
		for (int i = 0; i < convert.length; i++)
			convert[i] = replaceNumerals(input[i]);

		return convert;

	}

	// method that changes a numeral to its word equivalent
	static String getNum(String numeral) {
		return NUMBERS[Integer.valueOf(numeral)];
	}

	// method that examines a String for 0-10
	static String replaceNumerals(String word) {

		if (word.equals("0")) return getNum(word);
		else if (word.equals("1")) return getNum(word);
		else if (word.equals("2")) return getNum(word);
		else if (word.equals("3")) return getNum(word);
		else if (word.equals("4")) return getNum(word);
		else if (word.equals("5")) return getNum(word);
		else if (word.equals("6")) return getNum(word);
		else if (word.equals("7")) return getNum(word);
		else if (word.equals("8")) return getNum(word);
		else if (word.equals("9")) return getNum(word);
		else if (word.equals("10")) return getNum(word);
		else return word;

	}

	// method that joins an array
	static String joinArr(String[] arr) {

		// initialize a String variable
		String join = "";

		// iterate and update the local String variable
		for (int i = 0; i < arr.length; i++)
		{
			// special case for last index
			if (i == arr.length - 1) join += arr[i];
			else join += arr[i] + " ";
		}

		return join;

	}

}

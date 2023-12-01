/*
 * A program that checks whether one of your group members has the same first letter of their first name as you
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out
				.println("What are the name of your group members (separate by space");
		String group = sc.nextLine();

		System.out.println("Enter your name?");
		String name = sc.nextLine();

		sc.close();

		// split group members into an array
		String[] split = group.split(" ");

		// output
		String result = (memberMatches(split, name))
				? "Compare notes"
				: "No such luck";

		System.out.println(result);

	}

	// methods

	// method to iterate an array and check whether any value's first letter
	// matches your name's first letter
	static boolean memberMatches(String[] group, String name) {

		// initialize a char variable for your first letter
		char yourLetter = name.charAt(0);

		// iterate and check
		for (String member : group)
		{
			if (member.charAt(0) == yourLetter) return true;
		}

		return false;

	}

}

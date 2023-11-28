/*
 * A program that compares easter eggs in your friend's, and your basket to see if all hidden eggs have been found
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("How many total hidden eggs?");
		int total = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("How many eggs do you have in your basket?");
		int yours = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("How many eggs does your friend have in their basket?");
		int friends = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		// compare total eggs found with eggs available, and output
		if (foundAll(total, yours, friends)) System.out.println("Candy Time");
		else System.out.println("Keep Hunting");

	}

	// methods

	// method that compares total eggs available with total eggs found
	static boolean foundAll(int total, int yours, int friends) {
		return total == yours + friends;
	}

}

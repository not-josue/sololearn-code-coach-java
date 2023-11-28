/*
 * A program that determines whether you can distribute ice cream evenly
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		// take user input for amount of people
		System.out.println("How many siblings?");
		int people = sc.nextInt();
		sc.nextLine(); // fix up
		// take user input for amount of popsicles
		System.out.println("How many popsicles?");
		int popsicles = sc.nextInt();
		sc.nextLine();

		// call the boolean function and log output based on the result
		if (canDistribute(people, popsicles))
		{
			System.out.println("give away");
		}
		else
		{
			System.out.println("eat them yourself");
		}

		sc.close();

	}

	/*
	 * method that takes two integers and returns true if the number of people is
	 * a factor of the number of items
	 */
	static boolean canDistribute(int people, int popsicles) {
		return popsicles % people == 0;
	}

}

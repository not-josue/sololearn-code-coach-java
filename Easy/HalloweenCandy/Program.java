/*
 * A program that determines the chance that you randomly pull out a dollar bill 
 * from your trick-or-treat bag based on the number of houses you visit
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	// required amount of houses a user has to have visited
	public static final int REQUIREDHOUSES = 3;
	// number of houses with dollar bills
	public static final double MONEYHOUSES = 2.0;

	public static void main(String[] args) {

		// create a scanner instance
		Scanner sc = new Scanner(System.in);
		// get user input
		System.out.println("How many houses have you visited?");
		int visited = sc.nextInt();
		sc.nextLine(); // fix up

		// call a method to check if user input is correct
		if (!enoughHouses(visited))
		{
			// console bad input message
			System.out.println("Not enough houses visited!!!");
		}
		else
		{
			// create a variable that calculates the percent of houses that gives out
			// dollar bills
			double percentage = (MONEYHOUSES / visited) * 100;
			// typecast to an int, and round up
			System.out.println((int) Math.ceil(percentage));
		}

		sc.close();

	}

	// a method that returns true if user input is greater than or equal to the
	// required amount
	static boolean enoughHouses(int houses) {
		return houses >= REQUIREDHOUSES;
	}

}

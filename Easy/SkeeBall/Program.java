/*
 * A program that calculates whether your score gets you enough points to purhase a prize
 * Written By: Josue
 */
import java.util.Scanner;

public class Program {

	// constants

	// ratio for points per ticket
	public static final int TICKETCOST = 12;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		// get user input
		System.out.println("How many points did you score?");
		int points = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("How much is the prize you want?");
		int cost = sc.nextInt();
		sc.nextLine();

		// convert points to tickets by calling the points2Tickets method
		int tickets = points2Tickets(points);
		// display output to user by calling the purchaseDecision method
		purchaseDecision(tickets, cost);

		sc.close();

	}

	// methods

	// method to convert points to tickets
	static int points2Tickets(int points) {
		return points / TICKETCOST;
	}

	// method that decides whether to purchase or not
	static void purchaseDecision(int tickets, int cost) {
		if (tickets >= cost)
		{
			System.out.println("Buy it!");
		}
		else
		{
			System.out.println("Try again");
		}
	}

}

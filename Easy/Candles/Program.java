/*
 * A program that calculates the amount of candles you have to buy depending on how many friends place an order
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int CANDLESPERPERSON = 9;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out.println("How many friends need to order candles?");
		int friends = sc.nextInt();

		sc.close();

		// initialize a variable to hold the total amount of candles you need to
		// order
		// take into account that you will ALWAYS need to order candles for yourself
		int total = (friends + 1) * CANDLESPERPERSON;

		System.out.println(total);

	}

}

/*
 * A program that calculates whether a profit is made (for the month) for a company that sells hovercrafts
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int HOVERCRAFTS_MANUFACTURED = 10;

	public static final int PER_HOVERCRAFT_COST = 2000000;

	public static final int INSURANCE_COSTS = 1000000;

	public static final int TOTAL_COSTS = (HOVERCRAFTS_MANUFACTURED
			* PER_HOVERCRAFT_COST) + INSURANCE_COSTS;

	public static final int SELL_PRICE = 3000000;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("How many hovercrafts were sold?");
		int quantitySold = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		int totalSales = totalSales(quantitySold);

		monthlyResult(totalSales);

	}

	// methods

	// method that calculates total sales
	static int totalSales(int quantitySold) {
		return quantitySold * SELL_PRICE;
	}

	// method to notify the monthly result
	static void monthlyResult(int sales) {
		if (sales > TOTAL_COSTS) System.out.println("Profit");
		else if (sales < TOTAL_COSTS) System.out.println("Loss");
		else System.out.println("Broke Even");
	}

}

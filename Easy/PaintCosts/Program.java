/*
 * A program that calculates the total cost of a paint project
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final double MATERIALS = 40.00;
	public static final double PAINTPRICE = 5.00;
	public static final double TAXRATE = 1.10;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// ask user for input
		System.out.println("How many colors will your project require?");
		int colors = sc.nextInt();

		sc.close();

		double total = (MATERIALS + paintCost(colors)) * TAXRATE;

		System.out.println(Math.round(total));

	}

	// methods

	// method for calculating the total paint cost
	static double paintCost(int colors) {
		return colors * PAINTPRICE;
	}

}

/*
 * A program that calculates a customer's purchase in a kaleidoscope shop
 * Written By: Josue
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Program {

	// constants

	public static final double DISCOUNT = 0.10;
	public static final double TAX_RATE = 0.07;
	public static final double PRICE = 5.00;

	public static final int APPLY_DISCOUNT = 2;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("How many kaleidoscopes are being purchased?");
		int input = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		// initialize a variable that holds the price before tax
		double beforeTax = beforeTax(input);

		// output, apply discount if amount purchased is greater than 1
		if (input >= APPLY_DISCOUNT)
			System.out.println(doubleRounder(tax(discount(beforeTax))));
		else
			System.out.println(doubleRounder(tax(beforeTax)));

	}

	// methods

	// method to round a double to two decimal places
	static double doubleRounder(double value) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

	// method to apply a discount to the purchase price
	static double discount(double value) {
		return value - (value * DISCOUNT);
	}

	// method to calculate the price before tax or discount
	static double beforeTax(int amount) {
		return amount * PRICE;
	}

	// method to apply a tax rate to a purchase
	static double tax(double amount) {
		return amount + (amount * TAX_RATE);
	}

}

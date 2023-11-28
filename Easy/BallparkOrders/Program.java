/*
 * A program that calculates the total cost of a food order at a baseball park
 * Written By: Josue
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class Program {

	// constants

	public static final double NACHOS = 6.00;
	public static final double PIZZA = 6.00;
	public static final double BURGER = 10.00;
	public static final double WATER = 4.00;
	public static final double COKE = 5.00;

	public static final int ITEMS = 4;

	public static final double TAXRATE = 1.07;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your order:");
		String input = sc.nextLine();
		// parse input into an array
		String[] parsedInput = parseInput(ITEMS, input);
		// calculate the total cost
		double total = totalCost(parsedInput);
		// output rounded total
		System.out.println(round(total));

	}

	// methods

	// method to parse the user's input into an array
	static String[] parseInput(int items, String input) {
		// create an instance of Scanner
		Scanner sc = new Scanner(input);
		// declare an array
		String[] parser = new String[items];
		// declare a temp variable
		String temp;
		// iterate
		for (int i = 0; i < items; i++)
		{
			temp = sc.next();
			parser[i] = temp;
		}
		sc.close();
		return parser;
	}

	// method to calculate the cost of 1 item
	static double itemCost(String food) {

		if (food.equals("Nachos")) return NACHOS;
		else if (food.equals("Pizza")) return PIZZA;
		else if (food.equals("Cheeseburger")) return BURGER;
		else if (food.equals("Water")) return WATER;
		else if (food.equals("Coke")) return COKE;
		else return COKE;

	}

	// method to calculate the total amount for a food order
	static double totalCost(String[] foodOrder) {
		double beforeTax = 0.00;
		for (String item : foodOrder)
		{
			beforeTax += itemCost(item);
		}
		return beforeTax * TAXRATE;
	}

	// method to round the total cost to two decimal places
	static double round(double value) {
		BigDecimal bd = new BigDecimal(value);
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		return bd.doubleValue();
	}

}

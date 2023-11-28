/*
 * A program that calculates how many flamingo lawn ornaments you should add to your yard (every 2 feet) based on your lawn's parameter
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get input
		System.out.println("What is the length of your yard?");
		int length = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("What is the width of your yard?");
		int width = sc.nextInt();
		sc.nextLine(); // fix up

		sc.close();

		// initialize a total variable
		int parameter = length + width;

		// output
		System.out.println(parameter);

	}

}

/*
 * A program that calculates your twin's age once they leave Neverland
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get user input
		System.out
				.println("What ages were the both of you when you went to Neverland?");
		int age = sc.nextInt();
		sc.nextLine(); // fix-up
		System.out.println("How many years has it been since your twin left?");
		int years = sc.nextInt();
		sc.nextLine(); // fix-up

		sc.close();

		// initialize a variable for the twins current age
		int twinsAge = calculateAge(age, years);

		// output
		outputMsg(twinsAge, years);

	}

	// methods

	// method to calculate the age of your twin
	static int calculateAge(int age, int years) {
		return age + years;
	}

	// method to generate output
	static void outputMsg(int age, int years) {
		System.out.println("My twin is " + age + " years old and they are " + years
				+ " years older than me");
	}

}

/*
 * A program that determines whether the coyote catches the roadrunner based on 
 * their distance, apart, and constant speed
 * Written By: Josue
 */
import java.util.Scanner;
public class Program {

	// constants

	public static final int DISTANCEAPART = 50;

	public static void main(String[] args) {

		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);

		// get safety distance
		System.out.println("Distance to safety:");
		int safety = sc.nextInt();
		sc.nextLine(); // fix-up

		// get roadrunner speed
		System.out.println("Roadrunner speed:");
		int roadrunner = sc.nextInt();
		sc.nextLine(); // fix-up

		// get coyote speed
		System.out.println("Coyote speed:");
		int coyote = sc.nextInt();
		sc.nextLine();

		sc.close();

		if (safelyMadeIt(safety, roadrunner, coyote))
			System.out.println("Meep Meep");
		else
			System.out.println("Yum");

	}

	// methods

	// method for determining how many turns for the roadrunner to get to safety
	static boolean safelyMadeIt(int safety, int roadrunner, int coyote) {
		// initialize a counter variable for updating coyote distance
		int counter = DISTANCEAPART;
		// initialize a variable for updating safety distance
		int finishLine = safety;

		// iterate until the roadrunner makes it to safety
		while (finishLine > 0)
		{
			counter -= coyote;
			if (counter <= 0) return false;
			finishLine -= roadrunner;
		}

		return true;

	}

}

/*
 * A program that extracts English alphabet characters, numbers, and spaces from a 
 * random String of symbols
 * Written By: Josue
 */
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class Program {

	public static void main(String[] args) {
		
		// create an instance of Scanner
		Scanner sc = new Scanner(System.in);
		
		// get input
		System.out.println("Enter random letters:");
		String input = sc.nextLine();
		
		sc.close();
		
		// output
		System.out.println(extract(input));

	}
	
	// methods
	
	// method to extract letters, numbers, and spaces
	static String extract(String input) {
		// initialize a variable for output
		String extracted = "";
		
		// create an instance of Pattern and Matcher
		Pattern pattern = Pattern.compile("[\\p{Alpha}\\d\\s]+");
		Matcher matcher = pattern.matcher(input);
		
		// iterate
		while (matcher.find()) extracted+= matcher.group();
		
		return extracted;
	}

}

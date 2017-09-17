package core;
import java.io.*;
import java.util.Scanner;
public class Input_Scanner {
	public static void main (String [] args ) throws FileNotFoundException {
		Scanner s = new Scanner (System.in);
		System.out.print("Enter your first name: ");
		String fist_name = s.nextLine();
		if (fist_name.length()==0) {System.err.println ("Good");System.exit(0) ;}
			
		
		System.out.print("Enter you last name: ");
	    String last_name = s.nextLine();
	    System.out.println ("Your full name is " + fist_name + " " + last_name);
	    s.close();
	}
}
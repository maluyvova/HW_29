package core;
import java.io.*;
import java.util.Arrays;
public class Input_Console_Password {
	public static void main (String [ ] args ){
		Console c = System.console();
		if (c==null) {System.err.println ("Console is not availible"); System.exit(0);}
		char [] password = c.readPassword("Enter password");
		char [] password2 = c.readPassword("Confirm password:");
		boolean isMatch = Arrays.equals(password, password2);
		System.out.println(isMatch ? "Password match" : "Password's don't match");
		System.out.println("Password:" + String.valueOf(password));
		System.out.println("Confirm password: " + String.valueOf(password2));
	}}

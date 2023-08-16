////////////////////////////////////////////////////////////////////////////////////////
//  Chris McElroy
//  9/23/19
//  CSC 220
//  Project 01
//  Reads the first digital, then displays the results with count, sum, and %.
////////////////////////////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;
 
 
public class LeadingDigit
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int[] x = xDigits(input);
		reportResults(x);    
	}

	// reads the integers creating a array for the number of each leading digit
	public static int[] xDigits(Scanner input) 
	{
		int[] x = new int[10];
		while (input.hasNextInt()) {
			int n = input.nextInt();
			x[FirstDigit(n)]++;
		}
		return x;
	}
		 

	// returns the first digit
	public static int FirstDigitOf(String digits) 
	{
		int FirstDigit = Integer.parseInt(digits.substring(0, 1));
		if (FirstDigit >= 0 && FirstDigit < 10)
			return FirstDigit;
		return  FirstDigitOf(digits.substring(1));
	}

	 // finds the first digit of the given number
	public static int FirstDigit(int n) 
	{
		int b = Math.abs(n);
		while (b >= 10) 
		{
			b = b / 10;
		}
		return b;
	}

	// sum of the integers
	public static int sum(int[] v) 
	{
		int z = 0;
		for (int n : v) {
			z += n;
		}
		return z;
	}

	// finds % and creates table/display
	public static void reportResults(int[] x) 
	{
		System.out.println();
		int y = sum(x) - x[0];
		System.out.println("\n -----------------------------------------------------");
		System.out.println("\n Leading Digit    Count         Percent");
		System.out.println("\n -----------------------------------------------------");
		for (int i = 0; i < x.length; i++) {
			double pct = x[i] * 100.0 / y;
			System.out.printf("%5d           %5d           %6.2f\n", i,x[i],pct);
		}
		System.out.println("\n -----------------------------------------------------");
		System.out.printf("\n Total           %5d           %6.2f\n", y, 100.0);
		System.out.println("\n ======================================================");

	}    
}
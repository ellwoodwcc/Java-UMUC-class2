/*
* File: Homework1
* Author: Steve Ellwood
* Date: June 2, 2018
* Purpose: This program demonstrates the use of Standard I/O class scanner and appropriate Java style
* 
*/

package assnm1;

import java.util.Scanner;

public class Assnm1InOut {

	public static void main(String[] args) {
		// Variables to hold values
		int emplId = 0;
		float quiz1 = 0.0f;
		float quiz2 = 0.0f;
		float quiz3 = 0.0f;
		float sumQz = 0.0f;
		float averageQz;
		int months = 0;
		float ageInMonths = 0;
		double celsius, farenheit;

		// Use the Scanner class to input data
		Scanner scan = new Scanner(System.in);

		// Prompt the user to enter their id
		System.out.println("Enter your Student EMPLID (0 - 999999):");
		emplId = scan.nextInt();

		// Prompt the student to enter specific quiz scores
		System.out.println("Enter your quiz1 percentage score (0.0 – 100.0):");
		quiz1 = scan.nextFloat();
		System.out.println("Enter your quiz2 percentage score (0.0 – 100.0):");
		quiz2 = scan.nextFloat();
		System.out.println("Enter your quiz3 percentage score (0.0 – 100.0):");
		quiz3 = scan.nextFloat();
		// calculate the average in-line
		sumQz = (quiz1 + quiz2 + quiz3);
		averageQz = sumQz / 3;
		// Prompt the user to enter an appropriate month age with type listed. Follow with in-line calc
		System.out.println("Enter your age in months (0-1440):");
		months = scan.nextShort();
		ageInMonths = months / 12;
		// Prompt user for temperature in celsius, then convert in-line to farenheit
		System.out.println("Enter the current Temperature in degrees Celsius:");
		celsius = scan.nextDouble();
		farenheit = celsius * 9 / 5.0 + 32;
		// Display all results to Standard Output
		System.out.println();
		System.out.println("*** Thank you ***");
		System.out.println("Student EMPLID: " + emplId);
		System.out.println("Quiz 1 Score: " + quiz1);
		System.out.println("Quiz 2 Score: " + quiz2);
		System.out.println("Quiz 3 Score: " + quiz3);
		System.out.println("Average quiz score: " + String.format("%.2f",averageQz));
		System.out.println("Age in months: " + months);
		System.out.println("Age in years: " +  ageInMonths);
		// + "\u2103" is how to add celsius according:http://www.fileformat.info/info/unicode/char/2103/index.htm 
		// same source tells how to add a degree mark"\u00B0"
		System.out.println("Temperature in Celsius: " + celsius + "\u00B0");
		System.out.println("Temperature in Fahrenheit: " + farenheit + "\u00B0");

	}
}

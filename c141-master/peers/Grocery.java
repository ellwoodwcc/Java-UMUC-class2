package peers;
//Very thorough javadoc. I would leave out the file though as we like to cut and paste it into our own IDE
/*
* File: Grocery.java
* Author: Samantha Kingston
* Date: June 11, 2018
* Purpose: Class to determine the member cost and employee 
* cost of items given their different discounts rates
*/

import java.text.DecimalFormat;

public class Grocery {	
	//This method limits the number output to two decimal places.
	//There might be a better way: https://stackoverflow.com/questions/2379221/java-currency-number-format
private DecimalFormat df2 = new DecimalFormat(".##");
//Why does this have to be static?
	
	private double price;
	private double memberCost;
	private double employeeCost;
   //smart to separate this out as a generic for all grocery types
	public Grocery(double newValue, double tax) {
		price = newValue * (1+tax);
	}

	public double employeeCost(double employeeDiscount) {
		employeeCost = price * (1-employeeDiscount);
		return employeeCost;
	}

	public double memberCost(double memberDiscount) {
		memberCost = price * (1-memberDiscount);
		return memberCost;
	}
	//I thought java people usually use a toString for printing	
	public void printStates() {
		System.out.println("price: " + df2.format(price) + "  Employee Cost: "
			+ df2.format(employeeCost) + "  Member Cost: " + 
			df2.format(memberCost));
	}

}

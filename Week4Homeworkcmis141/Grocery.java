/*
* File: Grocery.java
* Purpose: Class to determine the member cost and employee 
* cost of items given their different discounts rates
*/

import java.text.DecimalFormat;

public class Grocery {	
private static DecimalFormat df2 = new DecimalFormat(".##");
	
	private double price;
	private double memberCost;
	private double employeeCost;

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
		
	public void printStates() {
		System.out.println("price: " + df2.format(price) + "  Employee Cost: "
			+ df2.format(employeeCost) + "  Member Cost: " + 
			df2.format(memberCost));
	}

}

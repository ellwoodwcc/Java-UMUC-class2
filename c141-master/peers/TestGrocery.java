package peers;

/*
* File: TestGrocery.java
* Author: Samantha Kingston
* Date: June 11, 2018
* Purpose: test program for the Grocery class 
*/


public class TestGrocery {
    
    public static void main(String[] args) {
	Grocery plates = new Grocery(29.99,0.10);
	Grocery tea = new Grocery(4.99,0.00);

	//Invoke methods on objects

	double platesMemberCost = plates.memberCost(0.05);
	double platesemployeeCost = plates.employeeCost(0.20);
	System.out.println("** Plates **");
	plates.printStates();

	
	double teaMemberCost = tea.memberCost(0.05);
	double teaEmployeeCost = tea.employeeCost(0.10);
	System.out.println("** Tea **"); //clever
	tea.printStates();
	
    }
}
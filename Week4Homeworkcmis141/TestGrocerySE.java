package peers;

/*
* File: TestGrocery.java
* Purpose: test program for the Grocery class 
*/


public class TestGrocery {
    
    public static void main(String[] args) {
    	//set the price and tax level
	Grocery plates = new Grocery(29.99,0.10);
	Grocery tea = new Grocery(4.99,0.00);

	//Invoke methods on objects
	//set the cost after discount and taxes and print
	double platesMemberCost = plates.memberCost(0.05);
	double platesemployeeCost = plates.employeeCost(0.20);
	System.out.println("** Plates **");
	plates.printStates();

		//set the cost after discount and taxes and print
	//aim for teaCosts.toString(); only
	double teaMemberCost = tea.memberCost(0.05);
	double teaEmployeeCost = tea.employeeCost(0.10);
	System.out.println("** Tea **"); //clever
	tea.printStates();
	
    }
}
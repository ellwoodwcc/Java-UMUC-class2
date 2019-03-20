package discussion;

import java.util.Scanner;

public class Measure {
    Scanner input = new Scanner(System.in);
    private double length, width, price, totalCost;
     
 
    //no-arg constructor
    public Measure(){
        // default values 10.0,10.0, and 1.50
        length = 10.0;
        width = 10.0;
        price = 1.50;
    }// end no-arg constructor
     
    // overloaded constructor to accept arguments
    public Measure(double length, double width, double price){
        // this to update length, width, price with user input
        this.length = length;
        this.width = width;
        this.price = price;
    }// end overloaded constructor
 
    // begin getters and setters
    public double getLength() {
        return length;
    }
 
    public void setLength(double length) {
        while(length < 10){
            System.out.print("Length must be at least 10.0. Please try again: ");
            length = input.nextDouble(); // re prompt for user input if length less than 10
        }
        this.length = length;
    }
 
    public double getWidth() {
        return width;
    }
 
    public void setWidth(double width) {
        while (width < 10.0){ // validate that width is greater than 10, loop unitl correct input
            System.out.print("Width must be at least 10.0. please try again: ");
            width = input.nextDouble(); // re prompt for user input if width less than 10
        }
        this.width = width;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        while (price < 1.50){// validate price is greater than 1.50.
            System.out.print("Price must be at least 1.50. Please try again: ");
            price = input.nextDouble();
        }
        this.price = price;
    }
    // end getters and setters
     
    //calculate area method
    double area;
    public double calcArea(){
         area = length*width;
        return area;
    }
     
    //calculate carpeting cost method
    public double calcCarpetCost(){
        totalCost = area * price;
        return totalCost;
    }
     
    //toString method to display the results
    public String displayResults(Measure x){
         
        String display ="   Length: " + length + "\n" +
                        "   Width: " + width + "\n" +
                        "   Total Area: " + area + "\n" +
                        "   Price per sq ft: " + price + "\n" +
                        "   Total Cost: " + totalCost;
        return display;
         
         
    }
     
     
}// end class
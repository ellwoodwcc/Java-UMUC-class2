package discussion;

import java.util.Scanner;



public class CarpetCalcDemo {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
         
                                        // Create objects default, user input, and pre scheduledfc  
        Measure measure0 = new Measure (); // object for default values
        Measure measure1 = new Measure ();// object for user input room
        Measure measure2 = new Measure (); // object pre scheduled 
         
         
        System.out.print("Length: ");
        double length = input.nextDouble();// get user input length
        measure1.setLength(length); // set user input length
        System.out.print("Width: ");
        double width = input.nextDouble();// get user input width
        measure1.setWidth(width); // set user input width
         
        System.out.print("Price");
        double price = input.nextDouble(); // get user input price
        measure1.setPrice(price); // set user input price
         
        // display results
        System.out.println("Room 1 (default):");
        System.out.println(measure0.toString());
        System.out.println("Room 2 (user input):");
        System.out.println(measure1.toString());
        System.out.println("Bradenton Co-op (scheduled purchase):");
        System.out.println(measure2.toString());
         
         
        //"Room 1 (default):"
        //"Room 2 (user input)"
        //"Bradenton Co-op  (scheduled purchase)"
    }
 
}
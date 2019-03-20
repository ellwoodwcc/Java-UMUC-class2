/*
Filename: LotsOfDucks.java
Synopsis: Small loop that ensures you imput a reasonable amount of ducks.
*/



import java.util.Scanner;
public class LotsOfDucks 
{    
    public static void main(String[] args)
    {
        boolean validate = false;
        int ducks;

        // Names "input" as a Scanner class object.
        Scanner input = new Scanner(System.in);
        // Creates loop making user put in the correct amount of ducks.
        while (!validate) {
            System.out.print("How many ducks are in the pond? ");        
            ducks = input.nextInt();
            if (ducks > 100 || ducks < 0) {
                System.out.println("That doesn't make any sense! Try again.");
            } else {
                validate = true;
            }
        }
        
        System.out.print("That's a reasonable amount of ducks.");
    }
}

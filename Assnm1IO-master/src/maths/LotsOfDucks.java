package maths;

import java.util.Scanner;
public class LotsOfDucks 
{    
    public static void main(String[] args)
    {
        boolean validate = false;
        //best to initialize it so don't feed a null statement.
        int ducks = 0;

        // Names "input" as a Scanner class object.
        Scanner input = new Scanner(System.in);
        // Creates loop making user put in the correct amount of ducks.
        while (!validate) {
            System.out.print("How many ducks are in the pond? ");        
            ducks = input.nextInt();
            //Give more accurate feedback
            if (ducks > 100) {
                System.out.println("Can't be! That's far too many ducks (>100).");
            } 
            //you don't need a brace for a one liner. Use a compound if statement
            else if (ducks<0)
            	System.out.println("Can't be! I've never seen negative ducks.");
            else
            {
                validate = true;
            }
        }
        //give feedback to the inputter on what they input
        System.out.print("You said there are " + ducks + " ducks.  Would you like to count again? Press the run button.");
    }
}
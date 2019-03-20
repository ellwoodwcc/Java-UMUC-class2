package maths;


import java.util.Random;
public class ForArray {
	
//		Creating an random array of numbers and then printing out the list of nu7mbers.

		
		public static void main(String[] args)
		{
			
//			Creating an random array of numbers 30 long, each less or equal to 20
			
			int[] numberList= new int[80]; 
			//use Random from homework
			Random r = new Random();
			
			for(int i = 0; i <numberList.length; i++)
			{
				//fill the list
				numberList[i] = r.nextInt(101);
				
			}
			
//			print out a listing of each number
			
			// prints it out
			for(int i = 0; i < numberList.length; i++)
			{
				
				System.out.print(numberList[i] + " ");
				
			}
			
			
		}
		
		
		
		
		
		
	}


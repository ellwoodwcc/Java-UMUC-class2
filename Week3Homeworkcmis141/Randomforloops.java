package maths;


import java.util.Random;
public class ForArray {
	
//		Creating an random array of numbers and then printing out the list of nu7mbers.

		
		public static void main(String[] args)
		{
			
//			Creating an random array of numbers 30 long
			
			int[] numberList= new int[30]; 
			//use Random from homework
			Random r = new Random();
			
			for(int i = 0; i <numberList.length; i++)
			{
				//fill the list with numbers <= 20 but greawter than 1
				numberList[i] = r.nextInt(20)+1;
				
			}
			
//			first get the count for the for loop using the .length method of arrays
			
		
			for(int i = 0; i < numberList.length; i++)
			{
				// print each number i stored in array	
				System.out.print(numberList[i] + " ");
				
			}
			
			
		}
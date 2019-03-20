package arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
public class Test2D {
	/* package whatever; // don't place package name! */

	

	/* Name of the class has to be "Main" only if the class is public. */
	/*static class Matrix
	{*/
	   public static int ranInt(int base, int top) {

	   Random rand = new Random();
	       int randomNum = rand.nextInt((top - base) + 1) + base;
	       return randomNum;
	   }
	   public static void main (String[] args) 
	   {
	       
	       int[][] arr = new int[5][10];
	      //build the rows
	       for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<10;j++)
	           {
	               arr[i][j] = ranInt(1,100);
	               System.out.print(arr[i][j]+" ");
//	               
	           }
	       }
	      
	     /*  for(int i=0;i<5;i++)
	       {
	           for(int j=0;j<10;j++)
	               System.out.print(arr[i][j]+" ");
	           System.out.println();
	       }*/
	   }
	}


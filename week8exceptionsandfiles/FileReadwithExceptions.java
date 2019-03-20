package readdatadisc;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;
import java.util.Scanner;
/*
Author: Stephen Ellwood

Filename:FileReadwithExceptions.java
Synopsis: Reads file, evaluates it, outputs new files, prints summary with counter.
*/
public class FileReadwithExceptions {
	//There are more than one way to read from a file then echo it out. I went a few steps beyond the directions to show 
	//my classmates options I've been seeing online.
		    /* 1.) Create a Scanner from the inputFilename.  Catch exceptions from errors.
		    2.) Read the first String from the file and use it to create a PrintStream
		             catch exceptions
		    3.) Using hasNextInt and nextInt,read the count integer.  
		    4.) Use copyNumbers method described below to complete the job
		    5.) Close Scanner and PrintStream objects
		    6.) Call printToScreen to copy the output file to the screen*/
		    void process(String inputFilename){
		    	//String outputFilename = ""; 
		    	int argscount = 0;
		    	try{//don't put a while loop here messes things up ??? y//System.out.println(inputFilename);
		        	FileInputStream fs = new FileInputStream(inputFilename);
		    		Scanner fileInputScanner = new Scanner(fs);//opens scanner to inputfile
		    		String outputFilename = fileInputScanner.next(); //reads first string in file and that is name of the outputfile
		    		if(fileInputScanner.hasNextInt())
		    			argscount = fileInputScanner.nextInt();//count describes the total args we will take from the file
		    		else 
		    			argscount = -1;//see copy to understand this.

		    		FileOutputStream fw;// =null;
		    		fw = new FileOutputStream(outputFilename);//creates file
		    		System.out.println(outputFilename +" created with " + argscount + " results starting with the following data:");
		    		    		
		    		PrintStream ps = new PrintStream(fw);//I guess we don't need to set the datatype. Why can't Prinstream take the filename directly?
		    	
		    		copyNumberstoFile(fileInputScanner,ps, argscount); // calls copyNumbers - Although you have to fill in the proper parameters.
		    		//is common for scanners to fail at opening filename fs
		    		if (inputFilename != null)
					fileInputScanner.close(); // may or may not want this inside the try catch
					if (ps != null)//this rarely happens with printstream, but if it does, we won't ever know and the program will abort without a message
					ps.close();//don't close if it failed to open or get null piont except
					printToScreen(outputFilename);//do this last because it ensures the above operations performed correctly.
					
		    	//} catch(InputMismatchException e){ already caught
		    		// if I'm here, then ONLY InputMismatchException was thrown
		    	} catch (FileNotFoundException e) {
		            System.out.println(" Unable to open output file: "+ inputFilename + "  Defaulting to Screen");
		       	}
		    	System.out.println("*********  Done with Process ******");

		    }
		// The following routine is called to complete the job of copying integers to
		// the output file:
		// scan - a Scanner object to copy integers from
		// ps - A PrintStream to write the integers to
		// numIntsToRead - number of integers to read.  A value of -1 ==> read all integers
		    void copyNumberstoFile(Scanner scan, PrintStream ps, int numIntsToRead)
		     {
		      // hasNext() can be used to see if the scan object still has data
		      // Note that hasNextInt() can be used to see if an integer is present
		      // nextInt() will read an integer
		      // next() can be used to skip over bad integers
		    	//scan = new Scanner (ps);
		    	//don't need to do 
		    	int x = 0;
		    	int count = 0;
		    	//numIntsToRead = argscount;
//		    	try{//don't need to look for exceptions once go through the void process
		    		while (scan.hasNext())
		    		{
		    			//int x = FileInputStream(ps);
		    			//FileInputStream fis = new FileInputStream(inputFilename);
		                //scan = new Scanner(ps);
		    			if(scan.hasNextInt())
		    			{
		    				x = scan.nextInt();
		    				
		    				ps.printf("%3d ",x);//x = scan.nextInt();
		    				
		    				count += 1;
		    				numIntsToRead--;
		  //  				if (numIntsToRead > 0 && numIntsToRead <= 0 )flawed method
			if (count % 10 == 0)
		    	  					ps.println();//not sysoout.println! which would go to the screen.
		    				if (numIntsToRead > 0 )
		    				{
		    					numIntsToRead--;
		    					if (numIntsToRead <= 0)
		    					{//without braces no numbers put the first will print
		    						System.out.println("Exiting due to exceeding count");
		    						break; // We are done
		    					}
		   					}
		    				
		    			}
		    			else
		    			{
		    				scan.next();
		    				System.out.println("Bad data entry; try again.");
		    			}
		    		}
		     }
		   
		    // For the last step, Copy the contents of the file to the screen
		    private void printToScreen(String filename)
		    {
		    	int counter=0;
		        Scanner scan = null;
		        try {
		            FileInputStream fis = new FileInputStream(filename);
		            scan = new Scanner(fis);
		            while (scan.hasNextLine())
		            {
		                System.out.println(scan.nextLine());
		                
		                counter++;
		            }
		            System.out.println("Lines of 10 value rows read before exit: " + counter);
		        } 
		        catch (FileNotFoundException e) 
		        {
		            System.out.println("printToScreen: can't open: " + filename);
		        }
		        finally
		        {
		            if (scan != null)
		                scan.close();
		        }
		    }// end of printToScreen
		    
		 // end of classpackage printstreamandJH1;
	 public static void main(String[] args) {
		 FileReadwithExceptions rwe = new FileReadwithExceptions();
	        for (int i=0; i < args.length; i++)
	        {
	            System.out.println("\n\n=========== Processing "+ args[i] + " ==========\n");
	            rwe.process(args[i]);
	        }
	    }
}

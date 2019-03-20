package loopsless3;

public class MyLoopDemo {	
    public static void main(String[] args)  { 	
	System.out.println("Print Bytes Demo");

	// Define min and max bytes
	int MINBYTE = -128;
	int MAXBYTE = 127;
	// Counter for display
	int cnt=0;

	// While Loop
	System.out.println("While loop Bytes Demo");
	int currentByte=MINBYTE;	
	while (currentByte <= MAXBYTE) {
	    if (cnt < 9) {              
	        System.out.print(currentByte + "\t");
                cnt++;
	    }
            else {
               System.out.print(currentByte + "\n");
               // Reset counter
        	cnt=0;
            }
	    // Increment counter
           currentByte++;
        }

	// Do-While Loop
	// Reset counter
	cnt=0;
	System.out.println("\n");
	System.out.println("Do-While loop Bytes Demo");
	currentByte=MINBYTE;	
	do {
	    if (cnt < 9) {              
	        System.out.print(currentByte + "\t");
                cnt++;
	    }
            else {
               System.out.print(currentByte + "\n");
               // Reset counter
        	cnt=0;
            }
	    // Increment counter
           currentByte++;
        } while (currentByte <= MAXBYTE); 

	// For Loop
	// Reset counter
	cnt=0;
	System.out.println("\n");
	System.out.println("For loop Bytes Demo");
	currentByte=MINBYTE;	
	for (currentByte=MINBYTE; currentByte<=MAXBYTE; currentByte++) {
	    if (cnt < 9) {              
	        System.out.print(currentByte + "\t");
                cnt++;
	    }
            else {
               System.out.print(currentByte + "\n");
               // Reset counter
        	cnt=0;
            }	    
        } 

	
	       
    }
}
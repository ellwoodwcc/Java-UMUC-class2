package guitar;
/*Header comments include filename, author, date and brief purpose of the program
File: Guitar and GuitarTest (separate main-test file)
By: Stephen Ellwood 
//Purpose: Learn how to use constructors getters and setters
import java.awt.Color;
import java.util.Random; 
public class Guitar {
/*	A private int data field named numStrings that defines the number of strings on the
	guitar. The default value should be 6.
	 A private double data field named guitarLength that defines the length of the guitar in
	inches. The default value should be 28.2
	 A private String data field named guitarManufacturer that defines the manufacturer of
	the guitar. The default value should be “Gibson”.
	 A private Color data field named guitarColor that defines the color of the guitar. The
	default value should be Color.Red.*/
	    private int numStrings= 6;
	    private double guitarLength = 28.2;
	    private String guitarManufacturer = "Gibson";
	    private Color guitarColor = Color.RED;
	    
	    //int[] arr = new int[6];
	    char [] notes = {'A','B','C','D','E','F','G'}; 
	    double [] duration = {0.25,0.5,1,2,4};
	 
	    //A no argument constructor that creates a Guitar using the default number of strings, length, manufacturer and color.
	    public Guitar(){
	        //Is there a better way to do this? Why all the warnings?
	        this.numStrings = numStrings;
	        this.guitarLength = guitarLength;
	        this.guitarManufacturer = guitarManufacturer;
	        this.guitarColor = guitarColor;
	    }// end no-arg constructor
	     
	    // A constructor that creates a Guitar using a specified number of strings, length, manufacturer and color.
	    public Guitar (int st, double gl, String gm,Color gc){
	        // this to update length, width, price with user input
	    	this.numStrings = st;
	        this.guitarLength = gl;
	        this.guitarManufacturer = gm;
	        this.guitarColor = gc;
	    }// end overloaded constructor
	 
	    // begin getters and setters
	    
	   
		public int getNumStrings() {
			return numStrings;
		}

		public void setNumStrings(int numStrings) {
			this.numStrings = numStrings;
		}

		public double getGuitarLength() {
			return guitarLength;
		}

		public void setGuitarLength(double guitarLength) {
			this.guitarLength = guitarLength;
		}

		public String getGuitarManufacturer() {
			return guitarManufacturer;
		}

		public void setGuitarManufacturer(String guitarManufacturer) {
			this.guitarManufacturer = guitarManufacturer;
		}

		public String getGuitarColor() {
			return guitarColor.toString();
		}

		public void setGuitarColor(Color guitarColor) {
			this.guitarColor = guitarColor;
		}
		 // end getters and setters
	     
	    /*//playGuitar() method that returns a string representation of 16 randomly selected
		musical notes of random duration. For example, the first part of the string returned
		might look like this: [A(2), G(3), B(0.5), C(1), C(1), D(0.25), …]. You can assume one
		octave in the key of C where valid notes include A, B, C, D, E, F and G and duration
		values are .25, .5, 1, 2, and 4 representing sixteenth notes, eighth notes, quarter notes,
		half notes and whole notes, respectively.*/
		public String playGuitar(){
		       Random r1 = new Random();
		       Random r2 = new Random();
		       String retStr = "";
		       retStr = retStr + "[";
		       int note, dur;
		       //16 notes means 16 loops
		       int m = 0;
		       while(m<16){
		           note = r1.nextInt(7);
		           //System.out.println("note:"+ note);
		           dur = r2.nextInt(5);
		           //System.out.println("dur:"+dur);
		           if(m==15)
		        	   retStr = retStr +notes[note]+ "("+duration[dur]+")" + "]";
		           else
		        	   retStr = retStr +notes[note]+ "("+duration[dur]+")" + ", ";
		           m++;
		           //System.out.println("loop:"+m);
		           //System.out.println(retStr);
		           
		       }
		       return retStr;
		          
		   }
	     
		/*A toString() method that displays the number of strings, length, manufacturer and color
		in String format*/
		public String toString() {
		       
		       String str1 = "toString () :"
		       		+ "(numStrings: " + numStrings + ", Length: " + guitarLength + ", manufacturer: "
		               + guitarManufacturer + ", color: " + guitarColor + ") "+"\n";
		       String str2 = "getNumStrings(): "+ getNumStrings() +"\n" + "getGuitarLength(): "+ getGuitarLength()+"\n" + 
		    		  "getGuitarManufacturer(): "+ getGuitarManufacturer()+"\n" + "getGuitarColor(): "+getGuitarColor().toString() +"\n";
		       String str3 = "playGuitar() "+ playGuitar();
		       return str1 + str2+str3 +"\n";
	    }  
	     
	}// end class
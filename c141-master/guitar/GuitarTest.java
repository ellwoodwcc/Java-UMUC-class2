package guitar;

import java.awt.Color;

public class GuitarTest {
	/* private static Color red;
*/
	public static void main(String[] args) {
	       // TODO Auto-generated method stub

	       Guitar no1 = new Guitar(7, 30.2, "Fender", Color.black);

	       System.out.println(no1.toString());
	  

	       Guitar no2 = new Guitar(5, 44, "Fender", Color.RED);
	       System.out.println(no2.toString());
	     

	       Guitar no3 = new Guitar();
	       System.out.println(no3.toString());


	   }

	}


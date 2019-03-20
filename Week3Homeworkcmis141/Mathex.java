
Content week 3 cmis141
https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html
Math https://docs.oracle.com/javase/tutorial/java/data/beyondmath.html


public class BasicMathDemo {
    public static void main(String[] args) {
        double a = -191.635;
        double b = 43.74;
        int c = 16, d = 45;

        System.out.printf("The absolute value " + "of %.3f is %.3f%n", 
                          a, Math.abs(a));

        System.out.printf("The ceiling of " + "%.2f is %.0f%n", 
                          b, Math.ceil(b));

        System.out.printf("The floor of " + "%.2f is %.0f%n", 
                          b, Math.floor(b));

        System.out.printf("The rint of %.2f " + "is %.0f%n", 
                          b, Math.rint(b));

        System.out.printf("The max of %d and " + "%d is %d%n",
                          c, d, Math.max(c, d));

        System.out.printf("The min of of %d " + "and %d is %d%n",
                          c, d, Math.min(c, d));
    }
}
// Here's the output from this program:

// The absolute value of -191.635 is 191.635
// The ceiling of 43.74 is 44
// The floor of 43.74 is 43
// The rint of 43.74 is 44
// The max of 16 and 45 is 45
// The min of 16 and 45 is 16public class ExponentialDemo {
    public static void main(String[] args) {
        double x = 11.635;
        double y = 2.76;

        System.out.printf("The value of " + "e is %.4f%n",
                          Math.E);

        System.out.printf("exp(%.3f) " + "is %.3f%n",
                          x, Math.exp(x));

        System.out.printf("log(%.3f) is " + "%.3f%n",
                          x, Math.log(x));

        System.out.printf("pow(%.3f, %.3f) " + "is %.3f%n",
                          x, y, Math.pow(x, y));

        System.out.printf("sqrt(%.3f) is " + "%.3f%n",
                          x, Math.sqrt(x));
    }
}
/*Here's the output you'll see when you run ExponentialDemo:

The value of e is 2.7183
exp(11.635) is 112983.831
log(11.635) is 2.454
pow(11.635, 2.760) is 874.008
sqrt(11.635) is 3.411*/
public class TrigonometricDemo {
    public static void main(String[] args) {
        double degrees = 45.0;
        double radians = Math.toRadians(degrees);
        
        System.out.format("The value of pi " + "is %.4f%n",
                           Math.PI);

        System.out.format("The sine of %.1f " + "degrees is %.4f%n",
                          degrees, Math.sin(radians));

        System.out.format("The cosine of %.1f " + "degrees is %.4f%n",
                          degrees, Math.cos(radians));

        System.out.format("The tangent of %.1f " + "degrees is %.4f%n",
                          degrees, Math.tan(radians));

        System.out.format("The arcsine of %.4f " + "is %.4f degrees %n", 
                          Math.sin(radians), 
                          Math.toDegrees(Math.asin(Math.sin(radians))));

        System.out.format("The arccosine of %.4f " + "is %.4f degrees %n", 
                          Math.cos(radians),  
                          Math.toDegrees(Math.acos(Math.cos(radians))));

        System.out.format("The arctangent of %.4f " + "is %.4f degrees %n", 
                          Math.tan(radians), 
                          Math.toDegrees(Math.atan(Math.tan(radians))));
    }
}
// The output of this program is as follows:

// The value of pi is 3.1416
// The sine of 45.0 degrees is 0.7071
// The cosine of 45.0 degrees is 0.7071
// The tangent of 45.0 degrees is 1.0000
// The arcsine of 0.7071 is 45.0000 degrees
// The arccosine of 0.7071 is 45.0000 degrees
// The arctangent of 1.0000 is 45.0000 degrees

Random Numbers
The random() method returns a pseudo-randomly selected number between 0.0 and 1.0. The range includes 0.0 but not 1.0. In other words: 0.0 <= Math.random() < 1.0. To get a number in a different range, you can perform arithmetic on the value returned by the random method. For example, to generate an integer between 0 and 9, you would write:

int number = (int)(Math.random() * 10);
By multiplying the value by 10, the range of possible values becomes 0.0 <= number < 10.0.

Using Math.random works well when you need to generate a single random number. If you need to generate a series of random numbers, you should create an instance of java.util.Random and invoke methods on that object to generate numbers.

http://www.tutorialspoint.com/java/lang/math_abs_int.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get some integers to find their absolute values
      int x = 175;
      int y = -184;
   
      // get and print their absolute values
      System.out.println("Math.abs(" + x + ")=" + Math.abs(x));
      System.out.println("Math.abs(" + y + ")=" + Math.abs(y));
      System.out.println("Math.abs(-0)=" + Math.abs(-0));
   }
}
/*Let us compile and run the above program, this will produce the following result −

Math.abs(175)=175
Math.abs(-184)=184
Math.abs(-0)=0*/
Java.lang.Math.ceil() Method
http://www.tutorialspoint.com/java/lang/math_ceil.htm

Java.lang.Math.cos() Method
http://www.tutorialspoint.com/java/lang/math_cos.htm
Java.lang.Math.exp() Method
http://www.tutorialspoint.com/java/lang/math_exp.htm
Java.lang.Math.floor() Method    http://www.tutorialspoint.com/java/lang/math_floor.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two double numbers
      double x = 60984.1;
      double y = -497.99;
   
      // call floor and print the result
      System.out.println("Math.floor(" + x + ")=" + Math.floor(x));
      System.out.println("Math.floor(" + y + ")=" + Math.floor(y));
      System.out.println("Math.floor(0)=" + Math.floor(0));
   }
}
Java.lang.Math.log10() Method
http://www.tutorialspoint.com/java/lang/math_log10.htm
Java.lang.Math.max() Method   http://www.tutorialspoint.com/java/lang/math_max_int.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two integer numbers
      int x = 60984;
      int y = 1000;
   
      // print the larger number between x and y
      System.out.println("Math.max(" + x + "," + y + ")=" + Math.max(x, y));
   }
}
/*Let us compile and run the above program, this will produce the following result −

Math.max(60984, 1000)=60984*/
Java.lang.Math.min() Method
http://www.tutorialspoint.com/java/lang/math_min_int.htm
Java.lang.Math.pow() Method
http://www.tutorialspoint.com/java/lang/math_pow.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two double numbers
      double x = 2.0;
      double y = 5.4;
   
      // print x raised by y and then y raised by x
      System.out.println("Math.pow(" + x + "," + y + ")=" + Math.pow(x, y));
      System.out.println("Math.pow(" + y + "," + x + ")=" + Math.pow(y, x));
   }
}
/*Let us compile and run the above program, this will produce the following result −

Math.pow(2.0, 5.4)=42.22425314473263
Math.pow(5.4, 2.0)=29.160000000000004*/

Java.lang.Math.random() Method   http://www.tutorialspoint.com/java/lang/math_random.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two random double numbers
      double x = Math.random();
      double y = Math.random();
   
      // print the numbers and print the higher one
      System.out.println("Random number 1:" + x);
      System.out.println("Random number 2:" + y);
      System.out.println("Highest number:" + Math.max(x, y));
   }
}
/*Let us compile and run the above program, this will produce the following result −

Random number 1:0.11501691809557013
Random number 2:0.15726642068533314
Highest number:0.15726642068533314*/

Java.lang.Math.rint() Method   http://www.tutorialspoint.com/java/lang/math_rint.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two double numbers
      double x = 1654.9874;
      double y = -9765.134;
   
      // find the closest integers for these double numbers
      System.out.println("Math.rint(" + x + ")=" + Math.rint(x));
      System.out.println("Math.rint(" + y + ")=" + Math.rint(y));
   }
}
/*Let us compile and run the above program, this will produce the following result −

Math.rint(1654.9874)=1655.0
Math.rint(-9765.134)=-9765.0*/

Java.lang.Math.sin() Method   http://www.tutorialspoint.com/java/lang/math_sin.htm
Java.lang.Math.sqrt() Method  http://www.tutorialspoint.com/java/lang/math_sqrt.htm
Java.lang.Math.tan() Method   http://www.tutorialspoint.com/java/lang/math_tan.htm
Java.lang.Math.toDegrees() Method   http://www.tutorialspoint.com/java/lang/math_todegrees.htm
package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two double numbers numbers
      double x = 45;
      double y = -180;

      // convert them in degrees
      x = Math.toDegrees(x);
      y = Math.toDegrees(y);

      // print the hyperbolic tangent of these doubles
      System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
      System.out.println("Math.tanh(" + y + ")=" + Math.tanh(y));
   }
}
/*Let us compile and run the above program, this will produce the following result −

Math.tanh(2578.3100780887044)=1.0
Math.tanh(-10313.240312354817)=-1.0*/
Java.lang.Math.toRadians() Method   http://www.tutorialspoint.com/java/lang/math_toradians.htm

package com.tutorialspoint;

import java.lang.*;

public class MathDemo {

   public static void main(String[] args) {

      // get two double numbers numbers
      double x = 45;
      double y = -180;

      // convert them in radians
      x = Math.toRadians(x);
      y = Math.toRadians(y);

      // print the hyperbolic tangent of these doubles
      System.out.println("Math.tanh(" + x + ")=" + Math.tanh(x));
      System.out.println("Math.tanh(" + y + ")=" + Math.tanh(y));
   }
}
Let us compile and run the above program, this will produce the following result −

Math.tanh(0.7853981633974483)=0.6557942026326724
Math.tanh(-3.141592653589793)=-0.99627207622075


java.util.Random.setSeed() Method   http://www.tutorialspoint.com/java/util/timezone_setseed.htm
package com.tutorialspoint;

import java.util.*;

public class RandomDemo {
   public static void main( String args[] ) {
      
      // create random object
      Random randomno = new Random();

      // setting seed
      randomno.setSeed(20);

      // value after setting seed
      System.out.println("Object after seed: " + randomno.nextInt());
   }    
}




java.util.Random.nextInt() Method   http://www.tutorialspoint.com/java/util/random_nextint.htm
package com.tutorialspoint;

import java.util.*;

public class RandomDemo {
   public static void main( String args[] ) {

      // create random object
      Random randomno = new Random();
    
      // check next int value  
      System.out.println("Next int value: " + randomno.nextInt());
   }    
}
// Let us compile and run the above program, this will produce the following result.

// Next int value: 1228025286

java.util.Random.nextInt(n) Method  http://www.tutorialspoint.com/java/util/random_nextint_inc_exc.htm
//nextInt(int n) method is used to get a pseudorandom, uniformly distributed int value between 0 (inclusive) and the specified value (exclusive), drawn from this random number generator's sequence.
//IllegalArgumentException − This is thrown if n is not positive.
package com.tutorialspoint;

import java.util.*;

public class RandomDemo {
   public static void main( String args[] ) {

      // create random object
      Random randomno = new Random();

      // check next int value  
      System.out.println("Next int value: " + randomno.nextInt(10000));
   }    
}
/*Let us compile and run the above program, this will produce the following result.

Next int value: 2110*/


java.util.Random.nextBoolean() Method
http://www.tutorialspoint.com/java/util/random_nextboolean.htm

package com.tutorialspoint;

import java.util.*;

public class RandomDemo {
   public static void main( String args[] ) {
      
      // create random object
      Random randomno = new Random();

      // get next next boolean value 
      boolean value = randomno.nextBoolean();

      // check the value  
      System.out.println("Value is: " + value);
   }     
}
/*Let us compile and run the above program, this will produce the following result.

Value is: true*/
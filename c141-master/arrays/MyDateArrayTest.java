package arrays;

//import peers.MyDate;

/**
 * @author Stephen
 *
 */
public class MyDateArrayTest {

	public MyDateArrayTest(int arraysize) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// generate 3 dates for testing and print each
		int arraysize = 3;
		int[] dateArraymain = new int[arraysize];
		//ex- gives an array size as a parameter in a logical flow
		//Include setDate in the constructor to minimize the main
		MyDateArray m1 = new MyDateArray(arraysize);
		String s1 = m1.getFormattedDate(dateArraymain);
		// m1.setDate(2084,9,03); put this in the constructor
		//example that uses parameter ints in constructor
		MyDateArray m2 = new MyDateArray(12, 25, 1971);
		String s2 = m2.getFormattedDate(dateArraymain);
		//test using default constructor
		MyDateArray m3 = new MyDateArray();
		m3.setYear(2023);
		m3.setDay(3);
		m3.setMonth(3);

		String s3 = m3.getFormattedDate(dateArraymain);
		// String s2 = m2.getFormatforDate2();*
		System.out.println("Format for Date 1 is " + s1);
		// Notice the dates were picked from the constructor not the private, declared
		// fields
		System.out.println("Format for Date 2 is " + s2);
		System.out.println("Format for Date 3 is " + s3);
	}

}
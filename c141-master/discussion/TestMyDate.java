/**
 * 
 */
package discussion;

import peers.MyDate;

/**
 * @author Stephen
 *
 */
public class TestMyDate {

	public static void main(String[] args) {
		// generate two dates for testing
		MyDate m1 = new MyDate();
		m1.setDate(2084,9,03);
		//using default constructor or using the defaults fields?
		MyDate m2 = new MyDate();
		m2.setYear(2019);
		String s1 = m1.getFormattedDate();
		String s2 = m2.getFormatforDate2();
		System.out.println("Format for Date 1 is "+s1);
		//Notice the dates were picked from the constructor not the private, declared fields
		System.out.println("Format for Date 2 is "+s2);
	}

}
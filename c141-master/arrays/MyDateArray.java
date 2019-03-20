package arrays;
/*
* File: MyArray.java
* Author: Stephen Ellwood
* Date: 6/26/18
* Purpose: This program works with the important Date class to figure out ways of printing out dates given
* numbers from various contexts. It experiments with various ways to initialize, reformulate and size arrays.
* It demonstrates three methods to build a short array and uses the length method at a crucial point in the print method.
* All array prints show different results while using the same private array variable.
*/

public class MyDateArray {

	private int year = 2011;
	private int month = 1;
	private int day = 1;
	// int arraySize1=0;
	// int[] datesAr= new int [arraySize1];
	private int ArraySize = 0;
	private int[] myDateArray = new int[3];

	public MyDateArray(int sizeofArray) {
		if (sizeofArray == 3)
			this.ArraySize = sizeofArray;
		setDate3(2084, 9, 03);
	}

	public MyDateArray(int montha, int daya, int yeara) {
		// this.myDateArray = {montha,daya,yeara};//"Array constants can only be used in
		// initializers"
		this.myDateArray = new int[] { montha, daya, yeara };
	}

	public MyDateArray() {
		this.myDateArray = new int[] { day, month, year };
	}

	public void setDate3(int y, int m, int d) {
		this.myDateArray = new int[] { d, m, y };

	}

	public int getYear() {
		return year;
	}

	public void setYear(int y) {
		year = y;
	}

	public void setMonth(int y) {
		month = y;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void getDay(int day) {
		this.day = day;
	}

	String getFormattedDate(int[] datearray) {
		int[] printArray = new int[myDateArray.length];
		for (int i = 0; i < printArray.length; i++) {
			printArray[i] = myDateArray[i];
		}
		return printArray[0] + "/" + printArray[1] + "/" + printArray[2];
	}

}
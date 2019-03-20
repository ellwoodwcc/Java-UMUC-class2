public class MyDate {
//declare with values to avoid IDE feedback	
    private int year=2019;
    private int month = 7;
    private int day =1;
    
//Set the values. Should I do these here or up top?

    public MyDate(){
        year = 2018;
        month = 1;
        day = 1;
    }
    //main constructor turned into a set statement. good idea? 
    public void setDate(int y, int m, int d)
    {
        year = y;
        month = m;
        day = d;
        
    }//Which is the best encapsulation method?
    public int getYear()
    {
        return year;
    }
    public void setYear(int y)
    {
        year = y;
    }
    String getFormattedDate()
    {
        return month + "/" + day + "/"+ year;
    }
    //we don't want users to alternate the top fields directly
    public void setDay(int day)
    {	this.day = day;
    }
    //provide way of obtaining the current date
    public void getDay(int day)
    {   this.day = day;
    }
    //switch on month but store it in something else
    String getFormatforDate2 ()
    {
    	String month1 = "";
    	switch(month)
    	{
    	case 1: month1="January"; break;
    	case 2: month1="February";break;
    	case 3: month1="January"; break;
    	case 4: month1="February";break;
    	case 5: month1="January"; break;
    	case 6: month1="February";break;
    	case 7: month1="January"; break;
    	case 8: month1="February";break;
    	case 9: month1="September";break;
    	};
    	
        return month1 + " " + day + ", "+ year;
    }
}


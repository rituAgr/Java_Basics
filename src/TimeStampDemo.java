import java.sql.Timestamp;
import java.util.Date;

public class TimeStampDemo 
{
    public static void main( String[] args )
    {
         //Date object
	 Date date= new Date();
         //getTime() returns current time in milliseconds
	 long time = date.getTime();
         //Passed the milliseconds to constructor of Timestamp class 
	 Timestamp ts = new Timestamp(time);
	 System.out.println("Current Time Stamp: "+ts.toString());
    }
}
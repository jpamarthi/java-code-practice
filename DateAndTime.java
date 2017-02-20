/**
u are given a date. Your task is to find what the day is on that date.

Input Format

A single line of input containing the space separated month, day and year, respectively, in   format.

Constraints

Output Format

Output the correct day in capital letters.

Sample Input

08 05 2015
Sample Output

WEDNESDAY
Explanation

The day on August th  was WEDNESDAY.*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DateAndTime {

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();
        in.close();
		
		String dt1 = day + "/" + month + "/" + year;
		Date dt2 = new SimpleDateFormat("dd/MM/yyyy").parse(dt1);
		
		Calendar c = Calendar.getInstance();
		c.setTime(dt2);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		
		//System.out.println("dt2 : " + dt2);
		
        String dayName = "";
		
		switch (dayOfWeek) {
		case Calendar.MONDAY:
			dayName = "MONDAY";
			break;
		case Calendar.TUESDAY:
			dayName = "TUESDAY";
			break;
		case Calendar.WEDNESDAY:
			dayName = "WEDNESDAY";
			break;
		case Calendar.THURSDAY:
			dayName = "THURSDAY";
			break;
		case Calendar.FRIDAY:
			dayName = "FRIDAY";
			break;
		case Calendar.SATURDAY:
			dayName = "SATURDAY";
			break;
		case Calendar.SUNDAY:
			dayName = "SUNDAY";
			break;
		}
		System.out.println(dayName);
    }
}



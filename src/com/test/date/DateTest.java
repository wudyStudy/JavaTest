package com.test.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

	public static void  main(String []args){
			String date1 = "2007-01-10";
		
		DateFormat df = new SimpleDateFormat("yyyy-MM");
		try {
			Date d1 = df.parse(date1);
			System.out.println("d1=="+df.format(d1));
			Calendar  g = Calendar.getInstance();
			g.setTime(d1);
			g.add(Calendar.MONTH,1);			
			Date d2 = g.getTime();
			System.out.println("d2======="+df.format(d2));
		} catch (ParseException e) {			
			e.printStackTrace();
		}
	}
}

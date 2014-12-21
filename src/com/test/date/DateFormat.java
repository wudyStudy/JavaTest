package com.test.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	
	public static void main(String []args) throws Exception, ParseException{
		SimpleDateFormat formater = new SimpleDateFormat("yyyyMM");
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2008-04-14");	
		 int dateStrS = Integer.parseInt(formater.format(new Date()));	
		 int dateStrE = Integer.parseInt(formater.format(date));	
		System.out.println(dateStrE);
		System.out.println(dateStrS);
	}

}

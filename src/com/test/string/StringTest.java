package com.test.string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class StringTest {
	
	public static void main(String []args) throws Exception{
		String str = "21321321343242454";
		DateFormat df = new SimpleDateFormat("yyyyMM");
		Date dt1 = new SimpleDateFormat("yyyyMM").parse("201304");
        Date dt2 = new SimpleDateFormat("yyyyMM").parse("201405");
 
		for(;dt1.before(dt2);){
			Calendar calendar = Calendar.getInstance();//日历对象
		        calendar.setTime(dt1);//设置当前日期
		        calendar.add(Calendar.MONTH, 1);//月份加1
		        dt1 = calendar.getTime();
			String tempMonth = df.format(dt1);
			System.out.println(tempMonth);
		/*	int temp = Integer.parseInt("201304")%100+1;
			int tempValue = temp;
			String tempStart = String.valueOf(201311/100);
			if(tempValue==13){
				tempName = tempName+1;
				tempValue = 1;
				System.out.println(tempName+addMonthStr(tempValue));
			}else{
				tempValue = tempValue+1;
				tempName= 100*tempName+tempValue;
				System.out.println(100*tempName+addMonthStr(tempValue));
			}*/
		}
		//System.out.println(201311/100);
		//System.out.println(201311%100);
		
	}
	public static String addMonthStr(int temp){
		String tempValue = (String) ((1<temp&&temp<9)?"0"+temp:temp);
		return tempValue;
	}

}

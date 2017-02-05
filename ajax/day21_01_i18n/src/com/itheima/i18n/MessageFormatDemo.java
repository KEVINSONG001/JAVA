package com.itheima.i18n;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class MessageFormatDemo {

	public static void main(String[] args) {
//		String pattern = "At 12:30 pm on jul 3,1998, a hurricance destroyed 99 houses and caused $1000000 of damage";
//		
//		Date time = new Date();//日期和时间
//		int num = 99;
//		int money = 100000;
//		
//		Locale locale = Locale.CHINA;
//		DateFormat df1 = DateFormat.getTimeInstance(DateFormat.DEFAULT, locale);
//		DateFormat df2 = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
//		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
//		
//		String stime = df1.format(time);
//		String sdate = df2.format(time);
//		String smoney = nf.format(money);
//		
//		System.out.println("At "+stime+" on "+sdate+", a hurricance destroyed "+num+" houses and caused "+smoney+" of damage");
		
		//占位符对应着参数的索引
		String pattern = "At {0,time,medium} on {1,date,medium}, a hurricance destroyed {2} houses and caused {3,number,currency} of damage";
		
		MessageFormat mf = new MessageFormat(pattern,Locale.US);
		String result = mf.format(new Object[]{new Date(),new Date(),99,1000000});
		System.out.println(result);
		
	}

}

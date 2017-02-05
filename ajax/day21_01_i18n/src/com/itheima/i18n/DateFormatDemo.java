package com.itheima.i18n;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

import org.junit.Test;

public class DateFormatDemo {
	
	//2014��8��30�� ������ (���ڲ���)
	
	//����04ʱ35��54�� CST��ʱ�䲿�֣�
	@Test
	public void test1(){
		
		Locale locale = Locale.CHINA;
		
		Date now = new Date();
		// FULL LONG MEDIUM(DEFAULT) SHORT
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale);
		String str = df.format(now);
		System.out.println(str);
	}
	
	//yyyy-MM-dd
	@Test
	public void test2() throws ParseException{
		String s = "2014��8��30�� ������ ����04ʱ35��54�� CST";
		Locale locale = Locale.CHINA;
		DateFormat df = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL,locale);
		Date d = df.parse(s);
		System.out.println(d);
	}
}

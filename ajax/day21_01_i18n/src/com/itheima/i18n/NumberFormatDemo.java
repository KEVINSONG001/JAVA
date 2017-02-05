package com.itheima.i18n;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

import org.junit.Test;

public class NumberFormatDemo {
	@Test
	public void test1(){
		int money = 100000000;
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(nf.format(money));
	}
	
	@Test
	public void test2() throws ParseException{
		String s = "$100,000,000.00";
		NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);
		Number n = nf.parse(s);
		System.out.println(n);
	}
}

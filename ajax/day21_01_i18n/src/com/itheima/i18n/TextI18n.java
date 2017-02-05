package com.itheima.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class TextI18n {
	//按照本地区域信息读
	@Test
	public void test1(){
		ResourceBundle rb = ResourceBundle.getBundle("message");
		String s = rb.getString("hello");
		System.out.println(s);
	}
	//指定区域信息：Locale
	@Test
	public void test2(){
		Locale locale = Locale.US;
		ResourceBundle rb = ResourceBundle.getBundle("message",locale);
		String s = rb.getString("hello");
		System.out.println(s);
	}
}

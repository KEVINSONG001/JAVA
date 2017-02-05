package com.itheima.i18n;

import java.util.Locale;
import java.util.ResourceBundle;

import org.junit.Test;

public class TextI18n {
	//���ձ���������Ϣ��
	@Test
	public void test1(){
		ResourceBundle rb = ResourceBundle.getBundle("message");
		String s = rb.getString("hello");
		System.out.println(s);
	}
	//ָ��������Ϣ��Locale
	@Test
	public void test2(){
		Locale locale = Locale.US;
		ResourceBundle rb = ResourceBundle.getBundle("message",locale);
		String s = rb.getString("hello");
		System.out.println(s);
	}
}

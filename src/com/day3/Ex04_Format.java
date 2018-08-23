package com.day3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex04_Format {
	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		SimpleDateFormat formatter = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		String str = formatter.format(now.getTime());
		System.out.println(str);
	}
	

}

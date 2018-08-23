package com.day20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test2 {

	public static String replaceAll(String str, String oldStr, String newStr) {

		if (str == null) {
			return null;
		}

		Pattern p = Pattern.compile(oldStr); // 대한
		Matcher m = p.matcher(str); // str 문장안에서

		StringBuffer sb = new StringBuffer();

		while (m.find()) {
			m.appendReplacement(sb, newStr); // 大韓

		}
		m.appendTail(sb);

		return sb.toString();

	}

	public static void main(String[] args) {
		String str = "우리나라 대한민국 대한민국 16강 가즈아";
		String s = Test2.replaceAll(str, "대한", "大韓");
		
		System.out.println(s);
	}
}

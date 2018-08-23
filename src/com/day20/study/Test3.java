package com.day20.study;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test3 {
	
	public static String replaceAll(String str, String oldStr, String newStr){
		if(str == null){
			return null;
		}
		
		Pattern p = Pattern.compile(oldStr);
		Matcher m = p.matcher(str);
		
		StringBuffer sb = new StringBuffer();
		
		while(m.find()){
			m.appendReplacement(sb, newStr);
		}
		m.appendTail(sb);
		
		return sb.toString();
		
	}
	
	
	public static void main(String[] args) {
		String str = "歎營�� 歎營團 歎營錳 歎營⑷";
		String s = Test3.replaceAll(str, "歎", "撦");
		
		System.out.println(s);
	}
}

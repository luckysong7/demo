package com.day20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * java.util.regex
 * 정규화 표현식
 * 단어바꾸기, 메일주소검색, 파일 제어문자 제거
 * 
 * c[a-z]* : c로 시작하는 영단어(c,ca,cbvf)
 * c[a-z] : c로 시작하는 두단어(ca,cg)
 * c[a-zA-Z0-9] : ca,cA,c4
 * c. : c로 시작한느 두글자(ca,cB,c&)
 * c.*: c로 시작한느 모든  문자
 * c.*t : ct, chh7ahht, c774577t
 * [b|c].* 또는 [bc].* 또는 [b-c].* : b,c,bbb,cad
 * [^b|c].* 또는 [^bc].* 또는 [^b-c].* : b또는 c로 시작하지 않는 문자 
 * *c.* : c가 포함된 문자열(s45casdf)
 * [\\d]+ 또는 [0-9]+ : 하나 이상의 숫자
 * 
 * */

public class Test1 {
	public static void main(String[] args) {
		String[] str = { "bonus", "bat", "baby", "c", "cA", "ca", "c", "c0",
				"car", "combat", "count", "date", "disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*"); // 패턴정의 c 로 시작하는 하나 이상 단어
		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}
		}

		System.out.println("---------------------");

		p = Pattern.compile("c[a-z]+"); // c로 시작하는 2개 이상
		for (String s : str) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}
		}

		System.out.println("---------------------");

		p = Pattern.compile("c."); // c로 시작하는 두글자
		for (String s : str) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}
		}
		
		String[] mail = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr", "abc@bbb" };
		
		// [\\w]+ : 한글자 이상의 영문자, 숫자
		// @
		// (\\.[\\w]+) : 괄호안에 있는 것은 반드시 한번은 사용
		
		// \\. dot 는 반드시 사용
		
		
		p = Pattern.compile("[\\w]+@[a-z]+(\\.[a-z]+)+"); // c로 시작하는 두글자
		for (String s : mail) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}
		}
		
		
	}
}

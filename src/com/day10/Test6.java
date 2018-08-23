package com.day10;

public class Test6 {
	public static void main(String[] args) {
		
		String s1 = "재훈,재민,재현";
		String[] ss = s1.split(",");
		
		for(String v : ss){
			System.out.print(v + " ");
		}
		
		String s2 = "seoul";
		String s3 = "SEOUL";
		System.out.println();
		System.out.println("s2 == s3 : " + s2.equals(s3)); // 문자열이 다르니까 주소도 다르다.
		System.out.println(s2.equalsIgnoreCase(s3)); // 대소문자 구분 X 
		
		String s4 = "abc.def.hij";
		System.out.println(s4.indexOf(".")); // "." 의 위치를 반환
		System.out.println(s4.indexOf("abc")); 
		System.out.println(s4.lastIndexOf(".")); // 뒤에서부터 "." 의 위치를 반환
		System.out.println(s4.indexOf("x")); // 문자가 없으면 -1 을 반환
		
		String s5 = "과거 현재 미래";
		String s6 = s5.replaceAll("현재", "現在"); // regex 정규화 표현식 
		
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll("  ", ""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		char ch = "abcdefg".charAt(2); 
		System.out.println(ch);
		
		
		String s8 = "abcdefg"; 
		String s9 = "abcddfg"; 
		
		//사전식 배열
		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s8));
		
		
	}
}

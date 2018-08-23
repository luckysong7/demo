package com.day10;

public class Test5 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("서울");
		sb.append("부산");
		sb.append("대구");
		
		System.out.println(sb);  // 데이터 타입이 Stringbuffer
		
		// StringBuffer -> String 으로 변환
		
		String str = sb.toString(); // 데이터 타입이 String 
		System.out.println(str);
		
		int a = 24;
		System.out.println(a); // 정수형 
		System.out.println(Integer.toString(a)); // 문자형 (연산 불가)
		System.out.println(Integer.toString(a, 2)); // 2진수로 
		System.out.println(Integer.toString(a, 16)); // 16진수로 
		
		
	}
}

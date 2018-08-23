package com.day10;

// Wrapper 클래스 
// 기본 데이터를 객체로 사용할 수 있게 해줌
// 자바 자료형데이터: boolean, byte, char, short, int, long, float, double
// 레퍼런스데이터 : Boolean, Byte, Character, Short, Integer, Long, Float, Double

public class Test8 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2; // 쓰레기값
		Integer num1; // null 값
		Integer num2 = new Integer(20);
		
		num1 = n1; // Auto-Boxing (stack -> heap)
		n2 = num2; // Auto-Unboxing (heap -> stack) 
		
		
		System.out.println(n1 + " : " + num1);
		System.out.println(n2 + " : " + num2);
	}
}

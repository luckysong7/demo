package com.day10;

// Wrapper Ŭ���� 
// �⺻ �����͸� ��ü�� ����� �� �ְ� ����
// �ڹ� �ڷ���������: boolean, byte, char, short, int, long, float, double
// ���۷��������� : Boolean, Byte, Character, Short, Integer, Long, Float, Double

public class Test8 {
	public static void main(String[] args) {
		int n1 = 10;
		int n2; // �����Ⱚ
		Integer num1; // null ��
		Integer num2 = new Integer(20);
		
		num1 = n1; // Auto-Boxing (stack -> heap)
		n2 = num2; // Auto-Unboxing (heap -> stack) 
		
		
		System.out.println(n1 + " : " + num1);
		System.out.println(n2 + " : " + num2);
	}
}

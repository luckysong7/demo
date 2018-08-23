package com.day8;

import java.io.IOException;

class Cal {
	int number; // String input에 있는 값을 정수형으로 변형
	String input = ""; // System.in.read()로 읽어와 String배열에 저장
	int key; // 아스키코드값
	int sum = 0;
	
	int num1 ;
	int num2 ;
	int num3 ;
	
	
	
	// System.in.read() 로 숫자 받아오기
	public int input_number() {
		System.out.print("숫자를 입력해주세요 :");

		try {
			while ((key = System.in.read()) != 13) {
				input += Character.toString((char) key);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.number = Integer.parseInt(input);
		return number;
	}

	// 입력받은 숫자까지의 합계 구하기
	public int addToNumber() {
		
		for (int i = 1; i <= number; i++) {
			this.sum += i;
		}
		return this.sum;
	}

}

public class HW1 {
	public static void main(String[] args) {
		
		Cal obj = new Cal();
		int num2 = obj.input_number();
		int sum2 = obj.addToNumber();
		
		System.out.println(num2 + "까지의 합은 " + sum2 +" 입니다.");
		
	}
}

package com.day17.stream;

import java.io.IOException;

// 입출력 스트림
// 데이터 입출력시 모든 데이터를 형태와 상관없이 
// 일련된 흐름으로 전송하는것

// 1. 바이트 스트림 
// System.in  -> 1바이트씩 읽어옴



public class Test1 {
	public static void main(String[] args) throws IOException {
		int data;
		System.out.print("문자열 입력 : " ); // abcd
		while((data = System.in.read()) != -1){
			
			char ch = (char) data;  //형변환
			System.out.println("문자열 출력 : " + ch);
			
			
		}
	}
}

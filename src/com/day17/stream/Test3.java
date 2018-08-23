package com.day17.stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader
// 1 byte의 Stream을 2byte Stream으로 변환해주는 Stream
// 

public class Test3 {
	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("문자열 입력 : ");

		Reader rd = new InputStreamReader(System.in);

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.write(ch);
			System.out.flush();
			
		}
	}
}

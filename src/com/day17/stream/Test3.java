package com.day17.stream;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

// InputStreamReader
// 1 byte�� Stream�� 2byte Stream���� ��ȯ���ִ� Stream
// 

public class Test3 {
	public static void main(String[] args) throws IOException {

		int data;
		System.out.println("���ڿ� �Է� : ");

		Reader rd = new InputStreamReader(System.in);

		while ((data = rd.read()) != -1) {
			char ch = (char) data;
			System.out.write(ch);
			System.out.flush();
			
		}
	}
}

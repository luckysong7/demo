package com.day17.stream;

import java.io.IOException;

// ����� ��Ʈ��
// ������ ����½� ��� �����͸� ���¿� ������� 
// �Ϸõ� �帧���� �����ϴ°�

// 1. ����Ʈ ��Ʈ�� 
// System.in  -> 1����Ʈ�� �о��



public class Test1 {
	public static void main(String[] args) throws IOException {
		int data;
		System.out.print("���ڿ� �Է� : " ); // abcd
		while((data = System.in.read()) != -1){
			
			char ch = (char) data;  //����ȯ
			System.out.println("���ڿ� ��� : " + ch);
			
			
		}
	}
}

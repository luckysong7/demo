package com.day17.stream;

import java.io.IOException;
import java.io.OutputStream;

// 2. �⺻ ����� ��Ʈ��
// System.out

public class Test2 {
	public static void main(String[] args) throws IOException {
		// ��¿� ������ (�⺻ �ܺ� ��¿� ��Ʈ��)
		OutputStream os = System.out;
		byte[] b = new byte[3];
		b[0] = 65;
		b[1] = 97;
		b[2] = 122;
		
		System.out.println(b[0]); //�ƽ�Ű��
		System.out.println(b[1]);
		System.out.println(b[2]);
		
		os.write(b); // ��Ʈ���� ��� //���������� �ٲ㼭 ��� // ��������忡�� ��ȯ�ؼ� ���
		System.out.println("�� ������ ?");
		os.close(); // ������ ��� ��Ʈ���� ���� 
		System.out.println("�� ���̳� ?"); //�̺κ��� ��¾ȉ�

	}
}

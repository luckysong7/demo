package com.day17.stream;

import java.io.FileInputStream;

// FileInputStream
// FileOutputStream

public class Test5 {
	public static void main(String[] args) {
		
		try {
			FileInputStream fis =new FileInputStream("d:\\doc\\test.txt");
			
			int data ; // ��ǻ�ʹ� ����Ʈ ������ �޾Ƶ���
			while((data = fis.read()) != -1){
//				System.out.println((char)data);
				System.out.write(data);
				System.out.flush();
			}
		} catch (Exception e) {
		
		}
	}
}

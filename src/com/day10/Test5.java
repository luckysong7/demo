package com.day10;

public class Test5 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("����");
		sb.append("�λ�");
		sb.append("�뱸");
		
		System.out.println(sb);  // ������ Ÿ���� Stringbuffer
		
		// StringBuffer -> String ���� ��ȯ
		
		String str = sb.toString(); // ������ Ÿ���� String 
		System.out.println(str);
		
		int a = 24;
		System.out.println(a); // ������ 
		System.out.println(Integer.toString(a)); // ������ (���� �Ұ�)
		System.out.println(Integer.toString(a, 2)); // 2������ 
		System.out.println(Integer.toString(a, 16)); // 16������ 
		
		
	}
}

package com.day10;

public class Test6 {
	public static void main(String[] args) {
		
		String s1 = "����,���,����";
		String[] ss = s1.split(",");
		
		for(String v : ss){
			System.out.print(v + " ");
		}
		
		String s2 = "seoul";
		String s3 = "SEOUL";
		System.out.println();
		System.out.println("s2 == s3 : " + s2.equals(s3)); // ���ڿ��� �ٸ��ϱ� �ּҵ� �ٸ���.
		System.out.println(s2.equalsIgnoreCase(s3)); // ��ҹ��� ���� X 
		
		String s4 = "abc.def.hij";
		System.out.println(s4.indexOf(".")); // "." �� ��ġ�� ��ȯ
		System.out.println(s4.indexOf("abc")); 
		System.out.println(s4.lastIndexOf(".")); // �ڿ������� "." �� ��ġ�� ��ȯ
		System.out.println(s4.indexOf("x")); // ���ڰ� ������ -1 �� ��ȯ
		
		String s5 = "���� ���� �̷�";
		String s6 = s5.replaceAll("����", "���"); // regex ����ȭ ǥ���� 
		
		System.out.println(s6);
		
		String s7 = "  a  b  c  ";
		System.out.println(s7);
		System.out.println(s7.trim());
		System.out.println(s7.replaceAll("  ", ""));
		System.out.println(s7.replaceAll("\\s", ""));
		
		char ch = "abcdefg".charAt(2); 
		System.out.println(ch);
		
		
		String s8 = "abcdefg"; 
		String s9 = "abcddfg"; 
		
		//������ �迭
		System.out.println(s8.compareTo(s9));
		System.out.println(s9.compareTo(s8));
		
		
	}
}

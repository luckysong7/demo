package com.day20.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * java.util.regex
 * ����ȭ ǥ����
 * �ܾ�ٲٱ�, �����ּҰ˻�, ���� ����� ����
 * 
 * c[a-z]* : c�� �����ϴ� ���ܾ�(c,ca,cbvf)
 * c[a-z] : c�� �����ϴ� �δܾ�(ca,cg)
 * c[a-zA-Z0-9] : ca,cA,c4
 * c. : c�� �����Ѵ� �α���(ca,cB,c&)
 * c.*: c�� �����Ѵ� ���  ����
 * c.*t : ct, chh7ahht, c774577t
 * [b|c].* �Ǵ� [bc].* �Ǵ� [b-c].* : b,c,bbb,cad
 * [^b|c].* �Ǵ� [^bc].* �Ǵ� [^b-c].* : b�Ǵ� c�� �������� �ʴ� ���� 
 * *c.* : c�� ���Ե� ���ڿ�(s45casdf)
 * [\\d]+ �Ǵ� [0-9]+ : �ϳ� �̻��� ����
 * 
 * */

public class Test1 {
	public static void main(String[] args) {
		String[] str = { "bonus", "bat", "baby", "c", "cA", "ca", "c", "c0",
				"car", "combat", "count", "date", "disc" };

		Pattern p;

		p = Pattern.compile("c[a-z]*"); // �������� c �� �����ϴ� �ϳ� �̻� �ܾ�
		for (String s : str) {
			Matcher m = p.matcher(s);

			if (m.matches()) {
				System.out.println(s);
			}
		}

		System.out.println("---------------------");

		p = Pattern.compile("c[a-z]+"); // c�� �����ϴ� 2�� �̻�
		for (String s : str) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}
		}

		System.out.println("---------------------");

		p = Pattern.compile("c."); // c�� �����ϴ� �α���
		for (String s : str) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}
		}
		
		String[] mail = {"aaa@aaa.com","@aaa.co.kr",".@bbb.com","aaa@vvv.co.kr","sss.co.kr", "abc@bbb" };
		
		// [\\w]+ : �ѱ��� �̻��� ������, ����
		// @
		// (\\.[\\w]+) : ��ȣ�ȿ� �ִ� ���� �ݵ�� �ѹ��� ���
		
		// \\. dot �� �ݵ�� ���
		
		
		p = Pattern.compile("[\\w]+@[a-z]+(\\.[a-z]+)+"); // c�� �����ϴ� �α���
		for (String s : mail) {
			Matcher m = p.matcher(s);
			if (m.matches()) {
				System.out.println(s);
			}
		}
		
		
	}
}

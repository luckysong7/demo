package com.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test4 {

	public static String getOper() throws Exception {
		String oper = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("������");
			oper = br.readLine();

			if (!(oper.equals("+")) && !(oper.equals("-"))
					&& !(oper.equals("*")) && !(oper.equals("/"))) {
				
				// throw�� ���ܸ� �ǵ������� �߻���Ų��.
				// throw�� ����Ϸ��� ���� throws Exception �� ����ؾ���
				// throw�� �ݵ�� try ���� ���ԵǾ���Ѵ�.

				throw new Exception();

			}

		} catch (Exception e) {
			System.out.println("�Է¿��� ");
		}
		return oper;
	}

	public static void main(String[] args) throws Exception {

		int num1 = 0, num2 = 0;
		float result = 0;

		String oper = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("�ΰ��� �� ? "); // 10 30

		num1 = sc.nextInt();
		num2 = sc.nextInt();

		oper = getOper();

		if (oper.equals("+")) {
			result = num1 + num2;
		} else if (oper.equals("-")) {
			result = num1 - num2;
		} else if (oper.equals("*")) {
			result = num1 * num2;
		} else if (oper.equals("/")) {
			result = num1 / num2;
		}

		System.out.printf("%d %s %d = %f \n", num1, oper, num2, result);
	}
}

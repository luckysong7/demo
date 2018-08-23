package com.day15;

import java.util.Scanner;

//����ó��
//Exception

public class Test3 {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		float result = 0;
		String oper = "";

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("�ΰ��� �� ? "); // 10 30

			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("������? "); // +
			oper = sc.next();

			result = 0;
			if (oper.equals("+")) {
				result = num1 + num2;
			} else if (oper.equals("-")) {
				result = num1 - num2;
			} else if (oper.equals("*")) {
				result = num1 * num2;
			} else if (oper.equals("/")) {
				result = num1 / num2;
			}
		} catch (NumberFormatException e) {
			System.out.println("������ �Է��ض�..");
			
		} catch(ArithmeticException e){
			System.out.println("0���� ������ ����..");
		} catch(Exception e){
			System.out.println("�� �װ� ���ڷ� ���̳�..?");
		} finally{
			System.out.println("�� �׻� ���δ�.");
		}
		System.out.printf("%d %s %d = %f \n", num1, oper, num2, result);

	}
}

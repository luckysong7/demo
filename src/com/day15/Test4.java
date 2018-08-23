package com.day15;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test4 {

	public static String getOper() throws Exception {
		String oper = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("연산자");
			oper = br.readLine();

			if (!(oper.equals("+")) && !(oper.equals("-"))
					&& !(oper.equals("*")) && !(oper.equals("/"))) {
				
				// throw로 예외를 의도적으로 발생시킨다.
				// throw를 사용하려면 위에 throws Exception 을 기술해야함
				// throw는 반드시 try 문에 포함되어야한다.

				throw new Exception();

			}

		} catch (Exception e) {
			System.out.println("입력에러 ");
		}
		return oper;
	}

	public static void main(String[] args) throws Exception {

		int num1 = 0, num2 = 0;
		float result = 0;

		String oper = null;
		Scanner sc = new Scanner(System.in);
		System.out.print("두개의 수 ? "); // 10 30

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

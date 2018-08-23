package com.exec;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperationMain {
	public static void main(String[] args) throws IOException, MyException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		double num1, num2, result = 0;

		OperationAuthen auth = new OperationAuthen();

		try {
			System.out.print("두수를 입력해 [A, B]");
			str = br.readLine();

			auth.inputForm(str); // 입력 오류처리

			String[] temp = str.split(",");

			auth.number(temp[0]); // 실수 정수 오류처리
			num1 = Double.parseDouble(temp[0]);

			auth.number(temp[1]);
			num2 = Double.parseDouble(temp[1]);

			System.out.print("연산자 입력해 ");
			str = br.readLine();

			auth.operator(str.charAt(0)); // String -> char 한자리

			if (str.equals("+")) {
				result = num1 + num2;
			} else if (str.equals("-")) {
				result = num1 - num2;
			} else if (str.equals("*")) {
				result = num1 * num2;
			} else if (str.equals("/")) {
				result = num1 / num2;
			}

			System.out.printf("%g %s %g = %g \n", num1, str, num2, result);

		} catch(Exception e){
			System.out.println(e.toString());
		}

	}
}

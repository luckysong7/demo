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
			System.out.print("�μ��� �Է��� [A, B]");
			str = br.readLine();

			auth.inputForm(str); // �Է� ����ó��

			String[] temp = str.split(",");

			auth.number(temp[0]); // �Ǽ� ���� ����ó��
			num1 = Double.parseDouble(temp[0]);

			auth.number(temp[1]);
			num2 = Double.parseDouble(temp[1]);

			System.out.print("������ �Է��� ");
			str = br.readLine();

			auth.operator(str.charAt(0)); // String -> char ���ڸ�

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

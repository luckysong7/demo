package com.day15;

import java.util.Scanner;

//예외처리
//Exception

public class Test3 {

	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		float result = 0;
		String oper = "";

		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("두개의 수 ? "); // 10 30

			num1 = sc.nextInt();
			num2 = sc.nextInt();

			System.out.print("연산자? "); // +
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
			System.out.println("정수를 입력해라..");
			
		} catch(ArithmeticException e){
			System.out.println("0으로 나눌수 없다..");
		} catch(Exception e){
			System.out.println("넌 그게 숫자로 보이냐..?");
		} finally{
			System.out.println("난 항상 보인다.");
		}
		System.out.printf("%d %s %d = %f \n", num1, oper, num2, result);

	}
}

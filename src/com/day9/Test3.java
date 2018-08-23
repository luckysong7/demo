package com.day9;

public class Test3 {
	int a = 5;

	{ // 초기화 블럭

		System.out.println("초기화 블럭 : a =" + a);
		a = 10;
		System.out.println("초기화 블럭 : a =" + a);

	}

	static int b;

	static { // static 초기화 블럭
		b = 10;
		System.out.println("static 블럭 : b =" + b);

	}
	
	final double PI ; // 상수 (한번 값이 지정되면 프로그램이 종료되기 전까지 값 변경 불가) 
	// final 변수는 항상 초기값이 지정되어야 함
	// 객체를 생성할 때 메모리에 올라감
	
	
	public Test3(){
		System.out.println("생성자 ... ");
		PI = 3.14;
		System.out.println("상수 : PI =" + PI);
	}

	
	public static void main(String[] args) {

			Test3 obj1 = new Test3();
			System.out.println("---------------");
			Test3 obj2 = new Test3();
	}
}

package com.day8;

// static 
// 자기가 알아서 메모리로 올라감
// 1000개를 만들어도 메모리공간은 한개만 사용 

public class Test2 {
	public static int a = 10;
	// 클래스변수나 클래스메소드 로딩되는 순간
	// 메모리 할당이 이루어지고 (클래스이름, 객체이름)
	// 즉, new를 사용하지 않고 바로 사용할 수 있음
	
	private int b = 20;
	// 동일한 클래스의 intance 메소드 안에서 바로 접근이 가능
	// 하지만 클래스메소드에서느 접근할 수 없다.
	// 클래스 메소드에서 접근하기 위해서는 new 를 통해 객체를 생성하고
	// 객체 이름으로만 접근이 가능
	
	
	
	public void write(){ //인스턴스 메소드
		
		System.out.println("class 변수 : " + a);
		System.out.println("instance 변수 : " + b);
		
	}
	
	public static void print(){
		System.out.println("class 변수 : " + a);
//		System.out.println("instance 변수 : " + b); 
		
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("클래스 변수 a : " + a);
		System.out.println("클래스 변수 Test2 의 a : " + Test2.a);
		
//		print(); // Italic 체로 되어 있으면 class 변수로 만들어 져 있음을 알수 있다. 
		Test2.print();
		Test2 ob1 = new Test2();
		
		
		System.out.println("인스턴스 변수 b : " + ob1.b);
		ob1.write();
		ob1.print(); // 클래스메소드는 굳이 이렇게 쓸 필요없음을 알려줌 -> static way로 호출
		System.out.println("클래스 변수 a : " + ob1.a);// 클래스변수는 굳이 이렇게 쓸 필요없음을 알려줌 -> static way로 호출
		
		Test2 ob2 = new Test2();
		ob2.a = 100;
		ob2.b = 200;
		
		System.out.println("ob2-----------------------");
		ob2.write();
		
		System.out.println("ob1-----------------------");
		ob1.write();
	}
	
}

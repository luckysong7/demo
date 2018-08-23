package com.day9;

// 생성자
// 메모리 할당 받을 때 사용
// 변수 초기화할때 사용 

// class의 이름과 동일
// 리턴값이 없기 때문에 property 가 없다.
// 중복정의가 가능
// 제일 선두에서 한번만 호출 가능


public class Test1 {
	
	private int x;
	
	// 명시적 생성자 -> 기본으로 클래스를 만들면 생성자가 만들어지기 때문에 
	// 묵시적으로도 생성자를 이용할수 있음
	
	// 
	public Test1(){
		System.out.println("인수가 없는 생성자 ...");
		x =10 ; 
		System.out.println("x = " + x);
	}
	
	//오버로딩된 생성자
	
	public Test1(int x){
		System.out.println("인수가 있는 생성자 ...");
		
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		
	}
}

package com.day13;

// 내부클래스 
// Anoymouse, 익명의, 무명의 클래스 



public class Test4 {

	public Object getTitle(){
		
		//코딩 
		//Object ob = new Object();
		
		return new Object(){
			@Override
			public String toString() {
				return "무명의 클래스";
			}
		}; // 새로운 객체가 만들어져서(객체 만드는 클래스가 생략되어 있음) toString()함수를 통해 String 값 반환 
		
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		System.out.println(t.getTitle());
	}
}

package com.day9;

import java.util.Calendar;

class ob{
	public int x = 10;
	
	public void ob(int a ){
		x += a;
	}
}

public class Test7 {
	public static void main(String[] args) {
		ob ob = new ob();
		
		int a = 20;
		
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		ob.ob(a);	 // call by value	
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		
		
		ob ob1 = ob;
		
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		System.out.println("sub() 메소드 실행 전 : " + ob1.x);
		
		ob1.ob(a);
		
		System.out.println("sub() 메소드 실행 전 : " + ob.x);
		System.out.println("sub() 메소드 실행 전 : " + ob1.x);
		
		Calendar now1 = Calendar.getInstance();
		// Heap 영역에 새로운 Calendar 객체를 만들지 않고 처음 만들어진 객체 메모리 주소를 참조할 수 있도록 해줌
		Calendar now2 = Calendar.getInstance(); 
		Calendar now3 = Calendar.getInstance();
		Calendar now4 = Calendar.getInstance();
		
		System.out.println(now1.getTime());
		
		
	}
}

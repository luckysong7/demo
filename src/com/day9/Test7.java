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
		
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		ob.ob(a);	 // call by value	
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		
		
		ob ob1 = ob;
		
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		System.out.println("sub() �޼ҵ� ���� �� : " + ob1.x);
		
		ob1.ob(a);
		
		System.out.println("sub() �޼ҵ� ���� �� : " + ob.x);
		System.out.println("sub() �޼ҵ� ���� �� : " + ob1.x);
		
		Calendar now1 = Calendar.getInstance();
		// Heap ������ ���ο� Calendar ��ü�� ������ �ʰ� ó�� ������� ��ü �޸� �ּҸ� ������ �� �ֵ��� ����
		Calendar now2 = Calendar.getInstance(); 
		Calendar now3 = Calendar.getInstance();
		Calendar now4 = Calendar.getInstance();
		
		System.out.println(now1.getTime());
		
		
	}
}

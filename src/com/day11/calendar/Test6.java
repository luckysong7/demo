package com.day11.calendar;

class Test{
	
	public static final double PI ;
	
	static{
		PI = 3.14;
	}
	
	public double area;
	
	// Override �Ұ� 
	public final void write(String title){
		System.out.println(title + " : " + area );
		
	}
	
}



public class Test6 extends Test{

	//public void write(String title) �Ұ���
	
	public void circleArea(int r){
		area = (double)r*r*PI;
	}
	
	public static void main(String[] args) {
		Test6 ob = new Test6();
		
		ob.circleArea(10);
		ob.write("��");
		
	}
	
	
	
}

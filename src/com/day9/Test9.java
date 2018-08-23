package com.day9;

class SuperClass{
	
	private String title;
	protected double area;
	
	public SuperClass(){
		
	}
	
	public SuperClass(String title){
		this.title = title;
	}
	
	public void write(){
		System.out.println("title : " + area);
		
	}
	
}
// 자바는 단일 상속
class Circle extends SuperClass{
	private int r ;
	protected static final double PI = 3.14; // 상수 - 프로그램 끝나기 전까지 값 변경 불가
	

	
	public Circle(int r){
		super("원"); // 부모생성자중에 오버로딩된 생성자를 호출
		this.r = r;
	}
	
	public void circleArea(){
		area = (double) r * r * PI;
	}
	
	
	
}

class RectC extends SuperClass{
	private int w,h;
	
	
	public void rectArea(int w, int h){
		this.w = w;
		this.h = h;
		area = w*h;
	}
	// 메소드 오버라이드 
	// 부모 클래스의 메소드를 상속받아 자기것에 맞게 조금 변형하여 동작
	// 메소드 이름은 동일 !
	// 자식클래스의 메소드와 
	// 부모클래스의 메소드가 같으면
	// 자기 자신것의 메소드만 사용 
	// 부모 클래스의 메소드 사용안함
	@Override
	public void write(){
	
		System.out.println("가로 : " + w);
		System.out.println("세로 : " + h);
		System.out.println("넓이 : " + area);
	}
	
}

public class Test9 {
	public static void main(String[] args) {
		Circle ob1 = new Circle(10);
		ob1.circleArea();
		ob1.write();
		
		
		System.out.println("===========================");
		
		RectC ob2 = new RectC();
		ob2.rectArea(10, 20);
		ob2.write();
	}

}

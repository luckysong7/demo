package com.day8;

public class Test1 {
	public static void main(String[] args) {
		Circle ob1 = new Circle();
		ob1.setData(10);
		
		// ob1.r = 100 ; 외부에서 값을 변경하지 못한다 !!! ★★
		
		ob1.print(ob1.area());
	}

	
}


class Circle{
	
	private int r ; // 인스턴스 변수는 99 % private 변수로 만들자 !!
					// 정보의 은닉(캡슐화)
	private double area ;
	
	// 값 입력
	public void setData(int a){  // 변수 초기화 메소드 ★★
		this.r = a;
	}
	
	// 넓이 계산
	public double area(){
		return r*r*3.14;
	}
	
	//출력
	public void print(double a){
		System.out.println("반지름 : " + this.r);
		System.out.println("넓이 : " + area);
	}
	
	
}
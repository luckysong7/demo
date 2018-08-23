package com.day12;

class SuperTest{
	
	public int a = 10, b= 20 ;
	
	public void write(){
		System.out.println("슈퍼클래스 write() 메소드");
	}
	
	public int hap(){
		return a + b ;
	}
	
	
}

class SubTest extends SuperTest{
	
	public int b = 100 ,c = 200;
	
	public void print(){
		System.out.println("서브클래스 print()메소드");
		
	}

	@Override
	public int hap() {
		return a + b + c;
	}
	
}


public class Test2 {

	public static void main(String[] args) {
	
		SubTest ob1 = new SubTest();
		System.out.println("b : " + ob1.b); // 100 
		
		SuperTest ob2 = ob1; // UPCAST 
		
		System.out.println("b : " + ob2.b); // 20
		
		System.out.println("합 : " + ob2.hap()); // 310 메소드는 내꺼 쓴다 !!!
		
		ob2.write();
	  //ob2.print(); // 자식클래스에만 있으므로 못씀 무조건 내꺼 쓴다 
		((SubTest)ob2).print(); // DOWNCAST
		
		ob1.write();
		
		
	}
	
}

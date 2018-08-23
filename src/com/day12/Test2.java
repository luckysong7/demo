package com.day12;

class SuperTest{
	
	public int a = 10, b= 20 ;
	
	public void write(){
		System.out.println("����Ŭ���� write() �޼ҵ�");
	}
	
	public int hap(){
		return a + b ;
	}
	
	
}

class SubTest extends SuperTest{
	
	public int b = 100 ,c = 200;
	
	public void print(){
		System.out.println("����Ŭ���� print()�޼ҵ�");
		
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
		
		System.out.println("�� : " + ob2.hap()); // 310 �޼ҵ�� ���� ���� !!!
		
		ob2.write();
	  //ob2.print(); // �ڽ�Ŭ�������� �����Ƿ� ���� ������ ���� ���� 
		((SubTest)ob2).print(); // DOWNCAST
		
		ob1.write();
		
		
	}
	
}

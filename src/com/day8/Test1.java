package com.day8;

public class Test1 {
	public static void main(String[] args) {
		Circle ob1 = new Circle();
		ob1.setData(10);
		
		// ob1.r = 100 ; �ܺο��� ���� �������� ���Ѵ� !!! �ڡ�
		
		ob1.print(ob1.area());
	}

	
}


class Circle{
	
	private int r ; // �ν��Ͻ� ������ 99 % private ������ ������ !!
					// ������ ����(ĸ��ȭ)
	private double area ;
	
	// �� �Է�
	public void setData(int a){  // ���� �ʱ�ȭ �޼ҵ� �ڡ�
		this.r = a;
	}
	
	// ���� ���
	public double area(){
		return r*r*3.14;
	}
	
	//���
	public void print(double a){
		System.out.println("������ : " + this.r);
		System.out.println("���� : " + area);
	}
	
	
}
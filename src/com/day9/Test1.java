package com.day9;

// ������
// �޸� �Ҵ� ���� �� ���
// ���� �ʱ�ȭ�Ҷ� ��� 

// class�� �̸��� ����
// ���ϰ��� ���� ������ property �� ����.
// �ߺ����ǰ� ����
// ���� ���ο��� �ѹ��� ȣ�� ����


public class Test1 {
	
	private int x;
	
	// ����� ������ -> �⺻���� Ŭ������ ����� �����ڰ� ��������� ������ 
	// ���������ε� �����ڸ� �̿��Ҽ� ����
	
	// 
	public Test1(){
		System.out.println("�μ��� ���� ������ ...");
		x =10 ; 
		System.out.println("x = " + x);
	}
	
	//�����ε��� ������
	
	public Test1(int x){
		System.out.println("�μ��� �ִ� ������ ...");
		
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		
	}
}

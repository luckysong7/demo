package com.day9;

// �Ǻθ��Լ�
// �ҽ��� ��������
// ó���ӵ��� ���� -> �Ⱦ� 
// ���ÿ����� �����͸� �����ߴٰ� ����ϱ� ������ ����



public class Test4 {

	public void print(int n){
		if(n != 1){
			print(n-1);
		}
		System.out.printf("%5d" , n);
	}
	
	public int sum(int n){
		return n >1 ? n+ sum(n-1) : n ;
	}
	
	public int pow(int a, int b){
		return b >= 1 ? a*pow(a,b-1) : 1;
	}
	
	public static void main(String[] args) {
		Test4 obj = new Test4();
		obj.print(10);
		
		System.out.print(" : ");
		
		int s = obj.sum(10);
		System.out.println(s);
		
		System.out.println();
		
		int d = obj.pow(2, 10);
		System.out.println(d); // 2^10
	}
}

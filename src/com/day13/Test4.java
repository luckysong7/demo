package com.day13;

// ����Ŭ���� 
// Anoymouse, �͸���, ������ Ŭ���� 



public class Test4 {

	public Object getTitle(){
		
		//�ڵ� 
		//Object ob = new Object();
		
		return new Object(){
			@Override
			public String toString() {
				return "������ Ŭ����";
			}
		}; // ���ο� ��ü�� ���������(��ü ����� Ŭ������ �����Ǿ� ����) toString()�Լ��� ���� String �� ��ȯ 
		
	}
	
	public static void main(String[] args) {
		Test4 t = new Test4();
		System.out.println(t.getTitle());
	}
}

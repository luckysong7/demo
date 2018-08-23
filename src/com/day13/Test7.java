package com.day13;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class Test7 {
	private static final String city[] = { "����", "�λ�", "�뱸", "��õ", "����", "����",
			"����", "���" }; // �迭

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		
		String str ; 
		
		System.out.println("������ �ʱ�뷮 : " + v.capacity()); // ������ �⺻ �ʱ� �뷮�� 10 
		
		for(String n : city){
			v.add(n);
		}
		System.out.println("[Iterator�� �̿��� ��ü ���]");
		Iterator<String> it = v.iterator();
		while(it.hasNext()){
			str = it.next();
			System.out.print(str + " " );
		}
		System.out.println();
		System.out.println("���� �뷮 : " + v.capacity());
		System.out.println("������ ���� : " + v.size());
		v.set(0,"����"); // ���� ��� (������ ����)
		v.set(1,"������"); // ���� ��� 
		
		for(String s : v){
			System.out.print(s + " " );
		}
		System.out.println();
		
		//�����ֱ� 
		v.insertElementAt("���ѹα�", 0); // �ڿ� �ε��� ��ȣ �ٲ� 
		for(String s : v){
			System.out.print(s + " " );
		}
		System.out.println();
		
		//�˻� 
		int index = v.indexOf("�ٺ�");
		if(index != -1){
			System.out.println("�˻� ���� : " + index);
		}else{
			System.out.println("�˻� ����");
		}
		
		//��������
		Collections.sort(v);
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		
		//��������
		Collections.sort(v, Collections.reverseOrder()); // ������ ���� 
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		
		//���� 
		v.remove("������");
//		v.remove(1);
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
		System.out.println("���� �뷮 : " + v.capacity());
		System.out.println("������ ���� : " + v.size());
		
		//�뷮���� 
		for(int i = 1 ; i <= 20 ; i++){
			v.add(Integer.toString(i));
		}
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("������ �뷮 : " + v.capacity()); // ������ �뷮 
		System.out.println("�������� ���� : " + v.size());
		
		// �������� 
		for(int i = 1 ; i <= 10 ; i++){ // 10������ 5��° �ִ� ������ 
			//5��° �����Ͱ� �������� �ڿ� �ִ� ������ �ε�����ȣ�� ������
			v.remove(5); 
		}
		for(String s : v ){
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println("���� �뷮 : " + v.capacity());
		System.out.println("������ ���� : " + v.size());
		
		//����� ���� 
		v.trimToSize();
		System.out.println();
		System.out.println("���� �뷮 : " + v.capacity());
		System.out.println("������ ���� : " + v.size());
		
		//��ü ���� 
		v.clear();
		System.out.println();
		System.out.println("���� �뷮 : " + v.capacity());
		System.out.println("������ ���� : " + v.size());
		
		//����� ���� 
		v.trimToSize();
		System.out.println();
		System.out.println("���� �뷮 : " + v.capacity());
		System.out.println("������ ���� : " + v.size());
	}  
}

package com.day19.swing;

import java.lang.reflect.Method;

//Reflect ������ ����� �޼ҵ� ȣ����

class Exam {

	public Integer hap(Integer a, Integer b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}
	
	public void write(String title, int result){
		System.out.println(title + " : " + result);
		
	}

}

public class Test5 {
	public static void main(String[] args) throws Exception{
		@SuppressWarnings("rawtypes")
		Class cls = Class.forName("com.day19.swing.Exam");
		
		//Ŭ������ ��ü����
		Object ob = cls.newInstance();
		
		//hap�޼ҵ� ������ ���Ϲ���
		@SuppressWarnings("unchecked")
		Method hap = cls.getDeclaredMethod("hap", new Class[]{
				Integer.class,Integer.class});
		
		//sub�޼ҵ� ������ ���Ϲ���
		@SuppressWarnings("unchecked")
		Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class, int.class});
		
		@SuppressWarnings("unchecked")
		Method write = cls.getDeclaredMethod("write", new Class[]{String.class, int.class});
		
		//�μ��� ���� �޼ҵ���� ���Ϲ��� �� : null
		
		Object h = hap.invoke(ob, new Object[]{20,10});
		
		write.invoke(ob, new Object[]{"��" , h});
		
		Integer i = (Integer)sub.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"��",i});
		
		
				
		
	}
}

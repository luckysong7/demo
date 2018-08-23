package com.day19.swing;

import java.lang.reflect.Method;

//Reflect 개념을 사용한 메소드 호출방법

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
		
		//클래스의 객체생성
		Object ob = cls.newInstance();
		
		//hap메소드 정보를 리턴받음
		@SuppressWarnings("unchecked")
		Method hap = cls.getDeclaredMethod("hap", new Class[]{
				Integer.class,Integer.class});
		
		//sub메소드 정보를 리턴받음
		@SuppressWarnings("unchecked")
		Method sub = cls.getDeclaredMethod("sub", new Class[]{int.class, int.class});
		
		@SuppressWarnings("unchecked")
		Method write = cls.getDeclaredMethod("write", new Class[]{String.class, int.class});
		
		//인수가 없는 메소드들을 리턴받을 때 : null
		
		Object h = hap.invoke(ob, new Object[]{20,10});
		
		write.invoke(ob, new Object[]{"합" , h});
		
		Integer i = (Integer)sub.invoke(ob, new Object[]{20,10});
		write.invoke(ob, new Object[]{"차",i});
		
		
				
		
	}
}

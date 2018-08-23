package com.day12;

interface Test{
	
	public int total();
	public void write();
	public boolean equals(Object ob);
	
}

class TestImpl implements Test{

	private String hak, name;
	
	private int kor, eng;
	
	// 기본생성자해서 set메소드를 통해서 초기화하는 방법 1 
	// 처음부터 오버라이드된 생성자를 통해서 초기화하는 방법2
	public TestImpl() {

	
	}
	
	public TestImpl(String hak, String name, int kor, int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	public void set(String hak, String name, int kor, int eng){
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
	}	
	
	@Override
	public int total() {
		return eng + kor;
	}

	@Override
	public void write() {
		System.out.println("hak : " + hak + " name : "+ name + " total : " + total());
		
	}
	
	public boolean equals(Object ob){
		
		boolean flag = false;
		
		if(ob instanceof TestImpl){
			TestImpl t = (TestImpl)ob;
			
			if(this.hak.equals(t.hak) && this.name.equals(t.name)){
				flag = true;
			}
		}
		return flag;
		
	}
	
	
}


public class Test4 {
	public static void main(String[] args) {
		//초기화방법 1
		TestImpl ob1 = new TestImpl();
		ob1.set("1111", "배수지"	, 90, 80);
		
		//초기화방법 2
		TestImpl ob2 = new TestImpl("2222", "삼바홍", 40, 50);
		
		if(ob1.equals(ob2)){
			System.out.println("ob1과 ob2는 동일인물");
		}else{
			System.out.println("ob1과 ob2는 동일하지 않은 인물");
		}
		
		ob1.write();
		ob2.write();
	
		
	}
}

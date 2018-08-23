package com.day12;

interface Test{
	
	public int total();
	public void write();
	public boolean equals(Object ob);
	
}

class TestImpl implements Test{

	private String hak, name;
	
	private int kor, eng;
	
	// �⺻�������ؼ� set�޼ҵ带 ���ؼ� �ʱ�ȭ�ϴ� ��� 1 
	// ó������ �������̵�� �����ڸ� ���ؼ� �ʱ�ȭ�ϴ� ���2
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
		//�ʱ�ȭ��� 1
		TestImpl ob1 = new TestImpl();
		ob1.set("1111", "�����"	, 90, 80);
		
		//�ʱ�ȭ��� 2
		TestImpl ob2 = new TestImpl("2222", "���ȫ", 40, 50);
		
		if(ob1.equals(ob2)){
			System.out.println("ob1�� ob2�� �����ι�");
		}else{
			System.out.println("ob1�� ob2�� �������� ���� �ι�");
		}
		
		ob1.write();
		ob2.write();
	
		
	}
}

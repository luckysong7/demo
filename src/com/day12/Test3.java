package com.day12;

// Interface
/*
 * 1. �߻�Ŭ������ �������� �����ְ� ����(����)�� ����.
 * 2. final ������ �����Ҽ� �ִ�. 
 * 3. �������̽��� �����ϱ� ���ؼ��� implements �� ����Ѵ�. 
 * 4. �ϳ� �̻��� �������̽��� implements �� �� Ŭ������
 *    �������̽��� ��� �޼ҵ带 �������̵� �ؾ��Ѵ�.
 * 5. �������̽��� �������̽��� ��� ������ ������ �̶��� extends  �� ���
 * 6. �������̽��� ���� ����� �����ϴ�. 
 * 7. �������̽��� ������̴�. 
 * 8. ���������� �����ϴ�. 
 */

interface Fruit{
	
	String Won = "��"; // public static final �� �����Ǿ� ���� �׸��� final ������ ������ �ʱ�ȭ ���־�� �Ѵ� !!
	// ���Ÿ�ü�� Ŭ���� �����̴� !!!
	
	int getPrice(); // ������ public abstract �����Ǿ� ���� 
	
	public String getName(); // ���Ǻκ��� ���� !!
	
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "���";
	}
	
	public String getItems(){
		return "����";
	}
	
	
	
}


public class Test3 {
	public static void main(String[] args) {
		FruitImpl ob1 = new FruitImpl();
		System.out.println(ob1.getItems() + "-" + ob1.getName() + ":" + ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; // upcast
		
		System.out.println(ob2.getName()); // �߻�Ŭ������ �����̹Ƿ� �ڽ�Ŭ������ �޼ҵ� ��� ���� 
		
//		System.out.println(ob2.getItems()); // �θ����״� ������ �ڽ����׸� �ִ°� ������ !!!
	}
	
}

package com.day14;

import java.util.Vector;

class Test {
	String name;
	int age;

}

public class Test1 {
	public static void main(String[] args) {
		Vector<Test> v = new Vector<Test>();

		Test ob1 = new Test();
		ob1.name = "������";
		ob1.age = 27;

		v.add(ob1);
		
		// �߸��ۼ��ϴ� ��� 
		// ���� �Է��� ��ü�� 2�� ��µȴ�. 
//		ob1.name = "�ڼ���";
//		ob1.age = 26;
//		
//		v.add(ob1);// ob1 ��ü ���� ���� �ڸ��� �Էµȴ�.
		
		ob1 = new Test();
		ob1.age = 26;
		ob1.name = "����";
		
		v.add(ob1);
		
		for(Test n : v){
			System.out.println(n.age + " " + n.name);
		}
		
	}

}

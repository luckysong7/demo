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
		ob1.name = "송재훈";
		ob1.age = 27;

		v.add(ob1);
		
		// 잘못작성하는 경우 
		// 새로 입력한 객체만 2번 출력된다. 
//		ob1.name = "박수현";
//		ob1.age = 26;
//		
//		v.add(ob1);// ob1 객체 벡터 다음 자리에 입력된다.
		
		ob1 = new Test();
		ob1.age = 26;
		ob1.name = "고기륜";
		
		v.add(ob1);
		
		for(Test n : v){
			System.out.println(n.age + " " + n.name);
		}
		
	}

}

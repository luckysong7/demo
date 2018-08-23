package com.day12;

// Interface
/*
 * 1. 추상클래스의 일종으로 선언만있고 정의(내용)이 없다.
 * 2. final 변수만 정의할수 있다. 
 * 3. 인터페이스를 구현하기 위해서는 implements 를 사용한다. 
 * 4. 하나 이상의 인터페이스를 implements 를 한 클래스는
 *    인터페이스의 모든 메소드를 오버라이드 해야한다.
 * 5. 인터페이스가 인터페이스를 상속 받을수 있으며 이때는 extends  를 사용
 * 6. 인터페이스는 다중 상속이 가능하다. 
 * 7. 인터페이스는 저장소이다. 
 * 8. 강제적용이 가능하다. 
 */

interface Fruit{
	
	String Won = "원"; // public static final 이 생략되어 있음 그리고 final 변수는 무조건 초기화 해주어야 한다 !!
	// 이탤릭체는 클래스 변수이다 !!!
	
	int getPrice(); // 무조건 public abstract 생략되어 있음 
	
	public String getName(); // 정의부분이 없다 !!
	
}

class FruitImpl implements Fruit{

	@Override
	public int getPrice() {
		return 1000;
	}

	@Override
	public String getName() {
		return "사과";
	}
	
	public String getItems(){
		return "과일";
	}
	
	
	
}


public class Test3 {
	public static void main(String[] args) {
		FruitImpl ob1 = new FruitImpl();
		System.out.println(ob1.getItems() + "-" + ob1.getName() + ":" + ob1.getPrice() + Fruit.Won);
		
		Fruit ob2 = ob1; // upcast
		
		System.out.println(ob2.getName()); // 추상클래스의 일종이므로 자식클래스의 메소드 사용 가능 
		
//		System.out.println(ob2.getItems()); // 부모한테는 없지만 자식한테만 있는거 못쓴다 !!!
	}
	
}

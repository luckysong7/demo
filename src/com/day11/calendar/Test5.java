package com.day11.calendar;


// Singleton 기법 

class Sing {

	private static Sing ob;

	public static Sing getInstance() {

		if (ob == null) {
			ob = new Sing();
		}

		return ob;

	}

}

public class Test5 {
	public static void main(String[] args) {
		
		Sing ob1 = Sing.getInstance();
		Sing ob2 = Sing.getInstance();
		
		if(ob1 == ob2){  // 메모리 주소 비교 
			System.out.println("동일 객체 ...");
			
		}else{
			System.out.println("동일하지 않은 객체...");
		}
		

	}

}
